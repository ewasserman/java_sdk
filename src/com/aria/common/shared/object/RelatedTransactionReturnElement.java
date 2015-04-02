package com.aria.common.shared.object;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "related_transaction_ReturnElement", propOrder = {"ariaEventNo", "transactionDate", "transactionType", "transactionTypeNo", "isChargeType", "typeSpecificId", "acctNo", "amount", "currencyCd", "ariaStatementNo", "totalAmountApplied", "relatedAmountApplied", "updateDate", "voidDate", "fullyAppliedDate", "masterPlanInstanceNo"})
public class RelatedTransactionReturnElement {

    @XmlElement(name = "aria_event_no")
    protected Long ariaEventNo;
    @XmlElement(name = "transaction_date")
    protected String transactionDate;
    @XmlElement(name = "transaction_type")
    protected String transactionType;
    @XmlElement(name = "transaction_type_no")
    protected Long transactionTypeNo;
    @XmlElement(name = "is_charge_type")
    protected Long isChargeType;
    @XmlElement(name = "type_specific_id")
    protected Long typeSpecificId;
    @XmlElement(name = "acct_no")
    protected Long acctNo;
    @XmlElement(name = "amount")
    protected Double amount;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "aria_statement_no")
    protected Long ariaStatementNo;
    @XmlElement(name = "total_amount_applied")
    protected Double totalAmountApplied;
    @XmlElement(name = "related_amount_applied")
    protected Double relatedAmountApplied;
    @XmlElement(name = "update_date")
    protected String updateDate;
    @XmlElement(name = "void_date")
    protected String voidDate;
    @XmlElement(name = "fully_applied_date")
    protected String fullyAppliedDate;
    @XmlElement(name = "master_plan_instance_no")
    protected Long masterPlanInstanceNo;
    
    public Long getAriaEventNo() {
        return ariaEventNo;
    }

    public void setAriaEventNo(Long value) {
        this.ariaEventNo = value;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String value) {
        this.transactionDate = value;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    public Long getTransactionTypeNo() {
        return transactionTypeNo;
    }

    public void setTransactionTypeNo(Long value) {
        this.transactionTypeNo = value;
    }

    public Long getIsChargeType() {
        return isChargeType;
    }

    public void setIsChargeType(Long value) {
        this.isChargeType = value;
    }

    public Long getTypeSpecificId() {
        return typeSpecificId;
    }

    public void setTypeSpecificId(Long value) {
        this.typeSpecificId = value;
    }

    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double value) {
        this.amount = value;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }

    public Long getAriaStatementNo() {
        return ariaStatementNo;
    }

    public void setAriaStatementNo(Long value) {
        this.ariaStatementNo = value;
    }

    public Double getTotalAmountApplied() {
        return totalAmountApplied;
    }

    public void setTotalAmountApplied(Double value) {
        this.totalAmountApplied = value;
    }

    public Double getRelatedAmountApplied() {
        return relatedAmountApplied;
    }

    public void setRelatedAmountApplied(Double value) {
        this.relatedAmountApplied = value;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String value) {
        this.updateDate = value;
    }

    public String getVoidDate() {
        return voidDate;
    }

    public void setVoidDate(String value) {
        this.voidDate = value;
    }

    public String getFullyAppliedDate() {
        return fullyAppliedDate;
    }

    public void setFullyAppliedDate(String value) {
        this.fullyAppliedDate = value;
    }

    public Long getMasterPlanInstanceNo() {
        return masterPlanInstanceNo;
    }

    public void setMasterPlanInstanceNo(Long value) {
        this.masterPlanInstanceNo = value;
    }

    
}
