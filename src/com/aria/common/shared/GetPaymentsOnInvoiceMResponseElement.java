package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "invoicePayments"})
@XmlRootElement(name = "get_payments_on_invoice_mResponseElement")
public class GetPaymentsOnInvoiceMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "invoice_payments")
    protected List<InvoicePaymentsReturnElement> invoicePayments;
    
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

    public List<InvoicePaymentsReturnElement> getInvoicePayments() {
        if (this.invoicePayments == null) {
            this.invoicePayments = new ArrayList<InvoicePaymentsReturnElement>();
        }
        return this.invoicePayments;
    }
}
