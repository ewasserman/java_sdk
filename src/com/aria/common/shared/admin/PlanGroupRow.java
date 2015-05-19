package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_group_row", propOrder = {
    "planGroup"
    })
public class PlanGroupRow {

    @XmlElement(name = "plan_group")
    protected Long planGroup;
    public Long getPlanGroup() {
        return planGroup;
    }

    public void setPlanGroup(Long value) {
        this.planGroup = value;
    }

    
}
