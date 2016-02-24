package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "notifyMethod", "listStartMasterFile", "notifyMethodName"})
@XmlRootElement(name = "get_acct_plan_notify_method_mResponseElement")
public class GetAcctPlanNotifyMethodMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "notify_method")
    protected Long notifyMethod;
    @XmlElement(name = "list_start_master_file")
    protected Long listStartMasterFile;
    @XmlElement(name = "notify_method_name")
    protected String notifyMethodName;
    
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

    public Long getNotifyMethod() {
        return notifyMethod;
    }

    public void setNotifyMethod(Long value) {
        this.notifyMethod = value;
    }

    public Long getListStartMasterFile() {
        return listStartMasterFile;
    }

    public void setListStartMasterFile(Long value) {
        this.listStartMasterFile = value;
    }

    public String getNotifyMethodName() {
        return notifyMethodName;
    }

    public void setNotifyMethodName(String value) {
        this.notifyMethodName = value;
    }

    
}
