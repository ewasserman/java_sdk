package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "new_acct_plan_custom_rates_array", propOrder = {
    "newAcctPlanCustomRatesRow"
})
public class NewAcctPlanCustomRatesArray {

    @XmlElement(name = "new_acct_plan_custom_rates_row")
    protected List<NewAcctPlanCustomRatesRow> newAcctPlanCustomRatesRow;

    public List<NewAcctPlanCustomRatesRow> getNewAcctPlanCustomRatesRow() {
        if (this.newAcctPlanCustomRatesRow == null) {
            this.newAcctPlanCustomRatesRow = new ArrayList<NewAcctPlanCustomRatesRow>();
        }
        return this.newAcctPlanCustomRatesRow;
    }

}
