package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "amount",    "usageUnitThresholds"})
@XmlRootElement(name = "set_acct_usg_daily_threshold")
public class SetAcctUsgDailyThreshold {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "amount")
    protected Double amount;
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

    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }
            public Double getAmount() {
        return amount;
    }

    public void setAmount(Double value) {
        this.amount = value;
    }
            public UsageUnitThresholdsArray getUsageUnitThresholds() {
        return usageUnitThresholds;
    }

    public void setUsageUnitThresholds(UsageUnitThresholdsArray value) {
        this.usageUnitThresholds = value;
    }
            
}
