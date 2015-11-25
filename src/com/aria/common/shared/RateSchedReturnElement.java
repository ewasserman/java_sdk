package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rate_sched_ReturnElement", propOrder = {"scheduleNo", "scheduleName", "scheduleCurrency", "defaultInd", "displayInd", "defaultIndCurr", "clientRateScheduleId", "availableFromDate", "availableToDate", "followupRsNo", "clientFollowupRsId"})
public class RateSchedReturnElement {

    @XmlElement(name = "schedule_no")
    protected Long scheduleNo;
    @XmlElement(name = "schedule_name")
    protected String scheduleName;
    @XmlElement(name = "schedule_currency")
    protected String scheduleCurrency;
    @XmlElement(name = "default_ind")
    protected Long defaultInd;
    @XmlElement(name = "display_ind")
    protected Long displayInd;
    @XmlElement(name = "default_ind_curr")
    protected Long defaultIndCurr;
    @XmlElement(name = "client_rate_schedule_id")
    protected String clientRateScheduleId;
    @XmlElement(name = "available_from_date")
    protected String availableFromDate;
    @XmlElement(name = "available_to_date")
    protected String availableToDate;
    @XmlElement(name = "followup_rs_no")
    protected Long followupRsNo;
    @XmlElement(name = "client_followup_rs_id")
    protected String clientFollowupRsId;
    
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

    public String getScheduleCurrency() {
        return scheduleCurrency;
    }

    public void setScheduleCurrency(String value) {
        this.scheduleCurrency = value;
    }

    public Long getDefaultInd() {
        return defaultInd;
    }

    public void setDefaultInd(Long value) {
        this.defaultInd = value;
    }

    public Long getDisplayInd() {
        return displayInd;
    }

    public void setDisplayInd(Long value) {
        this.displayInd = value;
    }

    public Long getDefaultIndCurr() {
        return defaultIndCurr;
    }

    public void setDefaultIndCurr(Long value) {
        this.defaultIndCurr = value;
    }

    public String getClientRateScheduleId() {
        return clientRateScheduleId;
    }

    public void setClientRateScheduleId(String value) {
        this.clientRateScheduleId = value;
    }

    public String getAvailableFromDate() {
        return availableFromDate;
    }

    public void setAvailableFromDate(String value) {
        this.availableFromDate = value;
    }

    public String getAvailableToDate() {
        return availableToDate;
    }

    public void setAvailableToDate(String value) {
        this.availableToDate = value;
    }

    public Long getFollowupRsNo() {
        return followupRsNo;
    }

    public void setFollowupRsNo(Long value) {
        this.followupRsNo = value;
    }

    public String getClientFollowupRsId() {
        return clientFollowupRsId;
    }

    public void setClientFollowupRsId(String value) {
        this.clientFollowupRsId = value;
    }

    
}
