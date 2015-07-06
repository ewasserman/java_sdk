package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "product_fields_ReturnElement", propOrder = {"productFieldNo", "productFieldName", "productFieldDesc", "productFieldValue", "allowInstanceOverride"})
public class ProductFieldsReturnElement {

    @XmlElement(name = "product_field_no")
    protected Long productFieldNo;
    @XmlElement(name = "product_field_name")
    protected String productFieldName;
    @XmlElement(name = "product_field_desc")
    protected Long productFieldDesc;
    @XmlElement(name = "product_field_value")
    protected String productFieldValue;
    @XmlElement(name = "allow_instance_override")
    protected Long allowInstanceOverride;
    
    public Long getProductFieldNo() {
        return productFieldNo;
    }

    public void setProductFieldNo(Long value) {
        this.productFieldNo = value;
    }

    public String getProductFieldName() {
        return productFieldName;
    }

    public void setProductFieldName(String value) {
        this.productFieldName = value;
    }

    public Long getProductFieldDesc() {
        return productFieldDesc;
    }

    public void setProductFieldDesc(Long value) {
        this.productFieldDesc = value;
    }

    public String getProductFieldValue() {
        return productFieldValue;
    }

    public void setProductFieldValue(String value) {
        this.productFieldValue = value;
    }

    public Long getAllowInstanceOverride() {
        return allowInstanceOverride;
    }

    public void setAllowInstanceOverride(Long value) {
        this.allowInstanceOverride = value;
    }

    
}
