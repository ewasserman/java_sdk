package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unapplied_payments_ReturnElement", propOrder = {"paymentTransactionId", "paymentAmount", "unappliedAmount", "cashCreditTransactionId", "cashCreditAmount", "unappliedCashCredit"})
public class UnappliedPaymentsReturnElement {

    @XmlElement(name = "payment_transaction_id")
    protected Long paymentTransactionId;
    @XmlElement(name = "payment_amount")
    protected Double paymentAmount;
    @XmlElement(name = "unapplied_amount")
    protected Double unappliedAmount;
    @XmlElement(name = "cash_credit_transaction_id")
    protected Long cashCreditTransactionId;
    @XmlElement(name = "cash_credit_amount")
    protected Double cashCreditAmount;
    @XmlElement(name = "unapplied_cash_credit")
    protected Double unappliedCashCredit;
    
    public Long getPaymentTransactionId() {
        return paymentTransactionId;
    }

    public void setPaymentTransactionId(Long value) {
        this.paymentTransactionId = value;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double value) {
        this.paymentAmount = value;
    }

    public Double getUnappliedAmount() {
        return unappliedAmount;
    }

    public void setUnappliedAmount(Double value) {
        this.unappliedAmount = value;
    }

    public Long getCashCreditTransactionId() {
        return cashCreditTransactionId;
    }

    public void setCashCreditTransactionId(Long value) {
        this.cashCreditTransactionId = value;
    }

    public Double getCashCreditAmount() {
        return cashCreditAmount;
    }

    public void setCashCreditAmount(Double value) {
        this.cashCreditAmount = value;
    }

    public Double getUnappliedCashCredit() {
        return unappliedCashCredit;
    }

    public void setUnappliedCashCredit(Double value) {
        this.unappliedCashCredit = value;
    }

    
}
