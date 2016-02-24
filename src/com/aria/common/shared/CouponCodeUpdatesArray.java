package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coupon_code_updates_array", propOrder = {
    "couponCodeUpdatesRow"
})
public class CouponCodeUpdatesArray {

    @XmlElement(name = "coupon_code_updates_row")
    protected List<CouponCodeUpdatesRow> couponCodeUpdatesRow;

    public List<CouponCodeUpdatesRow> getCouponCodeUpdatesRow() {
        if (this.couponCodeUpdatesRow == null) {
            this.couponCodeUpdatesRow = new ArrayList<CouponCodeUpdatesRow>();
        }
        return this.couponCodeUpdatesRow;
    }

}
