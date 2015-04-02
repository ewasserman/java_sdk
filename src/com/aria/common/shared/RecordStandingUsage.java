package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "usageType",    "usageTypeCode",    "usageUnits",    "nextUsageDate",    "altDesc",    "planNo",    "firstUsageDate",    "recurringInd",    "clientPlanId"})
@XmlRootElement(name = "record_standing_usage")
public class RecordStandingUsage {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "usage_type")
    protected Long usageType;
        @XmlElement(name = "usage_type_code")
    protected String usageTypeCode;
        @XmlElement(name = "usage_units")
    protected Double usageUnits;
        @XmlElement(name = "next_usage_date")
    protected String nextUsageDate;
        @XmlElement(name = "alt_desc")
    protected String altDesc;
        @XmlElement(name = "plan_no")
    protected Long planNo;
        @XmlElement(name = "first_usage_date")
    protected String firstUsageDate;
        @XmlElement(name = "recurring_ind")
    protected String recurringInd;
        @XmlElement(name = "client_plan_id")
    protected String clientPlanId;
    
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
            public Long getUsageType() {
        return usageType;
    }

    public void setUsageType(Long value) {
        this.usageType = value;
    }
            public String getUsageTypeCode() {
        return usageTypeCode;
    }

    public void setUsageTypeCode(String value) {
        this.usageTypeCode = value;
    }
            public Double getUsageUnits() {
        return usageUnits;
    }

    public void setUsageUnits(Double value) {
        this.usageUnits = value;
    }
            public String getNextUsageDate() {
        return nextUsageDate;
    }

    public void setNextUsageDate(String value) {
        this.nextUsageDate = value;
    }
            public String getAltDesc() {
        return altDesc;
    }

    public void setAltDesc(String value) {
        this.altDesc = value;
    }
            public Long getPlanNo() {
        return planNo;
    }

    public void setPlanNo(Long value) {
        this.planNo = value;
    }
            public String getFirstUsageDate() {
        return firstUsageDate;
    }

    public void setFirstUsageDate(String value) {
        this.firstUsageDate = value;
    }
            public String getRecurringInd() {
        return recurringInd;
    }

    public void setRecurringInd(String value) {
        this.recurringInd = value;
    }
            public String getClientPlanId() {
        return clientPlanId;
    }

    public void setClientPlanId(String value) {
        this.clientPlanId = value;
    }
            
}
