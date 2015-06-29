package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usage_history_recs_ReturnElement", propOrder = {"billableAcctNo", "incurringAcctNo", "clientBillableAcctId", "clientIncurringAcctId", "planInstanceId", "clientPlanInstanceId", "usageTypeNo", "usageTypeDescription", "usageDate", "usageTime", "units", "unitsDescription", "usageUnitsDescription", "invoiceNo", "telcoTo", "telcoFrom", "specificRecordChargeAmount", "isExcluded", "exclusionComments", "comments", "preRatedRate", "qualifier1", "qualifier2", "qualifier3", "qualifier4", "recordedUnits", "usageRecNo", "usageParentRecNo", "usageTypeCode", "clientRecordId", "excludeReasonCd"})
public class UsageHistoryRecsReturnElement {

    @XmlElement(name = "billable_acct_no")
    protected Long billableAcctNo;
    @XmlElement(name = "incurring_acct_no")
    protected Long incurringAcctNo;
    @XmlElement(name = "client_billable_acct_id")
    protected String clientBillableAcctId;
    @XmlElement(name = "client_incurring_acct_id")
    protected String clientIncurringAcctId;
    @XmlElement(name = "plan_instance_id")
    protected Long planInstanceId;
    @XmlElement(name = "client_plan_instance_id")
    protected String clientPlanInstanceId;
    @XmlElement(name = "usage_type_no")
    protected Long usageTypeNo;
    @XmlElement(name = "usage_type_description")
    protected String usageTypeDescription;
    @XmlElement(name = "usage_date")
    protected String usageDate;
    @XmlElement(name = "usage_time")
    protected String usageTime;
    @XmlElement(name = "units")
    protected Double units;
    @XmlElement(name = "units_description")
    protected String unitsDescription;
    @XmlElement(name = "usage_units_description")
    protected String usageUnitsDescription;
    @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
    @XmlElement(name = "telco_to")
    protected String telcoTo;
    @XmlElement(name = "telco_from")
    protected String telcoFrom;
    @XmlElement(name = "specific_record_charge_amount")
    protected Double specificRecordChargeAmount;
    @XmlElement(name = "is_excluded")
    protected String isExcluded;
    @XmlElement(name = "exclusion_comments")
    protected String exclusionComments;
    @XmlElement(name = "comments")
    protected String comments;
    @XmlElement(name = "pre_rated_rate")
    protected Double preRatedRate;
    @XmlElement(name = "qualifier_1")
    protected String qualifier1;
    @XmlElement(name = "qualifier_2")
    protected String qualifier2;
    @XmlElement(name = "qualifier_3")
    protected String qualifier3;
    @XmlElement(name = "qualifier_4")
    protected String qualifier4;
    @XmlElement(name = "recorded_units")
    protected Double recordedUnits;
    @XmlElement(name = "usage_rec_no")
    protected Long usageRecNo;
    @XmlElement(name = "usage_parent_rec_no")
    protected Long usageParentRecNo;
    @XmlElement(name = "usage_type_code")
    protected String usageTypeCode;
    @XmlElement(name = "client_record_id")
    protected String clientRecordId;
    @XmlElement(name = "exclude_reason_cd")
    protected Long excludeReasonCd;
    
    public Long getBillableAcctNo() {
        return billableAcctNo;
    }

    public void setBillableAcctNo(Long value) {
        this.billableAcctNo = value;
    }

    public Long getIncurringAcctNo() {
        return incurringAcctNo;
    }

    public void setIncurringAcctNo(Long value) {
        this.incurringAcctNo = value;
    }

    public String getClientBillableAcctId() {
        return clientBillableAcctId;
    }

    public void setClientBillableAcctId(String value) {
        this.clientBillableAcctId = value;
    }

    public String getClientIncurringAcctId() {
        return clientIncurringAcctId;
    }

    public void setClientIncurringAcctId(String value) {
        this.clientIncurringAcctId = value;
    }

