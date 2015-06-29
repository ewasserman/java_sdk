package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "ccNum",    "includeDetails"})
@XmlRootElement(name = "compare_against_cc_blacklist")
public class CompareAgainstCcBlacklist {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "cc_num")
    protected String ccNum;
        @XmlElement(name = "include_details")
    protected Long includeDetails;
    
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

    public String getCcNum() {
        return ccNum;
    }

    public void setCcNum(String value) {
        this.ccNum = value;
    }
            public Long getIncludeDetails() {
        return includeDetails;
    }

    public void setIncludeDetails(Long value) {
        this.includeDetails = value;
    }
            
}
