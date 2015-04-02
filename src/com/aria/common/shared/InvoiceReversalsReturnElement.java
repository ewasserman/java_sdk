package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invoice_reversals_ReturnElement", propOrder = {"invoiceNo", "invoiceBillDate", "invoiceLineNo", "totalLineDebit", "reversedLineAmount", "reversedLineStartDate", "reversedLineEndDate", "transactionId", "reversalDate", "serviceNo", "clientServiceId", "transactionComments"})
public class InvoiceReversalsReturnElement {

    @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
    @XmlElement(name = "invoice_bill_date")
    protected String invoiceBillDate;
    @XmlElement(name = "invoice_line_no")
    protected Long invoiceLineNo;
    @XmlElement(name = "total_line_debit")
    protected Double totalLineDebit;
    @XmlElement(name = "reversed_line_amount")
    protected Double reversedLineAmount;
    @XmlElement(name = "reversed_line_start_date")
    protected String reversedLineStartDate;
    @XmlElement(name = "reversed_line_end_date")
    protected String reversedLineEndDate;
    @XmlElement(name = "transaction_id")
    protected String transactionId;
    @XmlElement(name = "reversal_date")
    protected String reversalDate;
    @XmlElement(name = "service_no")
    protected String serviceNo;
    @XmlElement(name = "client_service_id")
    protected String clientServiceId;
    @XmlElement(name = "transaction_comments")
    protected String transactionComments;
    
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

    public Long getInvoiceLineNo() {
        return invoiceLineNo;
    }

    public void setInvoiceLineNo(Long value) {
        this.invoiceLineNo = value;
    }

    public Double getTotalLineDebit() {
        return totalLineDebit;
    }

    public void setTotalLineDebit(Double value) {
        this.totalLineDebit = value;
    }

    public Double getReversedLineAmount() {
        return reversedLineAmount;
    }

    public void setReversedLineAmount(Double value) {
        this.reversedLineAmount = value;
    }

    public String getReversedLineStartDate() {
        return reversedLineStartDate;
    }

    public void setReversedLineStartDate(String value) {
        this.reversedLineStartDate = value;
    }

    public String getReversedLineEndDate() {
        return reversedLineEndDate;
    }

    public void setReversedLineEndDate(String value) {
        this.reversedLineEndDate = value;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    public String getReversalDate() {
        return reversalDate;
    }

    public void setReversalDate(String value) {
        this.reversalDate = value;
    }

    public String getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(String value) {
        this.serviceNo = value;
    }

    public String getClientServiceId() {
        return clientServiceId;
    }

    public void setClientServiceId(String value) {
        this.clientServiceId = value;
    }

    public String getTransactionComments() {
        return transactionComments;
    }

    public void setTransactionComments(String value) {
        this.transactionComments = value;
    }

    
}
