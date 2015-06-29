package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acct_supp_fields_row", propOrder = {
    "acctSuppFieldName",
    "acctSuppFieldValue",
    "acctSuppFieldDirective"
    })
public class AcctSuppFieldsRow {

    @XmlElement(name = "acct_supp_field_name")
    protected String acctSuppFieldName;
    @XmlElement(name = "acct_supp_field_value")
    protected String acctSuppFieldValue;
    @XmlElement(name = "acct_supp_field_directive")
    protected Long acctSuppFieldDirective;
    public String getAcctSuppFieldName() {
        return acctSuppFieldName;
    }

    public void setAcctSuppFieldName(String value) {
        this.acctSuppFieldName = value;
    }

    public String getAcctSuppFieldValue() {
        return acctSuppFieldValue;
    }

    public void setAcctSuppFieldValue(String value) {
        this.acctSuppFieldValue = value;
    }

    public Long getAcctSuppFieldDirective() {
        return acctSuppFieldDirective;
    }

    public void setAcctSuppFieldDirective(Long value) {
        this.acctSuppFieldDirective = value;
    }

    
}
