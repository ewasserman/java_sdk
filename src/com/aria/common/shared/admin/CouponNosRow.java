package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coupon_nos_row", propOrder = {
    "couponNos"
    })
public class CouponNosRow {

    @XmlElement(name = "coupon_nos")
    protected Long couponNos;
    public Long getCouponNos() {
        return couponNos;
    }

    public void setCouponNos(Long value) {
        this.couponNos = value;
    }

    
}
