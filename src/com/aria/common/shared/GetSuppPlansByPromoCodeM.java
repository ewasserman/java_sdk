package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "promoCode",    "includeRsSummary",    "localeNo",    "localeName",    "includeTranslations"})
@XmlRootElement(name = "get_supp_plans_by_promo_code_m")
public class GetSuppPlansByPromoCodeM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "promo_code")
    protected String promoCode;
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

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String value) {
        this.promoCode = value;
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
