package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "void_transactions_ReturnElement", propOrder = {"invoiceTransactionId", "voidTransactionId"})
public class VoidTransactionsReturnElement {

    @XmlElement(name = "invoice_transaction_id")
    protected Long invoiceTransactionId;
    @XmlElement(name = "void_transaction_id")
    protected Long voidTransactionId;
    
    public Long getInvoiceTransactionId() {
        return invoiceTransactionId;
    }

    public void setInvoiceTransactionId(Long value) {
        this.invoiceTransactionId = value;
    }

    public Long getVoidTransactionId() {
        return voidTransactionId;
    }

    public void setVoidTransactionId(Long value) {
        this.voidTransactionId = value;
    }

    
}
