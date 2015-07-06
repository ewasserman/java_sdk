package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assign_category_fields_row", propOrder = {
    "fieldNo",
    "fieldName",
    "fieldDirective"
    })
public class AssignCategoryFieldsRow {

    @XmlElement(name = "field_no")
    protected Long fieldNo;
    @XmlElement(name = "field_name")
    protected String fieldName;
    @XmlElement(name = "field_directive")
    protected Long fieldDirective;
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

    public Long getFieldDirective() {
        return fieldDirective;
    }

    public void setFieldDirective(Long value) {
        this.fieldDirective = value;
    }

    
}
