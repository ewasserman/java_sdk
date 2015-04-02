package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "messageId",    "doEncoding"})
@XmlRootElement(name = "get_acct_message_size")
public class GetAcctMessageSize {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "message_id")
    protected Long messageId;
        @XmlElement(name = "do_encoding")
    protected String doEncoding;
    
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
            public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long value) {
        this.messageId = value;
    }
            public String getDoEncoding() {
        return doEncoding;
    }

    public void setDoEncoding(String value) {
        this.doEncoding = value;
    }
            
}
