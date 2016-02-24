package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "reversibleAuthorizations"})
@XmlRootElement(name = "get_reversible_authorizationsResponseElement")
public class GetReversibleAuthorizationsResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "reversible_authorizations")
    protected List<ReversibleAuthorizationsReturnElement> reversibleAuthorizations;
    
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

    public List<ReversibleAuthorizationsReturnElement> getReversibleAuthorizations() {
        if (this.reversibleAuthorizations == null) {
            this.reversibleAuthorizations = new ArrayList<ReversibleAuthorizationsReturnElement>();
        }
        return this.reversibleAuthorizations;
    }
}
