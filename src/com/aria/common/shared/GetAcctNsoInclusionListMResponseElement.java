package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "acctNsoInclList"})
@XmlRootElement(name = "get_acct_nso_inclusion_list_mResponseElement")
public class GetAcctNsoInclusionListMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "acct_nso_incl_list")
    protected List<AcctNsoInclListReturnElement> acctNsoInclList;
    
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

    public List<AcctNsoInclListReturnElement> getAcctNsoInclList() {
        if (this.acctNsoInclList == null) {
            this.acctNsoInclList = new ArrayList<AcctNsoInclListReturnElement>();
        }
        return this.acctNsoInclList;
    }
}
