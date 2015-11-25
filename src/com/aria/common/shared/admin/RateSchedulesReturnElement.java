package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rate_schedules_ReturnElement", propOrder = {"currency", "rateInfo", "isDefault", "fromUnit", "toUnit", "ratePerUnit"})
public class RateSchedulesReturnElement {

    @XmlElement(name = "currency")
    protected String currency;
    @XmlElement(name = "rate_info")
    protected List<RateInfoReturnElement> rateInfo;
    @XmlElement(name = "is_default")
    protected Long isDefault;
    @XmlElement(name = "from_unit")
    protected String fromUnit;
    @XmlElement(name = "to_unit")
    protected String toUnit;
    @XmlElement(name = "rate_per_unit")
    protected Double ratePerUnit;
    
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String value) {
        this.currency = value;
    }

    public List<RateInfoReturnElement> getRateInfo() {
        if (this.rateInfo == null) {
            this.rateInfo = new ArrayList<RateInfoReturnElement>();
        }
        return this.rateInfo;
    }public Long getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Long value) {
        this.isDefault = value;
    }

    public String getFromUnit() {
        return fromUnit;
    }

    public void setFromUnit(String value) {
        this.fromUnit = value;
    }

    public String getToUnit() {
        return toUnit;
    }

    public void setToUnit(String value) {
        this.toUnit = value;
    }

    public Double getRatePerUnit() {
        return ratePerUnit;
    }

    public void setRatePerUnit(Double value) {
        this.ratePerUnit = value;
    }

    
}
