package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queued_plan_instance_details_ReturnElement", propOrder = {"originalPlan", "originalPlanNo", "newPlan", "newPlanNo", "changeDate", "newRateScheduleNo", "clientReceiptId", "newPlanUnits", "newPlanType", "clientOriginalPlanId", "clientNewPlanId", "clientNewRateScheduleId", "currentRateScheduleNo", "clientCurrentRateScheduleId", "customRate"})
public class QueuedPlanInstanceDetailsReturnElement {

    @XmlElement(name = "original_plan")
    protected String originalPlan;
    @XmlElement(name = "original_plan_no")
    protected Long originalPlanNo;
    @XmlElement(name = "new_plan")
    protected String newPlan;
    @XmlElement(name = "new_plan_no")
    protected Long newPlanNo;
    @XmlElement(name = "change_date")
    protected String changeDate;
    @XmlElement(name = "new_rate_schedule_no")
    protected Long newRateScheduleNo;
    @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
    @XmlElement(name = "new_plan_units")
    protected Double newPlanUnits;
    @XmlElement(name = "new_plan_type")
    protected String newPlanType;
    @XmlElement(name = "client_original_plan_id")
    protected String clientOriginalPlanId;
    @XmlElement(name = "client_new_plan_id")
    protected String clientNewPlanId;
    @XmlElement(name = "client_new_rate_schedule_id")
    protected String clientNewRateScheduleId;
    @XmlElement(name = "current_rate_schedule_no")
    protected Long currentRateScheduleNo;
    @XmlElement(name = "client_current_rate_schedule_id")
    protected String clientCurrentRateScheduleId;
    @XmlElement(name = "custom_rate")
    protected List<CustomRateReturnElement> customRate;
    
    public String getOriginalPlan() {
        return originalPlan;
    }

    public void setOriginalPlan(String value) {
        this.originalPlan = value;
    }

    public Long getOriginalPlanNo() {
        return originalPlanNo;
    }

    public void setOriginalPlanNo(Long value) {
        this.originalPlanNo = value;
    }

    public String getNewPlan() {
        return newPlan;
    }

    public void setNewPlan(String value) {
        this.newPlan = value;
    }

    public Long getNewPlanNo() {
        return newPlanNo;
    }

    public void setNewPlanNo(Long value) {
        this.newPlanNo = value;
    }

    public String getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(String value) {
        this.changeDate = value;
    }

    public Long getNewRateScheduleNo() {
        return newRateScheduleNo;
    }

    public void setNewRateScheduleNo(Long value) {
        this.newRateScheduleNo = value;
    }

    public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
    }

    public Double getNewPlanUnits() {
        return newPlanUnits;
    }

    public void setNewPlanUnits(Double value) {
        this.newPlanUnits = value;
    }

    public String getNewPlanType() {
        return newPlanType;
    }

    public void setNewPlanType(String value) {
        this.newPlanType = value;
    }

    public String getClientOriginalPlanId() {
        return clientOriginalPlanId;
    }

    public void setClientOriginalPlanId(String value) {
        this.clientOriginalPlanId = value;
    }

    public String getClientNewPlanId() {
        return clientNewPlanId;
    }

    public void setClientNewPlanId(String value) {
        this.clientNewPlanId = value;
    }

    public String getClientNewRateScheduleId() {
        return clientNewRateScheduleId;
    }

    public void setClientNewRateScheduleId(String value) {
        this.clientNewRateScheduleId = value;
    }

    public Long getCurrentRateScheduleNo() {
        return currentRateScheduleNo;
    }

    public void setCurrentRateScheduleNo(Long value) {
        this.currentRateScheduleNo = value;
    }

    public String getClientCurrentRateScheduleId() {
        return clientCurrentRateScheduleId;
    }

    public void setClientCurrentRateScheduleId(String value) {
        this.clientCurrentRateScheduleId = value;
    }

    public List<CustomRateReturnElement> getCustomRate() {
        if (this.customRate == null) {
            this.customRate = new ArrayList<CustomRateReturnElement>();
        }
        return this.customRate;
    }
}
