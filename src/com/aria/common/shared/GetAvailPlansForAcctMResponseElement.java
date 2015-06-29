package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "allClientAvailPlans"})
@XmlRootElement(name = "get_avail_plans_for_acct_mResponseElement")
public class GetAvailPlansForAcctMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "all_client_avail_plans")
    protected List<AllClientAvailPlansReturnElement> allClientAvailPlans;
    
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

    public List<AllClientAvailPlansReturnElement> getAllClientAvailPlans() {
        if (this.allClientAvailPlans == null) {
            this.allClientAvailPlans = new ArrayList<AllClientAvailPlansReturnElement>();
        }
        return this.allClientAvailPlans;
    }
}
