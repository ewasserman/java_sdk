package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "credit_card_payment_methods_array", propOrder = {
    "creditCardPaymentMethodsRow"
})
public class CreditCardPaymentMethodsArray {

    @XmlElement(name = "credit_card_payment_methods_row")
    protected List<CreditCardPaymentMethodsRow> creditCardPaymentMethodsRow;

    public List<CreditCardPaymentMethodsRow> getCreditCardPaymentMethodsRow() {
        if (this.creditCardPaymentMethodsRow == null) {
            this.creditCardPaymentMethodsRow = new ArrayList<CreditCardPaymentMethodsRow>();
        }
        return this.creditCardPaymentMethodsRow;
    }

}
