package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coupon_codes_ReturnElement", propOrder = {"couponCodes"})
public class CouponCodesReturnElement {

    @XmlElement(name = "coupon_codes")
    protected String couponCodes;
    
    public String getCouponCodes() {
        return couponCodes;
    }

    public void setCouponCodes(String value) {
        this.couponCodes = value;
    }

    
}
