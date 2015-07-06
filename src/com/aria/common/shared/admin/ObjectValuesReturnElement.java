package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "object_values_ReturnElement", propOrder = {"objectType", "objectId", "valueText", "primacy"})
public class ObjectValuesReturnElement {

    @XmlElement(name = "object_type")
    protected String objectType;
    @XmlElement(name = "object_id")
    protected Long objectId;
    @XmlElement(name = "value_text")
    protected String valueText;
    @XmlElement(name = "primacy")
    protected Long primacy;
    
    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String value) {
        this.objectType = value;
    }

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long value) {
        this.objectId = value;
    }

    public String getValueText() {
        return valueText;
    }

    public void setValueText(String value) {
        this.valueText = value;
    }

    public Long getPrimacy() {
        return primacy;
    }

    public void setPrimacy(Long value) {
        this.primacy = value;
    }

    
}
