package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pay_method_ReturnElement", propOrder = {"paymentMethodType"})
public class PayMethodReturnElement {

    @XmlElement(name = "payment_method_type")
    protected String paymentMethodType;
    
    public String getPaymentMethodType() {
        return paymentMethodType;
    }

    public void setPaymentMethodType(String value) {
        this.paymentMethodType = value;
    }

    
}
