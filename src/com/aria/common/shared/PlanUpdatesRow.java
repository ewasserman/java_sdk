package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_updates_row", propOrder = {
    "planDirective",
    "existingPlanInstanceNo",
    "existingClientPlanInstanceId",
    "newClientPlanInstanceId",
    "planInstanceIdx",
    "planInstanceDescription",
    "newPlanNo",
    "newClientPlanId",
    "promoCd",
    "planUnits",
    "assignPlanUnitInstances",
    "updatePlanUnitInstances",
    "removePlanUnitInstances",
    "planUnitInstFieldDetails",
    "altRateScheduleNo",
    "clientAltRateScheduleId",
    "prorationInvoiceTiming",
    "customRates",
    "couponCodeUpdates",
    "surchargeUpdates",
    "balanceForward",
    "parentPlanInstanceNo",
    "parentClientPlanInstanceId",
    "parentPlanInstanceIdx",
    "planStatusCd",
    "statusUntilAltStartCd",
    "dunningState",
    "degradeDate",
    "billingGroupNo",
    "clientBillingGroupId",
    "billingGroupIdx",
    "respLevelCd",
    "parentAcctMpInstNo",
    "parentAcctClientMpInstId",
    "dunningGroupNo",
    "clientDunningGroupId",
    "dunningGroupIdx",
    "planInstanceFieldUpdate",
    "effectiveDate",
    "offsetMonths",
    "altProrationStartDate",
    "autoOffsetMonthsOption",
    "altCollectGroupNo",
    "altClientCollectGroupId",
    "offsetInterval",
    "invoiceUnbilledUsage",
    "forceSuppBillDateReset",
    "forceMasterBillDateReset",
    "usageAccumulationResetMonths",
    "usagePooling",
    "usageThresholdApplicability",
    "nsoBillImmediately",
    "nsoItemArray"
    })
public class PlanUpdatesRow {

