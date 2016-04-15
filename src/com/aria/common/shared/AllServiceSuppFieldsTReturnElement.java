package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "all_service_supp_fields_t_ReturnElement", propOrder = {"fieldName", "fieldDesc", "fieldOrderNo", "fieldValue"})
public class AllServiceSuppFieldsTReturnElement {

    @XmlElement(name = "field_name")
    protected String fieldName;
    @XmlElement(name = "field_desc")
    protected String fieldDesc;
    @XmlElement(name = "field_order_no")
    protected Long fieldOrderNo;
    @XmlElement(name = "field_value")
    protected String fieldValue;
    
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String value) {
        this.fieldName = value;
    }

    public String getFieldDesc() {
        return fieldDesc;
    }

    public void setFieldDesc(String value) {
        this.fieldDesc = value;
    }

    public Long getFieldOrderNo() {
        return fieldOrderNo;
    }

    public void setFieldOrderNo(Long value) {
        this.fieldOrderNo = value;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String value) {
        this.fieldValue = value;
    }

    
}
