package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billing_dates_array", propOrder = {
    "billingDatesRow"
})
public class BillingDatesArray {

    @XmlElement(name = "billing_dates_row")
    protected List<BillingDatesRow> billingDatesRow;

    public List<BillingDatesRow> getBillingDatesRow() {
        if (this.billingDatesRow == null) {
            this.billingDatesRow = new ArrayList<BillingDatesRow>();
        }
        return this.billingDatesRow;
    }

}
