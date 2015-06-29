package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "createdBy", "createdDate", "amount", "creditType", "appliedAmount", "unappliedAmount", "reasonCode", "reasonText", "comments", "transactionId", "voidTransactionId", "creditExpiryTypeInd", "creditExpiryMonths", "creditExpiryDate", "eligibleServicePlanDetails", "outAcctNo", "outMasterPlanInstanceNo", "outClientMpInstanceId"})
@XmlRootElement(name = "get_credit_details_mResponseElement")
public class GetCreditDetailsMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "created_by")
    protected String createdBy;
    @XmlElement(name = "created_date")
    protected String createdDate;
    @XmlElement(name = "amount")
    protected Double amount;
    @XmlElement(name = "credit_type")
    protected String creditType;
    @XmlElement(name = "applied_amount")
    protected Double appliedAmount;
    @XmlElement(name = "unapplied_amount")
    protected Double unappliedAmount;
    @XmlElement(name = "reason_code")
    protected Long reasonCode;
    @XmlElement(name = "reason_text")
    protected String reasonText;
    @XmlElement(name = "comments")
    protected String comments;
    @XmlElement(name = "transaction_id")
    protected Long transactionId;
    @XmlElement(name = "void_transaction_id")
    protected Long voidTransactionId;
    @XmlElement(name = "credit_expiry_type_ind")
    protected String creditExpiryTypeInd;
    @XmlElement(name = "credit_expiry_months")
    protected Long creditExpiryMonths;
    @XmlElement(name = "credit_expiry_date")
    protected String creditExpiryDate;
    @XmlElement(name = "eligible_service_plan_details")
    protected List<EligibleServicePlanDetailsReturnElement> eligibleServicePlanDetails;
    @XmlElement(name = "out_acct_no")
    protected Long outAcctNo;
    @XmlElement(name = "out_master_plan_instance_no")
    protected Long outMasterPlanInstanceNo;
    @XmlElement(name = "out_client_mp_instance_id")
    protected String outClientMpInstanceId;
    
    public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long value) {
        this.errorCode = value;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String value) {
        this.createdDate = value;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double value) {
        this.amount = value;
    }

    public String getCreditType() {
        return creditType;
    }

    public void setCreditType(String value) {
        this.creditType = value;
    }

    public Double getAppliedAmount() {
        return appliedAmount;
    }

    public void setAppliedAmount(Double value) {
        this.appliedAmount = value;
    }

    public Double getUnappliedAmount() {
        return unappliedAmount;
    }

    public void setUnappliedAmount(Double value) {
        this.unappliedAmount = value;
    }

    public Long getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(Long value) {
        this.reasonCode = value;
    }

    public String getReasonText() {
        return reasonText;
    }

    public void setReasonText(String value) {
        this.reasonText = value;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String value) {
        this.comments = value;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long value) {
        this.transactionId = value;
    }

    public Long getVoidTransactionId() {
        return voidTransactionId;
    }

    public void setVoidTransactionId(Long value) {
        this.voidTransactionId = value;
    }

    public String getCreditExpiryTypeInd() {
        return creditExpiryTypeInd;
    }

    public void setCreditExpiryTypeInd(String value) {
        this.creditExpiryTypeInd = value;
    }

    public Long getCreditExpiryMonths() {
        return creditExpiryMonths;
    }

    public void setCreditExpiryMonths(Long value) {
        this.creditExpiryMonths = value;
    }

    public String getCreditExpiryDate() {
        return creditExpiryDate;
    }

    public void setCreditExpiryDate(String value) {
        this.creditExpiryDate = value;
    }

    public List<EligibleServicePlanDetailsReturnElement> getEligibleServicePlanDetails() {
        if (this.eligibleServicePlanDetails == null) {
            this.eligibleServicePlanDetails = new ArrayList<EligibleServicePlanDetailsReturnElement>();
        }
        return this.eligibleServicePlanDetails;
    }public Long getOutAcctNo() {
        return outAcctNo;
    }

    public void setOutAcctNo(Long value) {
        this.outAcctNo = value;
    }

    public Long getOutMasterPlanInstanceNo() {
        return outMasterPlanInstanceNo;
    }

    public void setOutMasterPlanInstanceNo(Long value) {
        this.outMasterPlanInstanceNo = value;
    }

    public String getOutClientMpInstanceId() {
        return outClientMpInstanceId;
    }

    public void setOutClientMpInstanceId(String value) {
        this.outClientMpInstanceId = value;
    }

    
}
