package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fam_transactions_ReturnElement", propOrder = {"acctNo", "masterPlanInstanceNo", "clientMasterPlanInstanceId", "transactionId", "transactionType", "transactionDesc", "transactionAmt", "transactionAppliedAmt", "transactionCurrency", "transactionCreateDate", "transactionVoidDate", "transactionStmtNo", "transactionVoidReason", "clientReceiptId", "transactionComments", "transactionSourceId", "transactionRefCode", "creditReasonCodeDescription", "csrComments", "transactionSeqStmtId"})
public class FamTransactionsReturnElement {

    @XmlElement(name = "acct_no")
    protected Long acctNo;
    @XmlElement(name = "master_plan_instance_no")
    protected Long masterPlanInstanceNo;
    @XmlElement(name = "client_master_plan_instance_id")
    protected String clientMasterPlanInstanceId;
    @XmlElement(name = "transaction_id")
    protected Long transactionId;
    @XmlElement(name = "transaction_type")
    protected Long transactionType;
    @XmlElement(name = "transaction_desc")
    protected String transactionDesc;
    @XmlElement(name = "transaction_amt")
    protected Double transactionAmt;
    @XmlElement(name = "transaction_applied_amt")
    protected Double transactionAppliedAmt;
    @XmlElement(name = "transaction_currency")
    protected String transactionCurrency;
    @XmlElement(name = "transaction_create_date")
    protected String transactionCreateDate;
    @XmlElement(name = "transaction_void_date")
    protected String transactionVoidDate;
    @XmlElement(name = "transaction_stmt_no")
    protected Long transactionStmtNo;
    @XmlElement(name = "transaction_void_reason")
    protected String transactionVoidReason;
    @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
    @XmlElement(name = "transaction_comments")
    protected String transactionComments;
    @XmlElement(name = "transaction_source_id")
    protected Long transactionSourceId;
    @XmlElement(name = "transaction_ref_code")
    protected String transactionRefCode;
    @XmlElement(name = "credit_reason_code_description")
    protected String creditReasonCodeDescription;
    @XmlElement(name = "csr_comments")
    protected String csrComments;
    @XmlElement(name = "transaction_seq_stmt_id")
    protected String transactionSeqStmtId;
    
    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }

    public Long getMasterPlanInstanceNo() {
        return masterPlanInstanceNo;
    }

    public void setMasterPlanInstanceNo(Long value) {
        this.masterPlanInstanceNo = value;
    }

    public String getClientMasterPlanInstanceId() {
        return clientMasterPlanInstanceId;
    }

    public void setClientMasterPlanInstanceId(String value) {
        this.clientMasterPlanInstanceId = value;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long value) {
        this.transactionId = value;
    }

    public Long getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(Long value) {
        this.transactionType = value;
    }

    public String getTransactionDesc() {
        return transactionDesc;
    }

    public void setTransactionDesc(String value) {
        this.transactionDesc = value;
    }

    public Double getTransactionAmt() {
        return transactionAmt;
    }

    public void setTransactionAmt(Double value) {
        this.transactionAmt = value;
    }

    public Double getTransactionAppliedAmt() {
        return transactionAppliedAmt;
    }

    public void setTransactionAppliedAmt(Double value) {
        this.transactionAppliedAmt = value;
    }

    public String getTransactionCurrency() {
        return transactionCurrency;
    }

    public void setTransactionCurrency(String value) {
        this.transactionCurrency = value;
    }

    public String getTransactionCreateDate() {
        return transactionCreateDate;
    }

    public void setTransactionCreateDate(String value) {
        this.transactionCreateDate = value;
    }

    public String getTransactionVoidDate() {
        return transactionVoidDate;
    }

    public void setTransactionVoidDate(String value) {
        this.transactionVoidDate = value;
    }

    public Long getTransactionStmtNo() {
        return transactionStmtNo;
    }

    public void setTransactionStmtNo(Long value) {
        this.transactionStmtNo = value;
    }

    public String getTransactionVoidReason() {
        return transactionVoidReason;
    }

    public void setTransactionVoidReason(String value) {
        this.transactionVoidReason = value;
    }

    public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
    }

    public String getTransactionComments() {
        return transactionComments;
    }

    public void setTransactionComments(String value) {
        this.transactionComments = value;
    }

    public Long getTransactionSourceId() {
        return transactionSourceId;
    }

    public void setTransactionSourceId(Long value) {
        this.transactionSourceId = value;
    }

    public String getTransactionRefCode() {
        return transactionRefCode;
    }

    public void setTransactionRefCode(String value) {
        this.transactionRefCode = value;
    }

    public String getCreditReasonCodeDescription() {
        return creditReasonCodeDescription;
    }

    public void setCreditReasonCodeDescription(String value) {
        this.creditReasonCodeDescription = value;
    }

    public String getCsrComments() {
        return csrComments;
    }

    public void setCsrComments(String value) {
        this.csrComments = value;
    }

    public String getTransactionSeqStmtId() {
        return transactionSeqStmtId;
    }

    public void setTransactionSeqStmtId(String value) {
        this.transactionSeqStmtId = value;
    }

    
}
