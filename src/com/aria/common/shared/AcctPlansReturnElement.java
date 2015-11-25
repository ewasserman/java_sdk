package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acct_plans_ReturnElement", propOrder = {"planNo", "planName", "planDesc", "planDate", "planUnits", "queuedPlanUnits", "unitsChangeDate", "lastBillDate", "nextBillDate", "billThruDate", "billDay", "billingInterval", "billingInd", "displayInd", "rolloverMonths", "rolloverPlanNo", "earlyCancelFee", "earlyCancelMinMonths", "suspensionPeriod", "newAcctStatus", "rolloverAcctStatus", "rolloverAcctStatusDays", "initFreeMonths", "plan2AssignOnSusp", "defaultNotifyMethod", "prepaidInd", "currencyCd", "rateScheduleNo", "rateScheduleName", "rateSchedIsDefaultInd", "availableFromDate", "availableToDate", "followupRsNo", "clientFollowupRsId", "suppPlanInd", "suppPlanStatusCd", "suppPlanStatusLabel", "suppPlanStatusDate", "suppPlanActivateDate", "suppPlanTerminateDate", "clientReceiptId", "clientPlanId", "clientRolloverPlanId", "clientPlan2AssignOnSusp", "clientRateScheduleId", "prorationInvoiceTimingCd"})
public class AcctPlansReturnElement {

