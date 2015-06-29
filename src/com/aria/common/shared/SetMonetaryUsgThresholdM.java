package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "thresholdScope",    "thresholdCategory",    "amount",    "acctNo",    "clientAcctId",    "masterPlanInstanceId",    "clientMasterPlanInstanceId",    "usageUnitThresholds"})
@XmlRootElement(name = "set_monetary_usg_threshold_m")
public class SetMonetaryUsgThresholdM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "threshold_scope")
    protected Long thresholdScope;
        @XmlElement(name = "threshold_category")
    protected Long thresholdCategory;
        @XmlElement(name = "amount")
    protected Long amount;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
        @XmlElement(name = "master_plan_instance_id")
    protected Long masterPlanInstanceId;
        @XmlElement(name = "client_master_plan_instance_id")
    protected String clientMasterPlanInstanceId;
        @XmlElement(name = "usage_unit_thresholds")
    protected UsageUnitThresholdsArray usageUnitThresholds;
    
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

    public Long getThresholdScope() {
        return thresholdScope;
    }

    public void setThresholdScope(Long value) {
        this.thresholdScope = value;
    }
            public Long getThresholdCategory() {
        return thresholdCategory;
    }

    public void setThresholdCategory(Long value) {
        this.thresholdCategory = value;
    }
            public Long getAmount() {
        return amount;
    }

    public void setAmount(Long value) {
        this.amount = value;
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
            public UsageUnitThresholdsArray getUsageUnitThresholds() {
        return usageUnitThresholds;
    }

    public void setUsageUnitThresholds(UsageUnitThresholdsArray value) {
        this.usageUnitThresholds = value;
    }
            
}
