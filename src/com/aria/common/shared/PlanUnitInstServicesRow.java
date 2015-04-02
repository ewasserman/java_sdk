package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_unit_inst_services_row", propOrder = {
    "serviceNo",
    "clientServiceId",
    "serviceFulfillmentDate",
    "fulfillmentDirective"
    })
public class PlanUnitInstServicesRow {

    @XmlElement(name = "service_no")
    protected Long serviceNo;
    @XmlElement(name = "client_service_id")
    protected String clientServiceId;
    @XmlElement(name = "service_fulfillment_date")
    protected String serviceFulfillmentDate;
    @XmlElement(name = "fulfillment_directive")
    protected Long fulfillmentDirective;
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

    public String getServiceFulfillmentDate() {
        return serviceFulfillmentDate;
    }

    public void setServiceFulfillmentDate(String value) {
        this.serviceFulfillmentDate = value;
    }

    public Long getFulfillmentDirective() {
        return fulfillmentDirective;
    }

    public void setFulfillmentDirective(Long value) {
        this.fulfillmentDirective = value;
    }

    
}
