package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acct_coupons_array", propOrder = {
    "acctCouponsRow"
})
public class AcctCouponsArray {

    @XmlElement(name = "acct_coupons_row")
    protected List<AcctCouponsRow> acctCouponsRow;

    public List<AcctCouponsRow> getAcctCouponsRow() {
        if (this.acctCouponsRow == null) {
            this.acctCouponsRow = new ArrayList<AcctCouponsRow>();
        }
        return this.acctCouponsRow;
    }

}
