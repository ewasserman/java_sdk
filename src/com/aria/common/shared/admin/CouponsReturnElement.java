package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coupons_ReturnElement", propOrder = {"couponCd", "couponMsg", "couponDesc", "statusInd", "noOfUses", "startDate", "endDate", "expiresDesc", "couponNo"})
public class CouponsReturnElement {

    @XmlElement(name = "coupon_cd")
    protected String couponCd;
    @XmlElement(name = "coupon_msg")
    protected String couponMsg;
    @XmlElement(name = "coupon_desc")
    protected String couponDesc;
    @XmlElement(name = "status_ind")
    protected Long statusInd;
    @XmlElement(name = "no_of_uses")
    protected Long noOfUses;
    @XmlElement(name = "start_date")
    protected String startDate;
    @XmlElement(name = "end_date")
    protected String endDate;
    @XmlElement(name = "expires_desc")
    protected String expiresDesc;
    @XmlElement(name = "coupon_no")
    protected Long couponNo;
    
    public String getCouponCd() {
        return couponCd;
    }

    public void setCouponCd(String value) {
        this.couponCd = value;
    }

    public String getCouponMsg() {
        return couponMsg;
    }

    public void setCouponMsg(String value) {
        this.couponMsg = value;
    }

    public String getCouponDesc() {
        return couponDesc;
    }

    public void setCouponDesc(String value) {
        this.couponDesc = value;
    }

    public Long getStatusInd() {
        return statusInd;
    }

    public void setStatusInd(Long value) {
        this.statusInd = value;
    }

    public Long getNoOfUses() {
        return noOfUses;
    }

    public void setNoOfUses(Long value) {
        this.noOfUses = value;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String value) {
        this.startDate = value;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String value) {
        this.endDate = value;
    }

    public String getExpiresDesc() {
        return expiresDesc;
    }

    public void setExpiresDesc(String value) {
        this.expiresDesc = value;
    }

    public Long getCouponNo() {
        return couponNo;
    }

    public void setCouponNo(Long value) {
        this.couponNo = value;
    }

    
}
