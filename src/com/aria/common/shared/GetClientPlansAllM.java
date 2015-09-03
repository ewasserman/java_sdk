package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "planNo",    "acctNo",    "promoCode",    "parentPlanNo",    "suppFieldNames",    "suppFieldValues",    "includeAllRateSchedules",    "includePlanHierarchy",    "clientPlanId",    "clientParentPlanId",    "retrieveBundledNso",    "retrieveIncludedNso"})
@XmlRootElement(name = "get_client_plans_all_m")
public class GetClientPlansAllM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "plan_no")
    protected Long planNo;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "promo_code")
    protected String promoCode;
        @XmlElement(name = "parent_plan_no")
    protected Long parentPlanNo;
        @XmlElement(name = "supp_field_names")
    protected SuppFieldNamesArray suppFieldNames;
        @XmlElement(name = "supp_field_values")
    protected SuppFieldValuesArray suppFieldValues;
        @XmlElement(name = "include_all_rate_schedules")
    protected String includeAllRateSchedules;
        @XmlElement(name = "include_plan_hierarchy")
    protected String includePlanHierarchy;
        @XmlElement(name = "client_plan_id")
    protected String clientPlanId;
        @XmlElement(name = "client_parent_plan_id")
    protected String clientParentPlanId;
        @XmlElement(name = "retrieve_bundled_nso")
    protected String retrieveBundledNso;
        @XmlElement(name = "retrieve_included_nso")
    protected String retrieveIncludedNso;
    
    public long getClientNo() {
        return clientNo;
    }

    public void setClientNo(Long value) {
        this.clientNo = value;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String value) {
        this.authKey = value;
    }

    public Long getPlanNo() {
        return planNo;
    }

    public void setPlanNo(Long value) {
        this.planNo = value;
    }
            public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }
            public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String value) {
        this.promoCode = value;
    }
            public Long getParentPlanNo() {
        return parentPlanNo;
    }

    public void setParentPlanNo(Long value) {
        this.parentPlanNo = value;
    }
            public SuppFieldNamesArray getSuppFieldNames() {
        return suppFieldNames;
    }

    public void setSuppFieldNames(SuppFieldNamesArray value) {
        this.suppFieldNames = value;
    }
            public SuppFieldValuesArray getSuppFieldValues() {
        return suppFieldValues;
    }

    public void setSuppFieldValues(SuppFieldValuesArray value) {
        this.suppFieldValues = value;
    }
            public String getIncludeAllRateSchedules() {
        return includeAllRateSchedules;
    }

    public void setIncludeAllRateSchedules(String value) {
        this.includeAllRateSchedules = value;
    }
            public String getIncludePlanHierarchy() {
        return includePlanHierarchy;
    }

    public void setIncludePlanHierarchy(String value) {
        this.includePlanHierarchy = value;
    }
            public String getClientPlanId() {
        return clientPlanId;
    }

    public void setClientPlanId(String value) {
        this.clientPlanId = value;
    }
            public String getClientParentPlanId() {
        return clientParentPlanId;
    }

    public void setClientParentPlanId(String value) {
        this.clientParentPlanId = value;
    }
            public String getRetrieveBundledNso() {
        return retrieveBundledNso;
    }

    public void setRetrieveBundledNso(String value) {
        this.retrieveBundledNso = value;
    }
            public String getRetrieveIncludedNso() {
        return retrieveIncludedNso;
    }

    public void setRetrieveIncludedNso(String value) {
        this.retrieveIncludedNso = value;
    }
            
}
