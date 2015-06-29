package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "currencyCd", "currentBalanceDue", "totalBalanceDue"})
@XmlRootElement(name = "get_acct_plan_balance_mResponseElement")
public class GetAcctPlanBalanceMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "current_balance_due")
    protected String currentBalanceDue;
    @XmlElement(name = "total_balance_due")
    protected String totalBalanceDue;
    
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

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }

    public String getCurrentBalanceDue() {
        return currentBalanceDue;
    }

    public void setCurrentBalanceDue(String value) {
        this.currentBalanceDue = value;
    }

    public String getTotalBalanceDue() {
        return totalBalanceDue;
    }

    public void setTotalBalanceDue(String value) {
        this.totalBalanceDue = value;
    }

    
}
