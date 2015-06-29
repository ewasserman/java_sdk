package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acct_coupons_row", propOrder = {
    "acctCouponCd"
    })
public class AcctCouponsRow {

    @XmlElement(name = "acct_coupon_cd")
    protected String acctCouponCd;
    public String getAcctCouponCd() {
        return acctCouponCd;
    }

    public void setAcctCouponCd(String value) {
        this.acctCouponCd = value;
    }

    
}
