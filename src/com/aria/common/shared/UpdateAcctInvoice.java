package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "accountNo",    "srcTransactionId",    "customStatusLabel",    "clientNotes",    "postingStatusCd"})
@XmlRootElement(name = "update_acct_invoice")
public class UpdateAcctInvoice {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "account_no")
    protected Long accountNo;
        @XmlElement(name = "src_transaction_id")
    protected Long srcTransactionId;
        @XmlElement(name = "custom_status_label")
    protected String customStatusLabel;
        @XmlElement(name = "client_notes")
    protected String clientNotes;
        @XmlElement(name = "posting_status_cd")
    protected Long postingStatusCd;
    
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
            public Long getSrcTransactionId() {
        return srcTransactionId;
    }

    public void setSrcTransactionId(Long value) {
        this.srcTransactionId = value;
    }
            public String getCustomStatusLabel() {
        return customStatusLabel;
    }

    public void setCustomStatusLabel(String value) {
        this.customStatusLabel = value;
    }
            public String getClientNotes() {
        return clientNotes;
    }

    public void setClientNotes(String value) {
        this.clientNotes = value;
    }
            public Long getPostingStatusCd() {
        return postingStatusCd;
    }

    public void setPostingStatusCd(Long value) {
        this.postingStatusCd = value;
    }
            
}
