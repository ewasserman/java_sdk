package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "discount_rules_ReturnElement", propOrder = {"ruleNo", "ruleId", "description", "extDescription", "flatPercentInd", "amount", "currency"})
public class DiscountRulesReturnElement {

    @XmlElement(name = "rule_no")
    protected Long ruleNo;
    @XmlElement(name = "rule_id")
    protected String ruleId;
    @XmlElement(name = "description")
    protected String description;
    @XmlElement(name = "ext_description")
    protected String extDescription;
    @XmlElement(name = "flat_percent_ind")
    protected Long flatPercentInd;
    @XmlElement(name = "amount")
    protected Double amount;
    @XmlElement(name = "currency")
    protected String currency;
    
    public Long getRuleNo() {
        return ruleNo;
    }

    public void setRuleNo(Long value) {
        this.ruleNo = value;
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String value) {
        this.ruleId = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public String getExtDescription() {
        return extDescription;
    }

    public void setExtDescription(String value) {
        this.extDescription = value;
    }

    public Long getFlatPercentInd() {
        return flatPercentInd;
    }

    public void setFlatPercentInd(Long value) {
        this.flatPercentInd = value;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double value) {
        this.amount = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String value) {
        this.currency = value;
    }

    
}
