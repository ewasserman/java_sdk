package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acct_dunning_groups_array", propOrder = {
    "acctDunningGroupsRow"
})
public class AcctDunningGroupsArray {

    @XmlElement(name = "acct_dunning_groups_row")
    protected List<AcctDunningGroupsRow> acctDunningGroupsRow;

    public List<AcctDunningGroupsRow> getAcctDunningGroupsRow() {
        if (this.acctDunningGroupsRow == null) {
            this.acctDunningGroupsRow = new ArrayList<AcctDunningGroupsRow>();
        }
        return this.acctDunningGroupsRow;
    }

}
