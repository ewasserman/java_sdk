package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "update_plan_unit_instances_row", propOrder = {
    "planUnitInstNo",
    "clientPlanUnitInstId",
    "newClientPlanUnitInstId",
    "planUnitInstanceServices"
    })
public class UpdatePlanUnitInstancesRow {

    @XmlElement(name = "plan_unit_inst_no")
    protected Long planUnitInstNo;
    @XmlElement(name = "client_plan_unit_inst_id")
    protected String clientPlanUnitInstId;
    @XmlElement(name = "new_client_plan_unit_inst_id")
    protected String newClientPlanUnitInstId;
    @XmlElement(name = "plan_unit_instance_services")
    protected com.aria.common.shared.PlanUnitInstanceServicesArray planUnitInstanceServices;
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

    public String getNewClientPlanUnitInstId() {
        return newClientPlanUnitInstId;
    }

    public void setNewClientPlanUnitInstId(String value) {
        this.newClientPlanUnitInstId = value;
    }

    public com.aria.common.shared.PlanUnitInstanceServicesArray getPlanUnitInstanceServices() {
        return planUnitInstanceServices;
    }

    public void setPlanUnitInstanceServices(com.aria.common.shared.PlanUnitInstanceServicesArray value) {
        this.planUnitInstanceServices = value;
    }

    
}
