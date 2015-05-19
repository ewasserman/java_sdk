package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exclusion_plans_row", propOrder = {
    "exclusionPlans"
    })
public class ExclusionPlansRow {

    @XmlElement(name = "exclusion_plans")
    protected Long exclusionPlans;
    public Long getExclusionPlans() {
        return exclusionPlans;
    }

    public void setExclusionPlans(Long value) {
        this.exclusionPlans = value;
    }

    
}
