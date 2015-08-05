package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mp_plan_inst_fields_ReturnElement", propOrder = {"planInstanceFieldName", "planInstanceFieldValue"})
public class MpPlanInstFieldsReturnElement {

    @XmlElement(name = "plan_instance_field_name")
    protected String planInstanceFieldName;
    @XmlElement(name = "plan_instance_field_value")
    protected String planInstanceFieldValue;
    
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

    
}
