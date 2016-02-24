package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "master_plans_detail_row", propOrder = {
    "planNo",
    "clientPlanId",
    "planInstanceDescription",
    "clientPlanInstanceId",
    "planInstanceIdx",
    "promoCd",
    "planInstanceUnits",
    "planUnitInstances",
    "planInstanceStatus",
    "respLevelCd",
    "respMasterPlanInstNo",
    "clientRespMasterPlanInstId",
    "respMasterPlanInstIdx",
    "clientBillingGroupId",
    "billingGroupIdx",
    "clientDunningGroupId",
    "dunningGroupIdx",
    "statusUntilAltStart",
    "balanceForward",
    "couponCodes",
    "mpiSurcharges",
    "nsoBillImmediately",
    "masterPlanNsoList",
    "nsoPoNum",
    "planInstanceFieldsInfo",
    "altRateScheduleNo",
    "clientAltRateScheduleId",
    "usageAccumulationResetMonths",
    "usagePooling",
    "usageThresholdApplicability",
    "customRates",
    "poNum",
    "suppPlan"
    })
public class MasterPlansDetailRow {

    @XmlElement(name = "plan_no")
    protected Long planNo;
    @XmlElement(name = "client_plan_id")
    protected String clientPlanId;
    @XmlElement(name = "plan_instance_description")
    protected String planInstanceDescription;
    @XmlElement(name = "client_plan_instance_id")
    protected String clientPlanInstanceId;
    @XmlElement(name = "plan_instance_idx")
    protected Long planInstanceIdx;
    @XmlElement(name = "promo_cd")
    protected String promoCd;
    @XmlElement(name = "plan_instance_units")
    protected Long planInstanceUnits;
    @XmlElement(name = "plan_unit_instances")
    protected com.aria.common.shared.PlanUnitInstancesArray planUnitInstances;
    @XmlElement(name = "plan_instance_status")
    protected Long planInstanceStatus;
    @XmlElement(name = "resp_level_cd")
    protected Long respLevelCd;
    @XmlElement(name = "resp_master_plan_inst_no")
    protected Long respMasterPlanInstNo;
    @XmlElement(name = "client_resp_master_plan_inst_id")
    protected String clientRespMasterPlanInstId;
    @XmlElement(name = "resp_master_plan_inst_idx")
    protected Long respMasterPlanInstIdx;
    @XmlElement(name = "client_billing_group_id")
    protected String clientBillingGroupId;
    @XmlElement(name = "billing_group_idx")
    protected Long billingGroupIdx;
    @XmlElement(name = "client_dunning_group_id")
    protected String clientDunningGroupId;
    @XmlElement(name = "dunning_group_idx")
    protected Long dunningGroupIdx;
    @XmlElement(name = "status_until_alt_start")
    protected Long statusUntilAltStart;
    @XmlElement(name = "balance_forward")
    protected Double balanceForward;
    @XmlElement(name = "coupon_codes")
    protected com.aria.common.shared.CouponCodesArray couponCodes;
    @XmlElement(name = "mpi_surcharges")
    protected com.aria.common.shared.MpiSurchargesArray mpiSurcharges;
    @XmlElement(name = "nso_bill_immediately")
    protected Long nsoBillImmediately;
    @XmlElement(name = "master_plan_nso_list")
    protected com.aria.common.shared.MasterPlanNsoListArray masterPlanNsoList;
    @XmlElement(name = "nso_po_num")
    protected String nsoPoNum;
    @XmlElement(name = "plan_instance_fields_info")
    protected com.aria.common.shared.PlanInstanceFieldsInfoArray planInstanceFieldsInfo;
    @XmlElement(name = "alt_rate_schedule_no")
    protected Long altRateScheduleNo;
    @XmlElement(name = "client_alt_rate_schedule_id")
    protected String clientAltRateScheduleId;
    @XmlElement(name = "usage_accumulation_reset_months")
    protected Long usageAccumulationResetMonths;
    @XmlElement(name = "usage_pooling")
    protected String usagePooling;
    @XmlElement(name = "usage_threshold_applicability")
    protected String usageThresholdApplicability;
    @XmlElement(name = "custom_rates")
    protected com.aria.common.shared.CustomRatesArray customRates;
    @XmlElement(name = "po_num")
    protected String poNum;
    @XmlElement(name = "supp_plan")
    protected com.aria.common.shared.SuppPlanArray suppPlan;
    public Long getPlanNo() {
        return planNo;
    }

    public void setPlanNo(Long value) {
        this.planNo = value;
    }

    public String getClientPlanId() {
        return clientPlanId;
    }

    public void setClientPlanId(String value) {
        this.clientPlanId = value;
    }

