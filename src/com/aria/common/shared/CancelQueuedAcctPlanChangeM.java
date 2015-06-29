package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "planInstanceToRemove",    "queueIdToRemove",    "removeAllQueuedPlans",    "removeTerminatePending"})
@XmlRootElement(name = "cancel_queued_acct_plan_change_m")
public class CancelQueuedAcctPlanChangeM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "plan_instance_to_remove")
    protected PlanInstanceToRemoveArray planInstanceToRemove;
        @XmlElement(name = "queue_id_to_remove")
    protected QueueIdToRemoveArray queueIdToRemove;
        @XmlElement(name = "remove_all_queued_plans")
    protected String removeAllQueuedPlans;
        @XmlElement(name = "remove_terminate_pending")
    protected String removeTerminatePending;
    
    public long getClientNo() {
        return clientNo;
    }

    public void setClientNo(Long value) {
        this.clientNo = value;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String value) {
        this.authKey = value;
    }

    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }
            public PlanInstanceToRemoveArray getPlanInstanceToRemove() {
        return planInstanceToRemove;
    }

    public void setPlanInstanceToRemove(PlanInstanceToRemoveArray value) {
        this.planInstanceToRemove = value;
    }
            public QueueIdToRemoveArray getQueueIdToRemove() {
        return queueIdToRemove;
    }

    public void setQueueIdToRemove(QueueIdToRemoveArray value) {
        this.queueIdToRemove = value;
    }
            public String getRemoveAllQueuedPlans() {
        return removeAllQueuedPlans;
    }

    public void setRemoveAllQueuedPlans(String value) {
        this.removeAllQueuedPlans = value;
    }
            public String getRemoveTerminatePending() {
        return removeTerminatePending;
    }

    public void setRemoveTerminatePending(String value) {
        this.removeTerminatePending = value;
    }
            
}
