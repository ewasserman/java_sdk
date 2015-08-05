package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "acctPaymentHistory"})
@XmlRootElement(name = "get_acct_payment_history_mResponseElement")
public class GetAcctPaymentHistoryMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "acct_payment_history")
    protected List<AcctPaymentHistoryReturnElement> acctPaymentHistory;
    
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

    public List<AcctPaymentHistoryReturnElement> getAcctPaymentHistory() {
        if (this.acctPaymentHistory == null) {
            this.acctPaymentHistory = new ArrayList<AcctPaymentHistoryReturnElement>();
        }
        return this.acctPaymentHistory;
    }
}
