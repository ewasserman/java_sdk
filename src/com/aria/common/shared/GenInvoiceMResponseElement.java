package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "invoiceNo", "outAcctNo", "outClientAcctId", "outBillingGroupNo", "outClientBillingGroupId", "thirdPartyErrors"})
@XmlRootElement(name = "gen_invoice_mResponseElement")
public class GenInvoiceMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
    @XmlElement(name = "out_acct_no")
    protected Long outAcctNo;
    @XmlElement(name = "out_client_acct_id")
    protected String outClientAcctId;
    @XmlElement(name = "out_billing_group_no")
    protected Long outBillingGroupNo;
    @XmlElement(name = "out_client_billing_group_id")
    protected String outClientBillingGroupId;
    @XmlElement(name = "third_party_errors")
    protected List<ThirdPartyErrorsReturnElement> thirdPartyErrors;
    
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

    public Long getOutAcctNo() {
        return outAcctNo;
    }

    public void setOutAcctNo(Long value) {
        this.outAcctNo = value;
    }

    public String getOutClientAcctId() {
        return outClientAcctId;
    }

    public void setOutClientAcctId(String value) {
        this.outClientAcctId = value;
    }

    public Long getOutBillingGroupNo() {
        return outBillingGroupNo;
    }

    public void setOutBillingGroupNo(Long value) {
        this.outBillingGroupNo = value;
    }

    public String getOutClientBillingGroupId() {
        return outClientBillingGroupId;
    }

    public void setOutClientBillingGroupId(String value) {
        this.outClientBillingGroupId = value;
    }

    public List<ThirdPartyErrorsReturnElement> getThirdPartyErrors() {
        if (this.thirdPartyErrors == null) {
            this.thirdPartyErrors = new ArrayList<ThirdPartyErrorsReturnElement>();
        }
        return this.thirdPartyErrors;
    }
}
