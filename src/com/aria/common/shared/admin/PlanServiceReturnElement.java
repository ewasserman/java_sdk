package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_service_ReturnElement", propOrder = {"planServices", "planNo", "clientPlanId", "serviceNo", "clientServiceId"})
public class PlanServiceReturnElement {

    @XmlElement(name = "plan_services")
    protected  planServices;
    @XmlElement(name = "plan_no")
    protected Long planNo;
    @XmlElement(name = "client_plan_id")
    protected String clientPlanId;
    @XmlElement(name = "service_no")
    protected List<ServiceNoReturnElement> serviceNo;
    @XmlElement(name = "client_service_id")
    protected List<ClientServiceIdReturnElement> clientServiceId;
    
    public  getPlanServices() {
        return planServices;
    }

    public void setPlanServices( value) {
        this.planServices = value;
    }

    public Long getPlanNo() {
        return planNo;
    }

    public void setPlanNo(Long value) {
        this.planNo = value;
    }

    public String getClientPlanId() {
        return clientPlanId;
    }

    public void setClientPlanId(String value) {
        this.clientPlanId = value;
    }

    public List<ServiceNoReturnElement> getServiceNo() {
        if (this.serviceNo == null) {
            this.serviceNo = new ArrayList<ServiceNoReturnElement>();
        }
        return this.serviceNo;
    }public List<ClientServiceIdReturnElement> getClientServiceId() {
        if (this.clientServiceId == null) {
            this.clientServiceId = new ArrayList<ClientServiceIdReturnElement>();
        }
        return this.clientServiceId;
    }
}
