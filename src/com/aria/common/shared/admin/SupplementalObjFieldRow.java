package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supplemental_obj_field_row", propOrder = {
    "fieldNo",
    "fieldName",
    "fieldValue"
    })
public class SupplementalObjFieldRow {

    @XmlElement(name = "field_no")
    protected Long fieldNo;
    @XmlElement(name = "field_name")
    protected String fieldName;
    @XmlElement(name = "field_value")
    protected com.aria.common.shared.admin.FieldValueArray fieldValue;
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

    public com.aria.common.shared.admin.FieldValueArray getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(com.aria.common.shared.admin.FieldValueArray value) {
        this.fieldValue = value;
    }

    
}
