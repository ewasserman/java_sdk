package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "master_plan_product_fields_row", propOrder = {
    "masterPlanProductFieldName",
    "masterPlanProductFieldVal"
    })
public class MasterPlanProductFieldsRow {

    @XmlElement(name = "master_plan_product_field_name")
    protected String masterPlanProductFieldName;
    @XmlElement(name = "master_plan_product_field_val")
    protected String masterPlanProductFieldVal;
    public String getMasterPlanProductFieldName() {
        return masterPlanProductFieldName;
    }

    public void setMasterPlanProductFieldName(String value) {
        this.masterPlanProductFieldName = value;
    }

    public String getMasterPlanProductFieldVal() {
        return masterPlanProductFieldVal;
    }

    public void setMasterPlanProductFieldVal(String value) {
        this.masterPlanProductFieldVal = value;
    }

    
}
