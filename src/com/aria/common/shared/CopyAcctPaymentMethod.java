package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "sourceAcctNo",    "clientSourceAcctId",    "targetAcctNo",    "clientTargetAcctId"})
@XmlRootElement(name = "copy_acct_payment_method")
public class CopyAcctPaymentMethod {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "source_acct_no")
    protected Long sourceAcctNo;
        @XmlElement(name = "client_source_acct_id")
    protected String clientSourceAcctId;
        @XmlElement(name = "target_acct_no")
    protected Long targetAcctNo;
        @XmlElement(name = "client_target_acct_id")
    protected String clientTargetAcctId;
    
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

    public Long getSourceAcctNo() {
        return sourceAcctNo;
    }

    public void setSourceAcctNo(Long value) {
        this.sourceAcctNo = value;
    }
            public String getClientSourceAcctId() {
        return clientSourceAcctId;
    }

    public void setClientSourceAcctId(String value) {
        this.clientSourceAcctId = value;
    }
            public Long getTargetAcctNo() {
        return targetAcctNo;
    }

    public void setTargetAcctNo(Long value) {
        this.targetAcctNo = value;
    }
            public String getClientTargetAcctId() {
        return clientTargetAcctId;
    }

    public void setClientTargetAcctId(String value) {
        this.clientTargetAcctId = value;
    }
            
}
