package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "functional_acct_groups_update_array", propOrder = {
    "functionalAcctGroupsUpdateRow"
})
public class FunctionalAcctGroupsUpdateArray {

    @XmlElement(name = "functional_acct_groups_update_row")
    protected List<FunctionalAcctGroupsUpdateRow> functionalAcctGroupsUpdateRow;

    public List<FunctionalAcctGroupsUpdateRow> getFunctionalAcctGroupsUpdateRow() {
        if (this.functionalAcctGroupsUpdateRow == null) {
            this.functionalAcctGroupsUpdateRow = new ArrayList<FunctionalAcctGroupsUpdateRow>();
        }
        return this.functionalAcctGroupsUpdateRow;
    }

}
