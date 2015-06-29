package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reversed_invoice_transactions_ReturnElement", propOrder = {"invoiceNo", "invoiceLineNo", "reversedTransactionId", "serviceNo", "reversedAmount", "reversingDate", "transactionComments", "clientServiceId"})
public class ReversedInvoiceTransactionsReturnElement {

    @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
    @XmlElement(name = "invoice_line_no")
    protected Long invoiceLineNo;
    @XmlElement(name = "reversed_transaction_id")
    protected Long reversedTransactionId;
    @XmlElement(name = "service_no")
    protected Long serviceNo;
    @XmlElement(name = "reversed_amount")
    protected Double reversedAmount;
    @XmlElement(name = "reversing_date")
    protected String reversingDate;
    @XmlElement(name = "transaction_comments")
    protected String transactionComments;
    @XmlElement(name = "client_service_id")
    protected String clientServiceId;
    
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

    public Long getReversedTransactionId() {
        return reversedTransactionId;
    }

    public void setReversedTransactionId(Long value) {
        this.reversedTransactionId = value;
    }

    public Long getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(Long value) {
        this.serviceNo = value;
    }

    public Double getReversedAmount() {
        return reversedAmount;
    }

    public void setReversedAmount(Double value) {
        this.reversedAmount = value;
    }

    public String getReversingDate() {
        return reversingDate;
    }

    public void setReversingDate(String value) {
        this.reversingDate = value;
    }

    public String getTransactionComments() {
        return transactionComments;
    }

    public void setTransactionComments(String value) {
        this.transactionComments = value;
    }

    public String getClientServiceId() {
        return clientServiceId;
    }

    public void setClientServiceId(String value) {
        this.clientServiceId = value;
    }

    
}
