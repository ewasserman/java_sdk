package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acct_surcharges_row", propOrder = {
    "acctSurchargeNo",
    "acctRateScheduleNo"
    })
public class AcctSurchargesRow {

    @XmlElement(name = "acct_surcharge_no")
    protected Long acctSurchargeNo;
    @XmlElement(name = "acct_rate_schedule_no")
    protected Long acctRateScheduleNo;
    public Long getAcctSurchargeNo() {
        return acctSurchargeNo;
    }

    public void setAcctSurchargeNo(Long value) {
        this.acctSurchargeNo = value;
    }

    public Long getAcctRateScheduleNo() {
        return acctRateScheduleNo;
    }

    public void setAcctRateScheduleNo(Long value) {
        this.acctRateScheduleNo = value;
    }

    
}
