package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_service_rates_ReturnElement", propOrder = {"rateSeqNo", "fromUnit", "toUnit", "ratePerUnit", "monthlyFee", "rateTierDescription"})
public class PlanServiceRatesReturnElement {

    @XmlElement(name = "rate_seq_no")
    protected Long rateSeqNo;
    @XmlElement(name = "from_unit")
    protected Double fromUnit;
    @XmlElement(name = "to_unit")
    protected Double toUnit;
    @XmlElement(name = "rate_per_unit")
    protected Double ratePerUnit;
    @XmlElement(name = "monthly_fee")
    protected Double monthlyFee;
    @XmlElement(name = "rate_tier_description")
    protected String rateTierDescription;
    
    public Long getRateSeqNo() {
        return rateSeqNo;
    }

    public void setRateSeqNo(Long value) {
        this.rateSeqNo = value;
    }

    public Double getFromUnit() {
        return fromUnit;
    }

    public void setFromUnit(Double value) {
        this.fromUnit = value;
    }

    public Double getToUnit() {
        return toUnit;
    }

    public void setToUnit(Double value) {
        this.toUnit = value;
    }

    public Double getRatePerUnit() {
        return ratePerUnit;
    }

    public void setRatePerUnit(Double value) {
        this.ratePerUnit = value;
    }

    public Double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(Double value) {
        this.monthlyFee = value;
    }

    public String getRateTierDescription() {
        return rateTierDescription;
    }

    public void setRateTierDescription(String value) {
        this.rateTierDescription = value;
    }

    
}
