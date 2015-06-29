package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "clientAcctId",    "masterPlanInstanceId",    "clientMasterPlanInstanceId",    "usageDetailsFlag",    "includeAllUsageUnitThresholds",    "planNo",    "usageTypeNo",    "usageTypeCd",    "retrieveExcludedUsage"})
@XmlRootElement(name = "get_unbilled_usage_summary_m")
public class GetUnbilledUsageSummaryM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
        @XmlElement(name = "master_plan_instance_id")
    protected Long masterPlanInstanceId;
        @XmlElement(name = "client_master_plan_instance_id")
    protected String clientMasterPlanInstanceId;
        @XmlElement(name = "usage_details_flag")
    protected String usageDetailsFlag;
        @XmlElement(name = "include_all_usage_unit_thresholds")
    protected String includeAllUsageUnitThresholds;
        @XmlElement(name = "plan_no")
    protected Long planNo;
        @XmlElement(name = "usage_type_no")
    protected Long usageTypeNo;
        @XmlElement(name = "usage_type_cd")
    protected String usageTypeCd;
        @XmlElement(name = "retrieve_excluded_usage")
    protected String retrieveExcludedUsage;
    
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
            public Long getMasterPlanInstanceId() {
        return masterPlanInstanceId;
    }

    public void setMasterPlanInstanceId(Long value) {
        this.masterPlanInstanceId = value;
    }
            public String getClientMasterPlanInstanceId() {
        return clientMasterPlanInstanceId;
    }

    public void setClientMasterPlanInstanceId(String value) {
        this.clientMasterPlanInstanceId = value;
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
            public String getUsageTypeCd() {
        return usageTypeCd;
    }

    public void setUsageTypeCd(String value) {
        this.usageTypeCd = value;
    }
            public String getRetrieveExcludedUsage() {
        return retrieveExcludedUsage;
    }

    public void setRetrieveExcludedUsage(String value) {
        this.retrieveExcludedUsage = value;
    }
            
}
