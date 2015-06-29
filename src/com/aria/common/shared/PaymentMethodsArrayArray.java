package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payment_methods_array_array", propOrder = {
    "paymentMethodsArrayRow"
})
public class PaymentMethodsArrayArray {

    @XmlElement(name = "payment_methods_array_row")
    protected List<PaymentMethodsArrayRow> paymentMethodsArrayRow;

    public List<PaymentMethodsArrayRow> getPaymentMethodsArrayRow() {
        if (this.paymentMethodsArrayRow == null) {
            this.paymentMethodsArrayRow = new ArrayList<PaymentMethodsArrayRow>();
        }
        return this.paymentMethodsArrayRow;
    }

}
