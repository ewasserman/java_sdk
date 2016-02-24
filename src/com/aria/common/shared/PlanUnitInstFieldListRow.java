package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_unit_inst_field_list_row", propOrder = {
    "fieldName",
    "planUnitInstFieldValues"
    })
public class PlanUnitInstFieldListRow {

    @XmlElement(name = "field_name")
    protected String fieldName;
    @XmlElement(name = "plan_unit_inst_field_values")
    protected com.aria.common.shared.PlanUnitInstFieldValuesArray planUnitInstFieldValues;
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String value) {
        this.fieldName = value;
    }

    public com.aria.common.shared.PlanUnitInstFieldValuesArray getPlanUnitInstFieldValues() {
        return planUnitInstFieldValues;
    }

    public void setPlanUnitInstFieldValues(com.aria.common.shared.PlanUnitInstFieldValuesArray value) {
        this.planUnitInstFieldValues = value;
    }

    
}
