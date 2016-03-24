package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "clientAcctId",    "referenceCode",    "paymentAmount",    "processorId",    "payMethodType",    "statementNo",    "comments",    "clientReceiptId",    "allowRecurring"})
@XmlRootElement(name = "record_alternative_payment_m")
public class RecordAlternativePaymentM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
        @XmlElement(name = "reference_code")
    protected String referenceCode;
        @XmlElement(name = "payment_amount")
    protected Double paymentAmount;
        @XmlElement(name = "processor_id")
    protected Long processorId;
        @XmlElement(name = "pay_method_type")
    protected Long payMethodType;
        @XmlElement(name = "statement_no")
    protected Long statementNo;
        @XmlElement(name = "comments")
    protected String comments;
        @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
        @XmlElement(name = "allow_recurring")
    protected String allowRecurring;
    
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
            public String getClientAcctId() {
        return clientAcctId;
    }

    public void setClientAcctId(String value) {
        this.clientAcctId = value;
    }
            public String getReferenceCode() {
        return referenceCode;
    }

    public void setReferenceCode(String value) {
        this.referenceCode = value;
    }
            public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double value) {
        this.paymentAmount = value;
    }
            public Long getProcessorId() {
        return processorId;
    }

    public void setProcessorId(Long value) {
        this.processorId = value;
    }
            public Long getPayMethodType() {
        return payMethodType;
    }

    public void setPayMethodType(Long value) {
        this.payMethodType = value;
    }
            public Long getStatementNo() {
        return statementNo;
    }

    public void setStatementNo(Long value) {
        this.statementNo = value;
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
            public String getAllowRecurring() {
        return allowRecurring;
    }

    public void setAllowRecurring(String value) {
        this.allowRecurring = value;
    }
            
}
