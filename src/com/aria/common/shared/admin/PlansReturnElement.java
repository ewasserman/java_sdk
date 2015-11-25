package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plans_ReturnElement", propOrder = {"planName", "planDesc", "planNo", "planLevel", "clientPlanId", "billingInterval", "activeInd"})
public class PlansReturnElement {

    @XmlElement(name = "plan_name")
    protected String planName;
    @XmlElement(name = "plan_desc")
    protected String planDesc;
    @XmlElement(name = "plan_no")
    protected Long planNo;
    @XmlElement(name = "plan_level")
    protected Long planLevel;
    @XmlElement(name = "client_plan_id")
    protected String clientPlanId;
    @XmlElement(name = "billing_interval")
    protected Long billingInterval;
    @XmlElement(name = "active_ind")
    protected Long activeInd;
    
    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String value) {
        this.planName = value;
    }

    public String getPlanDesc() {
        return planDesc;
    }

    public void setPlanDesc(String value) {
        this.planDesc = value;
    }

    public Long getPlanNo() {
        return planNo;
    }

    public void setPlanNo(Long value) {
        this.planNo = value;
    }

    public Long getPlanLevel() {
        return planLevel;
    }

    public void setPlanLevel(Long value) {
        this.planLevel = value;
    }

    public String getClientPlanId() {
        return clientPlanId;
    }

    public void setClientPlanId(String value) {
        this.clientPlanId = value;
    }

    public Long getBillingInterval() {
        return billingInterval;
    }

    public void setBillingInterval(Long value) {
        this.billingInterval = value;
    }

    public Long getActiveInd() {
        return activeInd;
    }

    public void setActiveInd(Long value) {
        this.activeInd = value;
    }

    
}
