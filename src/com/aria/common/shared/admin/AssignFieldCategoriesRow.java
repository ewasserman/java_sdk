package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assign_field_categories_row", propOrder = {
    "fieldCategoryNo",
    "fieldCategoryName",
    "fieldCategoryDirective"
    })
public class AssignFieldCategoriesRow {

    @XmlElement(name = "field_category_no")
    protected Long fieldCategoryNo;
    @XmlElement(name = "field_category_name")
    protected String fieldCategoryName;
    @XmlElement(name = "field_category_directive")
    protected Long fieldCategoryDirective;
    public Long getFieldCategoryNo() {
        return fieldCategoryNo;
    }

    public void setFieldCategoryNo(Long value) {
        this.fieldCategoryNo = value;
    }

    public String getFieldCategoryName() {
        return fieldCategoryName;
    }

    public void setFieldCategoryName(String value) {
        this.fieldCategoryName = value;
    }

    public Long getFieldCategoryDirective() {
        return fieldCategoryDirective;
    }

    public void setFieldCategoryDirective(Long value) {
        this.fieldCategoryDirective = value;
    }

    
}
