package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "account_surcharges_array", propOrder = {
    "accountSurchargesRow"
})
public class AccountSurchargesArray {

    @XmlElement(name = "account_surcharges_row")
    protected List<AccountSurchargesRow> accountSurchargesRow;

    public List<AccountSurchargesRow> getAccountSurchargesRow() {
        if (this.accountSurchargesRow == null) {
            this.accountSurchargesRow = new ArrayList<AccountSurchargesRow>();
        }
        return this.accountSurchargesRow;
    }

}
