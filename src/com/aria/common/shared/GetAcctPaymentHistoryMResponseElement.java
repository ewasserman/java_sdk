package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "paymentHistory"})
@XmlRootElement(name = "get_acct_payment_history_mResponseElement")
public class GetAcctPaymentHistoryMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "payment_history")
    protected List<PaymentHistoryReturnElement> paymentHistory;
    
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

    public List<PaymentHistoryReturnElement> getPaymentHistory() {
        if (this.paymentHistory == null) {
            this.paymentHistory = new ArrayList<PaymentHistoryReturnElement>();
        }
        return this.paymentHistory;
    }
}
