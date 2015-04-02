package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "discount_rules_ReturnElement", propOrder = {"ruleNo", "ruleName", "ruleId", "description", "extDescription", "discountType", "amount", "currency", "applicableTransScope", "durationTypeInd", "maxApplicableMonths", "maxApplicationsPerAcct", "inlineOffsetInd", "serviceCodeToUse", "altServiceNo2Apply", "altServiceId2Apply", "scopeNo", "planNo", "clientPlanId", "serviceNo", "clientServiceId", "itemNo", "clientItemId", "useAllOrNthSubsRule"})
public class DiscountRulesReturnElement {

    @XmlElement(name = "rule_no")
    protected Long ruleNo;
    @XmlElement(name = "rule_name")
    protected String ruleName;
    @XmlElement(name = "rule_id")
    protected String ruleId;
    @XmlElement(name = "description")
    protected String description;
    @XmlElement(name = "ext_description")
    protected String extDescription;
    @XmlElement(name = "discount_type")
    protected String discountType;
    @XmlElement(name = "amount")
    protected Double amount;
    @XmlElement(name = "currency")
    protected String currency;
    @XmlElement(name = "applicable_trans_scope")
    protected String applicableTransScope;
    @XmlElement(name = "duration_type_ind")
    protected String durationTypeInd;
    @XmlElement(name = "max_applicable_months")
    protected Long maxApplicableMonths;
    @XmlElement(name = "max_applications_per_acct")
    protected Long maxApplicationsPerAcct;
    @XmlElement(name = "inline_offset_ind")
    protected String inlineOffsetInd;
    @XmlElement(name = "service_code_to_use")
    protected Long serviceCodeToUse;
    @XmlElement(name = "alt_service_no_2_apply")
    protected Long altServiceNo2Apply;
    @XmlElement(name = "alt_service_id_2_apply")
    protected String altServiceId2Apply;
    @XmlElement(name = "scope_no")
    protected Long scopeNo;
    @XmlElement(name = "plan_no")
    protected List<PlanNoReturnElement> planNo;
    @XmlElement(name = "client_plan_id")
    protected List<ClientPlanIdReturnElement> clientPlanId;
    @XmlElement(name = "service_no")
    protected List<ServiceNoReturnElement> serviceNo;
    @XmlElement(name = "client_service_id")
    protected List<ClientServiceIdReturnElement> clientServiceId;
    @XmlElement(name = "item_no")
    protected List<ItemNoReturnElement> itemNo;
    @XmlElement(name = "client_item_id")
    protected List<ClientItemIdReturnElement> clientItemId;
    @XmlElement(name = "use_all_or_nth_subs_rule")
    protected String useAllOrNthSubsRule;
    
    public Long getRuleNo() {
        return ruleNo;
    }

    public void setRuleNo(Long value) {
        this.ruleNo = value;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String value) {
        this.ruleName = value;
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

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String value) {
        this.discountType = value;
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

    public String getApplicableTransScope() {
        return applicableTransScope;
    }

    public void setApplicableTransScope(String value) {
        this.applicableTransScope = value;
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

    public Long getScopeNo() {
        return scopeNo;
    }

    public void setScopeNo(Long value) {
        this.scopeNo = value;
    }

    public List<PlanNoReturnElement> getPlanNo() {
        if (this.planNo == null) {
            this.planNo = new ArrayList<PlanNoReturnElement>();
        }
        return this.planNo;
    }public List<ClientPlanIdReturnElement> getClientPlanId() {
        if (this.clientPlanId == null) {
            this.clientPlanId = new ArrayList<ClientPlanIdReturnElement>();
        }
        return this.clientPlanId;
    }public List<ServiceNoReturnElement> getServiceNo() {
        if (this.serviceNo == null) {
            this.serviceNo = new ArrayList<ServiceNoReturnElement>();
        }
        return this.serviceNo;
    }public List<ClientServiceIdReturnElement> getClientServiceId() {
        if (this.clientServiceId == null) {
            this.clientServiceId = new ArrayList<ClientServiceIdReturnElement>();
        }
        return this.clientServiceId;
    }public List<ItemNoReturnElement> getItemNo() {
        if (this.itemNo == null) {
            this.itemNo = new ArrayList<ItemNoReturnElement>();
        }
        return this.itemNo;
    }public List<ClientItemIdReturnElement> getClientItemId() {
        if (this.clientItemId == null) {
            this.clientItemId = new ArrayList<ClientItemIdReturnElement>();
        }
        return this.clientItemId;
    }public String getUseAllOrNthSubsRule() {
        return useAllOrNthSubsRule;
    }

    public void setUseAllOrNthSubsRule(String value) {
        this.useAllOrNthSubsRule = value;
    }

    
}
