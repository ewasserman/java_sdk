package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "filterStatusCode",    "excludeTerminatedPlans"})
@XmlRootElement(name = "get_all_acct_contracts")
public class GetAllAcctContracts {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "filter_status_code")
    protected Long filterStatusCode;
        @XmlElement(name = "exclude_terminated_plans")
    protected String excludeTerminatedPlans;
    
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
            public Long getFilterStatusCode() {
        return filterStatusCode;
    }

    public void setFilterStatusCode(Long value) {
        this.filterStatusCode = value;
    }
            public String getExcludeTerminatedPlans() {
        return excludeTerminatedPlans;
    }

    public void setExcludeTerminatedPlans(String value) {
        this.excludeTerminatedPlans = value;
    }
            
}
