package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "planInstanceNo",    "clientPlanInstanceId",    "customAcctRates",    "serviceNo",    "clientServiceId"})
@XmlRootElement(name = "assign_custom_acct_plan_rates_m")
public class AssignCustomAcctPlanRatesM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "plan_instance_no")
    protected Long planInstanceNo;
        @XmlElement(name = "client_plan_instance_id")
    protected String clientPlanInstanceId;
        @XmlElement(name = "custom_acct_rates")
    protected CustomAcctRatesArray customAcctRates;
        @XmlElement(name = "service_no")
    protected Long serviceNo;
        @XmlElement(name = "client_service_id")
    protected String clientServiceId;
    
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
            public Long getPlanInstanceNo() {
        return planInstanceNo;
    }

    public void setPlanInstanceNo(Long value) {
        this.planInstanceNo = value;
    }
            public String getClientPlanInstanceId() {
        return clientPlanInstanceId;
    }

    public void setClientPlanInstanceId(String value) {
        this.clientPlanInstanceId = value;
    }
            public CustomAcctRatesArray getCustomAcctRates() {
        return customAcctRates;
    }

    public void setCustomAcctRates(CustomAcctRatesArray value) {
        this.customAcctRates = value;
    }
            public Long getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(Long value) {
        this.serviceNo = value;
    }
            public String getClientServiceId() {
        return clientServiceId;
    }

    public void setClientServiceId(String value) {
        this.clientServiceId = value;
    }
            
}
