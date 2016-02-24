package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invoice_info_ReturnElement", propOrder = {"invoiceNo", "billingGroupNo", "clientPlanInstanceId", "procCvvResponse", "procAvsResponse", "procCavvResponse", "procStatusCode", "procStatusText", "procPaymentId", "procAuthCode", "procMerchComments", "invoiceChargesBeforeTax", "invoiceTaxCharges", "invoiceChargesAfterTax", "invoiceCreditAmount", "invoiceTotalAmount", "totalCredit", "totalTaxCredit", "totalCreditBeforeTax", "total", "prorationResultAmount", "expectedMonthlyRecCost", "expectedAnnualRecCost", "invoiceItems", "taxDetails"})
public class InvoiceInfoReturnElement {

    @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
    @XmlElement(name = "billing_group_no")
    protected Long billingGroupNo;
    @XmlElement(name = "client_plan_instance_id")
    protected String clientPlanInstanceId;
    @XmlElement(name = "proc_cvv_response")
    protected String procCvvResponse;
    @XmlElement(name = "proc_avs_response")
    protected String procAvsResponse;
    @XmlElement(name = "proc_cavv_response")
    protected String procCavvResponse;
    @XmlElement(name = "proc_status_code")
    protected String procStatusCode;
    @XmlElement(name = "proc_status_text")
    protected String procStatusText;
    @XmlElement(name = "proc_payment_id")
    protected String procPaymentId;
    @XmlElement(name = "proc_auth_code")
    protected String procAuthCode;
    @XmlElement(name = "proc_merch_comments")
    protected String procMerchComments;
    @XmlElement(name = "invoice_charges_before_tax")
    protected Double invoiceChargesBeforeTax;
    @XmlElement(name = "invoice_tax_charges")
    protected Double invoiceTaxCharges;
    @XmlElement(name = "invoice_charges_after_tax")
    protected Double invoiceChargesAfterTax;
    @XmlElement(name = "invoice_credit_amount")
    protected Double invoiceCreditAmount;
    @XmlElement(name = "invoice_total_amount")
    protected Double invoiceTotalAmount;
    @XmlElement(name = "total_credit")
    protected Double totalCredit;
    @XmlElement(name = "total_tax_credit")
    protected Double totalTaxCredit;
    @XmlElement(name = "total_credit_before_tax")
    protected Double totalCreditBeforeTax;
    @XmlElement(name = "total")
    protected Double total;
    @XmlElement(name = "proration_result_amount")
    protected Double prorationResultAmount;
    @XmlElement(name = "expected_monthly_rec_cost")
    protected Double expectedMonthlyRecCost;
    @XmlElement(name = "expected_annual_rec_cost")
    protected Double expectedAnnualRecCost;
    @XmlElement(name = "invoice_items")
    protected List<InvoiceItemsReturnElement> invoiceItems;
    @XmlElement(name = "tax_details")
    protected List<TaxDetailsReturnElement> taxDetails;
    
    public Long getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Long value) {
        this.invoiceNo = value;
    }

    public Long getBillingGroupNo() {
        return billingGroupNo;
    }

    public void setBillingGroupNo(Long value) {
        this.billingGroupNo = value;
    }

    public String getClientPlanInstanceId() {
        return clientPlanInstanceId;
    }

    public void setClientPlanInstanceId(String value) {
        this.clientPlanInstanceId = value;
    }

    public String getProcCvvResponse() {
        return procCvvResponse;
    }

    public void setProcCvvResponse(String value) {
        this.procCvvResponse = value;
    }

    public String getProcAvsResponse() {
        return procAvsResponse;
    }

    public void setProcAvsResponse(String value) {
        this.procAvsResponse = value;
    }

    public String getProcCavvResponse() {
        return procCavvResponse;
    }

    public void setProcCavvResponse(String value) {
        this.procCavvResponse = value;
    }

    public String getProcStatusCode() {
        return procStatusCode;
    }

    public void setProcStatusCode(String value) {
        this.procStatusCode = value;
    }

    public String getProcStatusText() {
        return procStatusText;
    }

    public void setProcStatusText(String value) {
        this.procStatusText = value;
    }

    public String getProcPaymentId() {
        return procPaymentId;
    }

    public void setProcPaymentId(String value) {
        this.procPaymentId = value;
    }

    public String getProcAuthCode() {
        return procAuthCode;
    }

    public void setProcAuthCode(String value) {
        this.procAuthCode = value;
    }

    public String getProcMerchComments() {
        return procMerchComments;
    }

    public void setProcMerchComments(String value) {
        this.procMerchComments = value;
    }

    public Double getInvoiceChargesBeforeTax() {
        return invoiceChargesBeforeTax;
    }

    public void setInvoiceChargesBeforeTax(Double value) {
        this.invoiceChargesBeforeTax = value;
    }

    public Double getInvoiceTaxCharges() {
        return invoiceTaxCharges;
    }

    public void setInvoiceTaxCharges(Double value) {
        this.invoiceTaxCharges = value;
    }

    public Double getInvoiceChargesAfterTax() {
        return invoiceChargesAfterTax;
    }

    public void setInvoiceChargesAfterTax(Double value) {
        this.invoiceChargesAfterTax = value;
    }

    public Double getInvoiceCreditAmount() {
        return invoiceCreditAmount;
    }

    public void setInvoiceCreditAmount(Double value) {
        this.invoiceCreditAmount = value;
    }

    public Double getInvoiceTotalAmount() {
        return invoiceTotalAmount;
    }

    public void setInvoiceTotalAmount(Double value) {
        this.invoiceTotalAmount = value;
    }

    public Double getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(Double value) {
        this.totalCredit = value;
    }

    public Double getTotalTaxCredit() {
        return totalTaxCredit;
    }

    public void setTotalTaxCredit(Double value) {
        this.totalTaxCredit = value;
    }

    public Double getTotalCreditBeforeTax() {
        return totalCreditBeforeTax;
    }

    public void setTotalCreditBeforeTax(Double value) {
        this.totalCreditBeforeTax = value;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double value) {
        this.total = value;
    }

    public Double getProrationResultAmount() {
        return prorationResultAmount;
    }

    public void setProrationResultAmount(Double value) {
        this.prorationResultAmount = value;
    }

    public Double getExpectedMonthlyRecCost() {
        return expectedMonthlyRecCost;
    }

    public void setExpectedMonthlyRecCost(Double value) {
        this.expectedMonthlyRecCost = value;
    }

    public Double getExpectedAnnualRecCost() {
        return expectedAnnualRecCost;
    }

    public void setExpectedAnnualRecCost(Double value) {
        this.expectedAnnualRecCost = value;
    }

    public List<InvoiceItemsReturnElement> getInvoiceItems() {
        if (this.invoiceItems == null) {
            this.invoiceItems = new ArrayList<InvoiceItemsReturnElement>();
        }
        return this.invoiceItems;
    }public List<TaxDetailsReturnElement> getTaxDetails() {
        if (this.taxDetails == null) {
            this.taxDetails = new ArrayList<TaxDetailsReturnElement>();
        }
        return this.taxDetails;
    }
}
