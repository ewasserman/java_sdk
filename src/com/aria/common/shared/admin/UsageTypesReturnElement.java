package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usage_types_ReturnElement", propOrder = {"usageTypeNo", "usageTypeDesc", "usageUnitType", "usageTypeName", "isEditable", "usageTypeTranslations"})
public class UsageTypesReturnElement {

    @XmlElement(name = "usage_type_no")
    protected Long usageTypeNo;
    @XmlElement(name = "usage_type_desc")
    protected String usageTypeDesc;
    @XmlElement(name = "usage_unit_type")
    protected String usageUnitType;
    @XmlElement(name = "usage_type_name")
    protected String usageTypeName;
    @XmlElement(name = "is_editable")
    protected Long isEditable;
    @XmlElement(name = "usage_type_translations")
    protected List<UsageTypeTranslationsReturnElement> usageTypeTranslations;
    
    public Long getUsageTypeNo() {
        return usageTypeNo;
    }

    public void setUsageTypeNo(Long value) {
        this.usageTypeNo = value;
    }

    public String getUsageTypeDesc() {
        return usageTypeDesc;
    }

    public void setUsageTypeDesc(String value) {
        this.usageTypeDesc = value;
    }

    public String getUsageUnitType() {
        return usageUnitType;
    }

    public void setUsageUnitType(String value) {
        this.usageUnitType = value;
    }

    public String getUsageTypeName() {
        return usageTypeName;
    }

    public void setUsageTypeName(String value) {
        this.usageTypeName = value;
    }

    public Long getIsEditable() {
        return isEditable;
    }

    public void setIsEditable(Long value) {
        this.isEditable = value;
    }

    public List<UsageTypeTranslationsReturnElement> getUsageTypeTranslations() {
        if (this.usageTypeTranslations == null) {
            this.usageTypeTranslations = new ArrayList<UsageTypeTranslationsReturnElement>();
        }
        return this.usageTypeTranslations;
    }
}
