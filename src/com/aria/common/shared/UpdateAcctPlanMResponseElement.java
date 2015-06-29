package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "prorationResultAmount", "collectionErrorCode", "collectionErrorMsg", "statementErrorCode", "statementErrorMsg", "procCvvResponse", "procAvsResponse", "procCavvResponse", "procStatusCode", "procStatusText", "procPaymentId", "procAuthCode", "procMerchComments", "invoiceNo", "expectdActivationFee", "expectdMthlyRecurringCost", "expectdAnnuRecurringCost", "acctPlanLineItems", "totalChargesBeforeTax", "totalTaxCharges", "totalChargesAfterTax", "totalCredit", "totalTaxCredit", "totalCreditBeforeTax", "total", "prorationTaxAmount", "prorationCreditResultAmount", "prorationCreditAmount"})
@XmlRootElement(name = "update_acct_plan_mResponseElement")
public class UpdateAcctPlanMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "proration_result_amount")
    protected Double prorationResultAmount;
    @XmlElement(name = "collection_error_code")
    protected Long collectionErrorCode;
    @XmlElement(name = "collection_error_msg")
    protected String collectionErrorMsg;
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
    @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
    @XmlElement(name = "expectd_activation_fee")
    protected Double expectdActivationFee;
    @XmlElement(name = "expectd_mthly_recurring_cost")
    protected Double expectdMthlyRecurringCost;
    @XmlElement(name = "expectd_annu_recurring_cost")
    protected Double expectdAnnuRecurringCost;
    @XmlElement(name = "acct_plan_line_items")
    protected List<AcctPlanLineItemsReturnElement> acctPlanLineItems;
    @XmlElement(name = "total_charges_before_tax")
    protected Double totalChargesBeforeTax;
    @XmlElement(name = "total_tax_charges")
    protected Double totalTaxCharges;
    @XmlElement(name = "total_charges_after_tax")
    protected Double totalChargesAfterTax;
    @XmlElement(name = "total_credit")
    protected Double totalCredit;
    @XmlElement(name = "total_tax_credit")
    protected Double totalTaxCredit;
    @XmlElement(name = "total_credit_before_tax")
    protected Double totalCreditBeforeTax;
    @XmlElement(name = "total")
    protected Double total;
    @XmlElement(name = "proration_tax_amount")
    protected Double prorationTaxAmount;
    @XmlElement(name = "proration_credit_result_amount")
    protected Double prorationCreditResultAmount;
    @XmlElement(name = "proration_credit_amount")
    protected Double prorationCreditAmount;
    
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

    public Double getProrationResultAmount() {
        return prorationResultAmount;
    }

    public void setProrationResultAmount(Double value) {
        this.prorationResultAmount = value;
    }

    public Long getCollectionErrorCode() {
        return collectionErrorCode;
    }

    public void setCollectionErrorCode(Long value) {
        this.collectionErrorCode = value;
    }

    public String getCollectionErrorMsg() {
        return collectionErrorMsg;
    }

    public void setCollectionErrorMsg(String value) {
        this.collectionErrorMsg = value;
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

    public Long getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Long value) {
        this.invoiceNo = value;
    }

    public Double getExpectdActivationFee() {
        return expectdActivationFee;
    }

    public void setExpectdActivationFee(Double value) {
        this.expectdActivationFee = value;
    }

    public Double getExpectdMthlyRecurringCost() {
        return expectdMthlyRecurringCost;
    }

    public void setExpectdMthlyRecurringCost(Double value) {
        this.expectdMthlyRecurringCost = value;
    }

    public Double getExpectdAnnuRecurringCost() {
        return expectdAnnuRecurringCost;
    }

    public void setExpectdAnnuRecurringCost(Double value) {
        this.expectdAnnuRecurringCost = value;
    }

    public List<AcctPlanLineItemsReturnElement> getAcctPlanLineItems() {
        if (this.acctPlanLineItems == null) {
            this.acctPlanLineItems = new ArrayList<AcctPlanLineItemsReturnElement>();
        }
        return this.acctPlanLineItems;
    }public Double getTotalChargesBeforeTax() {
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

    public Double getTotalTaxCredit() {
        return totalTaxCredit;
    }

    public void setTotalTaxCredit(Double value) {
        this.totalTaxCredit = value;
    }

    public Double getTotalCreditBeforeTax() {
        return totalCreditBeforeTax;
    }

    public void setTotalCreditBeforeTax(Double value) {
        this.totalCreditBeforeTax = value;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double value) {
        this.total = value;
    }

    public Double getProrationTaxAmount() {
        return prorationTaxAmount;
    }

    public void setProrationTaxAmount(Double value) {
        this.prorationTaxAmount = value;
    }

    public Double getProrationCreditResultAmount() {
        return prorationCreditResultAmount;
    }

    public void setProrationCreditResultAmount(Double value) {
        this.prorationCreditResultAmount = value;
    }

    public Double getProrationCreditAmount() {
        return prorationCreditAmount;
    }

    public void setProrationCreditAmount(Double value) {
        this.prorationCreditAmount = value;
    }

    
}
