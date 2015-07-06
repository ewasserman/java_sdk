package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "product_field_category_ReturnElement", propOrder = {"fieldCategoryNo", "fieldCategoryName"})
public class ProductFieldCategoryReturnElement {

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
