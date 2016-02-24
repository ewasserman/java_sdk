package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "promo_plan_set_translation_info_ReturnElement", propOrder = {"localeName", "planT"})
public class PromoPlanSetTranslationInfoReturnElement {

    @XmlElement(name = "locale_name")
    protected String localeName;
    @XmlElement(name = "plan_t")
    protected List<PlanTReturnElement> planT;
    
    public String getLocaleName() {
        return localeName;
    }

    public void setLocaleName(String value) {
        this.localeName = value;
    }

    public List<PlanTReturnElement> getPlanT() {
        if (this.planT == null) {
            this.planT = new ArrayList<PlanTReturnElement>();
        }
        return this.planT;
    }
}
