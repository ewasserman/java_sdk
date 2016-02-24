package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "specific_transactions_row", propOrder = {
    "transactionId",
    "transCreditAmount"
    })
public class SpecificTransactionsRow {

    @XmlElement(name = "transaction_id")
    protected Long transactionId;
    @XmlElement(name = "trans_credit_amount")
    protected Double transCreditAmount;
    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long value) {
        this.transactionId = value;
    }

    public Double getTransCreditAmount() {
        return transCreditAmount;
    }

    public void setTransCreditAmount(Double value) {
        this.transCreditAmount = value;
    }

    
}
