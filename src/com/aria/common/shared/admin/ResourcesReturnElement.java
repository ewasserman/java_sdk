package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resources_ReturnElement", propOrder = {"resourceTypeNo", "resourceUnits", "daysToExpiry", "resourceName", "resources", "expireOnPaidThrough", "resetOnUpdate", "addDaysToExpiry"})
public class ResourcesReturnElement {

    @XmlElement(name = "resource_type_no")
    protected Long resourceTypeNo;
    @XmlElement(name = "resource_units")
    protected Long resourceUnits;
    @XmlElement(name = "days_to_expiry")
    protected Long daysToExpiry;
    @XmlElement(name = "resource_name")
    protected String resourceName;
    @XmlElement(name = "resources")
    protected Long resources;
    @XmlElement(name = "expire_on_paid_through")
    protected Long expireOnPaidThrough;
    @XmlElement(name = "reset_on_update")
    protected Long resetOnUpdate;
    @XmlElement(name = "add_days_to_expiry")
    protected Long addDaysToExpiry;
    
    public Long getResourceTypeNo() {
        return resourceTypeNo;
    }

    public void setResourceTypeNo(Long value) {
        this.resourceTypeNo = value;
    }

    public Long getResourceUnits() {
        return resourceUnits;
    }

    public void setResourceUnits(Long value) {
        this.resourceUnits = value;
    }

    public Long getDaysToExpiry() {
        return daysToExpiry;
    }

    public void setDaysToExpiry(Long value) {
        this.daysToExpiry = value;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String value) {
        this.resourceName = value;
    }

    public Long getResources() {
        return resources;
    }

    public void setResources(Long value) {
        this.resources = value;
    }

    public Long getExpireOnPaidThrough() {
        return expireOnPaidThrough;
    }

    public void setExpireOnPaidThrough(Long value) {
        this.expireOnPaidThrough = value;
    }

    public Long getResetOnUpdate() {
        return resetOnUpdate;
    }

    public void setResetOnUpdate(Long value) {
        this.resetOnUpdate = value;
    }

    public Long getAddDaysToExpiry() {
        return addDaysToExpiry;
    }

    public void setAddDaysToExpiry(Long value) {
        this.addDaysToExpiry = value;
    }

    
}
