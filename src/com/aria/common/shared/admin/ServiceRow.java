package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "service_row", propOrder = {
    "serviceNo",
    "clientServiceId",
    "name",
    "glCd",
    "taxable",
    "taxGroup",
    "commodityCd",
    "tier"
    })
public class ServiceRow {

    @XmlElement(name = "service_no")
    protected Long serviceNo;
    @XmlElement(name = "client_service_id")
    protected String clientServiceId;
    @XmlElement(name = "name")
    protected String name;
    @XmlElement(name = "gl_cd")
    protected String glCd;
    @XmlElement(name = "taxable")
    protected Long taxable;
    @XmlElement(name = "tax_group")
    protected Long taxGroup;
    @XmlElement(name = "commodity_cd")
    protected String commodityCd;
    @XmlElement(name = "tier")
    protected com.aria.common.shared.admin.TierArray tier;
    public Long getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(Long value) {
        this.serviceNo = value;
    }

    public String getClientServiceId() {
        return clientServiceId;
    }

    public void setClientServiceId(String value) {
        this.clientServiceId = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getGlCd() {
        return glCd;
    }

    public void setGlCd(String value) {
        this.glCd = value;
    }

    public Long getTaxable() {
        return taxable;
    }

    public void setTaxable(Long value) {
        this.taxable = value;
    }

    public Long getTaxGroup() {
        return taxGroup;
    }

    public void setTaxGroup(Long value) {
        this.taxGroup = value;
    }

    public String getCommodityCd() {
        return commodityCd;
    }

    public void setCommodityCd(String value) {
        this.commodityCd = value;
    }

    public com.aria.common.shared.admin.TierArray getTier() {
        return tier;
    }

    public void setTier(com.aria.common.shared.admin.TierArray value) {
        this.tier = value;
    }

    
}
