package com.aria.common.shared.object;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "all_invoice_line_ReturnElement", propOrder = {"lineItemNo", "creditReasonCodeDescription", "description", "amount", "comments", "planName", "planNo", "serviceName", "serviceNo", "ledgerCode", "coaId", "coaDescription", "usageUnits", "usageRate", "usageTypeNo", "startDate", "endDate", "clientSku", "orderNo", "itemNo", "basePlanUnits", "prorationFactor", "prorationText", "advBillingPeriodTotalDays", "prorationRemainingDays", "prorationDescription", "allInvoiceLineTax", "rateScheduleNo", "rateScheduleTierNo"})
public class AllInvoiceLineReturnElement {

    @XmlElement(name = "line_item_no")
    protected Long lineItemNo;
    @XmlElement(name = "credit_reason_code_description")
    protected String creditReasonCodeDescription;
    @XmlElement(name = "description")
    protected String description;
    @XmlElement(name = "amount")
    protected Double amount;
    @XmlElement(name = "comments")
    protected String comments;
    @XmlElement(name = "plan_name")
    protected String planName;
    @XmlElement(name = "plan_no")
    protected Long planNo;
    @XmlElement(name = "service_name")
    protected String serviceName;
    @XmlElement(name = "service_no")
    protected Long serviceNo;
    @XmlElement(name = "ledger_code")
    protected String ledgerCode;
    @XmlElement(name = "coa_id")
    protected Long coaId;
    @XmlElement(name = "coa_description")
    protected String coaDescription;
    @XmlElement(name = "usage_units")
    protected Double usageUnits;
    @XmlElement(name = "usage_rate")
    protected Double usageRate;
    @XmlElement(name = "usage_type_no")
    protected Double usageTypeNo;
    @XmlElement(name = "start_date")
    protected String startDate;
    @XmlElement(name = "end_date")
    protected String endDate;
    @XmlElement(name = "client_sku")
    protected String clientSku;
    @XmlElement(name = "order_no")
    protected Long orderNo;
    @XmlElement(name = "item_no")
    protected Long itemNo;
    @XmlElement(name = "base_plan_units")
    protected Long basePlanUnits;
    @XmlElement(name = "proration_factor")
    protected Double prorationFactor;
    @XmlElement(name = "proration_text")
    protected String prorationText;
    @XmlElement(name = "adv_billing_period_total_days")
    protected Long advBillingPeriodTotalDays;
    @XmlElement(name = "proration_remaining_days")
    protected Long prorationRemainingDays;
    @XmlElement(name = "proration_description")
    protected String prorationDescription;
    @XmlElement(name = "all_invoice_line_tax")
    protected List<AllInvoiceLineTaxReturnElement> allInvoiceLineTax;
    @XmlElement(name = "rate_schedule_no")
    protected Double rateScheduleNo;
    @XmlElement(name = "rate_schedule_tier_no")
    protected Double rateScheduleTierNo;
    
    public Long getLineItemNo() {
        return lineItemNo;
    }

    public void setLineItemNo(Long value) {
        this.lineItemNo = value;
    }

    public String getCreditReasonCodeDescription() {
        return creditReasonCodeDescription;
    }

    public void setCreditReasonCodeDescription(String value) {
        this.creditReasonCodeDescription = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double value) {
        this.amount = value;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String value) {
        this.comments = value;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String value) {
        this.planName = value;
    }

    public Long getPlanNo() {
        return planNo;
    }

    public void setPlanNo(Long value) {
        this.planNo = value;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String value) {
        this.serviceName = value;
    }

    public Long getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(Long value) {
        this.serviceNo = value;
    }

    public String getLedgerCode() {
        return ledgerCode;
    }

    public void setLedgerCode(String value) {
        this.ledgerCode = value;
    }

    public Long getCoaId() {
        return coaId;
    }

    public void setCoaId(Long value) {
        this.coaId = value;
    }

    public String getCoaDescription() {
        return coaDescription;
    }

    public void setCoaDescription(String value) {
        this.coaDescription = value;
    }

    public Double getUsageUnits() {
        return usageUnits;
    }

    public void setUsageUnits(Double value) {
        this.usageUnits = value;
    }

    public Double getUsageRate() {
        return usageRate;
    }

    public void setUsageRate(Double value) {
        this.usageRate = value;
    }

    public Double getUsageTypeNo() {
        return usageTypeNo;
    }

    public void setUsageTypeNo(Double value) {
        this.usageTypeNo = value;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String value) {
        this.startDate = value;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String value) {
        this.endDate = value;
    }

    public String getClientSku() {
        return clientSku;
    }

    public void setClientSku(String value) {
        this.clientSku = value;
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long value) {
        this.orderNo = value;
    }

    public Long getItemNo() {
        return itemNo;
    }

    public void setItemNo(Long value) {
        this.itemNo = value;
    }

    public Long getBasePlanUnits() {
        return basePlanUnits;
    }

    public void setBasePlanUnits(Long value) {
        this.basePlanUnits = value;
    }

    public Double getProrationFactor() {
        return prorationFactor;
    }

    public void setProrationFactor(Double value) {
        this.prorationFactor = value;
    }

    public String getProrationText() {
        return prorationText;
    }

    public void setProrationText(String value) {
        this.prorationText = value;
    }

    public Long getAdvBillingPeriodTotalDays() {
        return advBillingPeriodTotalDays;
    }

    public void setAdvBillingPeriodTotalDays(Long value) {
        this.advBillingPeriodTotalDays = value;
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

    public List<AllInvoiceLineTaxReturnElement> getAllInvoiceLineTax() {
        if (this.allInvoiceLineTax == null) {
            this.allInvoiceLineTax = new ArrayList<AllInvoiceLineTaxReturnElement>();
        }
        return this.allInvoiceLineTax;
    }public Double getRateScheduleNo() {
        return rateScheduleNo;
    }

    public void setRateScheduleNo(Double value) {
        this.rateScheduleNo = value;
    }

    public Double getRateScheduleTierNo() {
        return rateScheduleTierNo;
    }

    public void setRateScheduleTierNo(Double value) {
        this.rateScheduleTierNo = value;
    }

    
}
