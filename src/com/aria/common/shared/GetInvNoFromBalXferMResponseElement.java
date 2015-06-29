package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "invoiceNo", "outacctNo", "outclientAcctId", "billingGroupNo", "clientBillingGroupId"})
@XmlRootElement(name = "get_inv_no_from_bal_xfer_mResponseElement")
public class GetInvNoFromBalXferMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
    @XmlElement(name = "outacct_no")
    protected Long outacctNo;
    @XmlElement(name = "outclient_acct_id")
    protected String outclientAcctId;
    @XmlElement(name = "billing_group_no")
    protected Long billingGroupNo;
    @XmlElement(name = "client_billing_group_id")
    protected String clientBillingGroupId;
    
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

    public Long getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Long value) {
        this.invoiceNo = value;
    }

    public Long getOutacctNo() {
        return outacctNo;
    }

    public void setOutacctNo(Long value) {
        this.outacctNo = value;
    }

    public String getOutclientAcctId() {
        return outclientAcctId;
    }

    public void setOutclientAcctId(String value) {
        this.outclientAcctId = value;
    }

    public Long getBillingGroupNo() {
        return billingGroupNo;
    }

    public void setBillingGroupNo(Long value) {
        this.billingGroupNo = value;
    }

    public String getClientBillingGroupId() {
        return clientBillingGroupId;
    }

    public void setClientBillingGroupId(String value) {
        this.clientBillingGroupId = value;
    }

    
}
