package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "planNo",    "currencyCd",    "clientPlanId",    "localeNo",    "localeName",    "includeTranslations"})
@XmlRootElement(name = "get_rate_schedules_for_plan_m")
public class GetRateSchedulesForPlanM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "plan_no")
    protected Long planNo;
        @XmlElement(name = "currency_cd")
    protected String currencyCd;
        @XmlElement(name = "client_plan_id")
    protected String clientPlanId;
        @XmlElement(name = "locale_no")
    protected String localeNo;
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
            public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }
            public String getClientPlanId() {
        return clientPlanId;
    }

    public void setClientPlanId(String value) {
        this.clientPlanId = value;
    }
            public String getLocaleNo() {
        return localeNo;
    }

    public void setLocaleNo(String value) {
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
