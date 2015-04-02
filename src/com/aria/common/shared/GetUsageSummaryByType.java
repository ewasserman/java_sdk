package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "userId",    "usageTypeFilter",    "dateFilterStartDate",    "dateFilterStartTime",    "dateFilterEndDate",    "dateFilterEndTime",    "billedFilter",    "billingPeriodFlag",    "usageQualifier1",    "usageQualifier2",    "usageQualifier3",    "usageQualifier4",    "usageTypeCdFilter",    "retrieveExcludedUsage"})
@XmlRootElement(name = "get_usage_summary_by_type")
public class GetUsageSummaryByType {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "user_id")
    protected String userId;
        @XmlElement(name = "usage_type_filter")
    protected Long usageTypeFilter;
        @XmlElement(name = "date_filter_start_date")
    protected String dateFilterStartDate;
        @XmlElement(name = "date_filter_start_time")
    protected String dateFilterStartTime;
        @XmlElement(name = "date_filter_end_date")
    protected String dateFilterEndDate;
        @XmlElement(name = "date_filter_end_time")
    protected String dateFilterEndTime;
        @XmlElement(name = "billed_filter")
    protected Long billedFilter;
        @XmlElement(name = "billing_period_flag")
    protected Long billingPeriodFlag;
        @XmlElement(name = "usage_qualifier_1")
    protected UsageQualifier1Array usageQualifier1;
        @XmlElement(name = "usage_qualifier_2")
    protected UsageQualifier2Array usageQualifier2;
        @XmlElement(name = "usage_qualifier_3")
    protected UsageQualifier3Array usageQualifier3;
        @XmlElement(name = "usage_qualifier_4")
    protected UsageQualifier4Array usageQualifier4;
        @XmlElement(name = "usage_type_cd_filter")
    protected String usageTypeCdFilter;
        @XmlElement(name = "retrieve_excluded_usage")
    protected String retrieveExcludedUsage;
    
    public long getClientNo() {
        return clientNo;
    }

    public void setClientNo(Long value) {
        this.clientNo = value;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String value) {
        this.authKey = value;
    }

    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }
            public String getUserId() {
        return userId;
    }

    public void setUserId(String value) {
        this.userId = value;
    }
            public Long getUsageTypeFilter() {
        return usageTypeFilter;
    }

    public void setUsageTypeFilter(Long value) {
        this.usageTypeFilter = value;
    }
            public String getDateFilterStartDate() {
        return dateFilterStartDate;
    }

    public void setDateFilterStartDate(String value) {
        this.dateFilterStartDate = value;
    }
            public String getDateFilterStartTime() {
        return dateFilterStartTime;
    }

    public void setDateFilterStartTime(String value) {
        this.dateFilterStartTime = value;
    }
            public String getDateFilterEndDate() {
        return dateFilterEndDate;
    }

    public void setDateFilterEndDate(String value) {
        this.dateFilterEndDate = value;
    }
            public String getDateFilterEndTime() {
        return dateFilterEndTime;
    }

    public void setDateFilterEndTime(String value) {
        this.dateFilterEndTime = value;
    }
            public Long getBilledFilter() {
        return billedFilter;
    }

    public void setBilledFilter(Long value) {
        this.billedFilter = value;
    }
            public Long getBillingPeriodFlag() {
        return billingPeriodFlag;
    }

    public void setBillingPeriodFlag(Long value) {
        this.billingPeriodFlag = value;
    }
            public UsageQualifier1Array getUsageQualifier1() {
        return usageQualifier1;
    }

    public void setUsageQualifier1(UsageQualifier1Array value) {
        this.usageQualifier1 = value;
    }
            public UsageQualifier2Array getUsageQualifier2() {
        return usageQualifier2;
    }

    public void setUsageQualifier2(UsageQualifier2Array value) {
        this.usageQualifier2 = value;
    }
            public UsageQualifier3Array getUsageQualifier3() {
        return usageQualifier3;
    }

    public void setUsageQualifier3(UsageQualifier3Array value) {
        this.usageQualifier3 = value;
    }
            public UsageQualifier4Array getUsageQualifier4() {
        return usageQualifier4;
    }

    public void setUsageQualifier4(UsageQualifier4Array value) {
        this.usageQualifier4 = value;
    }
            public String getUsageTypeCdFilter() {
        return usageTypeCdFilter;
    }

    public void setUsageTypeCdFilter(String value) {
        this.usageTypeCdFilter = value;
    }
            public String getRetrieveExcludedUsage() {
        return retrieveExcludedUsage;
    }

    public void setRetrieveExcludedUsage(String value) {
        this.retrieveExcludedUsage = value;
    }
            
}