    public String getPlanInstanceDescription() {
        return planInstanceDescription;
    }

    public void setPlanInstanceDescription(String value) {
        this.planInstanceDescription = value;
    }

    public String getClientPlanInstanceId() {
        return clientPlanInstanceId;
    }

    public void setClientPlanInstanceId(String value) {
        this.clientPlanInstanceId = value;
    }

    public Long getPlanInstanceIdx() {
        return planInstanceIdx;
    }

    public void setPlanInstanceIdx(Long value) {
        this.planInstanceIdx = value;
    }

    public String getPromoCd() {
        return promoCd;
    }

    public void setPromoCd(String value) {
        this.promoCd = value;
    }

    public Long getPlanInstanceUnits() {
        return planInstanceUnits;
    }

    public void setPlanInstanceUnits(Long value) {
        this.planInstanceUnits = value;
    }

    public com.aria.common.shared.PlanUnitInstancesArray getPlanUnitInstances() {
        return planUnitInstances;
    }

    public void setPlanUnitInstances(com.aria.common.shared.PlanUnitInstancesArray value) {
        this.planUnitInstances = value;
    }

    public Long getPlanInstanceStatus() {
        return planInstanceStatus;
    }

    public void setPlanInstanceStatus(Long value) {
        this.planInstanceStatus = value;
    }

    public Long getRespLevelCd() {
        return respLevelCd;
    }

    public void setRespLevelCd(Long value) {
        this.respLevelCd = value;
    }

    public Long getRespMasterPlanInstNo() {
        return respMasterPlanInstNo;
    }

    public void setRespMasterPlanInstNo(Long value) {
        this.respMasterPlanInstNo = value;
    }

    public String getClientRespMasterPlanInstId() {
        return clientRespMasterPlanInstId;
    }

    public void setClientRespMasterPlanInstId(String value) {
        this.clientRespMasterPlanInstId = value;
    }

    public Long getRespMasterPlanInstIdx() {
        return respMasterPlanInstIdx;
    }

    public void setRespMasterPlanInstIdx(Long value) {
        this.respMasterPlanInstIdx = value;
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

    public Long getStatusUntilAltStart() {
        return statusUntilAltStart;
    }

    public void setStatusUntilAltStart(Long value) {
        this.statusUntilAltStart = value;
    }

    public Double getBalanceForward() {
        return balanceForward;
    }

    public void setBalanceForward(Double value) {
        this.balanceForward = value;
    }

    public com.aria.common.shared.CouponCodesArray getCouponCodes() {
        return couponCodes;
    }

    public void setCouponCodes(com.aria.common.shared.CouponCodesArray value) {
        this.couponCodes = value;
    }

    public com.aria.common.shared.MpiSurchargesArray getMpiSurcharges() {
        return mpiSurcharges;
    }

    public void setMpiSurcharges(com.aria.common.shared.MpiSurchargesArray value) {
        this.mpiSurcharges = value;
    }

    public Long getNsoBillImmediately() {
        return nsoBillImmediately;
    }

    public void setNsoBillImmediately(Long value) {
        this.nsoBillImmediately = value;
    }

    public com.aria.common.shared.MasterPlanNsoListArray getMasterPlanNsoList() {
        return masterPlanNsoList;
    }

    public void setMasterPlanNsoList(com.aria.common.shared.MasterPlanNsoListArray value) {
        this.masterPlanNsoList = value;
    }

    public String getNsoPoNum() {
        return nsoPoNum;
    }

    public void setNsoPoNum(String value) {
        this.nsoPoNum = value;
    }

    public com.aria.common.shared.PlanInstanceFieldsInfoArray getPlanInstanceFieldsInfo() {
        return planInstanceFieldsInfo;
    }

    public void setPlanInstanceFieldsInfo(com.aria.common.shared.PlanInstanceFieldsInfoArray value) {
        this.planInstanceFieldsInfo = value;
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

    public Long getUsageAccumulationResetMonths() {
        return usageAccumulationResetMonths;
    }

    public void setUsageAccumulationResetMonths(Long value) {
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

    public com.aria.common.shared.CustomRatesArray getCustomRates() {
        return customRates;
    }

    public void setCustomRates(com.aria.common.shared.CustomRatesArray value) {
        this.customRates = value;
    }

    public String getPoNum() {
        return poNum;
    }

    public void setPoNum(String value) {
        this.poNum = value;
    }

    public com.aria.common.shared.SuppPlanArray getSuppPlan() {
        return suppPlan;
    }

    public void setSuppPlan(com.aria.common.shared.SuppPlanArray value) {
        this.suppPlan = value;
    }

    
}
