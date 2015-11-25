package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "referenceCode",    "paymentAmount",    "comments",    "clientReceiptId",    "externalDestinationId",    "externalId",    "paymentReceivedDate",    "specificChargeTransactionId",    "invoiceNo"})
@XmlRootElement(name = "record_external_payment_m")
public class RecordExternalPaymentM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "reference_code")
    protected String referenceCode;
        @XmlElement(name = "payment_amount")
    protected Double paymentAmount;
        @XmlElement(name = "comments")
    protected String comments;
        @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
        @XmlElement(name = "external_destination_id")
    protected Long externalDestinationId;
        @XmlElement(name = "external_id")
    protected String externalId;
        @XmlElement(name = "payment_received_date")
    protected String paymentReceivedDate;
        @XmlElement(name = "specific_charge_transaction_id")
    protected SpecificChargeTransactionIdArray specificChargeTransactionId;
        @XmlElement(name = "invoice_no")
    protected InvoiceNoArray invoiceNo;
    
    public long getClientNo() {
        return clientNo;
    }

    public void setClientNo(Long value) {
        this.clientNo = value;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String value) {
        this.authKey = value;
    }

    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }
            public String getReferenceCode() {
        return referenceCode;
    }

    public void setReferenceCode(String value) {
        this.referenceCode = value;
    }
            public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double value) {
        this.paymentAmount = value;
    }
            public String getComments() {
        return comments;
    }

    public void setComments(String value) {
        this.comments = value;
    }
            public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
    }
            public Long getExternalDestinationId() {
        return externalDestinationId;
    }

    public void setExternalDestinationId(Long value) {
        this.externalDestinationId = value;
    }
            public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String value) {
        this.externalId = value;
    }
            public String getPaymentReceivedDate() {
        return paymentReceivedDate;
    }

    public void setPaymentReceivedDate(String value) {
        this.paymentReceivedDate = value;
    }
            public SpecificChargeTransactionIdArray getSpecificChargeTransactionId() {
        return specificChargeTransactionId;
    }

    public void setSpecificChargeTransactionId(SpecificChargeTransactionIdArray value) {
        this.specificChargeTransactionId = value;
    }
            public InvoiceNoArray getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(InvoiceNoArray value) {
        this.invoiceNo = value;
    }
            
}
