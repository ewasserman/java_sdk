package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recurring_credits_details_ReturnElement", propOrder = {"outAcctNo", "outMasterPlanInstanceNo", "outClientMpInstanceId", "recurringCreditNo", "createDate", "createUser", "updateDate", "updateUser", "firstCreditDate", "lastCreditDate", "nextCreditDate", "creditAmount", "currencyCd", "creditsCompleted", "creditsRemaining", "creditIntervalMonths", "eligiblePlanNo", "eligiblePlanName", "eligibleServiceNo", "eligibleServiceName", "serviceNoToApply", "serviceNameToApply", "creditStatusCd", "creditStatusLabel", "creditReasonCd", "creditReasonText", "comments", "cancelDate", "cancelUser", "cancelComments", "clientEligiblePlanId", "clientEligibleServiceId", "clientServiceIdToApply", "eligibleServiceTypes", "eligibleServicePlanDetails"})
public class RecurringCreditsDetailsReturnElement {

    @XmlElement(name = "out_acct_no")
    protected Long outAcctNo;
    @XmlElement(name = "out_master_plan_instance_no")
    protected Long outMasterPlanInstanceNo;
    @XmlElement(name = "out_client_mp_instance_id")
    protected String outClientMpInstanceId;
    @XmlElement(name = "recurring_credit_no")
    protected Long recurringCreditNo;
    @XmlElement(name = "create_date")
    protected String createDate;
    @XmlElement(name = "create_user")
    protected String createUser;
    @XmlElement(name = "update_date")
    protected String updateDate;
    @XmlElement(name = "update_user")
    protected String updateUser;
    @XmlElement(name = "first_credit_date")
    protected String firstCreditDate;
    @XmlElement(name = "last_credit_date")
    protected String lastCreditDate;
    @XmlElement(name = "next_credit_date")
    protected String nextCreditDate;
    @XmlElement(name = "credit_amount")
    protected Double creditAmount;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "credits_completed")
    protected Long creditsCompleted;
    @XmlElement(name = "credits_remaining")
    protected Long creditsRemaining;
    @XmlElement(name = "credit_interval_months")
    protected Long creditIntervalMonths;
    @XmlElement(name = "eligible_plan_no")
    protected Long eligiblePlanNo;
    @XmlElement(name = "eligible_plan_name")
    protected String eligiblePlanName;
    @XmlElement(name = "eligible_service_no")
    protected Long eligibleServiceNo;
    @XmlElement(name = "eligible_service_name")
    protected String eligibleServiceName;
    @XmlElement(name = "service_no_to_apply")
    protected Long serviceNoToApply;
    @XmlElement(name = "service_name_to_apply")
    protected String serviceNameToApply;
    @XmlElement(name = "credit_status_cd")
    protected Long creditStatusCd;
    @XmlElement(name = "credit_status_label")
    protected String creditStatusLabel;
    @XmlElement(name = "credit_reason_cd")
    protected Long creditReasonCd;
    @XmlElement(name = "credit_reason_text")
    protected String creditReasonText;
    @XmlElement(name = "comments")
    protected String comments;
    @XmlElement(name = "cancel_date")
    protected String cancelDate;
    @XmlElement(name = "cancel_user")
    protected String cancelUser;
    @XmlElement(name = "cancel_comments")
    protected String cancelComments;
    @XmlElement(name = "client_eligible_plan_id")
    protected String clientEligiblePlanId;
    @XmlElement(name = "client_eligible_service_id")
    protected String clientEligibleServiceId;
    @XmlElement(name = "client_service_id_to_apply")
    protected String clientServiceIdToApply;
    @XmlElement(name = "eligible_service_types")
    protected List<EligibleServiceTypesReturnElement> eligibleServiceTypes;
    @XmlElement(name = "eligible_service_plan_details")
    protected List<EligibleServicePlanDetailsReturnElement> eligibleServicePlanDetails;
    
    public Long getOutAcctNo() {
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

    public Long getRecurringCreditNo() {
        return recurringCreditNo;
    }

    public void setRecurringCreditNo(Long value) {
        this.recurringCreditNo = value;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String value) {
        this.createDate = value;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String value) {
        this.createUser = value;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String value) {
        this.updateDate = value;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String value) {
        this.updateUser = value;
    }

    public String getFirstCreditDate() {
        return firstCreditDate;
    }

    public void setFirstCreditDate(String value) {
        this.firstCreditDate = value;
    }

    public String getLastCreditDate() {
        return lastCreditDate;
    }

    public void setLastCreditDate(String value) {
        this.lastCreditDate = value;
    }

    public String getNextCreditDate() {
        return nextCreditDate;
    }

    public void setNextCreditDate(String value) {
        this.nextCreditDate = value;
    }

    public Double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Double value) {
        this.creditAmount = value;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }

    public Long getCreditsCompleted() {
        return creditsCompleted;
    }

    public void setCreditsCompleted(Long value) {
        this.creditsCompleted = value;
    }

    public Long getCreditsRemaining() {
        return creditsRemaining;
    }

    public void setCreditsRemaining(Long value) {
        this.creditsRemaining = value;
    }

    public Long getCreditIntervalMonths() {
        return creditIntervalMonths;
    }

    public void setCreditIntervalMonths(Long value) {
        this.creditIntervalMonths = value;
    }

    public Long getEligiblePlanNo() {
        return eligiblePlanNo;
    }

    public void setEligiblePlanNo(Long value) {
        this.eligiblePlanNo = value;
    }

    public String getEligiblePlanName() {
        return eligiblePlanName;
    }

    public void setEligiblePlanName(String value) {
        this.eligiblePlanName = value;
    }

    public Long getEligibleServiceNo() {
        return eligibleServiceNo;
    }

    public void setEligibleServiceNo(Long value) {
        this.eligibleServiceNo = value;
    }

    public String getEligibleServiceName() {
        return eligibleServiceName;
    }

    public void setEligibleServiceName(String value) {
        this.eligibleServiceName = value;
    }

    public Long getServiceNoToApply() {
        return serviceNoToApply;
    }

    public void setServiceNoToApply(Long value) {
        this.serviceNoToApply = value;
    }

    public String getServiceNameToApply() {
        return serviceNameToApply;
    }

    public void setServiceNameToApply(String value) {
        this.serviceNameToApply = value;
    }

    public Long getCreditStatusCd() {
        return creditStatusCd;
    }

    public void setCreditStatusCd(Long value) {
        this.creditStatusCd = value;
    }

    public String getCreditStatusLabel() {
        return creditStatusLabel;
    }

    public void setCreditStatusLabel(String value) {
        this.creditStatusLabel = value;
    }

    public Long getCreditReasonCd() {
        return creditReasonCd;
    }

    public void setCreditReasonCd(Long value) {
        this.creditReasonCd = value;
    }

    public String getCreditReasonText() {
        return creditReasonText;
    }

    public void setCreditReasonText(String value) {
        this.creditReasonText = value;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String value) {
        this.comments = value;
    }

    public String getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(String value) {
        this.cancelDate = value;
    }

    public String getCancelUser() {
        return cancelUser;
    }

    public void setCancelUser(String value) {
        this.cancelUser = value;
    }

    public String getCancelComments() {
        return cancelComments;
    }

    public void setCancelComments(String value) {
        this.cancelComments = value;
    }

    public String getClientEligiblePlanId() {
        return clientEligiblePlanId;
    }

    public void setClientEligiblePlanId(String value) {
        this.clientEligiblePlanId = value;
    }

    public String getClientEligibleServiceId() {
        return clientEligibleServiceId;
    }

    public void setClientEligibleServiceId(String value) {
        this.clientEligibleServiceId = value;
    }

    public String getClientServiceIdToApply() {
        return clientServiceIdToApply;
    }

    public void setClientServiceIdToApply(String value) {
        this.clientServiceIdToApply = value;
    }

    public List<EligibleServiceTypesReturnElement> getEligibleServiceTypes() {
        if (this.eligibleServiceTypes == null) {
            this.eligibleServiceTypes = new ArrayList<EligibleServiceTypesReturnElement>();
        }
        return this.eligibleServiceTypes;
    }public List<EligibleServicePlanDetailsReturnElement> getEligibleServicePlanDetails() {
        if (this.eligibleServicePlanDetails == null) {
            this.eligibleServicePlanDetails = new ArrayList<EligibleServicePlanDetailsReturnElement>();
        }
        return this.eligibleServicePlanDetails;
    }
}
