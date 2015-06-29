package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "suppPlansToAssign",    "assignmentDirective",    "doWrite",    "comments",    "clientReceiptId",    "altProrationStartDate",    "couponCodes",    "effectiveDate",    "syncMstrBillDatesOverride",    "suppPlanSurcharges",    "newAcctCustomRates"})
@XmlRootElement(name = "assign_supp_plan_multi")
public class AssignSuppPlanMulti {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "supp_plans_to_assign")
    protected SuppPlansToAssignArray suppPlansToAssign;
        @XmlElement(name = "assignment_directive")
    protected Long assignmentDirective;
        @XmlElement(name = "do_write")
    protected String doWrite;
        @XmlElement(name = "comments")
    protected String comments;
        @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
        @XmlElement(name = "alt_proration_start_date")
    protected String altProrationStartDate;
        @XmlElement(name = "coupon_codes")
    protected CouponCodesArray couponCodes;
        @XmlElement(name = "effective_date")
    protected String effectiveDate;
        @XmlElement(name = "sync_mstr_bill_dates_override")
    protected Long syncMstrBillDatesOverride;
        @XmlElement(name = "supp_plan_surcharges")
    protected SuppPlanSurchargesArray suppPlanSurcharges;
        @XmlElement(name = "new_acct_custom_rates")
    protected NewAcctCustomRatesArray newAcctCustomRates;
    
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
            public SuppPlansToAssignArray getSuppPlansToAssign() {
        return suppPlansToAssign;
    }

    public void setSuppPlansToAssign(SuppPlansToAssignArray value) {
        this.suppPlansToAssign = value;
    }
            public Long getAssignmentDirective() {
        return assignmentDirective;
    }

    public void setAssignmentDirective(Long value) {
        this.assignmentDirective = value;
    }
            public String getDoWrite() {
        return doWrite;
    }

    public void setDoWrite(String value) {
        this.doWrite = value;
    }
            public String getComments() {
        return comments;
    }

    public void setComments(String value) {
        this.comments = value;
    }
            public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
    }
            public String getAltProrationStartDate() {
        return altProrationStartDate;
    }

    public void setAltProrationStartDate(String value) {
        this.altProrationStartDate = value;
    }
            public CouponCodesArray getCouponCodes() {
        return couponCodes;
    }

    public void setCouponCodes(CouponCodesArray value) {
        this.couponCodes = value;
    }
            public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
    }
            public Long getSyncMstrBillDatesOverride() {
        return syncMstrBillDatesOverride;
    }

    public void setSyncMstrBillDatesOverride(Long value) {
        this.syncMstrBillDatesOverride = value;
    }
            public SuppPlanSurchargesArray getSuppPlanSurcharges() {
        return suppPlanSurcharges;
    }

    public void setSuppPlanSurcharges(SuppPlanSurchargesArray value) {
        this.suppPlanSurcharges = value;
    }
            public NewAcctCustomRatesArray getNewAcctCustomRates() {
        return newAcctCustomRates;
    }

    public void setNewAcctCustomRates(NewAcctCustomRatesArray value) {
        this.newAcctCustomRates = value;
    }
            
}
