package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "surcharges_ReturnElement", propOrder = {"surchargeNo", "clientSurchargeId", "surchargeName", "surchargeTypeCd", "currencyCd", "scopeLabel", "deleteable", "surchargeScope"})
public class SurchargesReturnElement {

    @XmlElement(name = "surcharge_no")
    protected Long surchargeNo;
    @XmlElement(name = "client_surcharge_id")
    protected String clientSurchargeId;
    @XmlElement(name = "surcharge_name")
    protected String surchargeName;
    @XmlElement(name = "surcharge_type_cd")
    protected String surchargeTypeCd;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "scope_label")
    protected String scopeLabel;
    @XmlElement(name = "deleteable")
    protected String deleteable;
    @XmlElement(name = "surcharge_scope")
    protected Long surchargeScope;
    
    public Long getSurchargeNo() {
        return surchargeNo;
    }

    public void setSurchargeNo(Long value) {
        this.surchargeNo = value;
    }

    public String getClientSurchargeId() {
        return clientSurchargeId;
    }

    public void setClientSurchargeId(String value) {
        this.clientSurchargeId = value;
    }

    public String getSurchargeName() {
        return surchargeName;
    }

    public void setSurchargeName(String value) {
        this.surchargeName = value;
    }

    public String getSurchargeTypeCd() {
        return surchargeTypeCd;
    }

    public void setSurchargeTypeCd(String value) {
        this.surchargeTypeCd = value;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }

    public String getScopeLabel() {
        return scopeLabel;
    }

    public void setScopeLabel(String value) {
        this.scopeLabel = value;
    }

    public String getDeleteable() {
        return deleteable;
    }

    public void setDeleteable(String value) {
        this.deleteable = value;
    }

    public Long getSurchargeScope() {
        return surchargeScope;
    }

    public void setSurchargeScope(Long value) {
        this.surchargeScope = value;
    }

    
}