    @XmlElement(name = "plan_directive")
    protected Long planDirective;
    @XmlElement(name = "existing_plan_instance_no")
    protected Long existingPlanInstanceNo;
    @XmlElement(name = "existing_client_plan_instance_id")
    protected String existingClientPlanInstanceId;
    @XmlElement(name = "new_client_plan_instance_id")
    protected String newClientPlanInstanceId;
    @XmlElement(name = "plan_instance_idx")
    protected Long planInstanceIdx;
    @XmlElement(name = "plan_instance_description")
    protected String planInstanceDescription;
    @XmlElement(name = "new_plan_no")
    protected Long newPlanNo;
    @XmlElement(name = "new_client_plan_id")
    protected String newClientPlanId;
    @XmlElement(name = "promo_cd")
    protected String promoCd;
    @XmlElement(name = "plan_units")
    protected Double planUnits;
    @XmlElement(name = "assign_plan_unit_instances")
    protected com.aria.common.shared.AssignPlanUnitInstancesArray assignPlanUnitInstances;
    @XmlElement(name = "update_plan_unit_instances")
    protected com.aria.common.shared.UpdatePlanUnitInstancesArray updatePlanUnitInstances;
    @XmlElement(name = "remove_plan_unit_instances")
    protected com.aria.common.shared.RemovePlanUnitInstancesArray removePlanUnitInstances;
    @XmlElement(name = "plan_unit_inst_field_details")
    protected com.aria.common.shared.PlanUnitInstFieldDetailsArray planUnitInstFieldDetails;
    @XmlElement(name = "alt_rate_schedule_no")
    protected Long altRateScheduleNo;
    @XmlElement(name = "client_alt_rate_schedule_id")
    protected String clientAltRateScheduleId;
    @XmlElement(name = "proration_invoice_timing")
    protected Long prorationInvoiceTiming;
    @XmlElement(name = "custom_rates")
    protected com.aria.common.shared.CustomRatesArray customRates;
    @XmlElement(name = "coupon_code_updates")
    protected com.aria.common.shared.CouponCodeUpdatesArray couponCodeUpdates;
    @XmlElement(name = "surcharge_updates")
    protected com.aria.common.shared.SurchargeUpdatesArray surchargeUpdates;
    @XmlElement(name = "balance_forward")
    protected Double balanceForward;
    @XmlElement(name = "parent_plan_instance_no")
    protected Long parentPlanInstanceNo;
    @XmlElement(name = "parent_client_plan_instance_id")
    protected String parentClientPlanInstanceId;
    @XmlElement(name = "parent_plan_instance_idx")
    protected Long parentPlanInstanceIdx;
    @XmlElement(name = "plan_status_cd")
    protected Long planStatusCd;
    @XmlElement(name = "status_until_alt_start_cd")
    protected Long statusUntilAltStartCd;
    @XmlElement(name = "dunning_state")
    protected Long dunningState;
    @XmlElement(name = "degrade_date")
    protected String degradeDate;
    @XmlElement(name = "billing_group_no")
    protected Long billingGroupNo;
    @XmlElement(name = "client_billing_group_id")
    protected String clientBillingGroupId;
    @XmlElement(name = "billing_group_idx")
    protected Long billingGroupIdx;
    @XmlElement(name = "resp_level_cd")
    protected Long respLevelCd;
    @XmlElement(name = "parent_acct_mp_inst_no")
    protected Long parentAcctMpInstNo;
    @XmlElement(name = "parent_acct_client_mp_inst_id")
    protected String parentAcctClientMpInstId;
    @XmlElement(name = "dunning_group_no")
    protected Long dunningGroupNo;
    @XmlElement(name = "client_dunning_group_id")
    protected String clientDunningGroupId;
    @XmlElement(name = "dunning_group_idx")
    protected Long dunningGroupIdx;
    @XmlElement(name = "plan_instance_field_update")
    protected com.aria.common.shared.PlanInstanceFieldUpdateArray planInstanceFieldUpdate;
    @XmlElement(name = "effective_date")
    protected String effectiveDate;
    @XmlElement(name = "offset_months")
    protected Long offsetMonths;
    @XmlElement(name = "alt_proration_start_date")
    protected String altProrationStartDate;
    @XmlElement(name = "auto_offset_months_option")
    protected Long autoOffsetMonthsOption;
    @XmlElement(name = "alt_collect_group_no")
    protected String altCollectGroupNo;
    @XmlElement(name = "alt_client_collect_group_id")
    protected String altClientCollectGroupId;
    @XmlElement(name = "offset_interval")
    protected Long offsetInterval;
    @XmlElement(name = "invoice_unbilled_usage")
    protected String invoiceUnbilledUsage;
    @XmlElement(name = "force_supp_bill_date_reset")
    protected Long forceSuppBillDateReset;
    @XmlElement(name = "force_master_bill_date_reset")
    protected Long forceMasterBillDateReset;
    @XmlElement(name = "usage_accumulation_reset_months")
    protected String usageAccumulationResetMonths;
    @XmlElement(name = "usage_pooling")
    protected String usagePooling;
    @XmlElement(name = "usage_threshold_applicability")
    protected String usageThresholdApplicability;
    @XmlElement(name = "nso_bill_immediately")
    protected String nsoBillImmediately;
    @XmlElement(name = "nso_item_array")
    protected com.aria.common.shared.NsoItemArrayArray nsoItemArray;
    public Long getPlanDirective() {
        return planDirective;
    }

    public void setPlanDirective(Long value) {
        this.planDirective = value;
    }

    public Long getExistingPlanInstanceNo() {
        return existingPlanInstanceNo;
    }

    public void setExistingPlanInstanceNo(Long value) {
        this.existingPlanInstanceNo = value;
    }

    public String getExistingClientPlanInstanceId() {
        return existingClientPlanInstanceId;
    }

    public void setExistingClientPlanInstanceId(String value) {
        this.existingClientPlanInstanceId = value;
    }

    public String getNewClientPlanInstanceId() {
        return newClientPlanInstanceId;
    }

    public void setNewClientPlanInstanceId(String value) {
        this.newClientPlanInstanceId = value;
    }

    public Long getPlanInstanceIdx() {
        return planInstanceIdx;
    }

    public void setPlanInstanceIdx(Long value) {
        this.planInstanceIdx = value;
    }

    public String getPlanInstanceDescription() {
        return planInstanceDescription;
    }

    public void setPlanInstanceDescription(String value) {
        this.planInstanceDescription = value;
    }

    public Long getNewPlanNo() {
        return newPlanNo;
    }

    public void setNewPlanNo(Long value) {
        this.newPlanNo = value;
    }

    public String getNewClientPlanId() {
        return newClientPlanId;
    }

    public void setNewClientPlanId(String value) {
        this.newClientPlanId = value;
    }

    public String getPromoCd() {
        return promoCd;
    }

    public void setPromoCd(String value) {
        this.promoCd = value;
    }

