package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coupon_row", propOrder = {
    "couponCd",
    "couponDesc",
    "couponMsg",
    "statusInd",
    "noOfUses",
    "startDate",
    "endDate",
    "couponScope"
    })
public class CouponRow {

    @XmlElement(name = "coupon_cd")
    protected String couponCd;
    @XmlElement(name = "coupon_desc")
    protected String couponDesc;
    @XmlElement(name = "coupon_msg")
    protected String couponMsg;
    @XmlElement(name = "status_ind")
    protected Long statusInd;
    @XmlElement(name = "no_of_uses")
    protected Long noOfUses;
    @XmlElement(name = "start_date")
    protected String startDate;
    @XmlElement(name = "end_date")
    protected String endDate;
    @XmlElement(name = "coupon_scope")
    protected Long couponScope;
    public String getCouponCd() {
        return couponCd;
    }

    public void setCouponCd(String value) {
        this.couponCd = value;
    }

    public String getCouponDesc() {
        return couponDesc;
    }

    public void setCouponDesc(String value) {
        this.couponDesc = value;
    }

    public String getCouponMsg() {
        return couponMsg;
    }

    public void setCouponMsg(String value) {
        this.couponMsg = value;
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

    public Long getCouponScope() {
        return couponScope;
    }

    public void setCouponScope(Long value) {
        this.couponScope = value;
    }

    
}
