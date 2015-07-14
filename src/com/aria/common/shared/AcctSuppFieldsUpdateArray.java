package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acct_supp_fields_update_array", propOrder = {
    "acctSuppFieldsUpdateRow"
})
public class AcctSuppFieldsUpdateArray {

    @XmlElement(name = "acct_supp_fields_update_row")
    protected List<AcctSuppFieldsUpdateRow> acctSuppFieldsUpdateRow;

    public List<AcctSuppFieldsUpdateRow> getAcctSuppFieldsUpdateRow() {
        if (this.acctSuppFieldsUpdateRow == null) {
            this.acctSuppFieldsUpdateRow = new ArrayList<AcctSuppFieldsUpdateRow>();
        }
        return this.acctSuppFieldsUpdateRow;
    }

}
