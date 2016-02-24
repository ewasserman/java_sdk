package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "specific_invoices_row", propOrder = {
    "invoiceNo",
    "invoiceCreditAmount"
    })
public class SpecificInvoicesRow {

    @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
    @XmlElement(name = "invoice_credit_amount")
    protected Double invoiceCreditAmount;
    public Long getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Long value) {
        this.invoiceNo = value;
    }

    public Double getInvoiceCreditAmount() {
        return invoiceCreditAmount;
    }

    public void setInvoiceCreditAmount(Double value) {
        this.invoiceCreditAmount = value;
    }

    
}
