package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acct_supp_fields_row", propOrder = {
    "suppFieldName",
    "suppFieldValue",
    "suppFieldDirective"
    })
public class AcctSuppFieldsRow {

    @XmlElement(name = "supp_field_name")
    protected String suppFieldName;
    @XmlElement(name = "supp_field_value")
    protected String suppFieldValue;
    @XmlElement(name = "supp_field_directive")
    protected Long suppFieldDirective;
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

    public Long getSuppFieldDirective() {
        return suppFieldDirective;
    }

    public void setSuppFieldDirective(Long value) {
        this.suppFieldDirective = value;
    }

    
}
