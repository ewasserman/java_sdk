package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "account_surcharges_row", propOrder = {
    "surchargeNo",
    "surchargeDirective",
    "rateScheduleNo"
    })
public class AccountSurchargesRow {

    @XmlElement(name = "surcharge_no")
    protected Long surchargeNo;
    @XmlElement(name = "surcharge_directive")
    protected Long surchargeDirective;
    @XmlElement(name = "rate_schedule_no")
    protected Long rateScheduleNo;
    public Long getSurchargeNo() {
        return surchargeNo;
    }

    public void setSurchargeNo(Long value) {
        this.surchargeNo = value;
    }

    public Long getSurchargeDirective() {
        return surchargeDirective;
    }

    public void setSurchargeDirective(Long value) {
        this.surchargeDirective = value;
    }

    public Long getRateScheduleNo() {
        return rateScheduleNo;
    }

    public void setRateScheduleNo(Long value) {
        this.rateScheduleNo = value;
    }

    
}
