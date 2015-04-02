package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applied_transactions_ReturnElement", propOrder = {"transactionId", "originalAmount", "amountApplied", "dateApplied"})
public class AppliedTransactionsReturnElement {

    @XmlElement(name = "transaction_id")
    protected Long transactionId;
    @XmlElement(name = "original_amount")
    protected Double originalAmount;
    @XmlElement(name = "amount_applied")
    protected Double amountApplied;
    @XmlElement(name = "date_applied")
    protected String dateApplied;
    
    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long value) {
        this.transactionId = value;
    }

    public Double getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(Double value) {
        this.originalAmount = value;
    }

    public Double getAmountApplied() {
        return amountApplied;
    }

    public void setAmountApplied(Double value) {
        this.amountApplied = value;
    }

    public String getDateApplied() {
        return dateApplied;
    }

    public void setDateApplied(String value) {
        this.dateApplied = value;
    }

    
}
