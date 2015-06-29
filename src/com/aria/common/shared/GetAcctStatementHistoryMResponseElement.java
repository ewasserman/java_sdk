package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "statementsHistory"})
@XmlRootElement(name = "get_acct_statement_history_mResponseElement")
public class GetAcctStatementHistoryMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "statements_history")
    protected List<StatementsHistoryReturnElement> statementsHistory;
    
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

    public List<StatementsHistoryReturnElement> getStatementsHistory() {
        if (this.statementsHistory == null) {
            this.statementsHistory = new ArrayList<StatementsHistoryReturnElement>();
        }
        return this.statementsHistory;
    }
}
