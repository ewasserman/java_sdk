package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "writeoff_transactions_ReturnElement", propOrder = {"writeoffTransactionId", "invoiceNo", "serviceNo", "clientServiceId", "originalAmount", "amount", "date", "writeoffReasoncode", "disputeCreationDate", "disputeExpiryDate", "disputeInd", "canUnsettle"})
public class WriteoffTransactionsReturnElement {

    @XmlElement(name = "writeoff_transaction_id")
    protected Long writeoffTransactionId;
    @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
    @XmlElement(name = "service_no")
    protected Long serviceNo;
    @XmlElement(name = "client_service_id")
    protected String clientServiceId;
    @XmlElement(name = "original_amount")
    protected Long originalAmount;
    @XmlElement(name = "amount")
    protected Long amount;
    @XmlElement(name = "date")
    protected String date;
    @XmlElement(name = "writeoff_reasoncode")
    protected Long writeoffReasoncode;
    @XmlElement(name = "dispute_creation_date")
    protected String disputeCreationDate;
    @XmlElement(name = "dispute_expiry_date")
    protected String disputeExpiryDate;
    @XmlElement(name = "dispute_ind")
    protected Long disputeInd;
    @XmlElement(name = "can_unsettle")
    protected String canUnsettle;
    
    public Long getWriteoffTransactionId() {
        return writeoffTransactionId;
    }

    public void setWriteoffTransactionId(Long value) {
        this.writeoffTransactionId = value;
    }

    public Long getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Long value) {
        this.invoiceNo = value;
    }

    public Long getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(Long value) {
        this.serviceNo = value;
    }

    public String getClientServiceId() {
        return clientServiceId;
    }

    public void setClientServiceId(String value) {
        this.clientServiceId = value;
    }

    public Long getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(Long value) {
        this.originalAmount = value;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long value) {
        this.amount = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String value) {
        this.date = value;
    }

    public Long getWriteoffReasoncode() {
        return writeoffReasoncode;
    }

    public void setWriteoffReasoncode(Long value) {
        this.writeoffReasoncode = value;
    }

    public String getDisputeCreationDate() {
        return disputeCreationDate;
    }

    public void setDisputeCreationDate(String value) {
        this.disputeCreationDate = value;
    }

    public String getDisputeExpiryDate() {
        return disputeExpiryDate;
    }

    public void setDisputeExpiryDate(String value) {
        this.disputeExpiryDate = value;
    }

    public Long getDisputeInd() {
        return disputeInd;
    }

    public void setDisputeInd(Long value) {
        this.disputeInd = value;
    }

    public String getCanUnsettle() {
        return canUnsettle;
    }

    public void setCanUnsettle(String value) {
        this.canUnsettle = value;
    }

    
}
