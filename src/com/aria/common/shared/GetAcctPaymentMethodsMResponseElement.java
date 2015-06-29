package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"accountPaymentMethods", "errorCode", "errorMsg"})
@XmlRootElement(name = "get_acct_payment_methods_mResponseElement")
public class GetAcctPaymentMethodsMResponseElement {

    @XmlElement(name = "account_payment_methods")
    protected List<AccountPaymentMethodsReturnElement> accountPaymentMethods;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public List<AccountPaymentMethodsReturnElement> getAccountPaymentMethods() {
        if (this.accountPaymentMethods == null) {
            this.accountPaymentMethods = new ArrayList<AccountPaymentMethodsReturnElement>();
        }
        return this.accountPaymentMethods;
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
