package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "includeSuppPlans",    "includeBillingGroups",    "includePaymentMethods"})
@XmlRootElement(name = "get_acct_details_all_m")
public class GetAcctDetailsAllM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "include_supp_plans")
    protected Long includeSuppPlans;
        @XmlElement(name = "include_billing_groups")
    protected Long includeBillingGroups;
        @XmlElement(name = "include_payment_methods")
    protected Long includePaymentMethods;
    
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
            
}
