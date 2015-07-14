package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contract_plans_row", propOrder = {
    "planInstanceIdx",
    "clientPlanInstanceId",
    "cascadeAction"
    })
public class ContractPlansRow {

    @XmlElement(name = "plan_instance_idx")
    protected Long planInstanceIdx;
    @XmlElement(name = "client_plan_instance_id")
    protected String clientPlanInstanceId;
    @XmlElement(name = "cascade_action")
    protected String cascadeAction;
    public Long getPlanInstanceIdx() {
        return planInstanceIdx;
    }

    public void setPlanInstanceIdx(Long value) {
        this.planInstanceIdx = value;
    }

    public String getClientPlanInstanceId() {
        return clientPlanInstanceId;
    }

    public void setClientPlanInstanceId(String value) {
        this.clientPlanInstanceId = value;
    }

    public String getCascadeAction() {
        return cascadeAction;
    }

    public void setCascadeAction(String value) {
        this.cascadeAction = value;
    }

    
}
