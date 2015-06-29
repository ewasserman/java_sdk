package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "all_plan_instances_ReturnElement", propOrder = {"outQueuedInd", "outPlanInstanceNo", "parentPlanInstanceNo", "outClientInstancePlanId", "planName", "planType", "planUnitInstance"})
public class AllPlanInstancesReturnElement {

    @XmlElement(name = "out_queued_ind")
    protected String outQueuedInd;
    @XmlElement(name = "out_plan_instance_no")
    protected Long outPlanInstanceNo;
    @XmlElement(name = "parent_plan_instance_no")
    protected Long parentPlanInstanceNo;
    @XmlElement(name = "out_client_instance_plan_id")
    protected String outClientInstancePlanId;
    @XmlElement(name = "plan_name")
    protected String planName;
    @XmlElement(name = "plan_type")
    protected String planType;
    @XmlElement(name = "plan_unit_instance")
    protected List<PlanUnitInstanceReturnElement> planUnitInstance;
    
    public String getOutQueuedInd() {
        return outQueuedInd;
    }

    public void setOutQueuedInd(String value) {
        this.outQueuedInd = value;
    }

    public Long getOutPlanInstanceNo() {
        return outPlanInstanceNo;
    }

    public void setOutPlanInstanceNo(Long value) {
        this.outPlanInstanceNo = value;
    }

    public Long getParentPlanInstanceNo() {
        return parentPlanInstanceNo;
    }

    public void setParentPlanInstanceNo(Long value) {
        this.parentPlanInstanceNo = value;
    }

    public String getOutClientInstancePlanId() {
        return outClientInstancePlanId;
    }

    public void setOutClientInstancePlanId(String value) {
        this.outClientInstancePlanId = value;
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

    public List<PlanUnitInstanceReturnElement> getPlanUnitInstance() {
        if (this.planUnitInstance == null) {
            this.planUnitInstance = new ArrayList<PlanUnitInstanceReturnElement>();
        }
        return this.planUnitInstance;
    }
}
