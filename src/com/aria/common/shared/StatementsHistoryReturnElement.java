package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statements_history_ReturnElement", propOrder = {"statementNo", "createDate", "currencyCd", "dueDate", "dueDatePlusGracePeriod", "newChargesAmount", "newPaymentsAmount", "balanceForwardAmount", "totalAmount", "isPaidInd", "invoiceActivityInd", "seqStatementId", "statementMasterPlanInstances"})
public class StatementsHistoryReturnElement {

    @XmlElement(name = "statement_no")
    protected Long statementNo;
    @XmlElement(name = "create_date")
    protected String createDate;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "due_date")
    protected String dueDate;
    @XmlElement(name = "due_date_plus_grace_period")
    protected String dueDatePlusGracePeriod;
    @XmlElement(name = "new_charges_amount")
    protected Double newChargesAmount;
    @XmlElement(name = "new_payments_amount")
    protected Double newPaymentsAmount;
    @XmlElement(name = "balance_forward_amount")
    protected Double balanceForwardAmount;
    @XmlElement(name = "total_amount")
    protected Double totalAmount;
    @XmlElement(name = "is_paid_ind")
    protected Long isPaidInd;
    @XmlElement(name = "invoice_activity_ind")
    protected Long invoiceActivityInd;
    @XmlElement(name = "seq_statement_id")
    protected String seqStatementId;
    @XmlElement(name = "statement_master_plan_instances")
    protected List<StatementMasterPlanInstancesReturnElement> statementMasterPlanInstances;
    
    public Long getStatementNo() {
        return statementNo;
    }

    public void setStatementNo(Long value) {
        this.statementNo = value;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String value) {
        this.createDate = value;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String value) {
        this.dueDate = value;
    }

    public String getDueDatePlusGracePeriod() {
        return dueDatePlusGracePeriod;
    }

    public void setDueDatePlusGracePeriod(String value) {
        this.dueDatePlusGracePeriod = value;
    }

    public Double getNewChargesAmount() {
        return newChargesAmount;
    }

    public void setNewChargesAmount(Double value) {
        this.newChargesAmount = value;
    }

    public Double getNewPaymentsAmount() {
        return newPaymentsAmount;
    }

    public void setNewPaymentsAmount(Double value) {
        this.newPaymentsAmount = value;
    }

    public Double getBalanceForwardAmount() {
        return balanceForwardAmount;
    }

    public void setBalanceForwardAmount(Double value) {
        this.balanceForwardAmount = value;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double value) {
        this.totalAmount = value;
    }

    public Long getIsPaidInd() {
        return isPaidInd;
    }

    public void setIsPaidInd(Long value) {
        this.isPaidInd = value;
    }

    public Long getInvoiceActivityInd() {
        return invoiceActivityInd;
    }

    public void setInvoiceActivityInd(Long value) {
        this.invoiceActivityInd = value;
    }

    public String getSeqStatementId() {
        return seqStatementId;
    }

    public void setSeqStatementId(String value) {
        this.seqStatementId = value;
    }

    public List<StatementMasterPlanInstancesReturnElement> getStatementMasterPlanInstances() {
        if (this.statementMasterPlanInstances == null) {
            this.statementMasterPlanInstances = new ArrayList<StatementMasterPlanInstancesReturnElement>();
        }
        return this.statementMasterPlanInstances;
    }
}
