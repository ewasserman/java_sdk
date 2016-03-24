package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "out_invoices_ReturnElement", propOrder = {"invoicingErrorCode", "invoicingErrorMsg", "invoiceNo", "billingGroupNo", "clientBillingGroupId", "invoiceChargesBeforeTax", "invoiceTaxCharges", "invoiceChargesAfterTax", "invoiceCreditAmount", "invoiceTotalAmount", "invoiceItems", "taxDetails", "thirdPartyErrors"})
public class OutInvoicesReturnElement {

    @XmlElement(name = "invoicing_error_code")
    protected Long invoicingErrorCode;
    @XmlElement(name = "invoicing_error_msg")
    protected String invoicingErrorMsg;
    @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
    @XmlElement(name = "billing_group_no")
    protected Long billingGroupNo;
    @XmlElement(name = "client_billing_group_id")
    protected String clientBillingGroupId;
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
    @XmlElement(name = "invoice_items")
    protected List<InvoiceItemsReturnElement> invoiceItems;
    @XmlElement(name = "tax_details")
    protected List<TaxDetailsReturnElement> taxDetails;
    @XmlElement(name = "third_party_errors")
    protected List<ThirdPartyErrorsReturnElement> thirdPartyErrors;
    
    public Long getInvoicingErrorCode() {
        return invoicingErrorCode;
    }

    public void setInvoicingErrorCode(Long value) {
        this.invoicingErrorCode = value;
    }

    public String getInvoicingErrorMsg() {
        return invoicingErrorMsg;
    }

    public void setInvoicingErrorMsg(String value) {
        this.invoicingErrorMsg = value;
    }

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

    public String getClientBillingGroupId() {
        return clientBillingGroupId;
    }

    public void setClientBillingGroupId(String value) {
        this.clientBillingGroupId = value;
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
    }public List<ThirdPartyErrorsReturnElement> getThirdPartyErrors() {
        if (this.thirdPartyErrors == null) {
            this.thirdPartyErrors = new ArrayList<ThirdPartyErrorsReturnElement>();
        }
        return this.thirdPartyErrors;
    }
}
