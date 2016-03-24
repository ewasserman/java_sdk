package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "usageUnits",    "acctNo",    "userid",    "masterPlanInstanceNo",    "clientMasterPlanInstanceId",    "planInstanceNo",    "clientPlanInstanceId",    "usageType",    "usageDate",    "billableUnits",    "amt",    "rate",    "telcoFrom",    "telcoTo",    "comments",    "excludeFromBilling",    "exclusionComments",    "qualifier1",    "qualifier2",    "qualifier3",    "qualifier4",    "parentUsageRecNo",    "usageTypeCode",    "clientRecordId",    "callerId",    "clientReceiptId"})
@XmlRootElement(name = "record_usage_m")
public class RecordUsageM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "usage_units")
    protected Double usageUnits;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "userid")
    protected String userid;
        @XmlElement(name = "master_plan_instance_no")
    protected Long masterPlanInstanceNo;
        @XmlElement(name = "client_master_plan_instance_id")
    protected String clientMasterPlanInstanceId;
        @XmlElement(name = "plan_instance_no")
    protected Long planInstanceNo;
        @XmlElement(name = "client_plan_instance_id")
    protected String clientPlanInstanceId;
        @XmlElement(name = "usage_type")
    protected Long usageType;
        @XmlElement(name = "usage_date")
    protected String usageDate;
        @XmlElement(name = "billable_units")
    protected Double billableUnits;
        @XmlElement(name = "amt")
    protected Double amt;
        @XmlElement(name = "rate")
    protected Double rate;
        @XmlElement(name = "telco_from")
    protected String telcoFrom;
        @XmlElement(name = "telco_to")
    protected String telcoTo;
        @XmlElement(name = "comments")
    protected String comments;
        @XmlElement(name = "exclude_from_billing")
    protected String excludeFromBilling;
        @XmlElement(name = "exclusion_comments")
    protected String exclusionComments;
        @XmlElement(name = "qualifier_1")
    protected String qualifier1;
        @XmlElement(name = "qualifier_2")
    protected String qualifier2;
        @XmlElement(name = "qualifier_3")
    protected String qualifier3;
        @XmlElement(name = "qualifier_4")
    protected String qualifier4;
        @XmlElement(name = "parent_usage_rec_no")
    protected Long parentUsageRecNo;
        @XmlElement(name = "usage_type_code")
    protected String usageTypeCode;
        @XmlElement(name = "client_record_id")
    protected String clientRecordId;
        @XmlElement(name = "caller_id")
    protected String callerId;
        @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
    
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

    public Double getUsageUnits() {
        return usageUnits;
    }

    public void setUsageUnits(Double value) {
        this.usageUnits = value;
    }
            public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }
            public String getUserid() {
        return userid;
    }

    public void setUserid(String value) {
        this.userid = value;
    }
            public Long getMasterPlanInstanceNo() {
        return masterPlanInstanceNo;
    }

    public void setMasterPlanInstanceNo(Long value) {
        this.masterPlanInstanceNo = value;
    }
            public String getClientMasterPlanInstanceId() {
        return clientMasterPlanInstanceId;
    }

    public void setClientMasterPlanInstanceId(String value) {
        this.clientMasterPlanInstanceId = value;
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
            public Long getUsageType() {
        return usageType;
    }

    public void setUsageType(Long value) {
        this.usageType = value;
    }
            public String getUsageDate() {
        return usageDate;
    }

    public void setUsageDate(String value) {
        this.usageDate = value;
    }
            public Double getBillableUnits() {
        return billableUnits;
    }

    public void setBillableUnits(Double value) {
        this.billableUnits = value;
    }
            public Double getAmt() {
        return amt;
    }

    public void setAmt(Double value) {
        this.amt = value;
    }
            public Double getRate() {
        return rate;
    }

    public void setRate(Double value) {
        this.rate = value;
    }
            public String getTelcoFrom() {
        return telcoFrom;
    }

    public void setTelcoFrom(String value) {
        this.telcoFrom = value;
    }
            public String getTelcoTo() {
        return telcoTo;
    }

    public void setTelcoTo(String value) {
        this.telcoTo = value;
    }
            public String getComments() {
        return comments;
    }

    public void setComments(String value) {
        this.comments = value;
    }
            public String getExcludeFromBilling() {
        return excludeFromBilling;
    }

    public void setExcludeFromBilling(String value) {
        this.excludeFromBilling = value;
    }
            public String getExclusionComments() {
        return exclusionComments;
    }

    public void setExclusionComments(String value) {
        this.exclusionComments = value;
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
            public Long getParentUsageRecNo() {
        return parentUsageRecNo;
    }

    public void setParentUsageRecNo(Long value) {
        this.parentUsageRecNo = value;
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
            public String getCallerId() {
        return callerId;
    }

    public void setCallerId(String value) {
        this.callerId = value;
    }
            public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
    }
            
}
