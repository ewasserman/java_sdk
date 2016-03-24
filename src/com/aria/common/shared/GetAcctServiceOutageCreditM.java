package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "clientAcctId",    "outageStartDate",    "outageEndDate",    "masterPlanInstanceNo",    "clientMasterPlanInstanceId",    "outageStartTime",    "outageEndTime",    "plansToGetOutage",    "adjustPercent",    "clientPlanIdsToGetOutage",    "localeNo",    "localeName"})
@XmlRootElement(name = "get_acct_service_outage_credit_m")
public class GetAcctServiceOutageCreditM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
        @XmlElement(name = "outage_start_date")
    protected String outageStartDate;
        @XmlElement(name = "outage_end_date")
    protected String outageEndDate;
        @XmlElement(name = "master_plan_instance_no")
    protected Long masterPlanInstanceNo;
        @XmlElement(name = "client_master_plan_instance_id")
    protected String clientMasterPlanInstanceId;
        @XmlElement(name = "outage_start_time")
    protected String outageStartTime;
        @XmlElement(name = "outage_end_time")
    protected String outageEndTime;
        @XmlElement(name = "plans_to_get_outage")
    protected PlansToGetOutageArray plansToGetOutage;
        @XmlElement(name = "adjust_percent")
    protected Double adjustPercent;
        @XmlElement(name = "client_plan_ids_to_get_outage")
    protected ClientPlanIdsToGetOutageArray clientPlanIdsToGetOutage;
        @XmlElement(name = "locale_no")
    protected Long localeNo;
        @XmlElement(name = "locale_name")
    protected String localeName;
    
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
            public String getClientAcctId() {
        return clientAcctId;
    }

    public void setClientAcctId(String value) {
        this.clientAcctId = value;
    }
            public String getOutageStartDate() {
        return outageStartDate;
    }

    public void setOutageStartDate(String value) {
        this.outageStartDate = value;
    }
            public String getOutageEndDate() {
        return outageEndDate;
    }

    public void setOutageEndDate(String value) {
        this.outageEndDate = value;
    }
            public Long getMasterPlanInstanceNo() {
        return masterPlanInstanceNo;
    }

    public void setMasterPlanInstanceNo(Long value) {
        this.masterPlanInstanceNo = value;
    }
            public String getClientMasterPlanInstanceId() {
        return clientMasterPlanInstanceId;
    }

    public void setClientMasterPlanInstanceId(String value) {
        this.clientMasterPlanInstanceId = value;
    }
            public String getOutageStartTime() {
        return outageStartTime;
    }

    public void setOutageStartTime(String value) {
        this.outageStartTime = value;
    }
            public String getOutageEndTime() {
        return outageEndTime;
    }

    public void setOutageEndTime(String value) {
        this.outageEndTime = value;
    }
            public PlansToGetOutageArray getPlansToGetOutage() {
        return plansToGetOutage;
    }

    public void setPlansToGetOutage(PlansToGetOutageArray value) {
        this.plansToGetOutage = value;
    }
            public Double getAdjustPercent() {
        return adjustPercent;
    }

    public void setAdjustPercent(Double value) {
        this.adjustPercent = value;
    }
            public ClientPlanIdsToGetOutageArray getClientPlanIdsToGetOutage() {
        return clientPlanIdsToGetOutage;
    }

    public void setClientPlanIdsToGetOutage(ClientPlanIdsToGetOutageArray value) {
        this.clientPlanIdsToGetOutage = value;
    }
            public Long getLocaleNo() {
        return localeNo;
    }

    public void setLocaleNo(Long value) {
        this.localeNo = value;
    }
            public String getLocaleName() {
        return localeName;
    }

    public void setLocaleName(String value) {
        this.localeName = value;
    }
            
}
