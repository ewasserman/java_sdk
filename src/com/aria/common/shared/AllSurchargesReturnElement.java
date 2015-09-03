package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "all_surcharges_ReturnElement", propOrder = {"surchargeNo", "surchargeName", "description", "extDescription", "surchargeType", "currency", "taxGroup", "invoiceAppMethod", "revGlCode", "arGlCode", "surchargePlan", "surchargeRate"})
public class AllSurchargesReturnElement {

    @XmlElement(name = "surcharge_no")
    protected Long surchargeNo;
    @XmlElement(name = "surcharge_name")
    protected String surchargeName;
    @XmlElement(name = "description")
    protected String description;
    @XmlElement(name = "ext_description")
    protected String extDescription;
    @XmlElement(name = "surcharge_type")
    protected String surchargeType;
    @XmlElement(name = "currency")
    protected String currency;
    @XmlElement(name = "tax_group")
    protected String taxGroup;
    @XmlElement(name = "invoice_app_method")
    protected String invoiceAppMethod;
    @XmlElement(name = "rev_gl_code")
    protected String revGlCode;
    @XmlElement(name = "ar_gl_code")
    protected String arGlCode;
    @XmlElement(name = "surcharge_plan")
    protected List<SurchargePlanReturnElement> surchargePlan;
    @XmlElement(name = "surcharge_rate")
    protected List<SurchargeRateReturnElement> surchargeRate;
    
    public Long getSurchargeNo() {
        return surchargeNo;
    }

    public void setSurchargeNo(Long value) {
        this.surchargeNo = value;
    }

    public String getSurchargeName() {
        return surchargeName;
    }

    public void setSurchargeName(String value) {
        this.surchargeName = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public String getExtDescription() {
        return extDescription;
    }

    public void setExtDescription(String value) {
        this.extDescription = value;
    }

    public String getSurchargeType() {
        return surchargeType;
    }

    public void setSurchargeType(String value) {
        this.surchargeType = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String value) {
        this.currency = value;
    }

    public String getTaxGroup() {
        return taxGroup;
    }

    public void setTaxGroup(String value) {
        this.taxGroup = value;
    }

    public String getInvoiceAppMethod() {
        return invoiceAppMethod;
    }

    public void setInvoiceAppMethod(String value) {
        this.invoiceAppMethod = value;
    }

    public String getRevGlCode() {
        return revGlCode;
    }

    public void setRevGlCode(String value) {
        this.revGlCode = value;
    }

    public String getArGlCode() {
        return arGlCode;
    }

    public void setArGlCode(String value) {
        this.arGlCode = value;
    }

    public List<SurchargePlanReturnElement> getSurchargePlan() {
        if (this.surchargePlan == null) {
            this.surchargePlan = new ArrayList<SurchargePlanReturnElement>();
        }
        return this.surchargePlan;
    }public List<SurchargeRateReturnElement> getSurchargeRate() {
        if (this.surchargeRate == null) {
            this.surchargeRate = new ArrayList<SurchargeRateReturnElement>();
        }
        return this.surchargeRate;
    }
}
