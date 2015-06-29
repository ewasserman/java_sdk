package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "refundablePayments"})
@XmlRootElement(name = "get_refundable_payments_mResponseElement")
public class GetRefundablePaymentsMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "refundable_payments")
    protected List<RefundablePaymentsReturnElement> refundablePayments;
    
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

    public List<RefundablePaymentsReturnElement> getRefundablePayments() {
        if (this.refundablePayments == null) {
            this.refundablePayments = new ArrayList<RefundablePaymentsReturnElement>();
        }
        return this.refundablePayments;
    }
}
