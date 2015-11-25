package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "schedule_ReturnElement", propOrder = {"scheduleNo", "scheduleName", "clientRateScheduleId", "currencyCd", "isDefault", "taxInclusiveInd", "tier"})
public class ScheduleReturnElement {

    @XmlElement(name = "schedule_no")
    protected Long scheduleNo;
    @XmlElement(name = "schedule_name")
    protected String scheduleName;
    @XmlElement(name = "client_rate_schedule_id")
    protected String clientRateScheduleId;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "is_default")
    protected String isDefault;
    @XmlElement(name = "tax_inclusive_ind")
    protected String taxInclusiveInd;
    @XmlElement(name = "tier")
    protected List<TierReturnElement> tier;
    
    public Long getScheduleNo() {
        return scheduleNo;
    }

    public void setScheduleNo(Long value) {
        this.scheduleNo = value;
    }

    public String getScheduleName() {
        return scheduleName;
    }

    public void setScheduleName(String value) {
        this.scheduleName = value;
    }

    public String getClientRateScheduleId() {
        return clientRateScheduleId;
    }

    public void setClientRateScheduleId(String value) {
        this.clientRateScheduleId = value;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String value) {
        this.isDefault = value;
    }

    public String getTaxInclusiveInd() {
        return taxInclusiveInd;
    }

    public void setTaxInclusiveInd(String value) {
        this.taxInclusiveInd = value;
    }

    public List<TierReturnElement> getTier() {
        if (this.tier == null) {
            this.tier = new ArrayList<TierReturnElement>();
        }
        return this.tier;
    }
}
