package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acct_plans_m_ReturnElement", propOrder = {"planNo", "planName", "planDesc", "planInstanceNo", "clientPlanInstanceId", "planDate", "planUnits", "lastBillDate", "nextBillDate", "billThruDate", "billDay", "recurringBillingInterval", "usageBillingInterval", "billingInd", "displayInd", "rolloverMonths", "rolloverPlanNo", "earlyCancelFee", "earlyCancelMinMonths", "suspensionPeriod", "initialPlanStatus", "rolloverPlanStatus", "rolloverPlanStatusDuration", "rolloverPlanStatusUomCd", "initFreePeriodDuration", "initFreePeriodUomCd", "rolloverPlanDuration", "rolloverPlanUomCd", "initialPlanStatusCd", "rolloverPlanStatusCd", "plan2AssignOnSusp", "defaultNotifyMethod", "prepaidInd", "currencyCd", "rateScheduleNo", "rateScheduleName", "rateSchedIsDefaultInd", "suppPlanInd", "planInstanceStatusCd", "planInstanceStatusLabel", "planInstanceStatusDate", "dunningState", "dunningStep", "dunningDegradeDate", "planAssignmentDate", "planDeprovisionedDate", "clientReceiptId", "clientPlanId", "clientRolloverPlanId", "clientPlan2AssignOnSusp", "clientRateScheduleId", "prorationInvoiceTimingCd", "masterPlanInstanceNo", "clientMasterPlanInstanceId", "parentPlanInstanceNo", "clientParentPlanInstanceId", "contractRolloverPlanNo", "contractRolloverClientPlanId", "contractRolloverRateSchedNo", "contractRolloverClientRateSchedId", "poNum"})
public class AcctPlansMReturnElement {

    @XmlElement(name = "plan_no")
    protected Long planNo;
    @XmlElement(name = "plan_name")
    protected String planName;
    @XmlElement(name = "plan_desc")
    protected String planDesc;
    @XmlElement(name = "plan_instance_no")
    protected Long planInstanceNo;
    @XmlElement(name = "client_plan_instance_id")
    protected String clientPlanInstanceId;
    @XmlElement(name = "plan_date")
    protected String planDate;
    @XmlElement(name = "plan_units")
    protected Long planUnits;
    @XmlElement(name = "last_bill_date")
    protected String lastBillDate;
    @XmlElement(name = "next_bill_date")
    protected String nextBillDate;
    @XmlElement(name = "bill_thru_date")
    protected String billThruDate;
    @XmlElement(name = "bill_day")
    protected Long billDay;
    @XmlElement(name = "recurring_billing_interval")
    protected Long recurringBillingInterval;
    @XmlElement(name = "usage_billing_interval")
    protected Long usageBillingInterval;
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
    @XmlElement(name = "initial_plan_status")
    protected Long initialPlanStatus;
    @XmlElement(name = "rollover_plan_status")
    protected Long rolloverPlanStatus;
    @XmlElement(name = "rollover_plan_status_duration")
    protected Long rolloverPlanStatusDuration;
    @XmlElement(name = "rollover_plan_status_uom_cd")
    protected Long rolloverPlanStatusUomCd;
    @XmlElement(name = "init_free_period_duration")
    protected Long initFreePeriodDuration;
    @XmlElement(name = "init_free_period_uom_cd")
    protected String initFreePeriodUomCd;
    @XmlElement(name = "rollover_plan_duration")
    protected String rolloverPlanDuration;
    @XmlElement(name = "rollover_plan_uom_cd")
    protected Long rolloverPlanUomCd;
    @XmlElement(name = "initial_plan_status_cd")
    protected Long initialPlanStatusCd;
    @XmlElement(name = "rollover_plan_status_cd")
    protected Long rolloverPlanStatusCd;
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
    @XmlElement(name = "supp_plan_ind")
    protected Long suppPlanInd;
    @XmlElement(name = "plan_instance_status_cd")
    protected Long planInstanceStatusCd;
    @XmlElement(name = "plan_instance_status_label")
    protected String planInstanceStatusLabel;
    @XmlElement(name = "plan_instance_status_date")
    protected String planInstanceStatusDate;
    @XmlElement(name = "dunning_state")
    protected Long dunningState;
    @XmlElement(name = "dunning_step")
    protected Long dunningStep;
    @XmlElement(name = "dunning_degrade_date")
    protected String dunningDegradeDate;
    @XmlElement(name = "plan_assignment_date")
    protected String planAssignmentDate;
    @XmlElement(name = "plan_deprovisioned_date")
    protected String planDeprovisionedDate;
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
    @XmlElement(name = "master_plan_instance_no")
    protected Long masterPlanInstanceNo;
    @XmlElement(name = "client_master_plan_instance_id")
    protected String clientMasterPlanInstanceId;
    @XmlElement(name = "parent_plan_instance_no")
    protected Long parentPlanInstanceNo;
    @XmlElement(name = "client_parent_plan_instance_id")
    protected String clientParentPlanInstanceId;
    @XmlElement(name = "contract_rollover_plan_no")
    protected Long contractRolloverPlanNo;
    @XmlElement(name = "contract_rollover_client_plan_id")
    protected String contractRolloverClientPlanId;
    @XmlElement(name = "contract_rollover_rate_sched_no")
    protected Long contractRolloverRateSchedNo;
    @XmlElement(name = "contract_rollover_client_rate_sched_id")
    protected String contractRolloverClientRateSchedId;
    @XmlElement(name = "po_num")
    protected String poNum;
    
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

    public Long getPlanInstanceNo() {
        return planInstanceNo;
    }

