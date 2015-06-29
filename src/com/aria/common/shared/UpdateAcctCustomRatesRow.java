package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "update_acct_custom_rates_row", propOrder = {
    "customRateServiceNo",
    "customRateSeqNo",
    "customRateFromUnit",
    "customRateToUnit",
    "customRatePerUnit",
    "customRateClientServiceId"
    })
public class UpdateAcctCustomRatesRow {

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
    @XmlElement(name = "custom_rate_client_service_id")
    protected String customRateClientServiceId;
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

    public String getCustomRateClientServiceId() {
        return customRateClientServiceId;
    }

    public void setCustomRateClientServiceId(String value) {
        this.customRateClientServiceId = value;
    }

    
}
