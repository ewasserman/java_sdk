package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reversible_authorizations_ReturnElement", propOrder = {"authNo", "procAuthId", "authorizationDate", "authorizationReversibleAmount"})
public class ReversibleAuthorizationsReturnElement {

    @XmlElement(name = "auth_no")
    protected Long authNo;
    @XmlElement(name = "proc_auth_id")
    protected String procAuthId;
    @XmlElement(name = "authorization_date")
    protected String authorizationDate;
    @XmlElement(name = "authorization_reversible_amount")
    protected Double authorizationReversibleAmount;
    
    public Long getAuthNo() {
        return authNo;
    }

    public void setAuthNo(Long value) {
        this.authNo = value;
    }

    public String getProcAuthId() {
        return procAuthId;
    }

    public void setProcAuthId(String value) {
        this.procAuthId = value;
    }

    public String getAuthorizationDate() {
        return authorizationDate;
    }

    public void setAuthorizationDate(String value) {
        this.authorizationDate = value;
    }

    public Double getAuthorizationReversibleAmount() {
        return authorizationReversibleAmount;
    }

    public void setAuthorizationReversibleAmount(Double value) {
        this.authorizationReversibleAmount = value;
    }

    
}
