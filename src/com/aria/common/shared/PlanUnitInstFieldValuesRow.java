package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_unit_inst_field_values_row", propOrder = {
    "fieldValue",
    "planUnitInstFieldValDirective"
    })
public class PlanUnitInstFieldValuesRow {

    @XmlElement(name = "field_value")
    protected String fieldValue;
    @XmlElement(name = "plan_unit_inst_field_val_directive")
    protected Long planUnitInstFieldValDirective;
    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String value) {
        this.fieldValue = value;
    }

    public Long getPlanUnitInstFieldValDirective() {
        return planUnitInstFieldValDirective;
    }

    public void setPlanUnitInstFieldValDirective(Long value) {
        this.planUnitInstFieldValDirective = value;
    }

    
}
