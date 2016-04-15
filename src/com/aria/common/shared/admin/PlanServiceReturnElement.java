package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_service_ReturnElement", propOrder = {"planNo", "clientPlanId", "serviceNo", "clientServiceId"})
public class PlanServiceReturnElement {

    @XmlElement(name = "plan_no")
    protected String planNo;
    @XmlElement(name = "client_plan_id")
    protected String clientPlanId;
    @XmlElement(name = "service_no")
    protected String serviceNo;
    @XmlElement(name = "client_service_id")
    protected String clientServiceId;
    
    public String getPlanNo() {
        return planNo;
    }

    public void setPlanNo(String value) {
        this.planNo = value;
    }

    public String getClientPlanId() {
        return clientPlanId;
    }

    public void setClientPlanId(String value) {
        this.clientPlanId = value;
    }

    public String getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(String value) {
        this.serviceNo = value;
    }

    public String getClientServiceId() {
        return clientServiceId;
    }

    public void setClientServiceId(String value) {
        this.clientServiceId = value;
    }

    
}
