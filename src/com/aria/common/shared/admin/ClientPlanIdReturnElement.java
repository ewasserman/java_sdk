package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_plan_id_ReturnElement", propOrder = {"clientPlanIds", "planIds"})
public class ClientPlanIdReturnElement {

    @XmlElement(name = "client_plan_ids")
    protected String clientPlanIds;
    @XmlElement(name = "plan_ids")
    protected String planIds;
    
    public String getClientPlanIds() {
        return clientPlanIds;
    }

    public void setClientPlanIds(String value) {
        this.clientPlanIds = value;
    }

    public String getPlanIds() {
        return planIds;
    }

    public void setPlanIds(String value) {
        this.planIds = value;
    }

    
}
