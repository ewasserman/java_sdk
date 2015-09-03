package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payment_methods_array", propOrder = {
    "paymentMethodsRow"
})
public class PaymentMethodsArray {

    @XmlElement(name = "payment_methods_row")
    protected List<PaymentMethodsRow> paymentMethodsRow;

    public List<PaymentMethodsRow> getPaymentMethodsRow() {
        if (this.paymentMethodsRow == null) {
            this.paymentMethodsRow = new ArrayList<PaymentMethodsRow>();
        }
        return this.paymentMethodsRow;
    }

}
