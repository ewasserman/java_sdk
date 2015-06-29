package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mp_coupons_array", propOrder = {
    "mpCouponsRow"
})
public class MpCouponsArray {

    @XmlElement(name = "mp_coupons_row")
    protected List<MpCouponsRow> mpCouponsRow;

    public List<MpCouponsRow> getMpCouponsRow() {
        if (this.mpCouponsRow == null) {
            this.mpCouponsRow = new ArrayList<MpCouponsRow>();
        }
        return this.mpCouponsRow;
    }

}
