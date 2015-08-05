package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supp_plans_info_ReturnElement", propOrder = {"suppPlanInstanceNo", "clientSuppPlanInstanceId", "suppPlanNo", "clientSuppPlanId", "suppPlanInstanceDescription", "suppPlanUnits", "altRateScheduleNo", "clientAltRateScheduleId", "lastArrearsBillThruDate", "lastBillDate", "lastBillThruDate", "nextBillDate", "planDate", "statusDate", "suppPlanInstanceStatus", "parentPlanInstanceNo", "clientParentPlanInstanceId", "recurringBillingInterval", "usageBillingInterval", "rolloverPlanStatus", "rolloverPlanStatusDuration", "rolloverPlanStatusUomCd", "planDeprovisionedDate", "suppPlanProductFields", "suppPlanPlanInstFields"})
public class SuppPlansInfoReturnElement {

    @XmlElement(name = "supp_plan_instance_no")
    protected Long suppPlanInstanceNo;
    @XmlElement(name = "client_supp_plan_instance_id")
    protected String clientSuppPlanInstanceId;
    @XmlElement(name = "supp_plan_no")
    protected Long suppPlanNo;
    @XmlElement(name = "client_supp_plan_id")
    protected String clientSuppPlanId;
    @XmlElement(name = "supp_plan_instance_description")
    protected String suppPlanInstanceDescription;
    @XmlElement(name = "supp_plan_units")
    protected Long suppPlanUnits;
    @XmlElement(name = "alt_rate_schedule_no")
    protected Long altRateScheduleNo;
    @XmlElement(name = "client_alt_rate_schedule_id")
    protected String clientAltRateScheduleId;
    @XmlElement(name = "last_arrears_bill_thru_date")
    protected String lastArrearsBillThruDate;
    @XmlElement(name = "last_bill_date")
    protected String lastBillDate;
    @XmlElement(name = "last_bill_thru_date")
    protected String lastBillThruDate;
    @XmlElement(name = "next_bill_date")
    protected String nextBillDate;
    @XmlElement(name = "plan_date")
    protected String planDate;
    @XmlElement(name = "status_date")
    protected String statusDate;
    @XmlElement(name = "supp_plan_instance_status")
    protected String suppPlanInstanceStatus;
    @XmlElement(name = "parent_plan_instance_no")
    protected Long parentPlanInstanceNo;
    @XmlElement(name = "client_parent_plan_instance_id")
    protected String clientParentPlanInstanceId;
    @XmlElement(name = "recurring_billing_interval")
    protected Long recurringBillingInterval;
    @XmlElement(name = "usage_billing_interval")
    protected Long usageBillingInterval;
    @XmlElement(name = "rollover_plan_status")
    protected Long rolloverPlanStatus;
    @XmlElement(name = "rollover_plan_status_duration")
    protected Long rolloverPlanStatusDuration;
    @XmlElement(name = "rollover_plan_status_uom_cd")
    protected Long rolloverPlanStatusUomCd;
    @XmlElement(name = "plan_deprovisioned_date")
    protected String planDeprovisionedDate;
    @XmlElement(name = "supp_plan_product_fields")
    protected List<SuppPlanProductFieldsReturnElement> suppPlanProductFields;
    @XmlElement(name = "supp_plan_plan_inst_fields")
    protected List<SuppPlanPlanInstFieldsReturnElement> suppPlanPlanInstFields;
    
    public Long getSuppPlanInstanceNo() {
        return suppPlanInstanceNo;
    }

    public void setSuppPlanInstanceNo(Long value) {
        this.suppPlanInstanceNo = value;
    }

    public String getClientSuppPlanInstanceId() {
        return clientSuppPlanInstanceId;
    }

    public void setClientSuppPlanInstanceId(String value) {
        this.clientSuppPlanInstanceId = value;
    }

    public Long getSuppPlanNo() {
        return suppPlanNo;
    }

