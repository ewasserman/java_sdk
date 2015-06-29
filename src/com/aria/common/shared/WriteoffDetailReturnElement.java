package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "writeoff_detail_ReturnElement", propOrder = {"invoiceNo", "invoiceBillDate", "invoiceTransactionId", "originalTransactionAmount", "writeoffTransactionAmount", "writeoffTransactionStartDate", "writeoffTransactionEndDate"})
public class WriteoffDetailReturnElement {

    @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
    @XmlElement(name = "invoice_bill_date")
    protected String invoiceBillDate;
    @XmlElement(name = "invoice_transaction_id")
    protected Long invoiceTransactionId;
    @XmlElement(name = "original_transaction_amount")
    protected Double originalTransactionAmount;
    @XmlElement(name = "writeoff_transaction_amount")
    protected Double writeoffTransactionAmount;
    @XmlElement(name = "writeoff_transaction_start_date")
    protected String writeoffTransactionStartDate;
    @XmlElement(name = "writeoff_transaction_end_date")
    protected String writeoffTransactionEndDate;
    
    public Long getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Long value) {
        this.invoiceNo = value;
    }

    public String getInvoiceBillDate() {
        return invoiceBillDate;
    }

    public void setInvoiceBillDate(String value) {
        this.invoiceBillDate = value;
    }

    public Long getInvoiceTransactionId() {
        return invoiceTransactionId;
    }

    public void setInvoiceTransactionId(Long value) {
        this.invoiceTransactionId = value;
    }

    public Double getOriginalTransactionAmount() {
        return originalTransactionAmount;
    }

    public void setOriginalTransactionAmount(Double value) {
        this.originalTransactionAmount = value;
    }

    public Double getWriteoffTransactionAmount() {
        return writeoffTransactionAmount;
    }

    public void setWriteoffTransactionAmount(Double value) {
        this.writeoffTransactionAmount = value;
    }

    public String getWriteoffTransactionStartDate() {
        return writeoffTransactionStartDate;
    }

    public void setWriteoffTransactionStartDate(String value) {
        this.writeoffTransactionStartDate = value;
    }

    public String getWriteoffTransactionEndDate() {
        return writeoffTransactionEndDate;
    }

    public void setWriteoffTransactionEndDate(String value) {
        this.writeoffTransactionEndDate = value;
    }

    
}
