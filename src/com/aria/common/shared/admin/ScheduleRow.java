package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "schedule_row", propOrder = {
    "scheduleNo",
    "scheduleName",
    "clientRateScheduleId",
    "currencyCd",
    "isDefault"
    })
public class ScheduleRow {

    @XmlElement(name = "schedule_no")
    protected Long scheduleNo;
    @XmlElement(name = "schedule_name")
    protected String scheduleName;
    @XmlElement(name = "client_rate_schedule_id")
    protected String clientRateScheduleId;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "is_default")
    protected Long isDefault;
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

    public Long getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Long value) {
        this.isDefault = value;
    }

    
}
