package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acct_array", propOrder = {
    "acctRow"
})
public class AcctArray {

    @XmlElement(name = "acct_row")
    protected List<AcctRow> acctRow;

    public List<AcctRow> getAcctRow() {
        if (this.acctRow == null) {
            this.acctRow = new ArrayList<AcctRow>();
        }
        return this.acctRow;
    }

}
