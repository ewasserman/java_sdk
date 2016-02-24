package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_unit_instances_row", propOrder = {
    "clientPlanUnitInstId",
    "planUnitInstanceServices",
    "planUnitInstFields"
    })
public class PlanUnitInstancesRow {

    @XmlElement(name = "client_plan_unit_inst_id")
    protected String clientPlanUnitInstId;
    @XmlElement(name = "plan_unit_instance_services")
    protected com.aria.common.shared.PlanUnitInstanceServicesArray planUnitInstanceServices;
    @XmlElement(name = "plan_unit_inst_fields")
    protected com.aria.common.shared.PlanUnitInstFieldsArray planUnitInstFields;
    public String getClientPlanUnitInstId() {
        return clientPlanUnitInstId;
    }

    public void setClientPlanUnitInstId(String value) {
        this.clientPlanUnitInstId = value;
    }

    public com.aria.common.shared.PlanUnitInstanceServicesArray getPlanUnitInstanceServices() {
        return planUnitInstanceServices;
    }

    public void setPlanUnitInstanceServices(com.aria.common.shared.PlanUnitInstanceServicesArray value) {
        this.planUnitInstanceServices = value;
    }

    public com.aria.common.shared.PlanUnitInstFieldsArray getPlanUnitInstFields() {
        return planUnitInstFields;
    }

    public void setPlanUnitInstFields(com.aria.common.shared.PlanUnitInstFieldsArray value) {
        this.planUnitInstFields = value;
    }

    
}
