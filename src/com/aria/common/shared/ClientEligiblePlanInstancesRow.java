package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_eligible_plan_instances_row", propOrder = {
    "clientPlanInstanceId",
    "clientPlanInstanceServiceId"
    })
public class ClientEligiblePlanInstancesRow {

    @XmlElement(name = "client_plan_instance_id")
    protected String clientPlanInstanceId;
    @XmlElement(name = "client_plan_instance_service_id")
    protected String clientPlanInstanceServiceId;
    public String getClientPlanInstanceId() {
        return clientPlanInstanceId;
    }

    public void setClientPlanInstanceId(String value) {
        this.clientPlanInstanceId = value;
    }

    public String getClientPlanInstanceServiceId() {
        return clientPlanInstanceServiceId;
    }

    public void setClientPlanInstanceServiceId(String value) {
        this.clientPlanInstanceServiceId = value;
    }

    
}
