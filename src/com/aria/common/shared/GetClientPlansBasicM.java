package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "planNo",    "clientPlanId",    "includeRsSummary",    "localeNo",    "localeName",    "includeTranslations"})
@XmlRootElement(name = "get_client_plans_basic_m")
public class GetClientPlansBasicM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "plan_no")
    protected Long planNo;
        @XmlElement(name = "client_plan_id")
    protected String clientPlanId;
        @XmlElement(name = "include_rs_summary")
    protected String includeRsSummary;
        @XmlElement(name = "locale_no")
    protected Long localeNo;
        @XmlElement(name = "locale_name")
    protected String localeName;
        @XmlElement(name = "include_translations")
    protected String includeTranslations;
    
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
            public String getClientPlanId() {
        return clientPlanId;
    }

    public void setClientPlanId(String value) {
        this.clientPlanId = value;
    }
            public String getIncludeRsSummary() {
        return includeRsSummary;
    }

    public void setIncludeRsSummary(String value) {
        this.includeRsSummary = value;
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
            public String getIncludeTranslations() {
        return includeTranslations;
    }

    public void setIncludeTranslations(String value) {
        this.includeTranslations = value;
    }
            
}
