package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contract_rollover_custom_rate_info_ReturnElement", propOrder = {"customRatePlanInstanceNo", "customRateClientPlanInstanceId", "customRateServiceNo", "customClientRateServiceId", "customRateSeqNo", "customRateFromUnit", "customRateToUnit", "customRatePerUnit"})
public class ContractRolloverCustomRateInfoReturnElement {

    @XmlElement(name = "custom_rate_plan_instance_no")
    protected Long customRatePlanInstanceNo;
    @XmlElement(name = "custom_rate_client_plan_instance_id")
    protected String customRateClientPlanInstanceId;
    @XmlElement(name = "custom_rate_service_no")
    protected Long customRateServiceNo;
    @XmlElement(name = "custom_client_rate_service_id")
    protected String customClientRateServiceId;
    @XmlElement(name = "custom_rate_seq_no")
    protected String customRateSeqNo;
    @XmlElement(name = "custom_rate_from_unit")
    protected String customRateFromUnit;
    @XmlElement(name = "custom_rate_to_unit")
    protected String customRateToUnit;
    @XmlElement(name = "custom_rate_per_unit")
    protected String customRatePerUnit;
    
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

    public String getCustomClientRateServiceId() {
        return customClientRateServiceId;
    }

    public void setCustomClientRateServiceId(String value) {
        this.customClientRateServiceId = value;
    }

    public String getCustomRateSeqNo() {
        return customRateSeqNo;
    }

    public void setCustomRateSeqNo(String value) {
        this.customRateSeqNo = value;
    }

    public String getCustomRateFromUnit() {
        return customRateFromUnit;
    }

    public void setCustomRateFromUnit(String value) {
        this.customRateFromUnit = value;
    }

    public String getCustomRateToUnit() {
        return customRateToUnit;
    }

    public void setCustomRateToUnit(String value) {
        this.customRateToUnit = value;
    }

    public String getCustomRatePerUnit() {
        return customRatePerUnit;
    }

    public void setCustomRatePerUnit(String value) {
        this.customRatePerUnit = value;
    }

    
}
