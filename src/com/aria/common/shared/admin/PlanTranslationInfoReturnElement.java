package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_translation_info_ReturnElement", propOrder = {"localeName", "planName", "description", "rateSchedT", "planNo"})
public class PlanTranslationInfoReturnElement {

    @XmlElement(name = "locale_name")
    protected String localeName;
    @XmlElement(name = "plan_name")
    protected String planName;
    @XmlElement(name = "description")
    protected String description;
    @XmlElement(name = "rate_sched_t")
    protected List<RateSchedTReturnElement> rateSchedT;
    @XmlElement(name = "plan_no")
    protected String planNo;
    
    public String getLocaleName() {
        return localeName;
    }

    public void setLocaleName(String value) {
        this.localeName = value;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String value) {
        this.planName = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public List<RateSchedTReturnElement> getRateSchedT() {
        if (this.rateSchedT == null) {
            this.rateSchedT = new ArrayList<RateSchedTReturnElement>();
        }
        return this.rateSchedT;
    }public String getPlanNo() {
        return planNo;
    }

    public void setPlanNo(String value) {
        this.planNo = value;
    }

    
}
