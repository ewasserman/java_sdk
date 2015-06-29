package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"userSuccessMsg", "errorCode", "errorMsg"})
@XmlRootElement(name = "apply_coupon_to_acct_mResponseElement")
public class ApplyCouponToAcctMResponseElement {

    @XmlElement(name = "user_success_msg")
    protected String userSuccessMsg;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public String getUserSuccessMsg() {
        return userSuccessMsg;
    }

    public void setUserSuccessMsg(String value) {
        this.userSuccessMsg = value;
    }

    public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long value) {
        this.errorCode = value;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    
}
