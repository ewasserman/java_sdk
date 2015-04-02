package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sites_class_list_ReturnElement", propOrder = {"siteClass", "label"})
public class SitesClassListReturnElement {

    @XmlElement(name = "site_class")
    protected String siteClass;
    @XmlElement(name = "label")
    protected String label;
    
    public String getSiteClass() {
        return siteClass;
    }

    public void setSiteClass(String value) {
        this.siteClass = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String value) {
        this.label = value;
    }

    
}
