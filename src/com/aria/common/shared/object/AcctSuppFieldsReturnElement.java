package com.aria.common.shared.object;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acct_supp_fields_ReturnElement", propOrder = {"acctSuppFieldName", "acctSuppFieldValue"})
public class AcctSuppFieldsReturnElement {

    @XmlElement(name = "acct_supp_field_name")
    protected String acctSuppFieldName;
    @XmlElement(name = "acct_supp_field_value")
    protected String acctSuppFieldValue;
    
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

    
}
