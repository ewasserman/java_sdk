package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "creditReasonCd",    "comments",    "creditAmount",    "specificInvoices",    "specificTransactions"})
@XmlRootElement(name = "apply_cash_credit_m")
public class ApplyCashCreditM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "credit_reason_cd")
    protected String creditReasonCd;
        @XmlElement(name = "comments")
    protected String comments;
        @XmlElement(name = "credit_amount")
    protected Double creditAmount;
        @XmlElement(name = "specific_invoices")
    protected SpecificInvoicesArray specificInvoices;
        @XmlElement(name = "specific_transactions")
    protected SpecificTransactionsArray specificTransactions;
    
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
            public String getCreditReasonCd() {
        return creditReasonCd;
    }

    public void setCreditReasonCd(String value) {
        this.creditReasonCd = value;
    }
            public String getComments() {
        return comments;
    }

    public void setComments(String value) {
        this.comments = value;
    }
            public Double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Double value) {
        this.creditAmount = value;
    }
            public SpecificInvoicesArray getSpecificInvoices() {
        return specificInvoices;
    }

    public void setSpecificInvoices(SpecificInvoicesArray value) {
        this.specificInvoices = value;
    }
            public SpecificTransactionsArray getSpecificTransactions() {
        return specificTransactions;
    }

    public void setSpecificTransactions(SpecificTransactionsArray value) {
        this.specificTransactions = value;
    }
            
}
