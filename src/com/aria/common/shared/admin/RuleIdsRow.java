package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rule_ids_row", propOrder = {
    "rule",
    "ruleId"
    })
public class RuleIdsRow {

    @XmlElement(name = "rule")
    protected String rule;
    @XmlElement(name = "rule_id")
    protected String ruleId;
    public String getRule() {
        return rule;
    }

    public void setRule(String value) {
        this.rule = value;
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String value) {
        this.ruleId = value;
    }

    
}
