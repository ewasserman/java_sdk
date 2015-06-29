package com.aria.common.shared.object;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coupon_history_m_ReturnElement", propOrder = {"acctNo", "userId", "clientAcctId", "masterPlanInstanceId", "clientMasterPlanInstanceId", "currencyCd", "couponCd", "couponCreateDate", "couponStatus", "couponCancelDate"})
public class CouponHistoryMReturnElement {

    @XmlElement(name = "acct_no")
    protected Long acctNo;
    @XmlElement(name = "user_id")
    protected String userId;
    @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
    @XmlElement(name = "master_plan_instance_id")
    protected String masterPlanInstanceId;
    @XmlElement(name = "client_master_plan_instance_id")
    protected String clientMasterPlanInstanceId;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "coupon_cd")
    protected String couponCd;
    @XmlElement(name = "coupon_create_date")
    protected String couponCreateDate;
    @XmlElement(name = "coupon_status")
    protected String couponStatus;
    @XmlElement(name = "coupon_cancel_date")
    protected String couponCancelDate;
    
    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String value) {
        this.userId = value;
    }

    public String getClientAcctId() {
        return clientAcctId;
    }

    public void setClientAcctId(String value) {
        this.clientAcctId = value;
    }

    public String getMasterPlanInstanceId() {
        return masterPlanInstanceId;
    }

    public void setMasterPlanInstanceId(String value) {
        this.masterPlanInstanceId = value;
    }

    public String getClientMasterPlanInstanceId() {
        return clientMasterPlanInstanceId;
    }

    public void setClientMasterPlanInstanceId(String value) {
        this.clientMasterPlanInstanceId = value;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }

    public String getCouponCd() {
        return couponCd;
    }

    public void setCouponCd(String value) {
        this.couponCd = value;
    }

    public String getCouponCreateDate() {
        return couponCreateDate;
    }

    public void setCouponCreateDate(String value) {
        this.couponCreateDate = value;
    }

    public String getCouponStatus() {
        return couponStatus;
    }

    public void setCouponStatus(String value) {
        this.couponStatus = value;
    }

    public String getCouponCancelDate() {
        return couponCancelDate;
    }

    public void setCouponCancelDate(String value) {
        this.couponCancelDate = value;
    }

    
}
