package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acct_billing_groups_array", propOrder = {
    "acctBillingGroupsRow"
})
public class AcctBillingGroupsArray {

    @XmlElement(name = "acct_billing_groups_row")
    protected List<AcctBillingGroupsRow> acctBillingGroupsRow;

    public List<AcctBillingGroupsRow> getAcctBillingGroupsRow() {
        if (this.acctBillingGroupsRow == null) {
            this.acctBillingGroupsRow = new ArrayList<AcctBillingGroupsRow>();
        }
        return this.acctBillingGroupsRow;
    }

}
