package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supp_plan_row", propOrder = {
    "suppPlan",
    "planNo",
    "clientPlanId",
    "planInstanceDescription",
    "clientPlanInstanceId",
    "planInstanceIdx",
    "planInstanceUnits",
    "suppPlanNsoList",
    "planInstanceFieldsInfo",
    "altRateScheduleNo",
    "clientAltRateScheduleId",
    "usageAccumulationResetMonths",
    "usagePooling",
    "usageThresholdApplicability",
    "customRates"
    })
public class SuppPlanRow {

    @XmlElement(name = "supp_plan")
    protected com.aria.common.shared.SuppPlanArray suppPlan;
    @XmlElement(name = "plan_no")
    protected Long planNo;
    @XmlElement(name = "client_plan_id")
    protected String clientPlanId;
    @XmlElement(name = "plan_instance_description")
    protected String planInstanceDescription;
    @XmlElement(name = "client_plan_instance_id")
    protected String clientPlanInstanceId;
    @XmlElement(name = "plan_instance_idx")
    protected Long planInstanceIdx;
    @XmlElement(name = "plan_instance_units")
    protected Long planInstanceUnits;
    @XmlElement(name = "supp_plan_nso_list")
    protected com.aria.common.shared.SuppPlanNsoListArray suppPlanNsoList;
    @XmlElement(name = "plan_instance_fields_info")
    protected com.aria.common.shared.PlanInstanceFieldsInfoArray planInstanceFieldsInfo;
    @XmlElement(name = "alt_rate_schedule_no")
    protected Long altRateScheduleNo;
    @XmlElement(name = "client_alt_rate_schedule_id")
    protected String clientAltRateScheduleId;
    @XmlElement(name = "usage_accumulation_reset_months")
    protected Long usageAccumulationResetMonths;
    @XmlElement(name = "usage_pooling")
    protected String usagePooling;
    @XmlElement(name = "usage_threshold_applicability")
    protected String usageThresholdApplicability;
    @XmlElement(name = "custom_rates")
    protected com.aria.common.shared.CustomRatesArray customRates;
    public com.aria.common.shared.SuppPlanArray getSuppPlan() {
        return suppPlan;
    }

    public void setSuppPlan(com.aria.common.shared.SuppPlanArray value) {
        this.suppPlan = value;
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

    public String getPlanInstanceDescription() {
        return planInstanceDescription;
    }

    public void setPlanInstanceDescription(String value) {
        this.planInstanceDescription = value;
    }

    public String getClientPlanInstanceId() {
        return clientPlanInstanceId;
    }

    public void setClientPlanInstanceId(String value) {
        this.clientPlanInstanceId = value;
    }

    public Long getPlanInstanceIdx() {
        return planInstanceIdx;
    }

    public void setPlanInstanceIdx(Long value) {
        this.planInstanceIdx = value;
    }

    public Long getPlanInstanceUnits() {
        return planInstanceUnits;
    }

    public void setPlanInstanceUnits(Long value) {
        this.planInstanceUnits = value;
    }

    public com.aria.common.shared.SuppPlanNsoListArray getSuppPlanNsoList() {
        return suppPlanNsoList;
    }

    public void setSuppPlanNsoList(com.aria.common.shared.SuppPlanNsoListArray value) {
        this.suppPlanNsoList = value;
    }

    public com.aria.common.shared.PlanInstanceFieldsInfoArray getPlanInstanceFieldsInfo() {
        return planInstanceFieldsInfo;
    }

    public void setPlanInstanceFieldsInfo(com.aria.common.shared.PlanInstanceFieldsInfoArray value) {
        this.planInstanceFieldsInfo = value;
    }

    public Long getAltRateScheduleNo() {
        return altRateScheduleNo;
    }

    public void setAltRateScheduleNo(Long value) {
        this.altRateScheduleNo = value;
    }

    public String getClientAltRateScheduleId() {
        return clientAltRateScheduleId;
    }

    public void setClientAltRateScheduleId(String value) {
        this.clientAltRateScheduleId = value;
    }

    public Long getUsageAccumulationResetMonths() {
        return usageAccumulationResetMonths;
    }

    public void setUsageAccumulationResetMonths(Long value) {
        this.usageAccumulationResetMonths = value;
    }

    public String getUsagePooling() {
        return usagePooling;
    }

    public void setUsagePooling(String value) {
        this.usagePooling = value;
    }

    public String getUsageThresholdApplicability() {
        return usageThresholdApplicability;
    }

    public void setUsageThresholdApplicability(String value) {
        this.usageThresholdApplicability = value;
    }

    public com.aria.common.shared.CustomRatesArray getCustomRates() {
        return customRates;
    }

    public void setCustomRates(com.aria.common.shared.CustomRatesArray value) {
        this.customRates = value;
    }

    
}
