package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "surcharge_tier_t_ReturnElement", propOrder = {"description"})
public class SurchargeTierTReturnElement {

    @XmlElement(name = "description")
    protected String description;
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    
}
