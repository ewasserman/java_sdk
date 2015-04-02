package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sites_ReturnElement", propOrder = {"siteId", "siteClass", "siteName", "siteUrl", "isPublished", "isCsrFacing"})
public class SitesReturnElement {

    @XmlElement(name = "site_id")
    protected Long siteId;
    @XmlElement(name = "site_class")
    protected String siteClass;
    @XmlElement(name = "site_name")
    protected String siteName;
    @XmlElement(name = "site_url")
    protected String siteUrl;
    @XmlElement(name = "is_published")
    protected String isPublished;
    @XmlElement(name = "is_csr_facing")
    protected String isCsrFacing;
    
    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long value) {
        this.siteId = value;
    }

    public String getSiteClass() {
        return siteClass;
    }

    public void setSiteClass(String value) {
        this.siteClass = value;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String value) {
        this.siteName = value;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(String value) {
        this.siteUrl = value;
    }

    public String getIsPublished() {
        return isPublished;
    }

    public void setIsPublished(String value) {
        this.isPublished = value;
    }

    public String getIsCsrFacing() {
        return isCsrFacing;
    }

    public void setIsCsrFacing(String value) {
        this.isCsrFacing = value;
    }

    
}
