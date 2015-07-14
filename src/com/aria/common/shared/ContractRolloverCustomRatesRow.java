package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contract_rollover_custom_rates_row", propOrder = {
    "customRatePlanInstanceNo",
    "customRateClientPlanInstanceId",
    "customRateServiceNo",
    "customRateClientServiceId",
    "customRateSeqNo",
    "customRateFromUnit",
    "customRateToUnit",
    "customRatePerUnit"
    })
public class ContractRolloverCustomRatesRow {

    @XmlElement(name = "custom_rate_plan_instance_no")
    protected Long customRatePlanInstanceNo;
    @XmlElement(name = "custom_rate_client_plan_instance_id")
    protected String customRateClientPlanInstanceId;
    @XmlElement(name = "custom_rate_service_no")
    protected Long customRateServiceNo;
    @XmlElement(name = "custom_rate_client_service_id")
    protected String customRateClientServiceId;
    @XmlElement(name = "custom_rate_seq_no")
    protected Long customRateSeqNo;
    @XmlElement(name = "custom_rate_from_unit")
    protected Long customRateFromUnit;
    @XmlElement(name = "custom_rate_to_unit")
    protected Long customRateToUnit;
    @XmlElement(name = "custom_rate_per_unit")
    protected Double customRatePerUnit;
    public Long getCustomRatePlanInstanceNo() {
        return customRatePlanInstanceNo;
    }

    public void setCustomRatePlanInstanceNo(Long value) {
        this.customRatePlanInstanceNo = value;
    }

    public String getCustomRateClientPlanInstanceId() {
        return customRateClientPlanInstanceId;
    }

    public void setCustomRateClientPlanInstanceId(String value) {
        this.customRateClientPlanInstanceId = value;
    }

    public Long getCustomRateServiceNo() {
        return customRateServiceNo;
    }

    public void setCustomRateServiceNo(Long value) {
        this.customRateServiceNo = value;
    }

    public String getCustomRateClientServiceId() {
        return customRateClientServiceId;
    }

    public void setCustomRateClientServiceId(String value) {
        this.customRateClientServiceId = value;
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

    
}
