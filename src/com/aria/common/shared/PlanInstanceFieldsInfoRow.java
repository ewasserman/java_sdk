package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_instance_fields_info_row", propOrder = {
    "fieldNo",
    "fieldName",
    "fieldValue"
    })
public class PlanInstanceFieldsInfoRow {

    @XmlElement(name = "field_no")
    protected Long fieldNo;
    @XmlElement(name = "field_name")
    protected String fieldName;
    @XmlElement(name = "field_value")
    protected String fieldValue;
    public Long getFieldNo() {
        return fieldNo;
    }

    public void setFieldNo(Long value) {
        this.fieldNo = value;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String value) {
        this.fieldName = value;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String value) {
        this.fieldValue = value;
    }

    
}
