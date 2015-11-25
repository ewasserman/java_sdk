package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "schedule_ReturnElement", propOrder = {"scheduleName", "currencyCd", "clientRateScheduleId", "isDefault", "taxInclusiveRate", "tier"})
public class ScheduleReturnElement {

    @XmlElement(name = "schedule_name")
    protected String scheduleName;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "client_rate_schedule_id")
    protected String clientRateScheduleId;
    @XmlElement(name = "is_default")
    protected Long isDefault;
    @XmlElement(name = "tax_inclusive_rate")
    protected Long taxInclusiveRate;
    @XmlElement(name = "tier")
    protected List<TierReturnElement> tier;
    
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

    public String getClientRateScheduleId() {
        return clientRateScheduleId;
    }

    public void setClientRateScheduleId(String value) {
        this.clientRateScheduleId = value;
    }

    public Long getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Long value) {
        this.isDefault = value;
    }

    public Long getTaxInclusiveRate() {
        return taxInclusiveRate;
    }

    public void setTaxInclusiveRate(Long value) {
        this.taxInclusiveRate = value;
    }

    public List<TierReturnElement> getTier() {
        if (this.tier == null) {
            this.tier = new ArrayList<TierReturnElement>();
        }
        return this.tier;
    }
}
