package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rate_info_ReturnElement", propOrder = {"scheduleNo", "scheduleName", "clientRateScheduleId", "fromUnit", "toUnit", "ratePerUnit"})
public class RateInfoReturnElement {

    @XmlElement(name = "schedule_no")
    protected Long scheduleNo;
    @XmlElement(name = "schedule_name")
    protected String scheduleName;
    @XmlElement(name = "client_rate_schedule_id")
    protected String clientRateScheduleId;
    @XmlElement(name = "from_unit")
    protected Long fromUnit;
    @XmlElement(name = "to_unit")
    protected Long toUnit;
    @XmlElement(name = "rate_per_unit")
    protected Double ratePerUnit;
    
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

    public Long getFromUnit() {
        return fromUnit;
    }

    public void setFromUnit(Long value) {
        this.fromUnit = value;
    }

    public Long getToUnit() {
        return toUnit;
    }

    public void setToUnit(Long value) {
        this.toUnit = value;
    }

    public Double getRatePerUnit() {
        return ratePerUnit;
    }

    public void setRatePerUnit(Double value) {
        this.ratePerUnit = value;
    }

    
}
