package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"userId", "accountNo", "altCallerId", "applicationId", "applicationDate", "errorCode", "errorMsg"})
@XmlRootElement(name = "validate_session_mResponseElement")
public class ValidateSessionMResponseElement {

    @XmlElement(name = "user_id")
    protected String userId;
    @XmlElement(name = "account_no")
    protected Long accountNo;
    @XmlElement(name = "alt_caller_id")
    protected String altCallerId;
    @XmlElement(name = "application_id")
    protected String applicationId;
    @XmlElement(name = "application_date")
    protected String applicationDate;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public String getUserId() {
        return userId;
    }

    public void setUserId(String value) {
        this.userId = value;
    }

    public Long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Long value) {
        this.accountNo = value;
    }

    public String getAltCallerId() {
        return altCallerId;
    }

    public void setAltCallerId(String value) {
        this.altCallerId = value;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String value) {
        this.applicationId = value;
    }

    public String getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(String value) {
        this.applicationDate = value;
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
