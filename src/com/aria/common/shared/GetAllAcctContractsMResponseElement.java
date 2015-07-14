package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "allAcctContractsM"})
@XmlRootElement(name = "get_all_acct_contracts_mResponseElement")
public class GetAllAcctContractsMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "all_acct_contracts_m")
    protected List<AllAcctContractsMReturnElement> allAcctContractsM;
    
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

    public List<AllAcctContractsMReturnElement> getAllAcctContractsM() {
        if (this.allAcctContractsM == null) {
            this.allAcctContractsM = new ArrayList<AllAcctContractsMReturnElement>();
        }
        return this.allAcctContractsM;
    }
}
