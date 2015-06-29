package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "service_outage_line_items_ReturnElement", propOrder = {"planNo", "planName", "serviceNo", "serviceName", "outageDuration", "creditAmount", "clientPlanId", "clientServiceId", "outAcctNo", "outMasterPlanInstanceNo", "outClientMpInstanceId"})
public class ServiceOutageLineItemsReturnElement {

    @XmlElement(name = "plan_no")
    protected Long planNo;
    @XmlElement(name = "plan_name")
    protected String planName;
    @XmlElement(name = "service_no")
    protected Long serviceNo;
    @XmlElement(name = "service_name")
    protected String serviceName;
    @XmlElement(name = "outage_duration")
    protected Double outageDuration;
    @XmlElement(name = "credit_amount")
    protected Double creditAmount;
    @XmlElement(name = "client_plan_id")
    protected String clientPlanId;
    @XmlElement(name = "client_service_id")
    protected String clientServiceId;
    @XmlElement(name = "out_acct_no")
    protected Long outAcctNo;
    @XmlElement(name = "out_master_plan_instance_no")
    protected Long outMasterPlanInstanceNo;
    @XmlElement(name = "out_client_mp_instance_id")
    protected String outClientMpInstanceId;
    
    public Long getPlanNo() {
        return planNo;
    }

    public void setPlanNo(Long value) {
        this.planNo = value;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String value) {
        this.planName = value;
    }

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

    public Double getOutageDuration() {
        return outageDuration;
    }

    public void setOutageDuration(Double value) {
        this.outageDuration = value;
    }

    public Double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Double value) {
        this.creditAmount = value;
    }

    public String getClientPlanId() {
        return clientPlanId;
    }

    public void setClientPlanId(String value) {
        this.clientPlanId = value;
    }

    public String getClientServiceId() {
        return clientServiceId;
    }

    public void setClientServiceId(String value) {
        this.clientServiceId = value;
    }

    public Long getOutAcctNo() {
        return outAcctNo;
    }

    public void setOutAcctNo(Long value) {
        this.outAcctNo = value;
    }

    public Long getOutMasterPlanInstanceNo() {
        return outMasterPlanInstanceNo;
    }

    public void setOutMasterPlanInstanceNo(Long value) {
        this.outMasterPlanInstanceNo = value;
    }

    public String getOutClientMpInstanceId() {
        return outClientMpInstanceId;
    }

    public void setOutClientMpInstanceId(String value) {
        this.outClientMpInstanceId = value;
    }

    
}
