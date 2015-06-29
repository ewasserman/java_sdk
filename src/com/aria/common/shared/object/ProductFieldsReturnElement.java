package com.aria.common.shared.object;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "product_fields_ReturnElement", propOrder = {"productFieldNo", "productFieldDesc", "productFieldName", "productFieldValue"})
public class ProductFieldsReturnElement {

    @XmlElement(name = "product_field_no")
    protected Long productFieldNo;
    @XmlElement(name = "product_field_desc")
    protected String productFieldDesc;
    @XmlElement(name = "product_field_name")
    protected String productFieldName;
    @XmlElement(name = "product_field_value")
    protected String productFieldValue;
    
    public Long getProductFieldNo() {
        return productFieldNo;
    }

    public void setProductFieldNo(Long value) {
        this.productFieldNo = value;
    }

    public String getProductFieldDesc() {
        return productFieldDesc;
    }

    public void setProductFieldDesc(String value) {
        this.productFieldDesc = value;
    }

    public String getProductFieldName() {
        return productFieldName;
    }

    public void setProductFieldName(String value) {
        this.productFieldName = value;
    }

    public String getProductFieldValue() {
        return productFieldValue;
    }

    public void setProductFieldValue(String value) {
        this.productFieldValue = value;
    }

    
}
