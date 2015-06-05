package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coupons_array", propOrder = {
    "couponsRow"
})
public class CouponsArray {

    @XmlElement(name = "coupons_row")
    protected List<CouponsRow> couponsRow;

    public List<CouponsRow> getCouponsRow() {
        if (this.couponsRow == null) {
            this.couponsRow = new ArrayList<CouponsRow>();
        }
        return this.couponsRow;
    }

}
