package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "reversibleInvTrans"})
@XmlRootElement(name = "get_reversible_invs_by_payment_mResponseElement")
public class GetReversibleInvsByPaymentMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "reversible_inv_trans")
    protected List<ReversibleInvTransReturnElement> reversibleInvTrans;
    
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

    public List<ReversibleInvTransReturnElement> getReversibleInvTrans() {
        if (this.reversibleInvTrans == null) {
            this.reversibleInvTrans = new ArrayList<ReversibleInvTransReturnElement>();
        }
        return this.reversibleInvTrans;
    }
}
