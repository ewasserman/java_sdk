package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invoice_hist_ReturnElement", propOrder = {"invoiceNo", "outacctNo", "outclientAcctId", "billingGroupNo", "clientBillingGroupId", "masterPlanNo", "masterPlanName", "currencyCd", "billDate", "paidDate", "amount", "credit", "recurringBillFrom", "recurringBillThru", "usageBillFrom", "usageBillThru", "isVoidedInd", "clientMasterPlanId", "invoiceTypeCd"})
public class InvoiceHistReturnElement {

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
    @XmlElement(name = "amount")
    protected Double amount;
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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double value) {
        this.amount = value;
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

    
}
