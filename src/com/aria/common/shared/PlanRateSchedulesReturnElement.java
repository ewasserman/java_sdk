package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_rate_schedules_ReturnElement", propOrder = {"scheduleNo", "scheduleName", "scheduleCurrency", "scheduleDefaultInd", "scheduleDefaultIndCurr", "scheduleDisplayInd", "clientRateScheduleId", "availableFromDate", "availableToDate", "futureRate", "futureChangeDate", "followupRsNo", "clientFollowupRsId"})
public class PlanRateSchedulesReturnElement {

    @XmlElement(name = "schedule_no")
    protected Long scheduleNo;
    @XmlElement(name = "schedule_name")
    protected String scheduleName;
    @XmlElement(name = "schedule_currency")
    protected String scheduleCurrency;
    @XmlElement(name = "schedule_default_ind")
    protected Long scheduleDefaultInd;
    @XmlElement(name = "schedule_default_ind_curr")
    protected Long scheduleDefaultIndCurr;
    @XmlElement(name = "schedule_display_ind")
    protected Long scheduleDisplayInd;
    @XmlElement(name = "client_rate_schedule_id")
    protected String clientRateScheduleId;
    @XmlElement(name = "available_from_date")
    protected String availableFromDate;
    @XmlElement(name = "available_to_date")
    protected String availableToDate;
    @XmlElement(name = "future_rate")
    protected Long futureRate;
    @XmlElement(name = "future_change_date")
    protected String futureChangeDate;
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

    public Long getScheduleDefaultInd() {
        return scheduleDefaultInd;
    }

    public void setScheduleDefaultInd(Long value) {
        this.scheduleDefaultInd = value;
    }

    public Long getScheduleDefaultIndCurr() {
        return scheduleDefaultIndCurr;
    }

    public void setScheduleDefaultIndCurr(Long value) {
        this.scheduleDefaultIndCurr = value;
    }

    public Long getScheduleDisplayInd() {
        return scheduleDisplayInd;
    }

    public void setScheduleDisplayInd(Long value) {
        this.scheduleDisplayInd = value;
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

    public Long getFutureRate() {
        return futureRate;
    }

    public void setFutureRate(Long value) {
        this.futureRate = value;
    }

    public String getFutureChangeDate() {
        return futureChangeDate;
    }

    public void setFutureChangeDate(String value) {
        this.futureChangeDate = value;
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
