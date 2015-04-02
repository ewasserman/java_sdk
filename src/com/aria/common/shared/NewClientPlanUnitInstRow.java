package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "new_client_plan_unit_inst_row", propOrder = {
    "newClientPlanUnitInstId"
    })
public class NewClientPlanUnitInstRow {

    @XmlElement(name = "new_client_plan_unit_inst_id")
    protected String newClientPlanUnitInstId;
    public String getNewClientPlanUnitInstId() {
        return newClientPlanUnitInstId;
    }

    public void setNewClientPlanUnitInstId(String value) {
        this.newClientPlanUnitInstId = value;
    }

    
}
