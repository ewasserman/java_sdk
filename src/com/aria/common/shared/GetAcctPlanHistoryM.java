package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "filterPlanInstanceNo",    "filterClientPlanInstanceId"})
@XmlRootElement(name = "get_acct_plan_history_m")
public class GetAcctPlanHistoryM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "filter_plan_instance_no")
    protected Long filterPlanInstanceNo;
        @XmlElement(name = "filter_client_plan_instance_id")
    protected String filterClientPlanInstanceId;
    
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
            public Long getFilterPlanInstanceNo() {
        return filterPlanInstanceNo;
    }

    public void setFilterPlanInstanceNo(Long value) {
        this.filterPlanInstanceNo = value;
    }
            public String getFilterClientPlanInstanceId() {
        return filterClientPlanInstanceId;
    }

    public void setFilterClientPlanInstanceId(String value) {
        this.filterClientPlanInstanceId = value;
    }
            
}
