package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_nso_group_price_override_ReturnElement", propOrder = {"rateScheduleNo", "clientRateScheduleId", "currencyCd", "overridePrice"})
public class PlanNsoGroupPriceOverrideReturnElement {

    @XmlElement(name = "rate_schedule_no")
    protected Long rateScheduleNo;
    @XmlElement(name = "client_rate_schedule_id")
    protected String clientRateScheduleId;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "override_price")
    protected String overridePrice;
    
    public Long getRateScheduleNo() {
        return rateScheduleNo;
    }

    public void setRateScheduleNo(Long value) {
        this.rateScheduleNo = value;
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

    public String getOverridePrice() {
        return overridePrice;
    }

    public void setOverridePrice(String value) {
        this.overridePrice = value;
    }

    
}
