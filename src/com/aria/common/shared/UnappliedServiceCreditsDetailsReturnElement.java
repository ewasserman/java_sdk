package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unapplied_service_credits_details_ReturnElement", propOrder = {"creditId", "createDate", "createUser", "initialAmount", "amountLeftToApply", "reasonCd", "reasonText", "comments", "currencyCd", "serviceNoToApply", "serviceNameToApply", "eligiblePlanNo", "eligiblePlanName", "eligibleServiceNo", "eligibleServiceName", "clientServiceIdToApply", "clientEligiblePlanId", "clientEligibleServiceId", "amountReservedForAnniversary", "eligibleServiceTypes", "outAcctNo", "outMasterPlanInstanceNo", "outClientMpInstanceId"})
public class UnappliedServiceCreditsDetailsReturnElement {

    @XmlElement(name = "credit_id")
    protected Long creditId;
    @XmlElement(name = "create_date")
    protected String createDate;
    @XmlElement(name = "create_user")
    protected String createUser;
    @XmlElement(name = "initial_amount")
    protected Double initialAmount;
    @XmlElement(name = "amount_left_to_apply")
    protected Double amountLeftToApply;
    @XmlElement(name = "reason_cd")
    protected Long reasonCd;
    @XmlElement(name = "reason_text")
    protected String reasonText;
    @XmlElement(name = "comments")
    protected String comments;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "service_no_to_apply")
    protected Long serviceNoToApply;
    @XmlElement(name = "service_name_to_apply")
    protected String serviceNameToApply;
    @XmlElement(name = "eligible_plan_no")
    protected Long eligiblePlanNo;
    @XmlElement(name = "eligible_plan_name")
    protected String eligiblePlanName;
    @XmlElement(name = "eligible_service_no")
    protected Long eligibleServiceNo;
    @XmlElement(name = "eligible_service_name")
    protected String eligibleServiceName;
    @XmlElement(name = "client_service_id_to_apply")
    protected String clientServiceIdToApply;
    @XmlElement(name = "client_eligible_plan_id")
    protected String clientEligiblePlanId;
    @XmlElement(name = "client_eligible_service_id")
    protected String clientEligibleServiceId;
    @XmlElement(name = "amount_reserved_for_anniversary")
    protected Long amountReservedForAnniversary;
    @XmlElement(name = "eligible_service_types")
    protected List<EligibleServiceTypesReturnElement> eligibleServiceTypes;
    @XmlElement(name = "out_acct_no")
    protected Long outAcctNo;
    @XmlElement(name = "out_master_plan_instance_no")
    protected Long outMasterPlanInstanceNo;
    @XmlElement(name = "out_client_mp_instance_id")
    protected String outClientMpInstanceId;
    
    public Long getCreditId() {
        return creditId;
    }

    public void setCreditId(Long value) {
        this.creditId = value;
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

    public Double getInitialAmount() {
        return initialAmount;
    }

    public void setInitialAmount(Double value) {
        this.initialAmount = value;
    }

    public Double getAmountLeftToApply() {
        return amountLeftToApply;
    }

    public void setAmountLeftToApply(Double value) {
        this.amountLeftToApply = value;
    }

    public Long getReasonCd() {
        return reasonCd;
    }

    public void setReasonCd(Long value) {
        this.reasonCd = value;
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

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
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

    public String getClientServiceIdToApply() {
        return clientServiceIdToApply;
    }

    public void setClientServiceIdToApply(String value) {
        this.clientServiceIdToApply = value;
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

    public Long getAmountReservedForAnniversary() {
        return amountReservedForAnniversary;
    }

    public void setAmountReservedForAnniversary(Long value) {
        this.amountReservedForAnniversary = value;
    }

    public List<EligibleServiceTypesReturnElement> getEligibleServiceTypes() {
        if (this.eligibleServiceTypes == null) {
            this.eligibleServiceTypes = new ArrayList<EligibleServiceTypesReturnElement>();
        }
        return this.eligibleServiceTypes;
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
