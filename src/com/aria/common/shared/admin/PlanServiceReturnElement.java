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
    protected List<PlanNoReturnElement> planNo;
    @XmlElement(name = "client_plan_id")
    protected List<ClientPlanIdReturnElement> clientPlanId;
    @XmlElement(name = "service_no")
    protected List<ServiceNoReturnElement> serviceNo;
    @XmlElement(name = "client_service_id")
    protected List<ClientServiceIdReturnElement> clientServiceId;
    
    public List<PlanNoReturnElement> getPlanNo() {
        if (this.planNo == null) {
            this.planNo = new ArrayList<PlanNoReturnElement>();
        }
        return this.planNo;
    }public List<ClientPlanIdReturnElement> getClientPlanId() {
        if (this.clientPlanId == null) {
            this.clientPlanId = new ArrayList<ClientPlanIdReturnElement>();
        }
        return this.clientPlanId;
    }public List<ServiceNoReturnElement> getServiceNo() {
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
