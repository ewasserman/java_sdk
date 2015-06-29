package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "clientReceiptId",    "planInstanceNo",    "clientPlanInstanceId",    "assignmentDirective",    "comments",    "altProrationStartDate",    "effectiveDate",    "offsetInterval",    "invoiceUnbilledUsage",    "doWrite"})
@XmlRootElement(name = "cancel_acct_plan_m")
public class CancelAcctPlanM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
        @XmlElement(name = "plan_instance_no")
    protected Long planInstanceNo;
        @XmlElement(name = "client_plan_instance_id")
    protected String clientPlanInstanceId;
        @XmlElement(name = "assignment_directive")
    protected Long assignmentDirective;
        @XmlElement(name = "comments")
    protected String comments;
        @XmlElement(name = "alt_proration_start_date")
    protected String altProrationStartDate;
        @XmlElement(name = "effective_date")
    protected String effectiveDate;
        @XmlElement(name = "offset_interval")
    protected Long offsetInterval;
        @XmlElement(name = "invoice_unbilled_usage")
    protected String invoiceUnbilledUsage;
        @XmlElement(name = "do_write")
    protected String doWrite;
    
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
            public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
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
            public Long getAssignmentDirective() {
        return assignmentDirective;
    }

    public void setAssignmentDirective(Long value) {
        this.assignmentDirective = value;
    }
            public String getComments() {
        return comments;
    }

    public void setComments(String value) {
        this.comments = value;
    }
            public String getAltProrationStartDate() {
        return altProrationStartDate;
    }

    public void setAltProrationStartDate(String value) {
        this.altProrationStartDate = value;
    }
            public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
    }
            public Long getOffsetInterval() {
        return offsetInterval;
    }

    public void setOffsetInterval(Long value) {
        this.offsetInterval = value;
    }
            public String getInvoiceUnbilledUsage() {
        return invoiceUnbilledUsage;
    }

    public void setInvoiceUnbilledUsage(String value) {
        this.invoiceUnbilledUsage = value;
    }
            public String getDoWrite() {
        return doWrite;
    }

    public void setDoWrite(String value) {
        this.doWrite = value;
    }
            
}
