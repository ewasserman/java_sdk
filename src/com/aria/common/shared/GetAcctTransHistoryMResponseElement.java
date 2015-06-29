package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"history", "errorCode", "errorMsg"})
@XmlRootElement(name = "get_acct_trans_history_mResponseElement")
public class GetAcctTransHistoryMResponseElement {

    @XmlElement(name = "history")
    protected List<HistoryReturnElement> history;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public List<HistoryReturnElement> getHistory() {
        if (this.history == null) {
            this.history = new ArrayList<HistoryReturnElement>();
        }
        return this.history;
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
