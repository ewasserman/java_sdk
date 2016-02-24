package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_unit_inst_services_info_ReturnElement", propOrder = {"serviceNo", "clientServiceId", "serviceName", "fulfillmentStatus", "fulfillmentDate"})
public class PlanUnitInstServicesInfoReturnElement {

    @XmlElement(name = "service_no")
    protected Long serviceNo;
    @XmlElement(name = "client_service_id")
    protected String clientServiceId;
    @XmlElement(name = "service_name")
    protected String serviceName;
    @XmlElement(name = "fulfillment_status")
    protected String fulfillmentStatus;
    @XmlElement(name = "fulfillment_date")
    protected String fulfillmentDate;
    
    public Long getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(Long value) {
        this.serviceNo = value;
    }

    public String getClientServiceId() {
        return clientServiceId;
    }

    public void setClientServiceId(String value) {
        this.clientServiceId = value;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String value) {
        this.serviceName = value;
    }

    public String getFulfillmentStatus() {
        return fulfillmentStatus;
    }

    public void setFulfillmentStatus(String value) {
        this.fulfillmentStatus = value;
    }

    public String getFulfillmentDate() {
        return fulfillmentDate;
    }

    public void setFulfillmentDate(String value) {
        this.fulfillmentDate = value;
    }

    
}
