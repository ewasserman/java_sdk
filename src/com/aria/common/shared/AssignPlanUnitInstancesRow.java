package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assign_plan_unit_instances_row", propOrder = {
    "clientPlanUnitInstId",
    "planUnitInstIdx",
    "planUnitInstanceServices"
    })
public class AssignPlanUnitInstancesRow {

    @XmlElement(name = "client_plan_unit_inst_id")
    protected String clientPlanUnitInstId;
    @XmlElement(name = "plan_unit_inst_idx")
    protected Long planUnitInstIdx;
    @XmlElement(name = "plan_unit_instance_services")
    protected com.aria.common.shared.PlanUnitInstanceServicesArray planUnitInstanceServices;
    public String getClientPlanUnitInstId() {
        return clientPlanUnitInstId;
    }

    public void setClientPlanUnitInstId(String value) {
        this.clientPlanUnitInstId = value;
    }

    public Long getPlanUnitInstIdx() {
        return planUnitInstIdx;
    }

    public void setPlanUnitInstIdx(Long value) {
        this.planUnitInstIdx = value;
    }

    public com.aria.common.shared.PlanUnitInstanceServicesArray getPlanUnitInstanceServices() {
        return planUnitInstanceServices;
    }

    public void setPlanUnitInstanceServices(com.aria.common.shared.PlanUnitInstanceServicesArray value) {
        this.planUnitInstanceServices = value;
    }

    
}
