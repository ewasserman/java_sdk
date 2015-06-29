package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "new_acct_custom_rates_row", propOrder = {
    "customRatePlanNo",
    "customRateServiceNo",
    "customRateSeqNo",
    "customRateFromUnit",
    "customRateToUnit",
    "customRatePerUnit",
    "clientCustomRatePlanId",
    "clientCustomRateServiceId"
    })
public class NewAcctCustomRatesRow {

    @XmlElement(name = "custom_rate_plan_no")
    protected Long customRatePlanNo;
    @XmlElement(name = "custom_rate_service_no")
    protected Long customRateServiceNo;
    @XmlElement(name = "custom_rate_seq_no")
    protected Long customRateSeqNo;
    @XmlElement(name = "custom_rate_from_unit")
    protected Long customRateFromUnit;
    @XmlElement(name = "custom_rate_to_unit")
    protected Long customRateToUnit;
    @XmlElement(name = "custom_rate_per_unit")
    protected Double customRatePerUnit;
    @XmlElement(name = "client_custom_rate_plan_id")
    protected String clientCustomRatePlanId;
    @XmlElement(name = "client_custom_rate_service_id")
    protected String clientCustomRateServiceId;
    public Long getCustomRatePlanNo() {
        return customRatePlanNo;
    }

    public void setCustomRatePlanNo(Long value) {
        this.customRatePlanNo = value;
    }

    public Long getCustomRateServiceNo() {
        return customRateServiceNo;
    }

    public void setCustomRateServiceNo(Long value) {
        this.customRateServiceNo = value;
    }

    public Long getCustomRateSeqNo() {
        return customRateSeqNo;
    }

    public void setCustomRateSeqNo(Long value) {
        this.customRateSeqNo = value;
    }

    public Long getCustomRateFromUnit() {
        return customRateFromUnit;
    }

    public void setCustomRateFromUnit(Long value) {
        this.customRateFromUnit = value;
    }

    public Long getCustomRateToUnit() {
        return customRateToUnit;
    }

    public void setCustomRateToUnit(Long value) {
        this.customRateToUnit = value;
    }

    public Double getCustomRatePerUnit() {
        return customRatePerUnit;
    }

    public void setCustomRatePerUnit(Double value) {
        this.customRatePerUnit = value;
    }

    public String getClientCustomRatePlanId() {
        return clientCustomRatePlanId;
    }

    public void setClientCustomRatePlanId(String value) {
        this.clientCustomRatePlanId = value;
    }

    public String getClientCustomRateServiceId() {
        return clientCustomRateServiceId;
    }

    public void setClientCustomRateServiceId(String value) {
        this.clientCustomRateServiceId = value;
    }

    
}
