package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "functional_acct_group_array", propOrder = {
    "functionalAcctGroupRow"
})
public class FunctionalAcctGroupArray {

    @XmlElement(name = "functional_acct_group_row")
    protected List<FunctionalAcctGroupRow> functionalAcctGroupRow;

    public List<FunctionalAcctGroupRow> getFunctionalAcctGroupRow() {
        if (this.functionalAcctGroupRow == null) {
            this.functionalAcctGroupRow = new ArrayList<FunctionalAcctGroupRow>();
        }
        return this.functionalAcctGroupRow;
    }

}