    public Double getPlanUnits() {
        return planUnits;
    }

    public void setPlanUnits(Double value) {
        this.planUnits = value;
    }

    public com.aria.common.shared.AssignPlanUnitInstancesArray getAssignPlanUnitInstances() {
        return assignPlanUnitInstances;
    }

    public void setAssignPlanUnitInstances(com.aria.common.shared.AssignPlanUnitInstancesArray value) {
        this.assignPlanUnitInstances = value;
    }

    public com.aria.common.shared.UpdatePlanUnitInstancesArray getUpdatePlanUnitInstances() {
        return updatePlanUnitInstances;
    }

    public void setUpdatePlanUnitInstances(com.aria.common.shared.UpdatePlanUnitInstancesArray value) {
        this.updatePlanUnitInstances = value;
    }

    public com.aria.common.shared.RemovePlanUnitInstancesArray getRemovePlanUnitInstances() {
        return removePlanUnitInstances;
    }

    public void setRemovePlanUnitInstances(com.aria.common.shared.RemovePlanUnitInstancesArray value) {
        this.removePlanUnitInstances = value;
    }

    public com.aria.common.shared.PlanUnitInstFieldDetailsArray getPlanUnitInstFieldDetails() {
        return planUnitInstFieldDetails;
    }

    public void setPlanUnitInstFieldDetails(com.aria.common.shared.PlanUnitInstFieldDetailsArray value) {
        this.planUnitInstFieldDetails = value;
    }

    public Long getAltRateScheduleNo() {
        return altRateScheduleNo;
    }

    public void setAltRateScheduleNo(Long value) {
        this.altRateScheduleNo = value;
    }

    public String getClientAltRateScheduleId() {
        return clientAltRateScheduleId;
    }

    public void setClientAltRateScheduleId(String value) {
        this.clientAltRateScheduleId = value;
    }

    public Long getProrationInvoiceTiming() {
        return prorationInvoiceTiming;
    }

    public void setProrationInvoiceTiming(Long value) {
        this.prorationInvoiceTiming = value;
    }

    public com.aria.common.shared.CustomRatesArray getCustomRates() {
        return customRates;
    }

    public void setCustomRates(com.aria.common.shared.CustomRatesArray value) {
        this.customRates = value;
    }

    public com.aria.common.shared.CouponCodeUpdatesArray getCouponCodeUpdates() {
        return couponCodeUpdates;
    }

    public void setCouponCodeUpdates(com.aria.common.shared.CouponCodeUpdatesArray value) {
        this.couponCodeUpdates = value;
    }

    public com.aria.common.shared.SurchargeUpdatesArray getSurchargeUpdates() {
        return surchargeUpdates;
    }

    public void setSurchargeUpdates(com.aria.common.shared.SurchargeUpdatesArray value) {
        this.surchargeUpdates = value;
    }

    public Double getBalanceForward() {
        return balanceForward;
    }

    public void setBalanceForward(Double value) {
        this.balanceForward = value;
    }

    public Long getParentPlanInstanceNo() {
        return parentPlanInstanceNo;
    }

    public void setParentPlanInstanceNo(Long value) {
        this.parentPlanInstanceNo = value;
    }

    public String getParentClientPlanInstanceId() {
        return parentClientPlanInstanceId;
    }

    public void setParentClientPlanInstanceId(String value) {
        this.parentClientPlanInstanceId = value;
    }

    public Long getParentPlanInstanceIdx() {
        return parentPlanInstanceIdx;
    }

    public void setParentPlanInstanceIdx(Long value) {
        this.parentPlanInstanceIdx = value;
    }

    public Long getPlanStatusCd() {
        return planStatusCd;
    }

    public void setPlanStatusCd(Long value) {
        this.planStatusCd = value;
    }

    public Long getStatusUntilAltStartCd() {
        return statusUntilAltStartCd;
    }

    public void setStatusUntilAltStartCd(Long value) {
        this.statusUntilAltStartCd = value;
    }

    public Long getDunningState() {
        return dunningState;
    }

    public void setDunningState(Long value) {
        this.dunningState = value;
    }

    public String getDegradeDate() {
        return degradeDate;
    }

    public void setDegradeDate(String value) {
        this.degradeDate = value;
    }

    public Long getBillingGroupNo() {
        return billingGroupNo;
    }

    public void setBillingGroupNo(Long value) {
        this.billingGroupNo = value;
    }

