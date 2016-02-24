package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invoice_items_ReturnElement", propOrder = {"invoiceLineNo", "planNo", "clientPlanId", "planInstanceNo", "clientPlanInstanceId", "planName", "serviceNo", "clientServiceId", "serviceName", "serviceCoaId", "clientServiceCoaCode", "units", "ratePerUnit", "lineAmount", "lineDescription", "startDateRange", "endDateRange", "lineType", "basePlanUnits", "prorationFactor", "prorationText", "prorationRemainingDays", "prorationDescription", "creditCouponCode", "clientSku", "orderNo", "itemNo", "clientItemId", "advBillingPeriodTotalDays", "rateScheduleNo", "rateScheduleTierNo"})
public class InvoiceItemsReturnElement {

    @XmlElement(name = "invoice_line_no")
    protected Long invoiceLineNo;
    @XmlElement(name = "plan_no")
    protected Long planNo;
    @XmlElement(name = "client_plan_id")
    protected String clientPlanId;
    @XmlElement(name = "plan_instance_no")
    protected Long planInstanceNo;
    @XmlElement(name = "client_plan_instance_id")
    protected String clientPlanInstanceId;
    @XmlElement(name = "plan_name")
    protected String planName;
    @XmlElement(name = "service_no")
    protected Long serviceNo;
    @XmlElement(name = "client_service_id")
    protected String clientServiceId;
    @XmlElement(name = "service_name")
    protected String serviceName;
    @XmlElement(name = "service_coa_id")
    protected Long serviceCoaId;
    @XmlElement(name = "client_service_coa_code")
    protected String clientServiceCoaCode;
    @XmlElement(name = "units")
    protected Double units;
    @XmlElement(name = "rate_per_unit")
    protected Double ratePerUnit;
    @XmlElement(name = "line_amount")
    protected Double lineAmount;
    @XmlElement(name = "line_description")
    protected String lineDescription;
    @XmlElement(name = "start_date_range")
    protected String startDateRange;
    @XmlElement(name = "end_date_range")
    protected String endDateRange;
    @XmlElement(name = "line_type")
    protected Long lineType;
    @XmlElement(name = "base_plan_units")
    protected Double basePlanUnits;
    @XmlElement(name = "proration_factor")
    protected Double prorationFactor;
    @XmlElement(name = "proration_text")
    protected String prorationText;
    @XmlElement(name = "proration_remaining_days")
    protected Long prorationRemainingDays;
    @XmlElement(name = "proration_description")
    protected String prorationDescription;
    @XmlElement(name = "credit_coupon_code")
    protected String creditCouponCode;
    @XmlElement(name = "client_sku")
    protected String clientSku;
    @XmlElement(name = "order_no")
    protected Long orderNo;
    @XmlElement(name = "item_no")
    protected Long itemNo;
    @XmlElement(name = "client_item_id")
    protected String clientItemId;
    @XmlElement(name = "adv_billing_period_total_days")
    protected Long advBillingPeriodTotalDays;
    @XmlElement(name = "rate_schedule_no")
    protected Long rateScheduleNo;
    @XmlElement(name = "rate_schedule_tier_no")
    protected Long rateScheduleTierNo;
    
    public Long getInvoiceLineNo() {
        return invoiceLineNo;
    }

    public void setInvoiceLineNo(Long value) {
        this.invoiceLineNo = value;
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

    public Long getPlanInstanceNo() {
        return planInstanceNo;
    }

    public void setPlanInstanceNo(Long value) {
        this.planInstanceNo = value;
    }

    public String getClientPlanInstanceId() {
        return clientPlanInstanceId;
    }

    public void setClientPlanInstanceId(String value) {
        this.clientPlanInstanceId = value;
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

    public Long getServiceCoaId() {
        return serviceCoaId;
    }

    public void setServiceCoaId(Long value) {
        this.serviceCoaId = value;
    }

    public String getClientServiceCoaCode() {
        return clientServiceCoaCode;
    }

    public void setClientServiceCoaCode(String value) {
        this.clientServiceCoaCode = value;
    }

    public Double getUnits() {
        return units;
    }

    public void setUnits(Double value) {
        this.units = value;
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

    public String getLineDescription() {
        return lineDescription;
    }

    public void setLineDescription(String value) {
        this.lineDescription = value;
    }

    public String getStartDateRange() {
        return startDateRange;
    }

    public void setStartDateRange(String value) {
        this.startDateRange = value;
    }

    public String getEndDateRange() {
        return endDateRange;
    }

    public void setEndDateRange(String value) {
        this.endDateRange = value;
    }

    public Long getLineType() {
        return lineType;
    }

    public void setLineType(Long value) {
        this.lineType = value;
    }

    public Double getBasePlanUnits() {
        return basePlanUnits;
    }

    public void setBasePlanUnits(Double value) {
        this.basePlanUnits = value;
    }

    public Double getProrationFactor() {
        return prorationFactor;
    }

    public void setProrationFactor(Double value) {
        this.prorationFactor = value;
    }

    public String getProrationText() {
        return prorationText;
    }

    public void setProrationText(String value) {
        this.prorationText = value;
    }

    public Long getProrationRemainingDays() {
        return prorationRemainingDays;
    }

    public void setProrationRemainingDays(Long value) {
        this.prorationRemainingDays = value;
    }

    public String getProrationDescription() {
        return prorationDescription;
    }

    public void setProrationDescription(String value) {
        this.prorationDescription = value;
    }

    public String getCreditCouponCode() {
        return creditCouponCode;
    }

    public void setCreditCouponCode(String value) {
        this.creditCouponCode = value;
    }

    public String getClientSku() {
        return clientSku;
    }

    public void setClientSku(String value) {
        this.clientSku = value;
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long value) {
        this.orderNo = value;
    }

    public Long getItemNo() {
        return itemNo;
    }

    public void setItemNo(Long value) {
        this.itemNo = value;
    }

    public String getClientItemId() {
        return clientItemId;
    }

    public void setClientItemId(String value) {
        this.clientItemId = value;
    }

    public Long getAdvBillingPeriodTotalDays() {
        return advBillingPeriodTotalDays;
    }

    public void setAdvBillingPeriodTotalDays(Long value) {
        this.advBillingPeriodTotalDays = value;
    }

    public Long getRateScheduleNo() {
        return rateScheduleNo;
    }

    public void setRateScheduleNo(Long value) {
        this.rateScheduleNo = value;
    }

    public Long getRateScheduleTierNo() {
        return rateScheduleTierNo;
    }

    public void setRateScheduleTierNo(Long value) {
        this.rateScheduleTierNo = value;
    }

    
}
