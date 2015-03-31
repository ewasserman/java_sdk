package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "discount_bundles_ReturnElement", propOrder = {"bundleNo", "bundleName", "bundleId", "description", "allowOverlapInd", "rules", "ruleIds"})
public class DiscountBundlesReturnElement {

    @XmlElement(name = "bundle_no")
    protected Long bundleNo;
    @XmlElement(name = "bundle_name")
    protected String bundleName;
    @XmlElement(name = "bundle_id")
    protected String bundleId;
    @XmlElement(name = "description")
    protected String description;
    @XmlElement(name = "allow_overlap_ind")
    protected String allowOverlapInd;
    @XmlElement(name = "rules")
    protected List<RulesReturnElement> rules;
    @XmlElement(name = "rule_ids")
    protected List<RuleIdsReturnElement> ruleIds;
    
    public Long getBundleNo() {
        return bundleNo;
    }

    public void setBundleNo(Long value) {
        this.bundleNo = value;
    }

    public String getBundleName() {
        return bundleName;
    }

    public void setBundleName(String value) {
        this.bundleName = value;
    }

    public String getBundleId() {
        return bundleId;
    }

    public void setBundleId(String value) {
        this.bundleId = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public String getAllowOverlapInd() {
        return allowOverlapInd;
    }

    public void setAllowOverlapInd(String value) {
        this.allowOverlapInd = value;
    }

    public List<RulesReturnElement> getRules() {
        if (this.rules == null) {
            this.rules = new ArrayList<RulesReturnElement>();
        }
        return this.rules;
    }public List<RuleIdsReturnElement> getRuleIds() {
        if (this.ruleIds == null) {
            this.ruleIds = new ArrayList<RuleIdsReturnElement>();
        }
        return this.ruleIds;
    }
}