    public void setSuppPlanNo(Long value) {
        this.suppPlanNo = value;
    }

    public String getClientSuppPlanId() {
        return clientSuppPlanId;
    }

    public void setClientSuppPlanId(String value) {
        this.clientSuppPlanId = value;
    }

    public String getSuppPlanInstanceDescription() {
        return suppPlanInstanceDescription;
    }

    public void setSuppPlanInstanceDescription(String value) {
        this.suppPlanInstanceDescription = value;
    }

    public Long getSuppPlanUnits() {
        return suppPlanUnits;
    }

    public void setSuppPlanUnits(Long value) {
        this.suppPlanUnits = value;
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

    public String getLastArrearsBillThruDate() {
        return lastArrearsBillThruDate;
    }

    public void setLastArrearsBillThruDate(String value) {
        this.lastArrearsBillThruDate = value;
    }

    public String getLastBillDate() {
        return lastBillDate;
    }

    public void setLastBillDate(String value) {
        this.lastBillDate = value;
    }

    public String getLastBillThruDate() {
        return lastBillThruDate;
    }

    public void setLastBillThruDate(String value) {
        this.lastBillThruDate = value;
    }

    public String getNextBillDate() {
        return nextBillDate;
    }

    public void setNextBillDate(String value) {
        this.nextBillDate = value;
    }

    public String getPlanDate() {
        return planDate;
    }

    public void setPlanDate(String value) {
        this.planDate = value;
    }

    public String getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(String value) {
        this.statusDate = value;
    }

    public String getSuppPlanInstanceStatus() {
        return suppPlanInstanceStatus;
    }

    public void setSuppPlanInstanceStatus(String value) {
        this.suppPlanInstanceStatus = value;
    }

    public Long getParentPlanInstanceNo() {
        return parentPlanInstanceNo;
    }

    public void setParentPlanInstanceNo(Long value) {
        this.parentPlanInstanceNo = value;
    }

    public String getClientParentPlanInstanceId() {
        return clientParentPlanInstanceId;
    }

    public void setClientParentPlanInstanceId(String value) {
        this.clientParentPlanInstanceId = value;
    }

    public Long getRecurringBillingInterval() {
        return recurringBillingInterval;
    }

    public void setRecurringBillingInterval(Long value) {
        this.recurringBillingInterval = value;
    }

    public Long getUsageBillingInterval() {
        return usageBillingInterval;
    }

    public void setUsageBillingInterval(Long value) {
        this.usageBillingInterval = value;
    }

    public Long getRolloverPlanStatus() {
        return rolloverPlanStatus;
    }

    public void setRolloverPlanStatus(Long value) {
        this.rolloverPlanStatus = value;
    }

    public Long getRolloverPlanStatusDuration() {
        return rolloverPlanStatusDuration;
    }

    public void setRolloverPlanStatusDuration(Long value) {
        this.rolloverPlanStatusDuration = value;
    }

    public Long getRolloverPlanStatusUomCd() {
        return rolloverPlanStatusUomCd;
    }

    public void setRolloverPlanStatusUomCd(Long value) {
        this.rolloverPlanStatusUomCd = value;
    }

    public String getPlanDeprovisionedDate() {
        return planDeprovisionedDate;
    }

    public void setPlanDeprovisionedDate(String value) {
        this.planDeprovisionedDate = value;
    }

    public List<SuppPlanProductFieldsReturnElement> getSuppPlanProductFields() {
        if (this.suppPlanProductFields == null) {
            this.suppPlanProductFields = new ArrayList<SuppPlanProductFieldsReturnElement>();
        }
        return this.suppPlanProductFields;
    }public List<SuppPlanPlanInstFieldsReturnElement> getSuppPlanPlanInstFields() {
        if (this.suppPlanPlanInstFields == null) {
            this.suppPlanPlanInstFields = new ArrayList<SuppPlanPlanInstFieldsReturnElement>();
        }
        return this.suppPlanPlanInstFields;
    }
}
