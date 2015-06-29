package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "voidTransactions"})
@XmlRootElement(name = "void_invoice_mResponseElement")
public class VoidInvoiceMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "void_transactions")
    protected List<VoidTransactionsReturnElement> voidTransactions;
    
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

    public List<VoidTransactionsReturnElement> getVoidTransactions() {
        if (this.voidTransactions == null) {
            this.voidTransactions = new ArrayList<VoidTransactionsReturnElement>();
        }
        return this.voidTransactions;
    }
}
