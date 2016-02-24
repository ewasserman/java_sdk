package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "surcharge_updates_row", propOrder = {
    "surchargeNo",
    "clientSurchargeId",
    "rateScheduleNo",
    "surchargeDirective"
    })
public class SurchargeUpdatesRow {

    @XmlElement(name = "surcharge_no")
    protected Long surchargeNo;
    @XmlElement(name = "client_surcharge_id")
    protected String clientSurchargeId;
    @XmlElement(name = "rate_schedule_no")
    protected Long rateScheduleNo;
    @XmlElement(name = "surcharge_directive")
    protected Long surchargeDirective;
    public Long getSurchargeNo() {
        return surchargeNo;
    }

    public void setSurchargeNo(Long value) {
        this.surchargeNo = value;
    }

    public String getClientSurchargeId() {
        return clientSurchargeId;
    }

    public void setClientSurchargeId(String value) {
        this.clientSurchargeId = value;
    }

    public Long getRateScheduleNo() {
        return rateScheduleNo;
    }

    public void setRateScheduleNo(Long value) {
        this.rateScheduleNo = value;
    }

    public Long getSurchargeDirective() {
        return surchargeDirective;
    }

    public void setSurchargeDirective(Long value) {
        this.surchargeDirective = value;
    }

    
}
