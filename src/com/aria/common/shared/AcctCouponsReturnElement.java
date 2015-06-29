package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acct_coupons_ReturnElement", propOrder = {"acctCouponCd"})
public class AcctCouponsReturnElement {

    @XmlElement(name = "acct_coupon_cd")
    protected String acctCouponCd;
    
    public String getAcctCouponCd() {
        return acctCouponCd;
    }

    public void setAcctCouponCd(String value) {
        this.acctCouponCd = value;
    }

    
}
