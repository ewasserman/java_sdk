package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supp_field_ReturnElement", propOrder = {"suppFieldName", "suppFieldValue"})
public class SuppFieldReturnElement {

    @XmlElement(name = "supp_field_name")
    protected String suppFieldName;
    @XmlElement(name = "supp_field_value")
    protected String suppFieldValue;
    
    public String getSuppFieldName() {
        return suppFieldName;
    }

    public void setSuppFieldName(String value) {
        this.suppFieldName = value;
    }

    public String getSuppFieldValue() {
        return suppFieldValue;
    }

    public void setSuppFieldValue(String value) {
        this.suppFieldValue = value;
    }

    
}
