package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "forcePending",    "clientReceiptId",    "altBillDay",    "invoiceMode"})
@XmlRootElement(name = "gen_invoice")
public class GenInvoice {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "force_pending")
    protected String forcePending;
        @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
        @XmlElement(name = "alt_bill_day")
    protected Long altBillDay;
        @XmlElement(name = "invoice_mode")
    protected Long invoiceMode;
    
    public long getClientNo() {
        return clientNo;
    }

    public void setClientNo(Long value) {
        this.clientNo = value;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String value) {
        this.authKey = value;
    }

    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }
            public String getForcePending() {
        return forcePending;
    }

    public void setForcePending(String value) {
        this.forcePending = value;
    }
            public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
    }
            public Long getAltBillDay() {
        return altBillDay;
    }

    public void setAltBillDay(Long value) {
        this.altBillDay = value;
    }
            public Long getInvoiceMode() {
        return invoiceMode;
    }

    public void setInvoiceMode(Long value) {
        this.invoiceMode = value;
    }
            
}
