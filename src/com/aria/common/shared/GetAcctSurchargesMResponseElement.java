package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"allSurcharges", "errorCode", "errorMsg"})
@XmlRootElement(name = "get_acct_surcharges_mResponseElement")
public class GetAcctSurchargesMResponseElement {

    @XmlElement(name = "all_surcharges")
    protected List<AllSurchargesReturnElement> allSurcharges;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public List<AllSurchargesReturnElement> getAllSurcharges() {
        if (this.allSurcharges == null) {
            this.allSurcharges = new ArrayList<AllSurchargesReturnElement>();
        }
        return this.allSurcharges;
    }public Long getErrorCode() {
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
