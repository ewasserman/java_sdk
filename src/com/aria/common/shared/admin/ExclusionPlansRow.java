package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exclusion_plans_row", propOrder = {
    "exclusionPlan"
    })
public class ExclusionPlansRow {

    @XmlElement(name = "exclusion_plan")
    protected Long exclusionPlan;
    public Long getExclusionPlan() {
        return exclusionPlan;
    }

    public void setExclusionPlan(Long value) {
        this.exclusionPlan = value;
    }

    
}
