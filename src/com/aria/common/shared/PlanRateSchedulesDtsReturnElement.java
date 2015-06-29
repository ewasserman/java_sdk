package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_rate_schedules_dts_ReturnElement", propOrder = {"scheduleNo", "clientRateScheduleId", "scheduleName", "scheduleCurrency", "recurringBillingInterval", "usageBillingInterval", "defaultInd", "defaultIndCurr", "scheduleDisplayInd"})
public class PlanRateSchedulesDtsReturnElement {

    @XmlElement(name = "schedule_no")
    protected Long scheduleNo;
    @XmlElement(name = "client_rate_schedule_id")
    protected String clientRateScheduleId;
    @XmlElement(name = "schedule_name")
    protected String scheduleName;
    @XmlElement(name = "schedule_currency")
    protected String scheduleCurrency;
    @XmlElement(name = "recurring_billing_interval")
    protected Long recurringBillingInterval;
    @XmlElement(name = "usage_billing_interval")
    protected Long usageBillingInterval;
    @XmlElement(name = "default_ind")
    protected Long defaultInd;
    @XmlElement(name = "default_ind_curr")
    protected Long defaultIndCurr;
    @XmlElement(name = "schedule_display_ind")
    protected Long scheduleDisplayInd;
    
    public Long getScheduleNo() {
        return scheduleNo;
    }

    public void setScheduleNo(Long value) {
        this.scheduleNo = value;
    }

    public String getClientRateScheduleId() {
        return clientRateScheduleId;
    }

    public void setClientRateScheduleId(String value) {
        this.clientRateScheduleId = value;
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

    public Long getRecurringBillingInterval() {
        return recurringBillingInterval;
    }

    public void setRecurringBillingInterval(Long value) {
        this.recurringBillingInterval = value;
    }

    public Long getUsageBillingInterval() {
        return usageBillingInterval;
    }

    public void setUsageBillingInterval(Long value) {
        this.usageBillingInterval = value;
    }

    public Long getDefaultInd() {
        return defaultInd;
    }

    public void setDefaultInd(Long value) {
        this.defaultInd = value;
    }

    public Long getDefaultIndCurr() {
        return defaultIndCurr;
    }

    public void setDefaultIndCurr(Long value) {
        this.defaultIndCurr = value;
    }

    public Long getScheduleDisplayInd() {
        return scheduleDisplayInd;
    }

    public void setScheduleDisplayInd(Long value) {
        this.scheduleDisplayInd = value;
    }

    
}
