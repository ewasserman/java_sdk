package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mp_coupons_row", propOrder = {
    "mpCouponCd"
    })
public class MpCouponsRow {

    @XmlElement(name = "mp_coupon_cd")
    protected String mpCouponCd;
    public String getMpCouponCd() {
        return mpCouponCd;
    }

    public void setMpCouponCd(String value) {
        this.mpCouponCd = value;
    }

    
}
