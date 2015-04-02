package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "accountNo",    "bankRoutingNum",    "bankAcctNum",    "doCollect",    "changeStatusAfterColl",    "resetDatesAfterStatus",    "bankAcctType",    "clientReceiptId"})
@XmlRootElement(name = "set_pay_method_bank_draft")
public class SetPayMethodBankDraft {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "account_no")
    protected Long accountNo;
        @XmlElement(name = "bank_routing_num")
    protected String bankRoutingNum;
        @XmlElement(name = "bank_acct_num")
    protected String bankAcctNum;
        @XmlElement(name = "do_collect")
    protected String doCollect;
        @XmlElement(name = "change_status_after_coll")
    protected String changeStatusAfterColl;
        @XmlElement(name = "reset_dates_after_status")
    protected String resetDatesAfterStatus;
        @XmlElement(name = "bank_acct_type")
    protected String bankAcctType;
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

    public Long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Long value) {
        this.accountNo = value;
    }
            public String getBankRoutingNum() {
        return bankRoutingNum;
    }

    public void setBankRoutingNum(String value) {
        this.bankRoutingNum = value;
    }
            public String getBankAcctNum() {
        return bankAcctNum;
    }

    public void setBankAcctNum(String value) {
        this.bankAcctNum = value;
    }
            public String getDoCollect() {
        return doCollect;
    }

    public void setDoCollect(String value) {
        this.doCollect = value;
    }
            public String getChangeStatusAfterColl() {
        return changeStatusAfterColl;
    }

    public void setChangeStatusAfterColl(String value) {
        this.changeStatusAfterColl = value;
    }
            public String getResetDatesAfterStatus() {
        return resetDatesAfterStatus;
    }

    public void setResetDatesAfterStatus(String value) {
        this.resetDatesAfterStatus = value;
    }
            public String getBankAcctType() {
        return bankAcctType;
    }

    public void setBankAcctType(String value) {
        this.bankAcctType = value;
    }
            public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
    }
            
}
