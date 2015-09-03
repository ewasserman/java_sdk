package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "paymentMethodMap"})
@XmlRootElement(name = "copy_acct_payment_method_mResponseElement")
public class CopyAcctPaymentMethodMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "payment_method_map")
    protected List<PaymentMethodMapReturnElement> paymentMethodMap;
    
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

    public List<PaymentMethodMapReturnElement> getPaymentMethodMap() {
        if (this.paymentMethodMap == null) {
            this.paymentMethodMap = new ArrayList<PaymentMethodMapReturnElement>();
        }
        return this.paymentMethodMap;
    }
}
