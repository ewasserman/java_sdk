package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supplemental_obj_fields_ReturnElement", propOrder = {"supplementalObjField"})
public class SupplementalObjFieldsReturnElement {

    @XmlElement(name = "supplemental_obj_field")
    protected String supplementalObjField;
    
    public String getSupplementalObjField() {
        return supplementalObjField;
    }

    public void setSupplementalObjField(String value) {
        this.supplementalObjField = value;
    }

    
}
