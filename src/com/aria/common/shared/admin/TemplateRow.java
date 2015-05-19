package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "template_row", propOrder = {
    "creditTemplateName",
    "clientCreditTemplateId",
    "eligiblePlanNo",
    "eligibleClientPlanId",
    "eligibleServiceNo",
    "eligibleClientServiceId",
    "eligibleServiceTypes",
    "discountType",
    "discountAmt",
    "noOfCredits",
    "creditIntervalMonths",
    "percentagePlanNo",
    "percentageClientPlanId",
    "percentageServiceNo",
    "percentageClientServiceId",
    "altServiceNo",
    "altClientServiceId"
    })
public class TemplateRow {

    @XmlElement(name = "credit_template_name")
    protected String creditTemplateName;
    @XmlElement(name = "client_credit_template_id")
    protected String clientCreditTemplateId;
    @XmlElement(name = "eligible_plan_no")
    protected Long eligiblePlanNo;
    @XmlElement(name = "eligible_client_plan_id")
    protected String eligibleClientPlanId;
    @XmlElement(name = "eligible_service_no")
    protected Long eligibleServiceNo;
    @XmlElement(name = "eligible_client_service_id")
    protected String eligibleClientServiceId;
    @XmlElement(name = "eligible_service_types")
    protected com.aria.common.shared.admin.EligibleServiceTypesArray eligibleServiceTypes;
    @XmlElement(name = "discount_type")
    protected Long discountType;
    @XmlElement(name = "discount_amt")
    protected Double discountAmt;
    @XmlElement(name = "no_of_credits")
    protected Long noOfCredits;
    @XmlElement(name = "credit_interval_months")
    protected Long creditIntervalMonths;
    @XmlElement(name = "percentage_plan_no")
    protected Long percentagePlanNo;
    @XmlElement(name = "percentage_client_plan_id")
    protected String percentageClientPlanId;
    @XmlElement(name = "percentage_service_no")
    protected Long percentageServiceNo;
    @XmlElement(name = "percentage_client_service_id")
    protected String percentageClientServiceId;
    @XmlElement(name = "alt_service_no")
    protected Long altServiceNo;
    @XmlElement(name = "alt_client_service_id")
    protected String altClientServiceId;
    public String getCreditTemplateName() {
        return creditTemplateName;
    }

    public void setCreditTemplateName(String value) {
        this.creditTemplateName = value;
    }

    public String getClientCreditTemplateId() {
        return clientCreditTemplateId;
    }

    public void setClientCreditTemplateId(String value) {
        this.clientCreditTemplateId = value;
    }

    public Long getEligiblePlanNo() {
        return eligiblePlanNo;
    }

    public void setEligiblePlanNo(Long value) {
        this.eligiblePlanNo = value;
    }

    public String getEligibleClientPlanId() {
        return eligibleClientPlanId;
    }

    public void setEligibleClientPlanId(String value) {
        this.eligibleClientPlanId = value;
    }

    public Long getEligibleServiceNo() {
        return eligibleServiceNo;
    }

    public void setEligibleServiceNo(Long value) {
        this.eligibleServiceNo = value;
    }

    public String getEligibleClientServiceId() {
        return eligibleClientServiceId;
    }

    public void setEligibleClientServiceId(String value) {
        this.eligibleClientServiceId = value;
    }

    public com.aria.common.shared.admin.EligibleServiceTypesArray getEligibleServiceTypes() {
        return eligibleServiceTypes;
    }

    public void setEligibleServiceTypes(com.aria.common.shared.admin.EligibleServiceTypesArray value) {
        this.eligibleServiceTypes = value;
    }

    public Long getDiscountType() {
        return discountType;
    }

    public void setDiscountType(Long value) {
        this.discountType = value;
    }

    public Double getDiscountAmt() {
        return discountAmt;
    }

    public void setDiscountAmt(Double value) {
        this.discountAmt = value;
    }

    public Long getNoOfCredits() {
        return noOfCredits;
    }

    public void setNoOfCredits(Long value) {
        this.noOfCredits = value;
    }

    public Long getCreditIntervalMonths() {
        return creditIntervalMonths;
    }

    public void setCreditIntervalMonths(Long value) {
        this.creditIntervalMonths = value;
    }

    public Long getPercentagePlanNo() {
        return percentagePlanNo;
    }

    public void setPercentagePlanNo(Long value) {
        this.percentagePlanNo = value;
    }

    public String getPercentageClientPlanId() {
        return percentageClientPlanId;
    }

    public void setPercentageClientPlanId(String value) {
        this.percentageClientPlanId = value;
    }

    public Long getPercentageServiceNo() {
        return percentageServiceNo;
    }

    public void setPercentageServiceNo(Long value) {
        this.percentageServiceNo = value;
    }

    public String getPercentageClientServiceId() {
        return percentageClientServiceId;
    }

    public void setPercentageClientServiceId(String value) {
        this.percentageClientServiceId = value;
    }

    public Long getAltServiceNo() {
        return altServiceNo;
    }

    public void setAltServiceNo(Long value) {
        this.altServiceNo = value;
    }

    public String getAltClientServiceId() {
        return altClientServiceId;
    }

    public void setAltClientServiceId(String value) {
        this.altClientServiceId = value;
    }

    
}
