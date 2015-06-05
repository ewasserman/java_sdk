package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "discount_rule_row", propOrder = {
    "label",
    "ruleId",
    "description",
    "extDescription",
    "flatPercentInd",
    "amount",
    "currency",
    "durationTypeInd",
    "maxApplicableMonths",
    "maxApplicationsPerAcct",
    "inlineOffsetInd",
    "discountBehaviorTypeInd",
    "serviceCodeToUse",
    "altServiceNo2Apply",
    "altServiceId2Apply",
    "applicableTransScope",
    "scopeNo",
    "planNo",
    "clientPlanId",
    "serviceNo",
    "clientServiceId",
    "itemNo",
    "clientItemId",
    "useAllOrNthSubsRule"
    })
public class DiscountRuleRow {

    @XmlElement(name = "label")
    protected String label;
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
    @XmlElement(name = "duration_type_ind")
    protected String durationTypeInd;
    @XmlElement(name = "max_applicable_months")
    protected Long maxApplicableMonths;
    @XmlElement(name = "max_applications_per_acct")
    protected Long maxApplicationsPerAcct;
    @XmlElement(name = "inline_offset_ind")
    protected String inlineOffsetInd;
    @XmlElement(name = "discount_behavior_type_ind")
    protected String discountBehaviorTypeInd;
    @XmlElement(name = "service_code_to_use")
    protected Long serviceCodeToUse;
    @XmlElement(name = "alt_service_no_2_apply")
    protected Long altServiceNo2Apply;
    @XmlElement(name = "alt_service_id_2_apply")
    protected String altServiceId2Apply;
    @XmlElement(name = "applicable_trans_scope")
    protected String applicableTransScope;
    @XmlElement(name = "scope_no")
    protected Long scopeNo;
    @XmlElement(name = "plan_no")
    protected com.aria.common.shared.admin.PlanNoArray planNo;
    @XmlElement(name = "client_plan_id")
    protected com.aria.common.shared.admin.ClientPlanIdArray clientPlanId;
    @XmlElement(name = "service_no")
    protected com.aria.common.shared.admin.ServiceNoArray serviceNo;
    @XmlElement(name = "client_service_id")
    protected com.aria.common.shared.admin.ClientServiceIdArray clientServiceId;
    @XmlElement(name = "item_no")
    protected com.aria.common.shared.admin.ItemNoArray itemNo;
    @XmlElement(name = "client_item_id")
    protected com.aria.common.shared.admin.ClientItemIdArray clientItemId;
    @XmlElement(name = "use_all_or_nth_subs_rule")
    protected String useAllOrNthSubsRule;
    public String getLabel() {
        return label;
    }

    public void setLabel(String value) {
        this.label = value;
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

    public String getDurationTypeInd() {
        return durationTypeInd;
    }

    public void setDurationTypeInd(String value) {
        this.durationTypeInd = value;
    }

    public Long getMaxApplicableMonths() {
        return maxApplicableMonths;
    }

    public void setMaxApplicableMonths(Long value) {
        this.maxApplicableMonths = value;
    }

    public Long getMaxApplicationsPerAcct() {
        return maxApplicationsPerAcct;
    }

    public void setMaxApplicationsPerAcct(Long value) {
        this.maxApplicationsPerAcct = value;
    }

    public String getInlineOffsetInd() {
        return inlineOffsetInd;
    }

    public void setInlineOffsetInd(String value) {
        this.inlineOffsetInd = value;
    }

    public String getDiscountBehaviorTypeInd() {
        return discountBehaviorTypeInd;
    }

    public void setDiscountBehaviorTypeInd(String value) {
        this.discountBehaviorTypeInd = value;
    }

    public Long getServiceCodeToUse() {
        return serviceCodeToUse;
    }

    public void setServiceCodeToUse(Long value) {
        this.serviceCodeToUse = value;
    }

    public Long getAltServiceNo2Apply() {
        return altServiceNo2Apply;
    }

    public void setAltServiceNo2Apply(Long value) {
        this.altServiceNo2Apply = value;
    }

    public String getAltServiceId2Apply() {
        return altServiceId2Apply;
    }

    public void setAltServiceId2Apply(String value) {
        this.altServiceId2Apply = value;
    }

    public String getApplicableTransScope() {
        return applicableTransScope;
    }

    public void setApplicableTransScope(String value) {
        this.applicableTransScope = value;
    }

    public Long getScopeNo() {
        return scopeNo;
    }

    public void setScopeNo(Long value) {
        this.scopeNo = value;
    }

    public com.aria.common.shared.admin.PlanNoArray getPlanNo() {
        return planNo;
    }

    public void setPlanNo(com.aria.common.shared.admin.PlanNoArray value) {
        this.planNo = value;
    }

    public com.aria.common.shared.admin.ClientPlanIdArray getClientPlanId() {
        return clientPlanId;
    }

    public void setClientPlanId(com.aria.common.shared.admin.ClientPlanIdArray value) {
        this.clientPlanId = value;
    }

    public com.aria.common.shared.admin.ServiceNoArray getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(com.aria.common.shared.admin.ServiceNoArray value) {
        this.serviceNo = value;
    }

    public com.aria.common.shared.admin.ClientServiceIdArray getClientServiceId() {
        return clientServiceId;
    }

    public void setClientServiceId(com.aria.common.shared.admin.ClientServiceIdArray value) {
        this.clientServiceId = value;
    }

    public com.aria.common.shared.admin.ItemNoArray getItemNo() {
        return itemNo;
    }

    public void setItemNo(com.aria.common.shared.admin.ItemNoArray value) {
        this.itemNo = value;
    }

    public com.aria.common.shared.admin.ClientItemIdArray getClientItemId() {
        return clientItemId;
    }

    public void setClientItemId(com.aria.common.shared.admin.ClientItemIdArray value) {
        this.clientItemId = value;
    }

    public String getUseAllOrNthSubsRule() {
        return useAllOrNthSubsRule;
    }

    public void setUseAllOrNthSubsRule(String value) {
        this.useAllOrNthSubsRule = value;
    }

    
}
