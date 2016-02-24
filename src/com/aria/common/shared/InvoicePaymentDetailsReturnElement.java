package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invoice_payment_details_ReturnElement", propOrder = {"transactionId", "transactionType", "description", "amount", "appliedAmount", "currencyCode", "transactionDate", "isVoided", "statementNo", "paymentType", "paymentSrcDescription", "paymentSrcSuffix", "clientReceiptId", "seqStatementId", "paymentMethodNo", "clientPaymentMethodId", "reasonCode", "reasonDescription"})
public class InvoicePaymentDetailsReturnElement {

    @XmlElement(name = "transaction_id")
    protected Long transactionId;
    @XmlElement(name = "transaction_type")
    protected Long transactionType;
    @XmlElement(name = "description")
    protected String description;
    @XmlElement(name = "amount")
    protected Double amount;
    @XmlElement(name = "applied_amount")
    protected Double appliedAmount;
    @XmlElement(name = "currency_code")
    protected String currencyCode;
    @XmlElement(name = "transaction_date")
    protected String transactionDate;
    @XmlElement(name = "is_voided")
    protected String isVoided;
    @XmlElement(name = "statement_no")
    protected Long statementNo;
    @XmlElement(name = "payment_type")
    protected String paymentType;
    @XmlElement(name = "payment_src_description")
    protected String paymentSrcDescription;
    @XmlElement(name = "payment_src_suffix")
    protected String paymentSrcSuffix;
    @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
    @XmlElement(name = "seq_statement_id")
    protected String seqStatementId;
    @XmlElement(name = "payment_method_no")
    protected Long paymentMethodNo;
    @XmlElement(name = "client_payment_method_id")
    protected String clientPaymentMethodId;
    @XmlElement(name = "reason_code")
    protected Long reasonCode;
    @XmlElement(name = "reason_description")
    protected String reasonDescription;
    
    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long value) {
        this.transactionId = value;
    }

    public Long getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(Long value) {
        this.transactionType = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double value) {
        this.amount = value;
    }

    public Double getAppliedAmount() {
        return appliedAmount;
    }

    public void setAppliedAmount(Double value) {
        this.appliedAmount = value;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String value) {
        this.transactionDate = value;
    }

    public String getIsVoided() {
        return isVoided;
    }

    public void setIsVoided(String value) {
        this.isVoided = value;
    }

    public Long getStatementNo() {
        return statementNo;
    }

    public void setStatementNo(Long value) {
        this.statementNo = value;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    public String getPaymentSrcDescription() {
        return paymentSrcDescription;
    }

    public void setPaymentSrcDescription(String value) {
        this.paymentSrcDescription = value;
    }

    public String getPaymentSrcSuffix() {
        return paymentSrcSuffix;
    }

    public void setPaymentSrcSuffix(String value) {
        this.paymentSrcSuffix = value;
    }

    public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
    }

    public String getSeqStatementId() {
        return seqStatementId;
    }

    public void setSeqStatementId(String value) {
        this.seqStatementId = value;
    }

    public Long getPaymentMethodNo() {
        return paymentMethodNo;
    }

    public void setPaymentMethodNo(Long value) {
        this.paymentMethodNo = value;
    }

    public String getClientPaymentMethodId() {
        return clientPaymentMethodId;
    }

    public void setClientPaymentMethodId(String value) {
        this.clientPaymentMethodId = value;
    }

    public Long getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(Long value) {
        this.reasonCode = value;
    }

    public String getReasonDescription() {
        return reasonDescription;
    }

    public void setReasonDescription(String value) {
        this.reasonDescription = value;
    }

    
}
