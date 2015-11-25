package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "credit_card_payment_method_array", propOrder = {
    "creditCardPaymentMethodRow"
})
public class CreditCardPaymentMethodArray {

    @XmlElement(name = "credit_card_payment_method_row")
    protected List<CreditCardPaymentMethodRow> creditCardPaymentMethodRow;

    public List<CreditCardPaymentMethodRow> getCreditCardPaymentMethodRow() {
        if (this.creditCardPaymentMethodRow == null) {
            this.creditCardPaymentMethodRow = new ArrayList<CreditCardPaymentMethodRow>();
        }
        return this.creditCardPaymentMethodRow;
    }

}
