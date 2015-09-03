package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "planInstanceNo",    "clientPlanInstanceId",    "statusCd",    "dunningState",    "degradeDate",    "queueDays",    "queueDate",    "forceBillDateReset",    "comments",    "clientReceiptId"})
@XmlRootElement(name = "update_acct_plan_status_m")
public class UpdateAcctPlanStatusM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "plan_instance_no")
    protected Long planInstanceNo;
        @XmlElement(name = "client_plan_instance_id")
    protected String clientPlanInstanceId;
        @XmlElement(name = "status_cd")
    protected Long statusCd;
        @XmlElement(name = "dunning_state")
    protected Long dunningState;
        @XmlElement(name = "degrade_date")
    protected String degradeDate;
        @XmlElement(name = "queue_days")
    protected Long queueDays;
        @XmlElement(name = "queue_date")
    protected String queueDate;
        @XmlElement(name = "force_bill_date_reset")
    protected Long forceBillDateReset;
        @XmlElement(name = "comments")
    protected String comments;
        @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
    
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
            public Long getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(Long value) {
        this.statusCd = value;
    }
            public Long getDunningState() {
        return dunningState;
    }

    public void setDunningState(Long value) {
        this.dunningState = value;
    }
            public String getDegradeDate() {
        return degradeDate;
    }

    public void setDegradeDate(String value) {
        this.degradeDate = value;
    }
            public Long getQueueDays() {
        return queueDays;
    }

    public void setQueueDays(Long value) {
        this.queueDays = value;
    }
            public String getQueueDate() {
        return queueDate;
    }

    public void setQueueDate(String value) {
        this.queueDate = value;
    }
            public Long getForceBillDateReset() {
        return forceBillDateReset;
    }

    public void setForceBillDateReset(Long value) {
        this.forceBillDateReset = value;
    }
            public String getComments() {
        return comments;
    }

    public void setComments(String value) {
        this.comments = value;
    }
            public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
    }
            
}
