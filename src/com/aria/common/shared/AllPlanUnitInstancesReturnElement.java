package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "all_plan_unit_instances_ReturnElement", propOrder = {"queuedInd", "planNo", "clientPlanId", "planName", "planType", "planUnitInstance"})
public class AllPlanUnitInstancesReturnElement {

    @XmlElement(name = "queued_ind")
    protected String queuedInd;
    @XmlElement(name = "plan_no")
    protected Long planNo;
    @XmlElement(name = "client_plan_id")
    protected String clientPlanId;
    @XmlElement(name = "plan_name")
    protected String planName;
    @XmlElement(name = "plan_type")
    protected String planType;
    @XmlElement(name = "plan_unit_instance")
    protected List<PlanUnitInstanceReturnElement> planUnitInstance;
    
    public String getQueuedInd() {
        return queuedInd;
    }

    public void setQueuedInd(String value) {
        this.queuedInd = value;
    }

    public Long getPlanNo() {
        return planNo;
    }

    public void setPlanNo(Long value) {
        this.planNo = value;
    }

    public String getClientPlanId() {
        return clientPlanId;
    }

    public void setClientPlanId(String value) {
        this.clientPlanId = value;
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
