package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billing_groups_array_array", propOrder = {
    "billingGroupsArrayRow"
})
public class BillingGroupsArrayArray {

    @XmlElement(name = "billing_groups_array_row")
    protected List<BillingGroupsArrayRow> billingGroupsArrayRow;

    public List<BillingGroupsArrayRow> getBillingGroupsArrayRow() {
        if (this.billingGroupsArrayRow == null) {
            this.billingGroupsArrayRow = new ArrayList<BillingGroupsArrayRow>();
        }
        return this.billingGroupsArrayRow;
    }

}
