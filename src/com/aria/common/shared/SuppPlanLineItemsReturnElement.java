package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supp_plan_line_items_ReturnElement", propOrder = {"lineNo", "lineType", "serviceNo", "serviceName", "lineUnits", "ratePerUnit", "lineAmount", "lineBaseUnits", "prorationFactor", "description", "dateRangeStart", "dateRangeEnd", "creditCouponCode", "outPlanNo", "planName", "clientServiceId", "outClientPlanId"})
public class SuppPlanLineItemsReturnElement {

    @XmlElement(name = "line_no")
    protected Long lineNo;
    @XmlElement(name = "line_type")
    protected Long lineType;
    @XmlElement(name = "service_no")
    protected Long serviceNo;
    @XmlElement(name = "service_name")
    protected String serviceName;
    @XmlElement(name = "line_units")
    protected Double lineUnits;
    @XmlElement(name = "rate_per_unit")
    protected Double ratePerUnit;
    @XmlElement(name = "line_amount")
    protected Double lineAmount;
    @XmlElement(name = "line_base_units")
    protected Double lineBaseUnits;
    @XmlElement(name = "proration_factor")
    protected Double prorationFactor;
    @XmlElement(name = "description")
    protected String description;
    @XmlElement(name = "date_range_start")
    protected String dateRangeStart;
    @XmlElement(name = "date_range_end")
    protected String dateRangeEnd;
    @XmlElement(name = "credit_coupon_code")
    protected String creditCouponCode;
    @XmlElement(name = "out_plan_no")
    protected Long outPlanNo;
    @XmlElement(name = "plan_name")
    protected String planName;
    @XmlElement(name = "client_service_id")
    protected String clientServiceId;
    @XmlElement(name = "out_client_plan_id")
    protected String outClientPlanId;
    
    public Long getLineNo() {
        return lineNo;
    }

    public void setLineNo(Long value) {
        this.lineNo = value;
    }

    public Long getLineType() {
        return lineType;
    }

    public void setLineType(Long value) {
        this.lineType = value;
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

    public Double getLineBaseUnits() {
        return lineBaseUnits;
    }

    public void setLineBaseUnits(Double value) {
        this.lineBaseUnits = value;
    }

    public Double getProrationFactor() {
        return prorationFactor;
    }

    public void setProrationFactor(Double value) {
        this.prorationFactor = value;
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

    public String getCreditCouponCode() {
        return creditCouponCode;
    }

    public void setCreditCouponCode(String value) {
        this.creditCouponCode = value;
    }

    public Long getOutPlanNo() {
        return outPlanNo;
    }

    public void setOutPlanNo(Long value) {
        this.outPlanNo = value;
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

    public String getOutClientPlanId() {
        return outClientPlanId;
    }

    public void setOutClientPlanId(String value) {
        this.outClientPlanId = value;
    }

    
}
