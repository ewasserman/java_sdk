package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "multi_plan_invoice_details_ReturnElement", propOrder = {"billingGroupNo", "clientBillingGroupId", "invoiceNo", "procCvvResponse", "procAvsResponse", "procCavvResponse", "procStatusCode", "procStatusText", "procPaymentId", "procAuthCode", "procMerchComments", "invoiceChargesBeforeTax", "invoiceTaxCharges", "invoiceChargesAfterTax", "invoiceCreditBeforeTax", "invoiceTaxCredits", "invoiceCredits", "invoiceTotalAmount", "expectdActivationFee", "expectdMthlyRecurringCost", "expectdAnnuRecurringCost", "invoiceItemDetails", "taxDetails"})
public class MultiPlanInvoiceDetailsReturnElement {

    @XmlElement(name = "billing_group_no")
    protected Long billingGroupNo;
    @XmlElement(name = "client_billing_group_id")
    protected String clientBillingGroupId;
    @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
    @XmlElement(name = "proc_cvv_response")
    protected String procCvvResponse;
    @XmlElement(name = "proc_avs_response")
    protected Long procAvsResponse;
    @XmlElement(name = "proc_cavv_response")
    protected Long procCavvResponse;
    @XmlElement(name = "proc_status_code")
    protected String procStatusCode;
    @XmlElement(name = "proc_status_text")
    protected Long procStatusText;
    @XmlElement(name = "proc_payment_id")
    protected String procPaymentId;
    @XmlElement(name = "proc_auth_code")
    protected Long procAuthCode;
    @XmlElement(name = "proc_merch_comments")
    protected String procMerchComments;
    @XmlElement(name = "invoice_charges_before_tax")
    protected Double invoiceChargesBeforeTax;
    @XmlElement(name = "invoice_tax_charges")
    protected Double invoiceTaxCharges;
    @XmlElement(name = "invoice_charges_after_tax")
    protected Double invoiceChargesAfterTax;
    @XmlElement(name = "invoice_credit_before_tax")
    protected Double invoiceCreditBeforeTax;
    @XmlElement(name = "invoice_tax_credits")
    protected Double invoiceTaxCredits;
    @XmlElement(name = "invoice_credits")
    protected Double invoiceCredits;
    @XmlElement(name = "invoice_total_amount")
    protected Double invoiceTotalAmount;
    @XmlElement(name = "expectd_activation_fee")
    protected Double expectdActivationFee;
    @XmlElement(name = "expectd_mthly_recurring_cost")
    protected Double expectdMthlyRecurringCost;
    @XmlElement(name = "expectd_annu_recurring_cost")
    protected Double expectdAnnuRecurringCost;
    @XmlElement(name = "invoice_item_details")
    protected List<InvoiceItemDetailsReturnElement> invoiceItemDetails;
    @XmlElement(name = "tax_details")
    protected List<TaxDetailsReturnElement> taxDetails;
    
    public Long getBillingGroupNo() {
        return billingGroupNo;
    }

    public void setBillingGroupNo(Long value) {
        this.billingGroupNo = value;
    }

    public String getClientBillingGroupId() {
        return clientBillingGroupId;
    }

    public void setClientBillingGroupId(String value) {
        this.clientBillingGroupId = value;
    }

    public Long getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Long value) {
        this.invoiceNo = value;
    }

    public String getProcCvvResponse() {
        return procCvvResponse;
    }

    public void setProcCvvResponse(String value) {
        this.procCvvResponse = value;
    }

    public Long getProcAvsResponse() {
        return procAvsResponse;
    }

    public void setProcAvsResponse(Long value) {
        this.procAvsResponse = value;
    }

    public Long getProcCavvResponse() {
        return procCavvResponse;
    }

    public void setProcCavvResponse(Long value) {
        this.procCavvResponse = value;
    }

    public String getProcStatusCode() {
        return procStatusCode;
    }

    public void setProcStatusCode(String value) {
        this.procStatusCode = value;
    }

    public Long getProcStatusText() {
        return procStatusText;
    }

    public void setProcStatusText(Long value) {
        this.procStatusText = value;
    }

    public String getProcPaymentId() {
        return procPaymentId;
    }

    public void setProcPaymentId(String value) {
        this.procPaymentId = value;
    }

    public Long getProcAuthCode() {
        return procAuthCode;
    }

    public void setProcAuthCode(Long value) {
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

    public Double getInvoiceCreditBeforeTax() {
        return invoiceCreditBeforeTax;
    }

    public void setInvoiceCreditBeforeTax(Double value) {
        this.invoiceCreditBeforeTax = value;
    }

    public Double getInvoiceTaxCredits() {
        return invoiceTaxCredits;
    }

    public void setInvoiceTaxCredits(Double value) {
        this.invoiceTaxCredits = value;
    }

    public Double getInvoiceCredits() {
        return invoiceCredits;
    }

    public void setInvoiceCredits(Double value) {
        this.invoiceCredits = value;
    }

    public Double getInvoiceTotalAmount() {
        return invoiceTotalAmount;
    }

    public void setInvoiceTotalAmount(Double value) {
        this.invoiceTotalAmount = value;
    }

    public Double getExpectdActivationFee() {
        return expectdActivationFee;
    }

    public void setExpectdActivationFee(Double value) {
        this.expectdActivationFee = value;
    }

    public Double getExpectdMthlyRecurringCost() {
        return expectdMthlyRecurringCost;
    }

    public void setExpectdMthlyRecurringCost(Double value) {
        this.expectdMthlyRecurringCost = value;
    }

    public Double getExpectdAnnuRecurringCost() {
        return expectdAnnuRecurringCost;
    }

    public void setExpectdAnnuRecurringCost(Double value) {
        this.expectdAnnuRecurringCost = value;
    }

    public List<InvoiceItemDetailsReturnElement> getInvoiceItemDetails() {
        if (this.invoiceItemDetails == null) {
            this.invoiceItemDetails = new ArrayList<InvoiceItemDetailsReturnElement>();
        }
        return this.invoiceItemDetails;
    }public List<TaxDetailsReturnElement> getTaxDetails() {
        if (this.taxDetails == null) {
            this.taxDetails = new ArrayList<TaxDetailsReturnElement>();
        }
        return this.taxDetails;
    }
}
