package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "planInstanceNo",    "clientPlanInstanceId",    "newPlanNo",    "newClientPlanId",    "newClientPlanInstanceId",    "altRateScheduleNo",    "planUnits",    "couponCodes",    "promoCd",    "mpSurcharges",    "planStatus",    "planInstanceDescription",    "planInstanceFieldUpdate",    "assignmentDirective",    "comments",    "doWrite",    "clientReceiptId",    "offsetMonths",    "altProrationStartDate",    "autoOffsetMonthsOption",    "altClientAcctGroupId",    "customRates",    "effectiveDate",    "offsetInterval",    "invoiceUnbilledUsage",    "forceSuppBillDateReset",    "forceMasterBillDateReset",    "clientAltRateScheduleId",    "usageAccumulationResetMonths",    "usagePooling",    "usageThresholdApplicability"})
@XmlRootElement(name = "replace_acct_plan_m")
public class ReplaceAcctPlanM {

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
        @XmlElement(name = "new_plan_no")
    protected Long newPlanNo;
        @XmlElement(name = "new_client_plan_id")
    protected String newClientPlanId;
        @XmlElement(name = "new_client_plan_instance_id")
    protected String newClientPlanInstanceId;
        @XmlElement(name = "alt_rate_schedule_no")
    protected Long altRateScheduleNo;
        @XmlElement(name = "plan_units")
    protected Double planUnits;
        @XmlElement(name = "coupon_codes")
    protected CouponCodesArray couponCodes;
        @XmlElement(name = "promo_cd")
    protected String promoCd;
        @XmlElement(name = "mp_surcharges")
    protected MpSurchargesArray mpSurcharges;
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
        @XmlElement(name = "offset_months")
    protected Long offsetMonths;
        @XmlElement(name = "alt_proration_start_date")
    protected String altProrationStartDate;
        @XmlElement(name = "auto_offset_months_option")
    protected Long autoOffsetMonthsOption;
        @XmlElement(name = "alt_client_acct_group_id")
    protected String altClientAcctGroupId;
        @XmlElement(name = "custom_rates")
    protected CustomRatesArray customRates;
        @XmlElement(name = "effective_date")
    protected String effectiveDate;
        @XmlElement(name = "offset_interval")
    protected Long offsetInterval;
        @XmlElement(name = "invoice_unbilled_usage")
    protected String invoiceUnbilledUsage;
        @XmlElement(name = "force_supp_bill_date_reset")
    protected Long forceSuppBillDateReset;
        @XmlElement(name = "force_master_bill_date_reset")
    protected Long forceMasterBillDateReset;
        @XmlElement(name = "client_alt_rate_schedule_id")
    protected String clientAltRateScheduleId;
        @XmlElement(name = "usage_accumulation_reset_months")
    protected Long usageAccumulationResetMonths;
        @XmlElement(name = "usage_pooling")
    protected String usagePooling;
        @XmlElement(name = "usage_threshold_applicability")
    protected String usageThresholdApplicability;
    
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
            public String getNewClientPlanInstanceId() {
        return newClientPlanInstanceId;
    }

    public void setNewClientPlanInstanceId(String value) {
        this.newClientPlanInstanceId = value;
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
            public MpSurchargesArray getMpSurcharges() {
        return mpSurcharges;
    }

    public void setMpSurcharges(MpSurchargesArray value) {
        this.mpSurcharges = value;
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
            public String getAltClientAcctGroupId() {
        return altClientAcctGroupId;
    }

    public void setAltClientAcctGroupId(String value) {
        this.altClientAcctGroupId = value;
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
            
}
