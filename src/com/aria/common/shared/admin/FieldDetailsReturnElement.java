package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "field_details_ReturnElement", propOrder = {"fieldNo", "fieldName", "description", "datatype", "minNoSel", "maxNoSel", "formInputType", "allowedValues", "associatedTypes", "fieldCategories", "objectValues", "allowInstanceOverride"})
public class FieldDetailsReturnElement {

    @XmlElement(name = "field_no")
    protected Long fieldNo;
    @XmlElement(name = "field_name")
    protected String fieldName;
    @XmlElement(name = "description")
    protected Long description;
    @XmlElement(name = "datatype")
    protected Long datatype;
    @XmlElement(name = "min_no_sel")
    protected Long minNoSel;
    @XmlElement(name = "max_no_sel")
    protected Long maxNoSel;
    @XmlElement(name = "form_input_type")
    protected String formInputType;
    @XmlElement(name = "allowed_values")
    protected List<AllowedValuesReturnElement> allowedValues;
    @XmlElement(name = "associated_types")
    protected String associatedTypes;
    @XmlElement(name = "field_categories")
    protected List<FieldCategoriesReturnElement> fieldCategories;
    @XmlElement(name = "object_values")
    protected List<ObjectValuesReturnElement> objectValues;
    @XmlElement(name = "allow_instance_override")
    protected Long allowInstanceOverride;
    
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

    public Long getDescription() {
        return description;
    }

    public void setDescription(Long value) {
        this.description = value;
    }

    public Long getDatatype() {
        return datatype;
    }

    public void setDatatype(Long value) {
        this.datatype = value;
    }

    public Long getMinNoSel() {
        return minNoSel;
    }

    public void setMinNoSel(Long value) {
        this.minNoSel = value;
    }

    public Long getMaxNoSel() {
        return maxNoSel;
    }

    public void setMaxNoSel(Long value) {
        this.maxNoSel = value;
    }

    public String getFormInputType() {
        return formInputType;
    }

    public void setFormInputType(String value) {
        this.formInputType = value;
    }

    public List<AllowedValuesReturnElement> getAllowedValues() {
        if (this.allowedValues == null) {
            this.allowedValues = new ArrayList<AllowedValuesReturnElement>();
        }
        return this.allowedValues;
    }public String getAssociatedTypes() {
        return associatedTypes;
    }

    public void setAssociatedTypes(String value) {
        this.associatedTypes = value;
    }

    public List<FieldCategoriesReturnElement> getFieldCategories() {
        if (this.fieldCategories == null) {
            this.fieldCategories = new ArrayList<FieldCategoriesReturnElement>();
        }
        return this.fieldCategories;
    }public List<ObjectValuesReturnElement> getObjectValues() {
        if (this.objectValues == null) {
            this.objectValues = new ArrayList<ObjectValuesReturnElement>();
        }
        return this.objectValues;
    }public Long getAllowInstanceOverride() {
        return allowInstanceOverride;
    }

    public void setAllowInstanceOverride(Long value) {
        this.allowInstanceOverride = value;
    }

    
}
