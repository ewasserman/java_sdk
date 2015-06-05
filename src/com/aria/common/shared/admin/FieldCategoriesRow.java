package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "field_categories_row", propOrder = {
    "fieldCategoryNo",
    "fieldCategoryName"
    })
public class FieldCategoriesRow {

    @XmlElement(name = "field_category_no")
    protected Long fieldCategoryNo;
    @XmlElement(name = "field_category_name")
    protected String fieldCategoryName;
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

    
}
