package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "update_acct_custom_rates_array", propOrder = {
    "updateAcctCustomRatesRow"
})
public class UpdateAcctCustomRatesArray {

    @XmlElement(name = "update_acct_custom_rates_row")
    protected List<UpdateAcctCustomRatesRow> updateAcctCustomRatesRow;

    public List<UpdateAcctCustomRatesRow> getUpdateAcctCustomRatesRow() {
        if (this.updateAcctCustomRatesRow == null) {
            this.updateAcctCustomRatesRow = new ArrayList<UpdateAcctCustomRatesRow>();
        }
        return this.updateAcctCustomRatesRow;
    }

}
