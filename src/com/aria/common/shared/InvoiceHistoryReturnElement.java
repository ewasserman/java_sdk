package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invoice_history_ReturnElement", propOrder = {"invoiceNo", "masterPlanNo", "masterPlanName", "currencyCd", "billDate", "paidDate", "debit", "credit", "recurringBillFrom", "recurringBillThru", "usageBillFrom", "usageBillThru", "isVoidedInd", "clientMasterPlanId", "invoiceTypeCd", "postingStatusCd", "postingUser", "postingDate"})
public class InvoiceHistoryReturnElement {

    @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
    @XmlElement(name = "master_plan_no")
    protected Long masterPlanNo;
    @XmlElement(name = "master_plan_name")
    protected String masterPlanName;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "bill_date")
    protected String billDate;
    @XmlElement(name = "paid_date")
    protected String paidDate;
    @XmlElement(name = "debit")
    protected Double debit;
    @XmlElement(name = "credit")
    protected Double credit;
    @XmlElement(name = "recurring_bill_from")
    protected String recurringBillFrom;
    @XmlElement(name = "recurring_bill_thru")
    protected String recurringBillThru;
    @XmlElement(name = "usage_bill_from")
    protected String usageBillFrom;
    @XmlElement(name = "usage_bill_thru")
    protected String usageBillThru;
    @XmlElement(name = "is_voided_ind")
    protected Long isVoidedInd;
    @XmlElement(name = "client_master_plan_id")
    protected String clientMasterPlanId;
    @XmlElement(name = "invoice_type_cd")
    protected String invoiceTypeCd;
    @XmlElement(name = "posting_status_cd")
    protected Long postingStatusCd;
    @XmlElement(name = "posting_user")
    protected String postingUser;
    @XmlElement(name = "posting_date")
    protected String postingDate;
    
    public Long getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Long value) {
        this.invoiceNo = value;
    }

    public Long getMasterPlanNo() {
        return masterPlanNo;
    }

    public void setMasterPlanNo(Long value) {
        this.masterPlanNo = value;
    }

    public String getMasterPlanName() {
        return masterPlanName;
    }

    public void setMasterPlanName(String value) {
        this.masterPlanName = value;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String value) {
        this.billDate = value;
    }

    public String getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(String value) {
        this.paidDate = value;
    }

    public Double getDebit() {
        return debit;
    }

    public void setDebit(Double value) {
        this.debit = value;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double value) {
        this.credit = value;
    }

    public String getRecurringBillFrom() {
        return recurringBillFrom;
    }

    public void setRecurringBillFrom(String value) {
        this.recurringBillFrom = value;
    }

    public String getRecurringBillThru() {
        return recurringBillThru;
    }

    public void setRecurringBillThru(String value) {
        this.recurringBillThru = value;
    }

    public String getUsageBillFrom() {
        return usageBillFrom;
    }

    public void setUsageBillFrom(String value) {
        this.usageBillFrom = value;
    }

    public String getUsageBillThru() {
        return usageBillThru;
    }

    public void setUsageBillThru(String value) {
        this.usageBillThru = value;
    }

    public Long getIsVoidedInd() {
        return isVoidedInd;
    }

    public void setIsVoidedInd(Long value) {
        this.isVoidedInd = value;
    }

    public String getClientMasterPlanId() {
        return clientMasterPlanId;
    }

    public void setClientMasterPlanId(String value) {
        this.clientMasterPlanId = value;
    }

    public String getInvoiceTypeCd() {
        return invoiceTypeCd;
    }

    public void setInvoiceTypeCd(String value) {
        this.invoiceTypeCd = value;
    }

    public Long getPostingStatusCd() {
        return postingStatusCd;
    }

    public void setPostingStatusCd(Long value) {
        this.postingStatusCd = value;
    }

    public String getPostingUser() {
        return postingUser;
    }

    public void setPostingUser(String value) {
        this.postingUser = value;
    }

    public String getPostingDate() {
        return postingDate;
    }

    public void setPostingDate(String value) {
        this.postingDate = value;
    }

    
}
