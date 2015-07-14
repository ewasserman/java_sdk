package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_instance_field_update_row", propOrder = {
    "planInstanceFieldName",
    "planInstanceFieldValue",
    "planInstanceFieldDirective"
    })
public class PlanInstanceFieldUpdateRow {

    @XmlElement(name = "plan_instance_field_name")
    protected String planInstanceFieldName;
    @XmlElement(name = "plan_instance_field_value")
    protected String planInstanceFieldValue;
    @XmlElement(name = "plan_instance_field_directive")
    protected Long planInstanceFieldDirective;
    public String getPlanInstanceFieldName() {
        return planInstanceFieldName;
    }

    public void setPlanInstanceFieldName(String value) {
        this.planInstanceFieldName = value;
    }

    public String getPlanInstanceFieldValue() {
        return planInstanceFieldValue;
    }

    public void setPlanInstanceFieldValue(String value) {
        this.planInstanceFieldValue = value;
    }

    public Long getPlanInstanceFieldDirective() {
        return planInstanceFieldDirective;
    }

    public void setPlanInstanceFieldDirective(Long value) {
        this.planInstanceFieldDirective = value;
    }

    
}
