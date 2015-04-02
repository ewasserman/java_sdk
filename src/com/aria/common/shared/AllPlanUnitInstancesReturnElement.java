package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "all_plan_unit_instances_ReturnElement", propOrder = {"outQueuedInd", "outPlanNo", "outClientPlanId", "planName", "planType", "planUnitInstance"})
public class AllPlanUnitInstancesReturnElement {

    @XmlElement(name = "out_queued_ind")
    protected String outQueuedInd;
    @XmlElement(name = "out_plan_no")
    protected Long outPlanNo;
    @XmlElement(name = "out_client_plan_id")
    protected String outClientPlanId;
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

    public Long getOutPlanNo() {
        return outPlanNo;
    }

    public void setOutPlanNo(Long value) {
        this.outPlanNo = value;
    }

    public String getOutClientPlanId() {
        return outClientPlanId;
    }

    public void setOutClientPlanId(String value) {
        this.outClientPlanId = value;
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
