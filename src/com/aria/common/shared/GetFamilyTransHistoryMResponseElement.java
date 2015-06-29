package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "famTransactions"})
@XmlRootElement(name = "get_family_trans_history_mResponseElement")
public class GetFamilyTransHistoryMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "fam_transactions")
    protected List<FamTransactionsReturnElement> famTransactions;
    
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

    public List<FamTransactionsReturnElement> getFamTransactions() {
        if (this.famTransactions == null) {
            this.famTransactions = new ArrayList<FamTransactionsReturnElement>();
        }
        return this.famTransactions;
    }
}
