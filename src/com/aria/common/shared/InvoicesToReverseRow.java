package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invoices_to_reverse_row", propOrder = {
    "invoiceNo",
    "invoiceLineNo",
    "invoiceLineReversingAmount",
    "invoiceLineReversingDate"
    })
public class InvoicesToReverseRow {

    @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
    @XmlElement(name = "invoice_line_no")
    protected Long invoiceLineNo;
    @XmlElement(name = "invoice_line_reversing_amount")
    protected Double invoiceLineReversingAmount;
    @XmlElement(name = "invoice_line_reversing_date")
    protected String invoiceLineReversingDate;
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

    public Double getInvoiceLineReversingAmount() {
        return invoiceLineReversingAmount;
    }

    public void setInvoiceLineReversingAmount(Double value) {
        this.invoiceLineReversingAmount = value;
    }

    public String getInvoiceLineReversingDate() {
        return invoiceLineReversingDate;
    }

    public void setInvoiceLineReversingDate(String value) {
        this.invoiceLineReversingDate = value;
    }

    
}
