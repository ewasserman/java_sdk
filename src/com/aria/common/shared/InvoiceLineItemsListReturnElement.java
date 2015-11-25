package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invoice_line_items_list_ReturnElement", propOrder = {"lineNo", "serviceNo", "serviceName", "serviceIsTaxInd", "lineUnits", "ratePerUnit", "lineAmount", "description", "dateRangeStart", "dateRangeEnd", "usageTypeNo", "planNo", "planName", "clientServiceId", "usageTypeCd", "clientPlanId", "refChargeLineNo", "scheduleName", "clientRateScheduleId"})
public class InvoiceLineItemsListReturnElement {

    @XmlElement(name = "line_no")
    protected Long lineNo;
    @XmlElement(name = "service_no")
    protected Long serviceNo;
    @XmlElement(name = "service_name")
    protected String serviceName;
    @XmlElement(name = "service_is_tax_ind")
    protected Long serviceIsTaxInd;
    @XmlElement(name = "line_units")
    protected Double lineUnits;
    @XmlElement(name = "rate_per_unit")
    protected Double ratePerUnit;
    @XmlElement(name = "line_amount")
    protected Double lineAmount;
    @XmlElement(name = "description")
    protected String description;
    @XmlElement(name = "date_range_start")
    protected String dateRangeStart;
    @XmlElement(name = "date_range_end")
    protected String dateRangeEnd;
    @XmlElement(name = "usage_type_no")
    protected Long usageTypeNo;
    @XmlElement(name = "plan_no")
    protected Long planNo;
    @XmlElement(name = "plan_name")
    protected String planName;
    @XmlElement(name = "client_service_id")
    protected String clientServiceId;
    @XmlElement(name = "usage_type_cd")
    protected String usageTypeCd;
    @XmlElement(name = "client_plan_id")
    protected String clientPlanId;
    @XmlElement(name = "ref_charge_line_no")
    protected Long refChargeLineNo;
    @XmlElement(name = "schedule_name")
    protected String scheduleName;
    @XmlElement(name = "client_rate_schedule_id")
    protected String clientRateScheduleId;
    
    public Long getLineNo() {
        return lineNo;
    }

    public void setLineNo(Long value) {
        this.lineNo = value;
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

    public Long getServiceIsTaxInd() {
        return serviceIsTaxInd;
    }

    public void setServiceIsTaxInd(Long value) {
        this.serviceIsTaxInd = value;
    }

    public Double getLineUnits() {
        return lineUnits;
    }

    public void setLineUnits(Double value) {
        this.lineUnits = value;
    }

    public Double getRatePerUnit() {
        return ratePerUnit;
    }

    public void setRatePerUnit(Double value) {
        this.ratePerUnit = value;
    }

    public Double getLineAmount() {
        return lineAmount;
    }

    public void setLineAmount(Double value) {
        this.lineAmount = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public String getDateRangeStart() {
        return dateRangeStart;
    }

    public void setDateRangeStart(String value) {
        this.dateRangeStart = value;
    }

    public String getDateRangeEnd() {
        return dateRangeEnd;
    }

    public void setDateRangeEnd(String value) {
        this.dateRangeEnd = value;
    }

    public Long getUsageTypeNo() {
        return usageTypeNo;
    }

    public void setUsageTypeNo(Long value) {
        this.usageTypeNo = value;
    }

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

    public String getClientServiceId() {
        return clientServiceId;
    }

    public void setClientServiceId(String value) {
        this.clientServiceId = value;
    }

    public String getUsageTypeCd() {
        return usageTypeCd;
    }

    public void setUsageTypeCd(String value) {
        this.usageTypeCd = value;
    }

    public String getClientPlanId() {
        return clientPlanId;
    }

    public void setClientPlanId(String value) {
        this.clientPlanId = value;
    }

    public Long getRefChargeLineNo() {
        return refChargeLineNo;
    }

    public void setRefChargeLineNo(Long value) {
        this.refChargeLineNo = value;
    }

    public String getScheduleName() {
        return scheduleName;
    }

    public void setScheduleName(String value) {
        this.scheduleName = value;
    }

    public String getClientRateScheduleId() {
        return clientRateScheduleId;
    }

    public void setClientRateScheduleId(String value) {
        this.clientRateScheduleId = value;
    }

    
}