    @XmlElement(name = "plan_no")
    protected Long planNo;
    @XmlElement(name = "plan_name")
    protected String planName;
    @XmlElement(name = "plan_desc")
    protected String planDesc;
    @XmlElement(name = "plan_date")
    protected String planDate;
    @XmlElement(name = "plan_units")
    protected Long planUnits;
    @XmlElement(name = "queued_plan_units")
    protected Long queuedPlanUnits;
    @XmlElement(name = "units_change_date")
    protected String unitsChangeDate;
    @XmlElement(name = "last_bill_date")
    protected String lastBillDate;
    @XmlElement(name = "next_bill_date")
    protected String nextBillDate;
    @XmlElement(name = "bill_thru_date")
    protected String billThruDate;
    @XmlElement(name = "bill_day")
    protected Long billDay;
    @XmlElement(name = "billing_interval")
    protected Long billingInterval;
    @XmlElement(name = "billing_ind")
    protected Long billingInd;
    @XmlElement(name = "display_ind")
    protected Long displayInd;
    @XmlElement(name = "rollover_months")
    protected Long rolloverMonths;
    @XmlElement(name = "rollover_plan_no")
    protected Long rolloverPlanNo;
    @XmlElement(name = "early_cancel_fee")
    protected Double earlyCancelFee;
    @XmlElement(name = "early_cancel_min_months")
    protected Long earlyCancelMinMonths;
    @XmlElement(name = "suspension_period")
    protected Long suspensionPeriod;
    @XmlElement(name = "new_acct_status")
    protected Long newAcctStatus;
    @XmlElement(name = "rollover_acct_status")
    protected Long rolloverAcctStatus;
    @XmlElement(name = "rollover_acct_status_days")
    protected Long rolloverAcctStatusDays;
    @XmlElement(name = "init_free_months")
    protected Long initFreeMonths;
    @XmlElement(name = "plan_2_assign_on_susp")
    protected Long plan2AssignOnSusp;
    @XmlElement(name = "default_notify_method")
    protected Long defaultNotifyMethod;
    @XmlElement(name = "prepaid_ind")
    protected Long prepaidInd;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "rate_schedule_no")
    protected Long rateScheduleNo;
    @XmlElement(name = "rate_schedule_name")
    protected String rateScheduleName;
    @XmlElement(name = "rate_sched_is_default_ind")
    protected Long rateSchedIsDefaultInd;
    @XmlElement(name = "available_from_date")
    protected String availableFromDate;
    @XmlElement(name = "available_to_date")
    protected String availableToDate;
    @XmlElement(name = "followup_rs_no")
    protected Long followupRsNo;
    @XmlElement(name = "client_followup_rs_id")
    protected String clientFollowupRsId;
    @XmlElement(name = "supp_plan_ind")
    protected Long suppPlanInd;
    @XmlElement(name = "supp_plan_status_cd")
    protected Long suppPlanStatusCd;
    @XmlElement(name = "supp_plan_status_label")
    protected String suppPlanStatusLabel;
    @XmlElement(name = "supp_plan_status_date")
    protected String suppPlanStatusDate;
    @XmlElement(name = "supp_plan_activate_date")
    protected String suppPlanActivateDate;
    @XmlElement(name = "supp_plan_terminate_date")
    protected String suppPlanTerminateDate;
    @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
    @XmlElement(name = "client_plan_id")
    protected String clientPlanId;
    @XmlElement(name = "client_rollover_plan_id")
    protected String clientRolloverPlanId;
    @XmlElement(name = "client_plan_2_assign_on_susp")
    protected String clientPlan2AssignOnSusp;
    @XmlElement(name = "client_rate_schedule_id")
    protected String clientRateScheduleId;
    @XmlElement(name = "proration_invoice_timing_cd")
    protected String prorationInvoiceTimingCd;
    
    public Long getPlanNo() {
        return planNo;
    }

    public void setPlanNo(Long value) {
        this.planNo = value;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String value) {
        this.planName = value;
    }

    public String getPlanDesc() {
        return planDesc;
    }

    public void setPlanDesc(String value) {
        this.planDesc = value;
    }

    public String getPlanDate() {
        return planDate;
    }

    public void setPlanDate(String value) {
        this.planDate = value;
    }

    public Long getPlanUnits() {
        return planUnits;
    }

    public void setPlanUnits(Long value) {
        this.planUnits = value;
    }

    public Long getQueuedPlanUnits() {
        return queuedPlanUnits;
    }

    public void setQueuedPlanUnits(Long value) {
        this.queuedPlanUnits = value;
    }

    public String getUnitsChangeDate() {
        return unitsChangeDate;
    }

    public void setUnitsChangeDate(String value) {
        this.unitsChangeDate = value;
    }

    public String getLastBillDate() {
        return lastBillDate;
    }

    public void setLastBillDate(String value) {
        this.lastBillDate = value;
    }

    public String getNextBillDate() {
        return nextBillDate;
    }

    public void setNextBillDate(String value) {
        this.nextBillDate = value;
    }

    public String getBillThruDate() {
        return billThruDate;
    }

    public void setBillThruDate(String value) {
        this.billThruDate = value;
    }

    public Long getBillDay() {
        return billDay;
    }

    public void setBillDay(Long value) {
        this.billDay = value;
    }

    public Long getBillingInterval() {
        return billingInterval;
    }

    public void setBillingInterval(Long value) {
        this.billingInterval = value;
    }

    public Long getBillingInd() {
        return billingInd;
    }

    public void setBillingInd(Long value) {
        this.billingInd = value;
    }

    public Long getDisplayInd() {
        return displayInd;
    }

    public void setDisplayInd(Long value) {
        this.displayInd = value;
    }

    public Long getRolloverMonths() {
        return rolloverMonths;
    }

    public void setRolloverMonths(Long value) {
        this.rolloverMonths = value;
    }

    public Long getRolloverPlanNo() {
        return rolloverPlanNo;
    }

    public void setRolloverPlanNo(Long value) {
        this.rolloverPlanNo = value;
    }

    public Double getEarlyCancelFee() {
        return earlyCancelFee;
    }

    public void setEarlyCancelFee(Double value) {
        this.earlyCancelFee = value;
    }

    public Long getEarlyCancelMinMonths() {
        return earlyCancelMinMonths;
    }

    public void setEarlyCancelMinMonths(Long value) {
        this.earlyCancelMinMonths = value;
    }

    public Long getSuspensionPeriod() {
        return suspensionPeriod;
    }

    public void setSuspensionPeriod(Long value) {
        this.suspensionPeriod = value;
    }

    public Long getNewAcctStatus() {
        return newAcctStatus;
    }

    public void setNewAcctStatus(Long value) {
        this.newAcctStatus = value;
    }

    public Long getRolloverAcctStatus() {
        return rolloverAcctStatus;
    }

    public void setRolloverAcctStatus(Long value) {
        this.rolloverAcctStatus = value;
    }

    public Long getRolloverAcctStatusDays() {
        return rolloverAcctStatusDays;
    }

    public void setRolloverAcctStatusDays(Long value) {
        this.rolloverAcctStatusDays = value;
    }

    public Long getInitFreeMonths() {
        return initFreeMonths;
    }

    public void setInitFreeMonths(Long value) {
        this.initFreeMonths = value;
    }

    public Long getPlan2AssignOnSusp() {
        return plan2AssignOnSusp;
    }

    public void setPlan2AssignOnSusp(Long value) {
        this.plan2AssignOnSusp = value;
    }

    public Long getDefaultNotifyMethod() {
        return defaultNotifyMethod;
    }

    public void setDefaultNotifyMethod(Long value) {
        this.defaultNotifyMethod = value;
    }

    public Long getPrepaidInd() {
        return prepaidInd;
    }

    public void setPrepaidInd(Long value) {
        this.prepaidInd = value;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }

    public Long getRateScheduleNo() {
        return rateScheduleNo;
    }

    public void setRateScheduleNo(Long value) {
        this.rateScheduleNo = value;
    }

    public String getRateScheduleName() {
        return rateScheduleName;
    }

    public void setRateScheduleName(String value) {
        this.rateScheduleName = value;
    }

    public Long getRateSchedIsDefaultInd() {
        return rateSchedIsDefaultInd;
    }

    public void setRateSchedIsDefaultInd(Long value) {
        this.rateSchedIsDefaultInd = value;
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

    public Long getSuppPlanInd() {
        return suppPlanInd;
    }

    public void setSuppPlanInd(Long value) {
        this.suppPlanInd = value;
    }

    public Long getSuppPlanStatusCd() {
        return suppPlanStatusCd;
    }

    public void setSuppPlanStatusCd(Long value) {
        this.suppPlanStatusCd = value;
    }

    public String getSuppPlanStatusLabel() {
        return suppPlanStatusLabel;
    }

    public void setSuppPlanStatusLabel(String value) {
        this.suppPlanStatusLabel = value;
    }

    public String getSuppPlanStatusDate() {
        return suppPlanStatusDate;
    }

    public void setSuppPlanStatusDate(String value) {
        this.suppPlanStatusDate = value;
    }

    public String getSuppPlanActivateDate() {
        return suppPlanActivateDate;
    }

    public void setSuppPlanActivateDate(String value) {
        this.suppPlanActivateDate = value;
    }

    public String getSuppPlanTerminateDate() {
        return suppPlanTerminateDate;
    }

    public void setSuppPlanTerminateDate(String value) {
        this.suppPlanTerminateDate = value;
    }

    public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
    }

    public String getClientPlanId() {
        return clientPlanId;
    }

    public void setClientPlanId(String value) {
        this.clientPlanId = value;
    }

    public String getClientRolloverPlanId() {
        return clientRolloverPlanId;
    }

    public void setClientRolloverPlanId(String value) {
        this.clientRolloverPlanId = value;
    }

    public String getClientPlan2AssignOnSusp() {
        return clientPlan2AssignOnSusp;
    }

    public void setClientPlan2AssignOnSusp(String value) {
        this.clientPlan2AssignOnSusp = value;
    }

    public String getClientRateScheduleId() {
        return clientRateScheduleId;
    }

    public void setClientRateScheduleId(String value) {
        this.clientRateScheduleId = value;
    }

    public String getProrationInvoiceTimingCd() {
        return prorationInvoiceTimingCd;
    }

    public void setProrationInvoiceTimingCd(String value) {
        this.prorationInvoiceTimingCd = value;
    }

    
}
