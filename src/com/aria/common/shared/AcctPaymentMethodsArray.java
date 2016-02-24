package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acct_payment_methods_array", propOrder = {
    "acctPaymentMethodsRow"
})
public class AcctPaymentMethodsArray {

    @XmlElement(name = "acct_payment_methods_row")
    protected List<AcctPaymentMethodsRow> acctPaymentMethodsRow;

    public List<AcctPaymentMethodsRow> getAcctPaymentMethodsRow() {
        if (this.acctPaymentMethodsRow == null) {
            this.acctPaymentMethodsRow = new ArrayList<AcctPaymentMethodsRow>();
        }
        return this.acctPaymentMethodsRow;
    }

}
