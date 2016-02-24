package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supplemental_obj_fields_ReturnElement", propOrder = {"fieldNo", "fieldValue", "fieldName", "supplementalObjField"})
public class SupplementalObjFieldsReturnElement {

    @XmlElement(name = "field_no")
    protected Long fieldNo;
    @XmlElement(name = "field_value")
    protected String fieldValue;
    @XmlElement(name = "field_name")
    protected String fieldName;
    @XmlElement(name = "supplemental_obj_field")
    protected String supplementalObjField;
    
    public Long getFieldNo() {
        return fieldNo;
    }

    public void setFieldNo(Long value) {
        this.fieldNo = value;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String value) {
        this.fieldValue = value;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String value) {
        this.fieldName = value;
    }

    public String getSupplementalObjField() {
        return supplementalObjField;
    }

    public void setSupplementalObjField(String value) {
        this.supplementalObjField = value;
    }

    
}
