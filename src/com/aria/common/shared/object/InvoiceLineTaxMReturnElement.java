package com.aria.common.shared.object;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invoice_line_tax_m_ReturnElement", propOrder = {"taxId", "amount", "beforeCreditAmount", "jurisdiction", "description", "isExcluded"})
public class InvoiceLineTaxMReturnElement {

    @XmlElement(name = "tax_id")
    protected Long taxId;
    @XmlElement(name = "amount")
    protected Double amount;
    @XmlElement(name = "before_credit_amount")
    protected Double beforeCreditAmount;
    @XmlElement(name = "jurisdiction")
    protected String jurisdiction;
    @XmlElement(name = "description")
    protected String description;
    @XmlElement(name = "is_excluded")
    protected Long isExcluded;
    
    public Long getTaxId() {
        return taxId;
    }

    public void setTaxId(Long value) {
        this.taxId = value;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double value) {
        this.amount = value;
    }

    public Double getBeforeCreditAmount() {
        return beforeCreditAmount;
    }

    public void setBeforeCreditAmount(Double value) {
        this.beforeCreditAmount = value;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String value) {
        this.jurisdiction = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public Long getIsExcluded() {
        return isExcluded;
    }

    public void setIsExcluded(Long value) {
        this.isExcluded = value;
    }

    
}
