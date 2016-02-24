package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invoice_item_details_ReturnElement", propOrder = {"invoiceLineNo", "lineType", "planNo", "clientPlanId", "planName", "serviceNo", "clientServiceId", "serviceName", "serviceIsTaxInd", "planInstanceNo", "clientPlanInstanceId", "lineUnits", "ratePerUnit", "lineAmount", "lineBaseUnits", "prorationFactor", "lineDescription", "startDateRange", "endDateRange", "usageTypeNo", "usageTypeCd", "serviceCoaId", "clientServiceCoaCode", "refChargeLineNo", "nsoOrderNo", "nsoOrderStatusLabel", "clientSku", "itemNo", "clientItemId", "creditCouponCode", "creditReasonCodeDescription", "csrComments", "advBillingPeriodTotalDays", "rateScheduleNo", "rateScheduleTierNo"})
public class InvoiceItemDetailsReturnElement {

    @XmlElement(name = "invoice_line_no")
    protected Long invoiceLineNo;
    @XmlElement(name = "line_type")
    protected Long lineType;
    @XmlElement(name = "plan_no")
    protected Long planNo;
    @XmlElement(name = "client_plan_id")
    protected String clientPlanId;
    @XmlElement(name = "plan_name")
    protected String planName;
    @XmlElement(name = "service_no")
    protected Long serviceNo;
    @XmlElement(name = "client_service_id")
    protected String clientServiceId;
    @XmlElement(name = "service_name")
    protected Long serviceName;
    @XmlElement(name = "service_is_tax_ind")
    protected Long serviceIsTaxInd;
    @XmlElement(name = "plan_instance_no")
    protected Long planInstanceNo;
    @XmlElement(name = "client_plan_instance_id")
    protected Long clientPlanInstanceId;
    @XmlElement(name = "line_units")
    protected Double lineUnits;
    @XmlElement(name = "rate_per_unit")
    protected String ratePerUnit;
    @XmlElement(name = "line_amount")
    protected Long lineAmount;
    @XmlElement(name = "line_base_units")
    protected Long lineBaseUnits;
    @XmlElement(name = "proration_factor")
    protected String prorationFactor;
    @XmlElement(name = "line_description")
    protected Long lineDescription;
    @XmlElement(name = "start_date_range")
    protected Long startDateRange;
    @XmlElement(name = "end_date_range")
    protected String endDateRange;
    @XmlElement(name = "usage_type_no")
    protected Long usageTypeNo;
    @XmlElement(name = "usage_type_cd")
    protected Long usageTypeCd;
    @XmlElement(name = "service_coa_id")
    protected Long serviceCoaId;
    @XmlElement(name = "client_service_coa_code")
    protected Long clientServiceCoaCode;
    @XmlElement(name = "ref_charge_line_no")
    protected Long refChargeLineNo;
    @XmlElement(name = "nso_order_no")
    protected String nsoOrderNo;
    @XmlElement(name = "nso_order_status_label")
    protected Long nsoOrderStatusLabel;
    @XmlElement(name = "client_sku")
    protected Long clientSku;
    @XmlElement(name = "item_no")
    protected String itemNo;
    @XmlElement(name = "client_item_id")
    protected Long clientItemId;
    @XmlElement(name = "credit_coupon_code")
    protected String creditCouponCode;
    @XmlElement(name = "credit_reason_code_description")
    protected String creditReasonCodeDescription;
    @XmlElement(name = "csr_comments")
    protected String csrComments;
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

    public Long getLineType() {
        return lineType;
    }

    public void setLineType(Long value) {
        this.lineType = value;
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

    public Long getServiceName() {
        return serviceName;
    }

    public void setServiceName(Long value) {
        this.serviceName = value;
    }

    public Long getServiceIsTaxInd() {
        return serviceIsTaxInd;
    }

    public void setServiceIsTaxInd(Long value) {
        this.serviceIsTaxInd = value;
    }

    public Long getPlanInstanceNo() {
        return planInstanceNo;
    }

    public void setPlanInstanceNo(Long value) {
        this.planInstanceNo = value;
    }

    public Long getClientPlanInstanceId() {
        return clientPlanInstanceId;
    }

    public void setClientPlanInstanceId(Long value) {
        this.clientPlanInstanceId = value;
    }

    public Double getLineUnits() {
        return lineUnits;
    }

    public void setLineUnits(Double value) {
        this.lineUnits = value;
    }

    public String getRatePerUnit() {
        return ratePerUnit;
    }

    public void setRatePerUnit(String value) {
        this.ratePerUnit = value;
    }

    public Long getLineAmount() {
        return lineAmount;
    }

    public void setLineAmount(Long value) {
        this.lineAmount = value;
    }

    public Long getLineBaseUnits() {
        return lineBaseUnits;
    }

    public void setLineBaseUnits(Long value) {
        this.lineBaseUnits = value;
    }

    public String getProrationFactor() {
        return prorationFactor;
    }

    public void setProrationFactor(String value) {
        this.prorationFactor = value;
    }

    public Long getLineDescription() {
        return lineDescription;
    }

    public void setLineDescription(Long value) {
        this.lineDescription = value;
    }

    public Long getStartDateRange() {
        return startDateRange;
    }

    public void setStartDateRange(Long value) {
        this.startDateRange = value;
    }

    public String getEndDateRange() {
        return endDateRange;
    }

    public void setEndDateRange(String value) {
        this.endDateRange = value;
    }

    public Long getUsageTypeNo() {
        return usageTypeNo;
    }

    public void setUsageTypeNo(Long value) {
        this.usageTypeNo = value;
    }

    public Long getUsageTypeCd() {
        return usageTypeCd;
    }

    public void setUsageTypeCd(Long value) {
        this.usageTypeCd = value;
    }

    public Long getServiceCoaId() {
        return serviceCoaId;
    }

    public void setServiceCoaId(Long value) {
        this.serviceCoaId = value;
    }

    public Long getClientServiceCoaCode() {
        return clientServiceCoaCode;
    }

    public void setClientServiceCoaCode(Long value) {
        this.clientServiceCoaCode = value;
    }

    public Long getRefChargeLineNo() {
        return refChargeLineNo;
    }

    public void setRefChargeLineNo(Long value) {
        this.refChargeLineNo = value;
    }

    public String getNsoOrderNo() {
        return nsoOrderNo;
    }

    public void setNsoOrderNo(String value) {
        this.nsoOrderNo = value;
    }

    public Long getNsoOrderStatusLabel() {
        return nsoOrderStatusLabel;
    }

    public void setNsoOrderStatusLabel(Long value) {
        this.nsoOrderStatusLabel = value;
    }

    public Long getClientSku() {
        return clientSku;
    }

    public void setClientSku(Long value) {
        this.clientSku = value;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String value) {
        this.itemNo = value;
    }

    public Long getClientItemId() {
        return clientItemId;
    }

    public void setClientItemId(Long value) {
        this.clientItemId = value;
    }

    public String getCreditCouponCode() {
        return creditCouponCode;
    }

    public void setCreditCouponCode(String value) {
        this.creditCouponCode = value;
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
