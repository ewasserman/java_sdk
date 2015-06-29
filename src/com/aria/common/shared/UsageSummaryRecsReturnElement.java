package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usage_summary_recs_ReturnElement", propOrder = {"outAcctNo", "outClientAcctId", "outPlanInstanceNo", "outPlanInstanceCdid", "usageTypeNo", "usageTypeLabel", "billedInd", "totalUnits", "totalValueAmount", "totalValueCurrencyCode", "lastUsageDate", "usageTypeCd"})
public class UsageSummaryRecsReturnElement {

    @XmlElement(name = "out_acct_no")
    protected Long outAcctNo;
    @XmlElement(name = "out_client_acct_id")
    protected String outClientAcctId;
    @XmlElement(name = "out_plan_instance_no")
    protected Long outPlanInstanceNo;
    @XmlElement(name = "out_plan_instance_cdid")
    protected String outPlanInstanceCdid;
    @XmlElement(name = "usage_type_no")
    protected Long usageTypeNo;
    @XmlElement(name = "usage_type_label")
    protected String usageTypeLabel;
    @XmlElement(name = "billed_ind")
    protected Long billedInd;
    @XmlElement(name = "total_units")
    protected Double totalUnits;
    @XmlElement(name = "total_value_amount")
    protected Double totalValueAmount;
    @XmlElement(name = "total_value_currency_code")
    protected String totalValueCurrencyCode;
    @XmlElement(name = "last_usage_date")
    protected String lastUsageDate;
    @XmlElement(name = "usage_type_cd")
    protected String usageTypeCd;
    
    public Long getOutAcctNo() {
        return outAcctNo;
    }

    public void setOutAcctNo(Long value) {
        this.outAcctNo = value;
    }

    public String getOutClientAcctId() {
        return outClientAcctId;
    }

    public void setOutClientAcctId(String value) {
        this.outClientAcctId = value;
    }

    public Long getOutPlanInstanceNo() {
        return outPlanInstanceNo;
    }

    public void setOutPlanInstanceNo(Long value) {
        this.outPlanInstanceNo = value;
    }

    public String getOutPlanInstanceCdid() {
        return outPlanInstanceCdid;
    }

    public void setOutPlanInstanceCdid(String value) {
        this.outPlanInstanceCdid = value;
    }

    public Long getUsageTypeNo() {
        return usageTypeNo;
    }

    public void setUsageTypeNo(Long value) {
        this.usageTypeNo = value;
    }

    public String getUsageTypeLabel() {
        return usageTypeLabel;
    }

    public void setUsageTypeLabel(String value) {
        this.usageTypeLabel = value;
    }

    public Long getBilledInd() {
        return billedInd;
    }

    public void setBilledInd(Long value) {
        this.billedInd = value;
    }

    public Double getTotalUnits() {
        return totalUnits;
    }

    public void setTotalUnits(Double value) {
        this.totalUnits = value;
    }

    public Double getTotalValueAmount() {
        return totalValueAmount;
    }

    public void setTotalValueAmount(Double value) {
        this.totalValueAmount = value;
    }

    public String getTotalValueCurrencyCode() {
        return totalValueCurrencyCode;
    }

    public void setTotalValueCurrencyCode(String value) {
        this.totalValueCurrencyCode = value;
    }

    public String getLastUsageDate() {
        return lastUsageDate;
    }

    public void setLastUsageDate(String value) {
        this.lastUsageDate = value;
    }

    public String getUsageTypeCd() {
        return usageTypeCd;
    }

    public void setUsageTypeCd(String value) {
        this.usageTypeCd = value;
    }

    
}
