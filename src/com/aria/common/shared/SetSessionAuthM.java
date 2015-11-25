package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "userId",    "password",    "altCallerId"})
@XmlRootElement(name = "set_session_auth_m")
public class SetSessionAuthM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "user_id")
    protected String userId;
        @XmlElement(name = "password")
    protected String password;
        @XmlElement(name = "alt_caller_id")
    protected String altCallerId;
    
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String value) {
        this.userId = value;
    }
            public String getPassword() {
        return password;
    }

    public void setPassword(String value) {
        this.password = value;
    }
            public String getAltCallerId() {
        return altCallerId;
    }

    public void setAltCallerId(String value) {
        this.altCallerId = value;
    }
            
}
