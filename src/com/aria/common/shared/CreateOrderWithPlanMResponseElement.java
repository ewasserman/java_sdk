package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "orderNo", "invoiceNo", "transactionId", "invoicingErrorCode", "invoicingErrorMsg", "statementErrorCode", "statementErrorMsg", "procCvvResponse", "procAvsResponse", "procCavvResponse", "procStatusCode", "procStatusText", "procPaymentId", "procAuthCode", "procMerchComments", "totalChargesBeforeTax", "totalTaxCharges", "totalChargesAfterTax", "totalCredit", "cartInvLineItems", "thirdPartyErrors"})
@XmlRootElement(name = "create_order_with_plan_mResponseElement")
public class CreateOrderWithPlanMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "order_no")
    protected Long orderNo;
    @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
    @XmlElement(name = "transaction_id")
    protected Long transactionId;
    @XmlElement(name = "invoicing_error_code")
    protected Long invoicingErrorCode;
    @XmlElement(name = "invoicing_error_msg")
    protected String invoicingErrorMsg;
    @XmlElement(name = "statement_error_code")
    protected Long statementErrorCode;
    @XmlElement(name = "statement_error_msg")
    protected String statementErrorMsg;
    @XmlElement(name = "proc_cvv_response")
    protected String procCvvResponse;
    @XmlElement(name = "proc_avs_response")
    protected String procAvsResponse;
    @XmlElement(name = "proc_cavv_response")
    protected String procCavvResponse;
    @XmlElement(name = "proc_status_code")
    protected String procStatusCode;
    @XmlElement(name = "proc_status_text")
    protected String procStatusText;
    @XmlElement(name = "proc_payment_id")
    protected String procPaymentId;
    @XmlElement(name = "proc_auth_code")
    protected String procAuthCode;
    @XmlElement(name = "proc_merch_comments")
    protected String procMerchComments;
    @XmlElement(name = "total_charges_before_tax")
    protected Double totalChargesBeforeTax;
    @XmlElement(name = "total_tax_charges")
    protected Double totalTaxCharges;
    @XmlElement(name = "total_charges_after_tax")
    protected Double totalChargesAfterTax;
    @XmlElement(name = "total_credit")
    protected Double totalCredit;
    @XmlElement(name = "cart_inv_line_items")
    protected List<CartInvLineItemsReturnElement> cartInvLineItems;
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

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long value) {
        this.orderNo = value;
    }

    public Long getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Long value) {
        this.invoiceNo = value;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long value) {
        this.transactionId = value;
    }

    public Long getInvoicingErrorCode() {
        return invoicingErrorCode;
    }

    public void setInvoicingErrorCode(Long value) {
        this.invoicingErrorCode = value;
    }

    public String getInvoicingErrorMsg() {
        return invoicingErrorMsg;
    }

    public void setInvoicingErrorMsg(String value) {
        this.invoicingErrorMsg = value;
    }

    public Long getStatementErrorCode() {
        return statementErrorCode;
    }

    public void setStatementErrorCode(Long value) {
        this.statementErrorCode = value;
    }

    public String getStatementErrorMsg() {
        return statementErrorMsg;
    }

    public void setStatementErrorMsg(String value) {
        this.statementErrorMsg = value;
    }

    public String getProcCvvResponse() {
        return procCvvResponse;
    }

    public void setProcCvvResponse(String value) {
        this.procCvvResponse = value;
    }

    public String getProcAvsResponse() {
        return procAvsResponse;
    }

    public void setProcAvsResponse(String value) {
        this.procAvsResponse = value;
    }

    public String getProcCavvResponse() {
        return procCavvResponse;
    }

    public void setProcCavvResponse(String value) {
        this.procCavvResponse = value;
    }

    public String getProcStatusCode() {
        return procStatusCode;
    }

    public void setProcStatusCode(String value) {
        this.procStatusCode = value;
    }

    public String getProcStatusText() {
        return procStatusText;
    }

    public void setProcStatusText(String value) {
        this.procStatusText = value;
    }

    public String getProcPaymentId() {
        return procPaymentId;
    }

    public void setProcPaymentId(String value) {
        this.procPaymentId = value;
    }

    public String getProcAuthCode() {
        return procAuthCode;
    }

    public void setProcAuthCode(String value) {
        this.procAuthCode = value;
    }

    public String getProcMerchComments() {
        return procMerchComments;
    }

    public void setProcMerchComments(String value) {
        this.procMerchComments = value;
    }

    public Double getTotalChargesBeforeTax() {
        return totalChargesBeforeTax;
    }

    public void setTotalChargesBeforeTax(Double value) {
        this.totalChargesBeforeTax = value;
    }

    public Double getTotalTaxCharges() {
        return totalTaxCharges;
    }

    public void setTotalTaxCharges(Double value) {
        this.totalTaxCharges = value;
    }

    public Double getTotalChargesAfterTax() {
        return totalChargesAfterTax;
    }

    public void setTotalChargesAfterTax(Double value) {
        this.totalChargesAfterTax = value;
    }

    public Double getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(Double value) {
        this.totalCredit = value;
    }

    public List<CartInvLineItemsReturnElement> getCartInvLineItems() {
        if (this.cartInvLineItems == null) {
            this.cartInvLineItems = new ArrayList<CartInvLineItemsReturnElement>();
        }
        return this.cartInvLineItems;
    }public List<ThirdPartyErrorsReturnElement> getThirdPartyErrors() {
        if (this.thirdPartyErrors == null) {
            this.thirdPartyErrors = new ArrayList<ThirdPartyErrorsReturnElement>();
        }
        return this.thirdPartyErrors;
    }
}
