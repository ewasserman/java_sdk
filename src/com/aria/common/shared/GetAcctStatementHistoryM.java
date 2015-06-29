package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "userId",    "clientAcctId",    "masterPlanInstanceNo",    "clientMasterPlanInstanceId",    "startDate",    "endDate",    "includeInvoiceActivityEligibility"})
@XmlRootElement(name = "get_acct_statement_history_m")
public class GetAcctStatementHistoryM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "user_id")
    protected String userId;
        @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
        @XmlElement(name = "master_plan_instance_no")
    protected Long masterPlanInstanceNo;
        @XmlElement(name = "client_master_plan_instance_id")
    protected String clientMasterPlanInstanceId;
        @XmlElement(name = "start_date")
    protected String startDate;
        @XmlElement(name = "end_date")
    protected String endDate;
        @XmlElement(name = "include_invoice_activity_eligibility")
    protected String includeInvoiceActivityEligibility;
    
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
            public String getClientAcctId() {
        return clientAcctId;
    }

    public void setClientAcctId(String value) {
        this.clientAcctId = value;
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
            public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String value) {
        this.startDate = value;
    }
            public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String value) {
        this.endDate = value;
    }
            public String getIncludeInvoiceActivityEligibility() {
        return includeInvoiceActivityEligibility;
    }

    public void setIncludeInvoiceActivityEligibility(String value) {
        this.includeInvoiceActivityEligibility = value;
    }
            
}
