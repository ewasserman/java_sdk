package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "usageDetailsFlag",    "includeAllUsageUnitThresholds",    "planNo",    "usageTypeNo",    "usageTypeCode"})
@XmlRootElement(name = "get_unbilled_usage_summary")
public class GetUnbilledUsageSummary {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "usage_details_flag")
    protected String usageDetailsFlag;
        @XmlElement(name = "include_all_usage_unit_thresholds")
    protected String includeAllUsageUnitThresholds;
        @XmlElement(name = "plan_no")
    protected Long planNo;
        @XmlElement(name = "usage_type_no")
    protected Long usageTypeNo;
        @XmlElement(name = "usage_type_code")
    protected String usageTypeCode;
    
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
            public String getUsageDetailsFlag() {
        return usageDetailsFlag;
    }

    public void setUsageDetailsFlag(String value) {
        this.usageDetailsFlag = value;
    }
            public String getIncludeAllUsageUnitThresholds() {
        return includeAllUsageUnitThresholds;
    }

    public void setIncludeAllUsageUnitThresholds(String value) {
        this.includeAllUsageUnitThresholds = value;
    }
            public Long getPlanNo() {
        return planNo;
    }

    public void setPlanNo(Long value) {
        this.planNo = value;
    }
            public Long getUsageTypeNo() {
        return usageTypeNo;
    }

    public void setUsageTypeNo(Long value) {
        this.usageTypeNo = value;
    }
            public String getUsageTypeCode() {
        return usageTypeCode;
    }

    public void setUsageTypeCode(String value) {
        this.usageTypeCode = value;
    }
            
}
