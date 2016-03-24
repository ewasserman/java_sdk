package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "hierarchyFilter",    "includeCurrentAcct",    "includeSuppPlans",    "includeBillingGroups",    "includePaymentMethods",    "localeNo",    "localeName"})
@XmlRootElement(name = "get_acct_hierarchy_details_m")
public class GetAcctHierarchyDetailsM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "hierarchy_filter")
    protected Long hierarchyFilter;
        @XmlElement(name = "include_current_acct")
    protected Long includeCurrentAcct;
        @XmlElement(name = "include_supp_plans")
    protected Long includeSuppPlans;
        @XmlElement(name = "include_billing_groups")
    protected Long includeBillingGroups;
        @XmlElement(name = "include_payment_methods")
    protected Long includePaymentMethods;
        @XmlElement(name = "locale_no")
    protected Long localeNo;
        @XmlElement(name = "locale_name")
    protected String localeName;
    
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

    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }
            public Long getHierarchyFilter() {
        return hierarchyFilter;
    }

    public void setHierarchyFilter(Long value) {
        this.hierarchyFilter = value;
    }
            public Long getIncludeCurrentAcct() {
        return includeCurrentAcct;
    }

    public void setIncludeCurrentAcct(Long value) {
        this.includeCurrentAcct = value;
    }
            public Long getIncludeSuppPlans() {
        return includeSuppPlans;
    }

    public void setIncludeSuppPlans(Long value) {
        this.includeSuppPlans = value;
    }
            public Long getIncludeBillingGroups() {
        return includeBillingGroups;
    }

    public void setIncludeBillingGroups(Long value) {
        this.includeBillingGroups = value;
    }
            public Long getIncludePaymentMethods() {
        return includePaymentMethods;
    }

    public void setIncludePaymentMethods(Long value) {
        this.includePaymentMethods = value;
    }
            public Long getLocaleNo() {
        return localeNo;
    }

    public void setLocaleNo(Long value) {
        this.localeNo = value;
    }
            public String getLocaleName() {
        return localeName;
    }

    public void setLocaleName(String value) {
        this.localeName = value;
    }
            
}
