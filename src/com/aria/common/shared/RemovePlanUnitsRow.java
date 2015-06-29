package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remove_plan_units_row", propOrder = {
    "planUnitInstNo",
    "clientPlanUnitInstId"
    })
public class RemovePlanUnitsRow {

    @XmlElement(name = "plan_unit_inst_no")
    protected Long planUnitInstNo;
    @XmlElement(name = "client_plan_unit_inst_id")
    protected String clientPlanUnitInstId;
    public Long getPlanUnitInstNo() {
        return planUnitInstNo;
    }

    public void setPlanUnitInstNo(Long value) {
        this.planUnitInstNo = value;
    }

    public String getClientPlanUnitInstId() {
        return clientPlanUnitInstId;
    }

    public void setClientPlanUnitInstId(String value) {
        this.clientPlanUnitInstId = value;
    }

    
}
