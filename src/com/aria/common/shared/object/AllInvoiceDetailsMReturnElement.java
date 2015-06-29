package com.aria.common.shared.object;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "all_invoice_details_m_ReturnElement", propOrder = {"invoiceNo", "acctNo", "userId", "clientAcctId", "invoiceType", "fromDate", "toDate", "usageBillFromDate", "usageBillThruDate", "taxedEmail", "taxedFirstName", "taxedMiddleInitial", "taxedLastName", "taxedAddress1", "taxedAddress2", "taxedAddress3", "taxedCity", "taxedState", "taxedLocality", "taxedZip", "taxedCountry", "amount", "billDate", "dueDate", "paidDate", "notifyDate", "currencyCd", "balanceForward", "statementBalanceForward", "totalDue", "comments", "additionalComments", "lastUpdated", "ariaStatementNo", "acctStatementSeqStr", "secondAcctStatementSeqStr", "invoiceLineItems", "voidingEventNo", "billCompanyName", "payMethodType", "payMethodName", "customStatusLabel", "clientNotes", "billingGroupNo", "clientBillingGroupId", "allInvoiceLineM"})
public class AllInvoiceDetailsMReturnElement {

    @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
    @XmlElement(name = "acct_no")
    protected Long acctNo;
    @XmlElement(name = "user_id")
    protected String userId;
    @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
    @XmlElement(name = "invoice_type")
    protected String invoiceType;
    @XmlElement(name = "from_date")
    protected String fromDate;
    @XmlElement(name = "to_date")
    protected String toDate;
    @XmlElement(name = "usage_bill_from_date")
    protected String usageBillFromDate;
    @XmlElement(name = "usage_bill_thru_date")
    protected String usageBillThruDate;
    @XmlElement(name = "taxed_email")
    protected String taxedEmail;
    @XmlElement(name = "taxed_first_name")
    protected String taxedFirstName;
    @XmlElement(name = "taxed_middle_initial")
    protected String taxedMiddleInitial;
    @XmlElement(name = "taxed_last_name")
    protected String taxedLastName;
    @XmlElement(name = "taxed_address1")
    protected String taxedAddress1;
    @XmlElement(name = "taxed_address2")
    protected String taxedAddress2;
    @XmlElement(name = "taxed_address3")
    protected String taxedAddress3;
    @XmlElement(name = "taxed_city")
    protected String taxedCity;
    @XmlElement(name = "taxed_state")
    protected String taxedState;
    @XmlElement(name = "taxed_locality")
    protected String taxedLocality;
    @XmlElement(name = "taxed_zip")
    protected String taxedZip;
    @XmlElement(name = "taxed_country")
    protected String taxedCountry;
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
    @XmlElement(name = "invoice_line_items")
    protected String invoiceLineItems;
    @XmlElement(name = "voiding_event_no")
    protected Long voidingEventNo;
    @XmlElement(name = "bill_company_name")
    protected String billCompanyName;
    @XmlElement(name = "pay_method_type")
    protected Long payMethodType;
    @XmlElement(name = "pay_method_name")
    protected String payMethodName;
    @XmlElement(name = "custom_status_label")
    protected String customStatusLabel;
    @XmlElement(name = "client_notes")
    protected String clientNotes;
    @XmlElement(name = "billing_group_no")
    protected Long billingGroupNo;
    @XmlElement(name = "client_billing_group_id")
    protected Long clientBillingGroupId;
    @XmlElement(name = "all_invoice_line_m")
    protected List<AllInvoiceLineMReturnElement> allInvoiceLineM;
    
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

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String value) {
        this.invoiceType = value;
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

    public String getUsageBillFromDate() {
        return usageBillFromDate;
    }

    public void setUsageBillFromDate(String value) {
        this.usageBillFromDate = value;
    }

    public String getUsageBillThruDate() {
        return usageBillThruDate;
    }

    public void setUsageBillThruDate(String value) {
        this.usageBillThruDate = value;
    }

    public String getTaxedEmail() {
        return taxedEmail;
    }

    public void setTaxedEmail(String value) {
        this.taxedEmail = value;
    }

    public String getTaxedFirstName() {
        return taxedFirstName;
    }

    public void setTaxedFirstName(String value) {
        this.taxedFirstName = value;
    }

    public String getTaxedMiddleInitial() {
        return taxedMiddleInitial;
    }

    public void setTaxedMiddleInitial(String value) {
        this.taxedMiddleInitial = value;
    }

    public String getTaxedLastName() {
        return taxedLastName;
    }

    public void setTaxedLastName(String value) {
        this.taxedLastName = value;
    }

    public String getTaxedAddress1() {
        return taxedAddress1;
    }

    public void setTaxedAddress1(String value) {
        this.taxedAddress1 = value;
    }

    public String getTaxedAddress2() {
        return taxedAddress2;
    }

    public void setTaxedAddress2(String value) {
        this.taxedAddress2 = value;
    }

    public String getTaxedAddress3() {
        return taxedAddress3;
    }

    public void setTaxedAddress3(String value) {
        this.taxedAddress3 = value;
    }

    public String getTaxedCity() {
        return taxedCity;
    }

    public void setTaxedCity(String value) {
        this.taxedCity = value;
    }

    public String getTaxedState() {
        return taxedState;
    }

    public void setTaxedState(String value) {
        this.taxedState = value;
    }

    public String getTaxedLocality() {
        return taxedLocality;
    }

    public void setTaxedLocality(String value) {
        this.taxedLocality = value;
    }

    public String getTaxedZip() {
        return taxedZip;
    }

    public void setTaxedZip(String value) {
        this.taxedZip = value;
    }

    public String getTaxedCountry() {
        return taxedCountry;
    }

    public void setTaxedCountry(String value) {
        this.taxedCountry = value;
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

    public String getInvoiceLineItems() {
        return invoiceLineItems;
    }

    public void setInvoiceLineItems(String value) {
        this.invoiceLineItems = value;
    }

    public Long getVoidingEventNo() {
        return voidingEventNo;
    }

    public void setVoidingEventNo(Long value) {
        this.voidingEventNo = value;
    }

    public String getBillCompanyName() {
        return billCompanyName;
    }

    public void setBillCompanyName(String value) {
        this.billCompanyName = value;
    }

    public Long getPayMethodType() {
        return payMethodType;
    }

    public void setPayMethodType(Long value) {
        this.payMethodType = value;
    }

    public String getPayMethodName() {
        return payMethodName;
    }

    public void setPayMethodName(String value) {
        this.payMethodName = value;
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

    public List<AllInvoiceLineMReturnElement> getAllInvoiceLineM() {
        if (this.allInvoiceLineM == null) {
            this.allInvoiceLineM = new ArrayList<AllInvoiceLineMReturnElement>();
        }
        return this.allInvoiceLineM;
    }
}
