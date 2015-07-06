package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mp_surcharges_row", propOrder = {
    "mpSurchargeNo",
    "mpSurchargeDirective",
    "mpRateScheduleNo"
    })
public class MpSurchargesRow {

    @XmlElement(name = "mp_surcharge_no")
    protected Long mpSurchargeNo;
    @XmlElement(name = "mp_surcharge_directive")
    protected Long mpSurchargeDirective;
    @XmlElement(name = "mp_rate_schedule_no")
    protected Long mpRateScheduleNo;
    public Long getMpSurchargeNo() {
        return mpSurchargeNo;
    }

    public void setMpSurchargeNo(Long value) {
        this.mpSurchargeNo = value;
    }

    public Long getMpSurchargeDirective() {
        return mpSurchargeDirective;
    }

    public void setMpSurchargeDirective(Long value) {
        this.mpSurchargeDirective = value;
    }

    public Long getMpRateScheduleNo() {
        return mpRateScheduleNo;
    }

    public void setMpRateScheduleNo(Long value) {
        this.mpRateScheduleNo = value;
    }

    
}
