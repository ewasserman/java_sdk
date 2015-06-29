package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payment_method_array", propOrder = {
    "paymentMethodRow"
})
public class PaymentMethodArray {

    @XmlElement(name = "payment_method_row")
    protected List<PaymentMethodRow> paymentMethodRow;

    public List<PaymentMethodRow> getPaymentMethodRow() {
        if (this.paymentMethodRow == null) {
            this.paymentMethodRow = new ArrayList<PaymentMethodRow>();
        }
        return this.paymentMethodRow;
    }

}
