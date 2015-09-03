package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nso_group_price_override_row", propOrder = {
    "rateScheduleNo",
    "clientRateScheduleId",
    "overridePrice"
    })
public class NsoGroupPriceOverrideRow {

    @XmlElement(name = "rate_schedule_no")
    protected Long rateScheduleNo;
    @XmlElement(name = "client_rate_schedule_id")
    protected String clientRateScheduleId;
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

    public String getOverridePrice() {
        return overridePrice;
    }

    public void setOverridePrice(String value) {
        this.overridePrice = value;
    }

    
}
