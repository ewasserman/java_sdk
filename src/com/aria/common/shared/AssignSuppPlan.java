package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "suppPlanNo",    "clientSuppPlanId",    "altRateScheduleNo",    "numPlanUnits",    "couponCode",    "assignmentDirective",    "comments",    "doWrite",    "clientReceiptId",    "contractTypeNo",    "contractAltRecurFee",    "contractLengthMonths",    "contractCancelFee",    "contractComments",    "contractStartDate",    "offsetMonths",    "autoOffsetMonthsOption",    "altProrationStartDate",    "altClientAcctGroupId",    "newAcctCustomRates",    "effectiveDate",    "offsetInterval",    "contractEndDate",    "syncMstrBillDatesOverride",    "clientAltRateScheduleId",    "surchargeNo"})
@XmlRootElement(name = "assign_supp_plan")
public class AssignSuppPlan {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "supp_plan_no")
    protected Long suppPlanNo;
        @XmlElement(name = "client_supp_plan_id")
    protected String clientSuppPlanId;
        @XmlElement(name = "alt_rate_schedule_no")
    protected Long altRateScheduleNo;
        @XmlElement(name = "num_plan_units")
    protected Long numPlanUnits;
        @XmlElement(name = "coupon_code")
    protected String couponCode;
        @XmlElement(name = "assignment_directive")
    protected Long assignmentDirective;
        @XmlElement(name = "comments")
    protected String comments;
        @XmlElement(name = "do_write")
    protected String doWrite;
        @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
        @XmlElement(name = "contract_type_no")
    protected Long contractTypeNo;
        @XmlElement(name = "contract_alt_recur_fee")
    protected Double contractAltRecurFee;
        @XmlElement(name = "contract_length_months")
    protected Long contractLengthMonths;
        @XmlElement(name = "contract_cancel_fee")
    protected Double contractCancelFee;
        @XmlElement(name = "contract_comments")
    protected String contractComments;
        @XmlElement(name = "contract_start_date")
    protected String contractStartDate;
        @XmlElement(name = "offset_months")
    protected Long offsetMonths;
        @XmlElement(name = "auto_offset_months_option")
    protected Long autoOffsetMonthsOption;
        @XmlElement(name = "alt_proration_start_date")
    protected String altProrationStartDate;
        @XmlElement(name = "alt_client_acct_group_id")
    protected String altClientAcctGroupId;
        @XmlElement(name = "new_acct_custom_rates")
    protected NewAcctCustomRatesArray newAcctCustomRates;
        @XmlElement(name = "effective_date")
    protected String effectiveDate;
        @XmlElement(name = "offset_interval")
    protected Long offsetInterval;
        @XmlElement(name = "contract_end_date")
    protected String contractEndDate;
        @XmlElement(name = "sync_mstr_bill_dates_override")
    protected Long syncMstrBillDatesOverride;
        @XmlElement(name = "client_alt_rate_schedule_id")
    protected String clientAltRateScheduleId;
        @XmlElement(name = "surcharge_no")
    protected SurchargeNoArray surchargeNo;
    
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
            public Long getSuppPlanNo() {
        return suppPlanNo;
    }

    public void setSuppPlanNo(Long value) {
        this.suppPlanNo = value;
    }
            public String getClientSuppPlanId() {
        return clientSuppPlanId;
    }

    public void setClientSuppPlanId(String value) {
        this.clientSuppPlanId = value;
    }
            public Long getAltRateScheduleNo() {
        return altRateScheduleNo;
    }

    public void setAltRateScheduleNo(Long value) {
        this.altRateScheduleNo = value;
    }
            public Long getNumPlanUnits() {
        return numPlanUnits;
    }

    public void setNumPlanUnits(Long value) {
        this.numPlanUnits = value;
    }
            public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String value) {
        this.couponCode = value;
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
            public Long getContractTypeNo() {
        return contractTypeNo;
    }

    public void setContractTypeNo(Long value) {
        this.contractTypeNo = value;
    }
            public Double getContractAltRecurFee() {
        return contractAltRecurFee;
    }

    public void setContractAltRecurFee(Double value) {
        this.contractAltRecurFee = value;
    }
            public Long getContractLengthMonths() {
        return contractLengthMonths;
    }

    public void setContractLengthMonths(Long value) {
        this.contractLengthMonths = value;
    }
            public Double getContractCancelFee() {
        return contractCancelFee;
    }

    public void setContractCancelFee(Double value) {
        this.contractCancelFee = value;
    }
            public String getContractComments() {
        return contractComments;
    }

    public void setContractComments(String value) {
        this.contractComments = value;
    }
            public String getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(String value) {
        this.contractStartDate = value;
    }
            public Long getOffsetMonths() {
        return offsetMonths;
    }

    public void setOffsetMonths(Long value) {
        this.offsetMonths = value;
    }
            public Long getAutoOffsetMonthsOption() {
        return autoOffsetMonthsOption;
    }

    public void setAutoOffsetMonthsOption(Long value) {
        this.autoOffsetMonthsOption = value;
    }
            public String getAltProrationStartDate() {
        return altProrationStartDate;
    }

    public void setAltProrationStartDate(String value) {
        this.altProrationStartDate = value;
    }
            public String getAltClientAcctGroupId() {
        return altClientAcctGroupId;
    }

    public void setAltClientAcctGroupId(String value) {
        this.altClientAcctGroupId = value;
    }
            public NewAcctCustomRatesArray getNewAcctCustomRates() {
        return newAcctCustomRates;
    }

    public void setNewAcctCustomRates(NewAcctCustomRatesArray value) {
        this.newAcctCustomRates = value;
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
            public String getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(String value) {
        this.contractEndDate = value;
    }
            public Long getSyncMstrBillDatesOverride() {
        return syncMstrBillDatesOverride;
    }

    public void setSyncMstrBillDatesOverride(Long value) {
        this.syncMstrBillDatesOverride = value;
    }
            public String getClientAltRateScheduleId() {
        return clientAltRateScheduleId;
    }

    public void setClientAltRateScheduleId(String value) {
        this.clientAltRateScheduleId = value;
    }
            public SurchargeNoArray getSurchargeNo() {
        return surchargeNo;
    }

    public void setSurchargeNo(SurchargeNoArray value) {
        this.surchargeNo = value;
    }
            
}
