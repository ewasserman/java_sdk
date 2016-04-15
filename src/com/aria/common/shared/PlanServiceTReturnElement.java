package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_service_t_ReturnElement", propOrder = {"serviceNo", "serviceName", "allServiceSuppFieldsT", "planServiceRatesT", "usageTypeName", "usageTypeDesc", "usageUnitLabel"})
public class PlanServiceTReturnElement {

    @XmlElement(name = "service_no")
    protected Long serviceNo;
    @XmlElement(name = "service_name")
    protected String serviceName;
    @XmlElement(name = "all_service_supp_fields_t")
    protected List<AllServiceSuppFieldsTReturnElement> allServiceSuppFieldsT;
    @XmlElement(name = "plan_service_rates_t")
    protected List<PlanServiceRatesTReturnElement> planServiceRatesT;
    @XmlElement(name = "usage_type_name")
    protected String usageTypeName;
    @XmlElement(name = "usage_type_desc")
    protected String usageTypeDesc;
    @XmlElement(name = "usage_unit_label")
    protected String usageUnitLabel;
    
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

    public List<AllServiceSuppFieldsTReturnElement> getAllServiceSuppFieldsT() {
        if (this.allServiceSuppFieldsT == null) {
            this.allServiceSuppFieldsT = new ArrayList<AllServiceSuppFieldsTReturnElement>();
        }
        return this.allServiceSuppFieldsT;
    }public List<PlanServiceRatesTReturnElement> getPlanServiceRatesT() {
        if (this.planServiceRatesT == null) {
            this.planServiceRatesT = new ArrayList<PlanServiceRatesTReturnElement>();
        }
        return this.planServiceRatesT;
    }public String getUsageTypeName() {
        return usageTypeName;
    }

    public void setUsageTypeName(String value) {
        this.usageTypeName = value;
    }

    public String getUsageTypeDesc() {
        return usageTypeDesc;
    }

    public void setUsageTypeDesc(String value) {
        this.usageTypeDesc = value;
    }

    public String getUsageUnitLabel() {
        return usageUnitLabel;
    }

    public void setUsageUnitLabel(String value) {
        this.usageUnitLabel = value;
    }

    
}
