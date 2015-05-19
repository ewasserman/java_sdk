package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usage_types_ReturnElement", propOrder = {"usageTypeNo", "usageTypeName", "usageTypeDesc", "unitType", "usageTypeCd", "isEditable"})
public class UsageTypesReturnElement {

    @XmlElement(name = "usage_type_no")
    protected Long usageTypeNo;
    @XmlElement(name = "usage_type_name")
    protected String usageTypeName;
    @XmlElement(name = "usage_type_desc")
    protected String usageTypeDesc;
    @XmlElement(name = "unit_type")
    protected String unitType;
    @XmlElement(name = "usage_type_cd")
    protected String usageTypeCd;
    @XmlElement(name = "is_editable")
    protected Long isEditable;
    
    public Long getUsageTypeNo() {
        return usageTypeNo;
    }

    public void setUsageTypeNo(Long value) {
        this.usageTypeNo = value;
    }

    public String getUsageTypeName() {
        return usageTypeName;
    }

    public void setUsageTypeName(String value) {
        this.usageTypeName = value;
    }

    public String getUsageTypeDesc() {
        return usageTypeDesc;
    }

    public void setUsageTypeDesc(String value) {
        this.usageTypeDesc = value;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String value) {
        this.unitType = value;
    }

    public String getUsageTypeCd() {
        return usageTypeCd;
    }

    public void setUsageTypeCd(String value) {
        this.usageTypeCd = value;
    }

    public Long getIsEditable() {
        return isEditable;
    }

    public void setIsEditable(Long value) {
        this.isEditable = value;
    }

    
}
