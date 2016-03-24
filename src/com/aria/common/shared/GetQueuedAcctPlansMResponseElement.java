package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "queuedPlanInstanceDetails", "acctLocaleNo", "acctLocaleName"})
@XmlRootElement(name = "get_queued_acct_plans_mResponseElement")
public class GetQueuedAcctPlansMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "queued_plan_instance_details")
    protected List<QueuedPlanInstanceDetailsReturnElement> queuedPlanInstanceDetails;
    @XmlElement(name = "acct_locale_no")
    protected Long acctLocaleNo;
    @XmlElement(name = "acct_locale_name")
    protected String acctLocaleName;
    
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

    public List<QueuedPlanInstanceDetailsReturnElement> getQueuedPlanInstanceDetails() {
        if (this.queuedPlanInstanceDetails == null) {
            this.queuedPlanInstanceDetails = new ArrayList<QueuedPlanInstanceDetailsReturnElement>();
        }
        return this.queuedPlanInstanceDetails;
    }public Long getAcctLocaleNo() {
        return acctLocaleNo;
    }

    public void setAcctLocaleNo(Long value) {
        this.acctLocaleNo = value;
    }

    public String getAcctLocaleName() {
        return acctLocaleName;
    }

    public void setAcctLocaleName(String value) {
        this.acctLocaleName = value;
    }

    
}
