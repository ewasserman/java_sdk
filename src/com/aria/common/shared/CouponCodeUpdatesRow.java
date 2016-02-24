package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coupon_code_updates_row", propOrder = {
    "couponCd",
    "couponDirective"
    })
public class CouponCodeUpdatesRow {

    @XmlElement(name = "coupon_cd")
    protected String couponCd;
    @XmlElement(name = "coupon_directive")
    protected Long couponDirective;
    public String getCouponCd() {
        return couponCd;
    }

    public void setCouponCd(String value) {
        this.couponCd = value;
    }

    public Long getCouponDirective() {
        return couponDirective;
    }

    public void setCouponDirective(Long value) {
        this.couponDirective = value;
    }

    
}
