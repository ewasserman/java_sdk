package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "services_ReturnElement", propOrder = {"serviceNo", "serviceName", "serviceType", "clientServiceId", "serviceTranslations"})
public class ServicesReturnElement {

    @XmlElement(name = "service_no")
    protected Long serviceNo;
    @XmlElement(name = "service_name")
    protected String serviceName;
    @XmlElement(name = "service_type")
    protected String serviceType;
    @XmlElement(name = "client_service_id")
    protected String clientServiceId;
    @XmlElement(name = "service_translations")
    protected List<ServiceTranslationsReturnElement> serviceTranslations;
    
    public Long getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(Long value) {
        this.serviceNo = value;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String value) {
        this.serviceName = value;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String value) {
        this.serviceType = value;
    }

    public String getClientServiceId() {
        return clientServiceId;
    }

    public void setClientServiceId(String value) {
        this.clientServiceId = value;
    }

    public List<ServiceTranslationsReturnElement> getServiceTranslations() {
        if (this.serviceTranslations == null) {
            this.serviceTranslations = new ArrayList<ServiceTranslationsReturnElement>();
        }
        return this.serviceTranslations;
    }
}
