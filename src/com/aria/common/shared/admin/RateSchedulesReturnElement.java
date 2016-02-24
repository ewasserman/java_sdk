package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rate_schedules_ReturnElement", propOrder = {"currency", "rateInfo", "isDefault"})
public class RateSchedulesReturnElement {

    @XmlElement(name = "currency")
    protected String currency;
    @XmlElement(name = "rate_info")
    protected List<RateInfoReturnElement> rateInfo;
    @XmlElement(name = "is_default")
    protected Long isDefault;
    
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

    
}
