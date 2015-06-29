package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "acctHierarchyDtls"})
@XmlRootElement(name = "get_acct_hierarchy_details_mResponseElement")
public class GetAcctHierarchyDetailsMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "acct_hierarchy_dtls")
    protected List<AcctHierarchyDtlsReturnElement> acctHierarchyDtls;
    
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

    public List<AcctHierarchyDtlsReturnElement> getAcctHierarchyDtls() {
        if (this.acctHierarchyDtls == null) {
            this.acctHierarchyDtls = new ArrayList<AcctHierarchyDtlsReturnElement>();
        }
        return this.acctHierarchyDtls;
    }
}
