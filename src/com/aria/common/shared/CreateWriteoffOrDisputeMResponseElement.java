package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "writeoffTransactions"})
@XmlRootElement(name = "create_writeoff_or_dispute_mResponseElement")
public class CreateWriteoffOrDisputeMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "writeoff_transactions")
    protected List<WriteoffTransactionsReturnElement> writeoffTransactions;
    
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

    public List<WriteoffTransactionsReturnElement> getWriteoffTransactions() {
        if (this.writeoffTransactions == null) {
            this.writeoffTransactions = new ArrayList<WriteoffTransactionsReturnElement>();
        }
        return this.writeoffTransactions;
    }
}
