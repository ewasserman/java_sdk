package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "promotions_ReturnElement", propOrder = {"promoCd", "promoDesc", "expiresAfter", "promotionTranslations"})
public class PromotionsReturnElement {

    @XmlElement(name = "promo_cd")
    protected String promoCd;
    @XmlElement(name = "promo_desc")
    protected String promoDesc;
    @XmlElement(name = "expires_after")
    protected String expiresAfter;
    @XmlElement(name = "promotion_translations")
    protected List<PromotionTranslationsReturnElement> promotionTranslations;
    
    public String getPromoCd() {
        return promoCd;
    }

    public void setPromoCd(String value) {
        this.promoCd = value;
    }

    public String getPromoDesc() {
        return promoDesc;
    }

    public void setPromoDesc(String value) {
        this.promoDesc = value;
    }

    public String getExpiresAfter() {
        return expiresAfter;
    }

    public void setExpiresAfter(String value) {
        this.expiresAfter = value;
    }

    public List<PromotionTranslationsReturnElement> getPromotionTranslations() {
        if (this.promotionTranslations == null) {
            this.promotionTranslations = new ArrayList<PromotionTranslationsReturnElement>();
        }
        return this.promotionTranslations;
    }
}