    public void setPlanInstanceNo(Long value) {
        this.planInstanceNo = value;
    }

    public String getClientPlanInstanceId() {
        return clientPlanInstanceId;
    }

    public void setClientPlanInstanceId(String value) {
        this.clientPlanInstanceId = value;
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

    public Long getInitialPlanStatus() {
        return initialPlanStatus;
    }

    public void setInitialPlanStatus(Long value) {
        this.initialPlanStatus = value;
    }

    public Long getRolloverPlanStatus() {
        return rolloverPlanStatus;
    }

    public void setRolloverPlanStatus(Long value) {
        this.rolloverPlanStatus = value;
    }

    public Long getRolloverPlanStatusDuration() {
        return rolloverPlanStatusDuration;
    }

    public void setRolloverPlanStatusDuration(Long value) {
        this.rolloverPlanStatusDuration = value;
    }

    public Long getRolloverPlanStatusUomCd() {
        return rolloverPlanStatusUomCd;
    }

    public void setRolloverPlanStatusUomCd(Long value) {
        this.rolloverPlanStatusUomCd = value;
    }

    public Long getInitFreePeriodDuration() {
        return initFreePeriodDuration;
    }

    public void setInitFreePeriodDuration(Long value) {
        this.initFreePeriodDuration = value;
    }

    public String getInitFreePeriodUomCd() {
        return initFreePeriodUomCd;
    }

    public void setInitFreePeriodUomCd(String value) {
        this.initFreePeriodUomCd = value;
    }

    public String getRolloverPlanDuration() {
        return rolloverPlanDuration;
    }

    public void setRolloverPlanDuration(String value) {
        this.rolloverPlanDuration = value;
    }

    public Long getRolloverPlanUomCd() {
        return rolloverPlanUomCd;
    }

    public void setRolloverPlanUomCd(Long value) {
        this.rolloverPlanUomCd = value;
    }

    public Long getInitialPlanStatusCd() {
        return initialPlanStatusCd;
    }

    public void setInitialPlanStatusCd(Long value) {
        this.initialPlanStatusCd = value;
    }

    public Long getRolloverPlanStatusCd() {
        return rolloverPlanStatusCd;
    }

    public void setRolloverPlanStatusCd(Long value) {
        this.rolloverPlanStatusCd = value;
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

    public Long getSuppPlanInd() {
        return suppPlanInd;
    }

    public void setSuppPlanInd(Long value) {
        this.suppPlanInd = value;
    }

    public Long getPlanInstanceStatusCd() {
        return planInstanceStatusCd;
    }

    public void setPlanInstanceStatusCd(Long value) {
        this.planInstanceStatusCd = value;
    }

    public String getPlanInstanceStatusLabel() {
        return planInstanceStatusLabel;
    }

    public void setPlanInstanceStatusLabel(String value) {
        this.planInstanceStatusLabel = value;
    }

    public String getPlanInstanceStatusDate() {
        return planInstanceStatusDate;
    }

    public void setPlanInstanceStatusDate(String value) {
        this.planInstanceStatusDate = value;
    }

    public Long getDunningState() {
        return dunningState;
    }

    public void setDunningState(Long value) {
        this.dunningState = value;
    }

    public Long getDunningStep() {
        return dunningStep;
    }

    public void setDunningStep(Long value) {
        this.dunningStep = value;
    }

    public String getDunningDegradeDate() {
        return dunningDegradeDate;
    }

    public void setDunningDegradeDate(String value) {
        this.dunningDegradeDate = value;
    }

    public String getPlanAssignmentDate() {
        return planAssignmentDate;
    }

    public void setPlanAssignmentDate(String value) {
        this.planAssignmentDate = value;
    }

    public String getPlanDeprovisionedDate() {
        return planDeprovisionedDate;
    }

    public void setPlanDeprovisionedDate(String value) {
        this.planDeprovisionedDate = value;
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

    public Long getMasterPlanInstanceNo() {
        return masterPlanInstanceNo;
    }

    public void setMasterPlanInstanceNo(Long value) {
        this.masterPlanInstanceNo = value;
    }

    public String getClientMasterPlanInstanceId() {
        return clientMasterPlanInstanceId;
    }

    public void setClientMasterPlanInstanceId(String value) {
        this.clientMasterPlanInstanceId = value;
    }

    public Long getParentPlanInstanceNo() {
        return parentPlanInstanceNo;
    }

    public void setParentPlanInstanceNo(Long value) {
        this.parentPlanInstanceNo = value;
    }

    public String getClientParentPlanInstanceId() {
        return clientParentPlanInstanceId;
    }

    public void setClientParentPlanInstanceId(String value) {
        this.clientParentPlanInstanceId = value;
    }

    public Long getContractRolloverPlanNo() {
        return contractRolloverPlanNo;
    }

    public void setContractRolloverPlanNo(Long value) {
        this.contractRolloverPlanNo = value;
    }

    public String getContractRolloverClientPlanId() {
        return contractRolloverClientPlanId;
    }

    public void setContractRolloverClientPlanId(String value) {
        this.contractRolloverClientPlanId = value;
    }

    public Long getContractRolloverRateSchedNo() {
        return contractRolloverRateSchedNo;
    }

    public void setContractRolloverRateSchedNo(Long value) {
        this.contractRolloverRateSchedNo = value;
    }

    public String getContractRolloverClientRateSchedId() {
        return contractRolloverClientRateSchedId;
    }

    public void setContractRolloverClientRateSchedId(String value) {
        this.contractRolloverClientRateSchedId = value;
    }

    public String getPoNum() {
        return poNum;
    }

    public void setPoNum(String value) {
        this.poNum = value;
    }

    
}
