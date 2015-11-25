package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "actionDirective",    "adjustmentDays",    "adjustmentDate",    "comments"})
@XmlRootElement(name = "adjust_billing_dates")
public class AdjustBillingDates {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "action_directive")
    protected Long actionDirective;
        @XmlElement(name = "adjustment_days")
    protected Long adjustmentDays;
        @XmlElement(name = "adjustment_date")
    protected String adjustmentDate;
        @XmlElement(name = "comments")
    protected String comments;
    
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
            public Long getActionDirective() {
        return actionDirective;
    }

    public void setActionDirective(Long value) {
        this.actionDirective = value;
    }
            public Long getAdjustmentDays() {
        return adjustmentDays;
    }

    public void setAdjustmentDays(Long value) {
        this.adjustmentDays = value;
    }
            public String getAdjustmentDate() {
        return adjustmentDate;
    }

    public void setAdjustmentDate(String value) {
        this.adjustmentDate = value;
    }
            public String getComments() {
        return comments;
    }

    public void setComments(String value) {
        this.comments = value;
    }
            
}
