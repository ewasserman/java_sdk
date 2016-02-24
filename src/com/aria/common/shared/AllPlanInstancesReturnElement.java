package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "all_plan_instances_ReturnElement", propOrder = {"queuedInd", "planInstanceNo", "clientPlanInstanceId", "parentPlanInstanceNo", "planName", "planType", "planUnitInstList"})
public class AllPlanInstancesReturnElement {

    @XmlElement(name = "queued_ind")
    protected String queuedInd;
    @XmlElement(name = "plan_instance_no")
    protected Long planInstanceNo;
    @XmlElement(name = "client_plan_instance_id")
    protected String clientPlanInstanceId;
    @XmlElement(name = "parent_plan_instance_no")
    protected Long parentPlanInstanceNo;
    @XmlElement(name = "plan_name")
    protected String planName;
    @XmlElement(name = "plan_type")
    protected String planType;
    @XmlElement(name = "plan_unit_inst_list")
    protected List<PlanUnitInstListReturnElement> planUnitInstList;
    
    public String getQueuedInd() {
        return queuedInd;
    }

    public void setQueuedInd(String value) {
        this.queuedInd = value;
    }

    public Long getPlanInstanceNo() {
        return planInstanceNo;
    }

    public void setPlanInstanceNo(Long value) {
        this.planInstanceNo = value;
    }

    public String getClientPlanInstanceId() {
        return clientPlanInstanceId;
    }

    public void setClientPlanInstanceId(String value) {
        this.clientPlanInstanceId = value;
    }

    public Long getParentPlanInstanceNo() {
        return parentPlanInstanceNo;
    }

    public void setParentPlanInstanceNo(Long value) {
        this.parentPlanInstanceNo = value;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String value) {
        this.planName = value;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String value) {
        this.planType = value;
    }

    public List<PlanUnitInstListReturnElement> getPlanUnitInstList() {
        if (this.planUnitInstList == null) {
            this.planUnitInstList = new ArrayList<PlanUnitInstListReturnElement>();
        }
        return this.planUnitInstList;
    }
}
