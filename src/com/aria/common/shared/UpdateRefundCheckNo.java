package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "acctUserId",    "clientAcctId",    "transactionId",    "refundCheckNumber"})
@XmlRootElement(name = "update_refund_check_no")
public class UpdateRefundCheckNo {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "acct_user_id")
    protected String acctUserId;
        @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
        @XmlElement(name = "transaction_id")
    protected Long transactionId;
        @XmlElement(name = "refund_check_number")
    protected Long refundCheckNumber;
    
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
            public String getAcctUserId() {
        return acctUserId;
    }

    public void setAcctUserId(String value) {
        this.acctUserId = value;
    }
            public String getClientAcctId() {
        return clientAcctId;
    }

    public void setClientAcctId(String value) {
        this.clientAcctId = value;
    }
            public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long value) {
        this.transactionId = value;
    }
            public Long getRefundCheckNumber() {
        return refundCheckNumber;
    }

    public void setRefundCheckNumber(Long value) {
        this.refundCheckNumber = value;
    }
            
}
