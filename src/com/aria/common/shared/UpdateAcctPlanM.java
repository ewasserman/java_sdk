package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "planInstanceNo",    "clientPlanInstanceId",    "altRateScheduleNo",    "planUnits",    "couponCodes",    "promoCd",    "planStatus",    "planInstanceDescription",    "planInstanceFieldUpdate",    "assignmentDirective",    "comments",    "doWrite",    "clientReceiptId",    "customRates",    "effectiveDate",    "offsetInterval",    "forceMasterBillDateReset",    "clientAltRateScheduleId",    "newClientPlanInstId",    "dunningState",    "degradeDate",    "respLevelCd",    "parentAcctMasterPlanInstId",    "usageAccumulationResetMonths",    "usagePooling",    "usageThresholdApplicability",    "mpSurcharges"})
@XmlRootElement(name = "update_acct_plan_m")
public class UpdateAcctPlanM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "plan_instance_no")
    protected Long planInstanceNo;
        @XmlElement(name = "client_plan_instance_id")
    protected String clientPlanInstanceId;
        @XmlElement(name = "alt_rate_schedule_no")
    protected Long altRateScheduleNo;
        @XmlElement(name = "plan_units")
    protected Double planUnits;
        @XmlElement(name = "coupon_codes")
    protected CouponCodesArray couponCodes;
        @XmlElement(name = "promo_cd")
    protected String promoCd;
        @XmlElement(name = "plan_status")
    protected Long planStatus;
        @XmlElement(name = "plan_instance_description")
    protected String planInstanceDescription;
        @XmlElement(name = "plan_instance_field_update")
    protected PlanInstanceFieldUpdateArray planInstanceFieldUpdate;
        @XmlElement(name = "assignment_directive")
    protected Long assignmentDirective;
        @XmlElement(name = "comments")
    protected String comments;
        @XmlElement(name = "do_write")
    protected String doWrite;
        @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
        @XmlElement(name = "custom_rates")
    protected CustomRatesArray customRates;
        @XmlElement(name = "effective_date")
    protected String effectiveDate;
        @XmlElement(name = "offset_interval")
    protected Long offsetInterval;
        @XmlElement(name = "force_master_bill_date_reset")
    protected Long forceMasterBillDateReset;
        @XmlElement(name = "client_alt_rate_schedule_id")
    protected String clientAltRateScheduleId;
        @XmlElement(name = "new_client_plan_inst_id")
    protected Long newClientPlanInstId;
        @XmlElement(name = "dunning_state")
    protected String dunningState;
        @XmlElement(name = "degrade_date")
    protected String degradeDate;
        @XmlElement(name = "resp_level_cd")
    protected Long respLevelCd;
        @XmlElement(name = "parent_acct_master_plan_inst_id")
    protected String parentAcctMasterPlanInstId;
        @XmlElement(name = "usage_accumulation_reset_months")
    protected Long usageAccumulationResetMonths;
        @XmlElement(name = "usage_pooling")
    protected String usagePooling;
        @XmlElement(name = "usage_threshold_applicability")
    protected String usageThresholdApplicability;
        @XmlElement(name = "mp_surcharges")
    protected MpSurchargesArray mpSurcharges;
    
    public long getClientNo() {
        return clientNo;
    }

    public void setClientNo(Long value) {
        this.clientNo = value;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String value) {
        this.authKey = value;
    }

    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
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
            public Long getAltRateScheduleNo() {
        return altRateScheduleNo;
    }

    public void setAltRateScheduleNo(Long value) {
        this.altRateScheduleNo = value;
    }
            public Double getPlanUnits() {
        return planUnits;
    }

    public void setPlanUnits(Double value) {
        this.planUnits = value;
    }
            public CouponCodesArray getCouponCodes() {
        return couponCodes;
    }

    public void setCouponCodes(CouponCodesArray value) {
        this.couponCodes = value;
    }
            public String getPromoCd() {
        return promoCd;
    }

    public void setPromoCd(String value) {
        this.promoCd = value;
    }
            public Long getPlanStatus() {
        return planStatus;
    }

    public void setPlanStatus(Long value) {
        this.planStatus = value;
    }
            public String getPlanInstanceDescription() {
        return planInstanceDescription;
    }

    public void setPlanInstanceDescription(String value) {
        this.planInstanceDescription = value;
    }
            public PlanInstanceFieldUpdateArray getPlanInstanceFieldUpdate() {
        return planInstanceFieldUpdate;
    }

    public void setPlanInstanceFieldUpdate(PlanInstanceFieldUpdateArray value) {
        this.planInstanceFieldUpdate = value;
    }
            public Long getAssignmentDirective() {
        return assignmentDirective;
    }

    public void setAssignmentDirective(Long value) {
        this.assignmentDirective = value;
    }
            public String getComments() {
        return comments;
    }

    public void setComments(String value) {
        this.comments = value;
    }
            public String getDoWrite() {
        return doWrite;
    }

    public void setDoWrite(String value) {
        this.doWrite = value;
    }
            public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
    }
            public CustomRatesArray getCustomRates() {
        return customRates;
    }

    public void setCustomRates(CustomRatesArray value) {
        this.customRates = value;
    }
            public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
    }
            public Long getOffsetInterval() {
        return offsetInterval;
    }

    public void setOffsetInterval(Long value) {
        this.offsetInterval = value;
    }
            public Long getForceMasterBillDateReset() {
        return forceMasterBillDateReset;
    }

    public void setForceMasterBillDateReset(Long value) {
        this.forceMasterBillDateReset = value;
    }
            public String getClientAltRateScheduleId() {
        return clientAltRateScheduleId;
    }

    public void setClientAltRateScheduleId(String value) {
        this.clientAltRateScheduleId = value;
    }
            public Long getNewClientPlanInstId() {
        return newClientPlanInstId;
    }

    public void setNewClientPlanInstId(Long value) {
        this.newClientPlanInstId = value;
    }
            public String getDunningState() {
        return dunningState;
    }

    public void setDunningState(String value) {
        this.dunningState = value;
    }
            public String getDegradeDate() {
        return degradeDate;
    }

    public void setDegradeDate(String value) {
        this.degradeDate = value;
    }
            public Long getRespLevelCd() {
        return respLevelCd;
    }

    public void setRespLevelCd(Long value) {
        this.respLevelCd = value;
    }
            public String getParentAcctMasterPlanInstId() {
        return parentAcctMasterPlanInstId;
    }

    public void setParentAcctMasterPlanInstId(String value) {
        this.parentAcctMasterPlanInstId = value;
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
            public MpSurchargesArray getMpSurcharges() {
        return mpSurcharges;
    }

    public void setMpSurcharges(MpSurchargesArray value) {
        this.mpSurcharges = value;
    }
            
}
