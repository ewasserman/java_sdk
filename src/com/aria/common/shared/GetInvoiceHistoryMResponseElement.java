package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "invoiceHist"})
@XmlRootElement(name = "get_invoice_history_mResponseElement")
public class GetInvoiceHistoryMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "invoice_hist")
    protected List<InvoiceHistReturnElement> invoiceHist;
    
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

    public List<InvoiceHistReturnElement> getInvoiceHist() {
        if (this.invoiceHist == null) {
            this.invoiceHist = new ArrayList<InvoiceHistReturnElement>();
        }
        return this.invoiceHist;
    }
}
