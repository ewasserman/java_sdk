package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acct_surcharges_info_ReturnElement", propOrder = {"surchargeNo", "rateScheduleNo"})
public class AcctSurchargesInfoReturnElement {

    @XmlElement(name = "surcharge_no")
    protected Long surchargeNo;
    @XmlElement(name = "rate_schedule_no")
    protected Long rateScheduleNo;
    
    public Long getSurchargeNo() {
        return surchargeNo;
    }

    public void setSurchargeNo(Long value) {
        this.surchargeNo = value;
    }

    public Long getRateScheduleNo() {
        return rateScheduleNo;
    }

    public void setRateScheduleNo(Long value) {
        this.rateScheduleNo = value;
    }

    
}
