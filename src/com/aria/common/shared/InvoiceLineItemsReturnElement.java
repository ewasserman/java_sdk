package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invoice_line_items_ReturnElement", propOrder = {"lineNo", "lineType", "serviceNo", "serviceName", "units", "ratePerUnit", "amount", "basePlanUnits", "prorationFactor", "description", "dateRangeStart", "dateRangeEnd", "creditCouponCode", "planNo", "planName", "clientServiceId", "clientPlanId", "usageTypeNo", "creditReasonCodeDescription", "csrComments", "clientSku", "orderNo", "itemNo", "usageTypeCd", "clientItemId", "prorationText", "advBillingPeriodTotalDays", "prorationRemainingDays", "prorationDescription", "rateScheduleNo", "rateScheduleTierNo"})
public class InvoiceLineItemsReturnElement {

    @XmlElement(name = "line_no")
    protected Long lineNo;
    @XmlElement(name = "line_type")
    protected Long lineType;
    @XmlElement(name = "service_no")
    protected Long serviceNo;
    @XmlElement(name = "service_name")
    protected String serviceName;
    @XmlElement(name = "units")
    protected Double units;
    @XmlElement(name = "rate_per_unit")
    protected Double ratePerUnit;
    @XmlElement(name = "amount")
    protected Double amount;
    @XmlElement(name = "base_plan_units")
    protected Double basePlanUnits;
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
    @XmlElement(name = "plan_no")
    protected Long planNo;
    @XmlElement(name = "plan_name")
    protected String planName;
    @XmlElement(name = "client_service_id")
    protected String clientServiceId;
    @XmlElement(name = "client_plan_id")
    protected String clientPlanId;
    @XmlElement(name = "usage_type_no")
    protected Long usageTypeNo;
    @XmlElement(name = "credit_reason_code_description")
    protected String creditReasonCodeDescription;
    @XmlElement(name = "csr_comments")
    protected String csrComments;
    @XmlElement(name = "client_sku")
    protected String clientSku;
    @XmlElement(name = "order_no")
    protected Long orderNo;
    @XmlElement(name = "item_no")
    protected Long itemNo;
    @XmlElement(name = "usage_type_cd")
    protected String usageTypeCd;
    @XmlElement(name = "client_item_id")
    protected String clientItemId;
    @XmlElement(name = "proration_text")
    protected String prorationText;
    @XmlElement(name = "adv_billing_period_total_days")
    protected Long advBillingPeriodTotalDays;
    @XmlElement(name = "proration_remaining_days")
    protected Long prorationRemainingDays;
    @XmlElement(name = "proration_description")
    protected String prorationDescription;
    @XmlElement(name = "rate_schedule_no")
    protected Long rateScheduleNo;
    @XmlElement(name = "rate_schedule_tier_no")
    protected Long rateScheduleTierNo;
    
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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double value) {
        this.amount = value;
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

    public String getClientPlanId() {
        return clientPlanId;
    }

    public void setClientPlanId(String value) {
        this.clientPlanId = value;
    }

    public Long getUsageTypeNo() {
        return usageTypeNo;
    }

    public void setUsageTypeNo(Long value) {
        this.usageTypeNo = value;
    }

    public String getCreditReasonCodeDescription() {
        return creditReasonCodeDescription;
    }

    public void setCreditReasonCodeDescription(String value) {
        this.creditReasonCodeDescription = value;
    }

    public String getCsrComments() {
        return csrComments;
    }

    public void setCsrComments(String value) {
        this.csrComments = value;
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

    public String getUsageTypeCd() {
        return usageTypeCd;
    }

    public void setUsageTypeCd(String value) {
        this.usageTypeCd = value;
    }

    public String getClientItemId() {
        return clientItemId;
    }

    public void setClientItemId(String value) {
        this.clientItemId = value;
    }

    public String getProrationText() {
        return prorationText;
    }

    public void setProrationText(String value) {
        this.prorationText = value;
    }

    public Long getAdvBillingPeriodTotalDays() {
        return advBillingPeriodTotalDays;
    }

    public void setAdvBillingPeriodTotalDays(Long value) {
        this.advBillingPeriodTotalDays = value;
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
