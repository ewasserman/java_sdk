package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_service_proration_results_ReturnElement", propOrder = {"planNo", "clientPlanId", "serviceNo", "clientServiceId", "prorationText", "prorationRemainingDays", "prorationDescription", "prorationResultTotal", "prorationAmount", "prorationTaxCharges", "prorationTaxCredits", "prorationSurchargeAmount", "prorationCreditAmount", "prorationStartDate", "prorationEndDate"})
public class PlanServiceProrationResultsReturnElement {

    @XmlElement(name = "plan_no")
    protected Long planNo;
    @XmlElement(name = "client_plan_id")
    protected String clientPlanId;
    @XmlElement(name = "service_no")
    protected Long serviceNo;
    @XmlElement(name = "client_service_id")
    protected String clientServiceId;
    @XmlElement(name = "proration_text")
    protected String prorationText;
    @XmlElement(name = "proration_remaining_days")
    protected Long prorationRemainingDays;
    @XmlElement(name = "proration_description")
    protected String prorationDescription;
    @XmlElement(name = "proration_result_total")
    protected Double prorationResultTotal;
    @XmlElement(name = "proration_amount")
    protected Double prorationAmount;
    @XmlElement(name = "proration_tax_charges")
    protected Double prorationTaxCharges;
    @XmlElement(name = "proration_tax_credits")
    protected Double prorationTaxCredits;
    @XmlElement(name = "proration_surcharge_amount")
    protected Double prorationSurchargeAmount;
    @XmlElement(name = "proration_credit_amount")
    protected Double prorationCreditAmount;
    @XmlElement(name = "proration_start_date")
    protected String prorationStartDate;
    @XmlElement(name = "proration_end_date")
    protected String prorationEndDate;
    
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

    public Long getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(Long value) {
        this.serviceNo = value;
    }

    public String getClientServiceId() {
        return clientServiceId;
    }

    public void setClientServiceId(String value) {
        this.clientServiceId = value;
    }

    public String getProrationText() {
        return prorationText;
    }

    public void setProrationText(String value) {
        this.prorationText = value;
    }

    public Long getProrationRemainingDays() {
        return prorationRemainingDays;
    }

    public void setProrationRemainingDays(Long value) {
        this.prorationRemainingDays = value;
    }

    public String getProrationDescription() {
        return prorationDescription;
    }

    public void setProrationDescription(String value) {
        this.prorationDescription = value;
    }

    public Double getProrationResultTotal() {
        return prorationResultTotal;
    }

    public void setProrationResultTotal(Double value) {
        this.prorationResultTotal = value;
    }

    public Double getProrationAmount() {
        return prorationAmount;
    }

    public void setProrationAmount(Double value) {
        this.prorationAmount = value;
    }

    public Double getProrationTaxCharges() {
        return prorationTaxCharges;
    }

    public void setProrationTaxCharges(Double value) {
        this.prorationTaxCharges = value;
    }

    public Double getProrationTaxCredits() {
        return prorationTaxCredits;
    }

    public void setProrationTaxCredits(Double value) {
        this.prorationTaxCredits = value;
    }

    public Double getProrationSurchargeAmount() {
        return prorationSurchargeAmount;
    }

    public void setProrationSurchargeAmount(Double value) {
        this.prorationSurchargeAmount = value;
    }

    public Double getProrationCreditAmount() {
        return prorationCreditAmount;
    }

    public void setProrationCreditAmount(Double value) {
        this.prorationCreditAmount = value;
    }

    public String getProrationStartDate() {
        return prorationStartDate;
    }

    public void setProrationStartDate(String value) {
        this.prorationStartDate = value;
    }

    public String getProrationEndDate() {
        return prorationEndDate;
    }

    public void setProrationEndDate(String value) {
        this.prorationEndDate = value;
    }

    
}
