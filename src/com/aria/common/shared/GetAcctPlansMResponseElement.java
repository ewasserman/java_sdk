package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "acctPlansM"})
@XmlRootElement(name = "get_acct_plans_mResponseElement")
public class GetAcctPlansMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "acct_plans_m")
    protected List<AcctPlansMReturnElement> acctPlansM;
    
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

    public List<AcctPlansMReturnElement> getAcctPlansM() {
        if (this.acctPlansM == null) {
            this.acctPlansM = new ArrayList<AcctPlansMReturnElement>();
        }
        return this.acctPlansM;
    }
}