    public String getClientBillingGroupId() {
        return clientBillingGroupId;
    }

    public void setClientBillingGroupId(String value) {
        this.clientBillingGroupId = value;
    }

    public Long getBillingGroupIdx() {
        return billingGroupIdx;
    }

    public void setBillingGroupIdx(Long value) {
        this.billingGroupIdx = value;
    }

    public Long getRespLevelCd() {
        return respLevelCd;
    }

    public void setRespLevelCd(Long value) {
        this.respLevelCd = value;
    }

    public Long getParentAcctMpInstNo() {
        return parentAcctMpInstNo;
    }

    public void setParentAcctMpInstNo(Long value) {
        this.parentAcctMpInstNo = value;
    }

    public String getParentAcctClientMpInstId() {
        return parentAcctClientMpInstId;
    }

    public void setParentAcctClientMpInstId(String value) {
        this.parentAcctClientMpInstId = value;
    }

    public Long getDunningGroupNo() {
        return dunningGroupNo;
    }

    public void setDunningGroupNo(Long value) {
        this.dunningGroupNo = value;
    }

    public String getClientDunningGroupId() {
        return clientDunningGroupId;
    }

    public void setClientDunningGroupId(String value) {
        this.clientDunningGroupId = value;
    }

    public Long getDunningGroupIdx() {
        return dunningGroupIdx;
    }

    public void setDunningGroupIdx(Long value) {
        this.dunningGroupIdx = value;
    }

    public com.aria.common.shared.PlanInstanceFieldUpdateArray getPlanInstanceFieldUpdate() {
        return planInstanceFieldUpdate;
    }

    public void setPlanInstanceFieldUpdate(com.aria.common.shared.PlanInstanceFieldUpdateArray value) {
        this.planInstanceFieldUpdate = value;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
    }

    public Long getOffsetMonths() {
        return offsetMonths;
    }

    public void setOffsetMonths(Long value) {
        this.offsetMonths = value;
    }

    public String getAltProrationStartDate() {
        return altProrationStartDate;
    }

    public void setAltProrationStartDate(String value) {
        this.altProrationStartDate = value;
    }

    public Long getAutoOffsetMonthsOption() {
        return autoOffsetMonthsOption;
    }

    public void setAutoOffsetMonthsOption(Long value) {
        this.autoOffsetMonthsOption = value;
    }

    public String getAltCollectGroupNo() {
        return altCollectGroupNo;
    }

    public void setAltCollectGroupNo(String value) {
        this.altCollectGroupNo = value;
    }

    public String getAltClientCollectGroupId() {
        return altClientCollectGroupId;
    }

    public void setAltClientCollectGroupId(String value) {
        this.altClientCollectGroupId = value;
    }

    public Long getOffsetInterval() {
        return offsetInterval;
    }

    public void setOffsetInterval(Long value) {
        this.offsetInterval = value;
    }

    public String getInvoiceUnbilledUsage() {
        return invoiceUnbilledUsage;
    }

    public void setInvoiceUnbilledUsage(String value) {
        this.invoiceUnbilledUsage = value;
    }

    public Long getForceSuppBillDateReset() {
        return forceSuppBillDateReset;
    }

    public void setForceSuppBillDateReset(Long value) {
        this.forceSuppBillDateReset = value;
    }

    public Long getForceMasterBillDateReset() {
        return forceMasterBillDateReset;
    }

    public void setForceMasterBillDateReset(Long value) {
        this.forceMasterBillDateReset = value;
    }

    public String getUsageAccumulationResetMonths() {
        return usageAccumulationResetMonths;
    }

    public void setUsageAccumulationResetMonths(String value) {
        this.usageAccumulationResetMonths = value;
    }

    public String getUsagePooling() {
        return usagePooling;
    }

    public void setUsagePooling(String value) {
        this.usagePooling = value;
    }

    public String getUsageThresholdApplicability() {
        return usageThresholdApplicability;
    }

    public void setUsageThresholdApplicability(String value) {
        this.usageThresholdApplicability = value;
    }

    public String getNsoBillImmediately() {
        return nsoBillImmediately;
    }

    public void setNsoBillImmediately(String value) {
        this.nsoBillImmediately = value;
    }

    public com.aria.common.shared.NsoItemArrayArray getNsoItemArray() {
        return nsoItemArray;
    }

    public void setNsoItemArray(com.aria.common.shared.NsoItemArrayArray value) {
        this.nsoItemArray = value;
    }

    
}
