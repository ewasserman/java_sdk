package com.aria.common.shared.object;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invoice_details_m_ReturnElement", propOrder = {"invoiceNo", "acctNo", "userId", "clientAcctId", "amount", "billDate", "dueDate", "paidDate", "notifyDate", "fromDate", "toDate", "currencyCd", "balanceForward", "statementBalanceForward", "totalDue", "comments", "additionalComments", "lastUpdated", "ariaStatementNo", "acctStatementSeqStr", "secondAcctStatementSeqStr", "voidingEventNo", "customStatusLabel", "clientNotes", "invoiceTypeCd", "billingGroupNo", "clientBillingGroupId", "invoiceLineM"})
public class InvoiceDetailsMReturnElement {

    @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
    @XmlElement(name = "acct_no")
    protected Long acctNo;
    @XmlElement(name = "user_id")
    protected String userId;
    @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
    @XmlElement(name = "amount")
    protected Double amount;
    @XmlElement(name = "bill_date")
    protected String billDate;
    @XmlElement(name = "due_date")
    protected String dueDate;
    @XmlElement(name = "paid_date")
    protected String paidDate;
    @XmlElement(name = "notify_date")
    protected String notifyDate;
    @XmlElement(name = "from_date")
    protected String fromDate;
    @XmlElement(name = "to_date")
    protected String toDate;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "balance_forward")
    protected Double balanceForward;
    @XmlElement(name = "statement_balance_forward")
    protected Double statementBalanceForward;
    @XmlElement(name = "total_due")
    protected Double totalDue;
    @XmlElement(name = "comments")
    protected String comments;
    @XmlElement(name = "additional_comments")
    protected String additionalComments;
    @XmlElement(name = "last_updated")
    protected String lastUpdated;
    @XmlElement(name = "aria_statement_no")
    protected Long ariaStatementNo;
    @XmlElement(name = "acct_statement_seq_str")
    protected String acctStatementSeqStr;
    @XmlElement(name = "second_acct_statement_seq_str")
    protected String secondAcctStatementSeqStr;
    @XmlElement(name = "voiding_event_no")
    protected Long voidingEventNo;
    @XmlElement(name = "custom_status_label")
    protected String customStatusLabel;
    @XmlElement(name = "client_notes")
    protected String clientNotes;
    @XmlElement(name = "invoice_type_cd")
    protected String invoiceTypeCd;
    @XmlElement(name = "billing_group_no")
    protected Long billingGroupNo;
    @XmlElement(name = "client_billing_group_id")
    protected Long clientBillingGroupId;
    @XmlElement(name = "invoice_line_m")
    protected List<InvoiceLineMReturnElement> invoiceLineM;
    
    public Long getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Long value) {
        this.invoiceNo = value;
    }

    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String value) {
        this.userId = value;
    }

    public String getClientAcctId() {
        return clientAcctId;
    }

    public void setClientAcctId(String value) {
        this.clientAcctId = value;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double value) {
        this.amount = value;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String value) {
        this.billDate = value;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String value) {
        this.dueDate = value;
    }

    public String getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(String value) {
        this.paidDate = value;
    }

    public String getNotifyDate() {
        return notifyDate;
    }

    public void setNotifyDate(String value) {
        this.notifyDate = value;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String value) {
        this.fromDate = value;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String value) {
        this.toDate = value;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }

    public Double getBalanceForward() {
        return balanceForward;
    }

    public void setBalanceForward(Double value) {
        this.balanceForward = value;
    }

    public Double getStatementBalanceForward() {
        return statementBalanceForward;
    }

    public void setStatementBalanceForward(Double value) {
        this.statementBalanceForward = value;
    }

    public Double getTotalDue() {
        return totalDue;
    }

    public void setTotalDue(Double value) {
        this.totalDue = value;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String value) {
        this.comments = value;
    }

    public String getAdditionalComments() {
        return additionalComments;
    }

    public void setAdditionalComments(String value) {
        this.additionalComments = value;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String value) {
        this.lastUpdated = value;
    }

    public Long getAriaStatementNo() {
        return ariaStatementNo;
    }

    public void setAriaStatementNo(Long value) {
        this.ariaStatementNo = value;
    }

    public String getAcctStatementSeqStr() {
        return acctStatementSeqStr;
    }

    public void setAcctStatementSeqStr(String value) {
        this.acctStatementSeqStr = value;
    }

    public String getSecondAcctStatementSeqStr() {
        return secondAcctStatementSeqStr;
    }

    public void setSecondAcctStatementSeqStr(String value) {
        this.secondAcctStatementSeqStr = value;
    }

    public Long getVoidingEventNo() {
        return voidingEventNo;
    }

    public void setVoidingEventNo(Long value) {
        this.voidingEventNo = value;
    }

    public String getCustomStatusLabel() {
        return customStatusLabel;
    }

    public void setCustomStatusLabel(String value) {
        this.customStatusLabel = value;
    }

    public String getClientNotes() {
        return clientNotes;
    }

    public void setClientNotes(String value) {
        this.clientNotes = value;
    }

    public String getInvoiceTypeCd() {
        return invoiceTypeCd;
    }

    public void setInvoiceTypeCd(String value) {
        this.invoiceTypeCd = value;
    }

    public Long getBillingGroupNo() {
        return billingGroupNo;
    }

    public void setBillingGroupNo(Long value) {
        this.billingGroupNo = value;
    }

    public Long getClientBillingGroupId() {
        return clientBillingGroupId;
    }

    public void setClientBillingGroupId(Long value) {
        this.clientBillingGroupId = value;
    }

    public List<InvoiceLineMReturnElement> getInvoiceLineM() {
        if (this.invoiceLineM == null) {
            this.invoiceLineM = new ArrayList<InvoiceLineMReturnElement>();
        }
        return this.invoiceLineM;
    }
}
