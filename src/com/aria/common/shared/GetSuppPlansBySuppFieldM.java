package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "fieldVal",    "fieldNo",    "fieldName",    "includeRsSummary"})
@XmlRootElement(name = "get_supp_plans_by_supp_field_m")
public class GetSuppPlansBySuppFieldM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "field_val")
    protected String fieldVal;
        @XmlElement(name = "field_no")
    protected Long fieldNo;
        @XmlElement(name = "field_name")
    protected String fieldName;
        @XmlElement(name = "include_rs_summary")
    protected String includeRsSummary;
    
    public long getClientNo() {
        return clientNo;
    }

    public void setClientNo(Long value) {
        this.clientNo = value;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String value) {
        this.authKey = value;
    }

    public String getFieldVal() {
        return fieldVal;
    }

    public void setFieldVal(String value) {
        this.fieldVal = value;
    }
            public Long getFieldNo() {
        return fieldNo;
    }

    public void setFieldNo(Long value) {
        this.fieldNo = value;
    }
            public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String value) {
        this.fieldName = value;
    }
            public String getIncludeRsSummary() {
        return includeRsSummary;
    }

    public void setIncludeRsSummary(String value) {
        this.includeRsSummary = value;
    }
            
}
