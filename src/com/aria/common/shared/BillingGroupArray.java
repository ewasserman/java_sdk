package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billing_group_array", propOrder = {
    "billingGroupRow"
})
public class BillingGroupArray {

    @XmlElement(name = "billing_group_row")
    protected List<BillingGroupRow> billingGroupRow;

    public List<BillingGroupRow> getBillingGroupRow() {
        if (this.billingGroupRow == null) {
            this.billingGroupRow = new ArrayList<BillingGroupRow>();
        }
        return this.billingGroupRow;
    }

}
