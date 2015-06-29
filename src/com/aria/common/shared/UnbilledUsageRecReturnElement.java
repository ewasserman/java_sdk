package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unbilled_usage_rec_ReturnElement", propOrder = {"planInstanceId", "usageTypeNo", "usageTypeDescription", "usageDate", "units", "specificRecordChargeAmount", "preRatedRate", "recordedUnits", "usageParentRecNo", "usageTypeCode", "excludeReasonCd", "usageRecNo"})
public class UnbilledUsageRecReturnElement {

    @XmlElement(name = "plan_instance_id")
    protected Long planInstanceId;
    @XmlElement(name = "usage_type_no")
    protected Long usageTypeNo;
    @XmlElement(name = "usage_type_description")
    protected String usageTypeDescription;
    @XmlElement(name = "usage_date")
    protected String usageDate;
    @XmlElement(name = "units")
    protected Double units;
    @XmlElement(name = "specific_record_charge_amount")
    protected Double specificRecordChargeAmount;
    @XmlElement(name = "pre_rated_rate")
    protected Double preRatedRate;
    @XmlElement(name = "recorded_units")
    protected Double recordedUnits;
    @XmlElement(name = "usage_parent_rec_no")
    protected Long usageParentRecNo;
    @XmlElement(name = "usage_type_code")
    protected String usageTypeCode;
    @XmlElement(name = "exclude_reason_cd")
    protected Long excludeReasonCd;
    @XmlElement(name = "usage_rec_no")
    protected Long usageRecNo;
    
    public Long getPlanInstanceId() {
        return planInstanceId;
    }

    public void setPlanInstanceId(Long value) {
        this.planInstanceId = value;
    }

    public Long getUsageTypeNo() {
        return usageTypeNo;
    }

    public void setUsageTypeNo(Long value) {
        this.usageTypeNo = value;
    }

    public String getUsageTypeDescription() {
        return usageTypeDescription;
    }

    public void setUsageTypeDescription(String value) {
        this.usageTypeDescription = value;
    }

    public String getUsageDate() {
        return usageDate;
    }

    public void setUsageDate(String value) {
        this.usageDate = value;
    }

    public Double getUnits() {
        return units;
    }

    public void setUnits(Double value) {
        this.units = value;
    }

    public Double getSpecificRecordChargeAmount() {
        return specificRecordChargeAmount;
    }

    public void setSpecificRecordChargeAmount(Double value) {
        this.specificRecordChargeAmount = value;
    }

    public Double getPreRatedRate() {
        return preRatedRate;
    }

    public void setPreRatedRate(Double value) {
        this.preRatedRate = value;
    }

    public Double getRecordedUnits() {
        return recordedUnits;
    }

    public void setRecordedUnits(Double value) {
        this.recordedUnits = value;
    }

    public Long getUsageParentRecNo() {
        return usageParentRecNo;
    }

    public void setUsageParentRecNo(Long value) {
        this.usageParentRecNo = value;
    }

    public String getUsageTypeCode() {
        return usageTypeCode;
    }

    public void setUsageTypeCode(String value) {
        this.usageTypeCode = value;
    }

    public Long getExcludeReasonCd() {
        return excludeReasonCd;
    }

    public void setExcludeReasonCd(Long value) {
        this.excludeReasonCd = value;
    }

    public Long getUsageRecNo() {
        return usageRecNo;
    }

    public void setUsageRecNo(Long value) {
        this.usageRecNo = value;
    }

    
}
