package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "queuedPlans", "currentRateScheduleNo", "clientCurrentRateScheduleId"})
@XmlRootElement(name = "get_queued_acct_plans_mResponseElement")
public class GetQueuedAcctPlansMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "queued_plans")
    protected List<QueuedPlansReturnElement> queuedPlans;
    @XmlElement(name = "current_rate_schedule_no")
    protected Long currentRateScheduleNo;
    @XmlElement(name = "client_current_rate_schedule_id")
    protected String clientCurrentRateScheduleId;
    
    public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long value) {
        this.errorCode = value;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    public List<QueuedPlansReturnElement> getQueuedPlans() {
        if (this.queuedPlans == null) {
            this.queuedPlans = new ArrayList<QueuedPlansReturnElement>();
        }
        return this.queuedPlans;
    }public Long getCurrentRateScheduleNo() {
        return currentRateScheduleNo;
    }

    public void setCurrentRateScheduleNo(Long value) {
        this.currentRateScheduleNo = value;
    }

    public String getClientCurrentRateScheduleId() {
        return clientCurrentRateScheduleId;
    }

    public void setClientCurrentRateScheduleId(String value) {
        this.clientCurrentRateScheduleId = value;
    }

    
}
