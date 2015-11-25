package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "all_plan_service_rates_ReturnElement", propOrder = {"scheduleNo", "clientRateScheduleId", "futureRate", "futureChangeDate", "followupRsNo", "clientFollowupRsId", "planServiceRates"})
public class AllPlanServiceRatesReturnElement {

    @XmlElement(name = "schedule_no")
    protected Long scheduleNo;
    @XmlElement(name = "client_rate_schedule_id")
    protected String clientRateScheduleId;
    @XmlElement(name = "future_rate")
    protected Long futureRate;
    @XmlElement(name = "future_change_date")
    protected String futureChangeDate;
    @XmlElement(name = "followup_rs_no")
    protected Long followupRsNo;
    @XmlElement(name = "client_followup_rs_id")
    protected String clientFollowupRsId;
    @XmlElement(name = "plan_service_rates")
    protected List<PlanServiceRatesReturnElement> planServiceRates;
    
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

    public List<PlanServiceRatesReturnElement> getPlanServiceRates() {
        if (this.planServiceRates == null) {
            this.planServiceRates = new ArrayList<PlanServiceRatesReturnElement>();
        }
        return this.planServiceRates;
    }
}
