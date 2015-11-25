package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "credit_card_payment_methods_row", propOrder = {
    "paymentMethodNo",
    "clientPaymentMethodId"
    })
public class CreditCardPaymentMethodsRow {

    @XmlElement(name = "payment_method_no")
    protected Long paymentMethodNo;
    @XmlElement(name = "client_payment_method_id")
    protected String clientPaymentMethodId;
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

    
}