    public Long getPlanInstanceId() {
        return planInstanceId;
    }

    public void setPlanInstanceId(Long value) {
        this.planInstanceId = value;
    }

    public String getClientPlanInstanceId() {
        return clientPlanInstanceId;
    }

    public void setClientPlanInstanceId(String value) {
        this.clientPlanInstanceId = value;
    }

    public Long getUsageTypeNo() {
        return usageTypeNo;
    }

    public void setUsageTypeNo(Long value) {
        this.usageTypeNo = value;
    }

    public String getUsageTypeDescription() {
        return usageTypeDescription;
    }

    public void setUsageTypeDescription(String value) {
        this.usageTypeDescription = value;
    }

    public String getUsageDate() {
        return usageDate;
    }

    public void setUsageDate(String value) {
        this.usageDate = value;
    }

    public String getUsageTime() {
        return usageTime;
    }

    public void setUsageTime(String value) {
        this.usageTime = value;
    }

    public Double getUnits() {
        return units;
    }

    public void setUnits(Double value) {
        this.units = value;
    }

    public String getUnitsDescription() {
        return unitsDescription;
    }

    public void setUnitsDescription(String value) {
        this.unitsDescription = value;
    }

    public String getUsageUnitsDescription() {
        return usageUnitsDescription;
    }

    public void setUsageUnitsDescription(String value) {
        this.usageUnitsDescription = value;
    }

    public Long getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Long value) {
        this.invoiceNo = value;
    }

    public String getTelcoTo() {
        return telcoTo;
    }

    public void setTelcoTo(String value) {
        this.telcoTo = value;
    }

    public String getTelcoFrom() {
        return telcoFrom;
    }

    public void setTelcoFrom(String value) {
        this.telcoFrom = value;
    }

    public Double getSpecificRecordChargeAmount() {
        return specificRecordChargeAmount;
    }

    public void setSpecificRecordChargeAmount(Double value) {
        this.specificRecordChargeAmount = value;
    }

    public String getIsExcluded() {
        return isExcluded;
    }

    public void setIsExcluded(String value) {
        this.isExcluded = value;
    }

    public String getExclusionComments() {
        return exclusionComments;
    }

    public void setExclusionComments(String value) {
        this.exclusionComments = value;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String value) {
        this.comments = value;
    }

    public Double getPreRatedRate() {
        return preRatedRate;
    }

    public void setPreRatedRate(Double value) {
        this.preRatedRate = value;
    }

    public String getQualifier1() {
        return qualifier1;
    }

    public void setQualifier1(String value) {
        this.qualifier1 = value;
    }

    public String getQualifier2() {
        return qualifier2;
    }

    public void setQualifier2(String value) {
        this.qualifier2 = value;
    }

    public String getQualifier3() {
        return qualifier3;
    }

    public void setQualifier3(String value) {
        this.qualifier3 = value;
    }

    public String getQualifier4() {
        return qualifier4;
    }

    public void setQualifier4(String value) {
        this.qualifier4 = value;
    }

    public Double getRecordedUnits() {
        return recordedUnits;
    }

    public void setRecordedUnits(Double value) {
        this.recordedUnits = value;
    }

    public Long getUsageRecNo() {
        return usageRecNo;
    }

    public void setUsageRecNo(Long value) {
        this.usageRecNo = value;
    }

    public Long getUsageParentRecNo() {
        return usageParentRecNo;
    }

    public void setUsageParentRecNo(Long value) {
        this.usageParentRecNo = value;
    }

    public String getUsageTypeCode() {
        return usageTypeCode;
    }

    public void setUsageTypeCode(String value) {
        this.usageTypeCode = value;
    }

    public String getClientRecordId() {
        return clientRecordId;
    }

    public void setClientRecordId(String value) {
        this.clientRecordId = value;
    }

    public Long getExcludeReasonCd() {
        return excludeReasonCd;
    }

    public void setExcludeReasonCd(Long value) {
        this.excludeReasonCd = value;
    }

    
}
