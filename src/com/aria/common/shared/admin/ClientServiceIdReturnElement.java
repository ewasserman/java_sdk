package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_service_id_ReturnElement", propOrder = {"clientServiceIds", "serviceIds"})
public class ClientServiceIdReturnElement {

    @XmlElement(name = "client_service_ids")
    protected String clientServiceIds;
    @XmlElement(name = "service_ids")
    protected String serviceIds;
    
    public String getClientServiceIds() {
        return clientServiceIds;
    }

    public void setClientServiceIds(String value) {
        this.clientServiceIds = value;
    }

    public String getServiceIds() {
        return serviceIds;
    }

    public void setServiceIds(String value) {
        this.serviceIds = value;
    }

    
}
