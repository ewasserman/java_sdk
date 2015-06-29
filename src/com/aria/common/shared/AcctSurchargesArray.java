package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acct_surcharges_array", propOrder = {
    "acctSurchargesRow"
})
public class AcctSurchargesArray {

    @XmlElement(name = "acct_surcharges_row")
    protected List<AcctSurchargesRow> acctSurchargesRow;

    public List<AcctSurchargesRow> getAcctSurchargesRow() {
        if (this.acctSurchargesRow == null) {
            this.acctSurchargesRow = new ArrayList<AcctSurchargesRow>();
        }
        return this.acctSurchargesRow;
    }

}
