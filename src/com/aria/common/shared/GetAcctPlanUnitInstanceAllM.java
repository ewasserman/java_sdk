package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "clientAcctId",    "planInstanceNo",    "clientPlanInstanceId",    "planUnitInstNo",    "clientPlanUnitInstId",    "statusCd",    "planUnitInstStatusCd",    "fulfillmentOnly"})
@XmlRootElement(name = "get_acct_plan_unit_instance_all_m")
public class GetAcctPlanUnitInstanceAllM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
        @XmlElement(name = "plan_instance_no")
    protected Long planInstanceNo;
        @XmlElement(name = "client_plan_instance_id")
    protected String clientPlanInstanceId;
        @XmlElement(name = "plan_unit_inst_no")
    protected Long planUnitInstNo;
        @XmlElement(name = "client_plan_unit_inst_id")
    protected String clientPlanUnitInstId;
        @XmlElement(name = "status_cd")
    protected Long statusCd;
        @XmlElement(name = "plan_unit_inst_status_cd")
    protected Long planUnitInstStatusCd;
        @XmlElement(name = "fulfillment_only")
    protected Long fulfillmentOnly;
    
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
            public String getClientAcctId() {
        return clientAcctId;
    }

    public void setClientAcctId(String value) {
        this.clientAcctId = value;
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
            public Long getPlanUnitInstNo() {
        return planUnitInstNo;
    }

    public void setPlanUnitInstNo(Long value) {
        this.planUnitInstNo = value;
    }
            public String getClientPlanUnitInstId() {
        return clientPlanUnitInstId;
    }

    public void setClientPlanUnitInstId(String value) {
        this.clientPlanUnitInstId = value;
    }
            public Long getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(Long value) {
        this.statusCd = value;
    }
            public Long getPlanUnitInstStatusCd() {
        return planUnitInstStatusCd;
    }

    public void setPlanUnitInstStatusCd(Long value) {
        this.planUnitInstStatusCd = value;
    }
            public Long getFulfillmentOnly() {
        return fulfillmentOnly;
    }

    public void setFulfillmentOnly(Long value) {
        this.fulfillmentOnly = value;
    }
            
}
