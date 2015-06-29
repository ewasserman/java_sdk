package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "error_codes_ReturnElement", propOrder = {"outAcctNo", "outMasterPlanInstanceNo", "outClientMpInstanceId", "recurCreditNo", "errorCode", "errorMsg"})
public class ErrorCodesReturnElement {

    @XmlElement(name = "out_acct_no")
    protected Long outAcctNo;
    @XmlElement(name = "out_master_plan_instance_no")
    protected Long outMasterPlanInstanceNo;
    @XmlElement(name = "out_client_mp_instance_id")
    protected String outClientMpInstanceId;
    @XmlElement(name = "recur_credit_no")
    protected Long recurCreditNo;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public Long getOutAcctNo() {
        return outAcctNo;
    }

    public void setOutAcctNo(Long value) {
        this.outAcctNo = value;
    }

    public Long getOutMasterPlanInstanceNo() {
        return outMasterPlanInstanceNo;
    }

    public void setOutMasterPlanInstanceNo(Long value) {
        this.outMasterPlanInstanceNo = value;
    }

    public String getOutClientMpInstanceId() {
        return outClientMpInstanceId;
    }

    public void setOutClientMpInstanceId(String value) {
        this.outClientMpInstanceId = value;
    }

    public Long getRecurCreditNo() {
        return recurCreditNo;
    }

    public void setRecurCreditNo(Long value) {
        this.recurCreditNo = value;
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
