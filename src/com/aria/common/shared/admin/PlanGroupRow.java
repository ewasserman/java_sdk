package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_group_row", propOrder = {
    "planGroups"
    })
public class PlanGroupRow {

    @XmlElement(name = "plan_groups")
    protected Long planGroups;
    public Long getPlanGroups() {
        return planGroups;
    }

    public void setPlanGroups(Long value) {
        this.planGroups = value;
    }

    
}
