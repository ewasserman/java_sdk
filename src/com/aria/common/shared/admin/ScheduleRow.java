package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "schedule_row", propOrder = {
    "scheduleName",
    "currencyCd",
    "isDefault",
    "minSurchargeToApply"
    })
public class ScheduleRow {

    @XmlElement(name = "schedule_name")
    protected String scheduleName;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "is_default")
    protected Long isDefault;
    @XmlElement(name = "min_surcharge_to_apply")
    protected Double minSurchargeToApply;
    public String getScheduleName() {
        return scheduleName;
    }

    public void setScheduleName(String value) {
        this.scheduleName = value;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }

    public Long getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Long value) {
        this.isDefault = value;
    }

    public Double getMinSurchargeToApply() {
        return minSurchargeToApply;
    }

    public void setMinSurchargeToApply(Double value) {
        this.minSurchargeToApply = value;
    }

    
}
