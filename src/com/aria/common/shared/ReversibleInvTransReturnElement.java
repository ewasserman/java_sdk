package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reversible_inv_trans_ReturnElement", propOrder = {"invoicedAcctNo", "invoiceNo", "invoiceLineNo", "invoiceTransId", "invoiceTransDate", "invoiceTransDescription", "invoiceTransAmount", "invTransReversedAmount", "invTransReversibleAmount", "invoiceTransIsRecurService", "invoiceTransRecurStartDate"})
public class ReversibleInvTransReturnElement {

    @XmlElement(name = "invoiced_acct_no")
    protected Long invoicedAcctNo;
    @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
    @XmlElement(name = "invoice_line_no")
    protected Long invoiceLineNo;
    @XmlElement(name = "invoice_trans_id")
    protected Long invoiceTransId;
    @XmlElement(name = "invoice_trans_date")
    protected String invoiceTransDate;
    @XmlElement(name = "invoice_trans_description")
    protected String invoiceTransDescription;
    @XmlElement(name = "invoice_trans_amount")
    protected Double invoiceTransAmount;
    @XmlElement(name = "inv_trans_reversed_amount")
    protected Double invTransReversedAmount;
    @XmlElement(name = "inv_trans_reversible_amount")
    protected Double invTransReversibleAmount;
    @XmlElement(name = "invoice_trans_is_recur_service")
    protected Long invoiceTransIsRecurService;
    @XmlElement(name = "invoice_trans_recur_start_date")
    protected String invoiceTransRecurStartDate;
    
    public Long getInvoicedAcctNo() {
        return invoicedAcctNo;
    }

    public void setInvoicedAcctNo(Long value) {
        this.invoicedAcctNo = value;
    }

    public Long getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Long value) {
        this.invoiceNo = value;
    }

    public Long getInvoiceLineNo() {
        return invoiceLineNo;
    }

    public void setInvoiceLineNo(Long value) {
        this.invoiceLineNo = value;
    }

    public Long getInvoiceTransId() {
        return invoiceTransId;
    }

    public void setInvoiceTransId(Long value) {
        this.invoiceTransId = value;
    }

    public String getInvoiceTransDate() {
        return invoiceTransDate;
    }

    public void setInvoiceTransDate(String value) {
        this.invoiceTransDate = value;
    }

    public String getInvoiceTransDescription() {
        return invoiceTransDescription;
    }

    public void setInvoiceTransDescription(String value) {
        this.invoiceTransDescription = value;
    }

    public Double getInvoiceTransAmount() {
        return invoiceTransAmount;
    }

    public void setInvoiceTransAmount(Double value) {
        this.invoiceTransAmount = value;
    }

    public Double getInvTransReversedAmount() {
        return invTransReversedAmount;
    }

    public void setInvTransReversedAmount(Double value) {
        this.invTransReversedAmount = value;
    }

    public Double getInvTransReversibleAmount() {
        return invTransReversibleAmount;
    }

    public void setInvTransReversibleAmount(Double value) {
        this.invTransReversibleAmount = value;
    }

    public Long getInvoiceTransIsRecurService() {
        return invoiceTransIsRecurService;
    }

    public void setInvoiceTransIsRecurService(Long value) {
        this.invoiceTransIsRecurService = value;
    }

    public String getInvoiceTransRecurStartDate() {
        return invoiceTransRecurStartDate;
    }

    public void setInvoiceTransRecurStartDate(String value) {
        this.invoiceTransRecurStartDate = value;
    }

    
}
