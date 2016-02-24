package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "clientAcctId",    "planUnitInstNo",    "clientPlanUnitInstId",    "newClientPlanUnitInstId",    "planUnitInstanceServices",    "planUnitInstFields",    "doWrite",    "prorationInvoiceTiming"})
@XmlRootElement(name = "update_acct_plan_unit_instance_m")
public class UpdateAcctPlanUnitInstanceM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
        @XmlElement(name = "plan_unit_inst_no")
    protected Long planUnitInstNo;
        @XmlElement(name = "client_plan_unit_inst_id")
    protected String clientPlanUnitInstId;
        @XmlElement(name = "new_client_plan_unit_inst_id")
    protected String newClientPlanUnitInstId;
        @XmlElement(name = "plan_unit_instance_services")
    protected PlanUnitInstanceServicesArray planUnitInstanceServices;
        @XmlElement(name = "plan_unit_inst_fields")
    protected PlanUnitInstFieldsArray planUnitInstFields;
        @XmlElement(name = "do_write")
    protected String doWrite;
        @XmlElement(name = "proration_invoice_timing")
    protected Long prorationInvoiceTiming;
    
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
            public String getNewClientPlanUnitInstId() {
        return newClientPlanUnitInstId;
    }

    public void setNewClientPlanUnitInstId(String value) {
        this.newClientPlanUnitInstId = value;
    }
            public PlanUnitInstanceServicesArray getPlanUnitInstanceServices() {
        return planUnitInstanceServices;
    }

    public void setPlanUnitInstanceServices(PlanUnitInstanceServicesArray value) {
        this.planUnitInstanceServices = value;
    }
            public PlanUnitInstFieldsArray getPlanUnitInstFields() {
        return planUnitInstFields;
    }

    public void setPlanUnitInstFields(PlanUnitInstFieldsArray value) {
        this.planUnitInstFields = value;
    }
            public String getDoWrite() {
        return doWrite;
    }

    public void setDoWrite(String value) {
        this.doWrite = value;
    }
            public Long getProrationInvoiceTiming() {
        return prorationInvoiceTiming;
    }

    public void setProrationInvoiceTiming(Long value) {
        this.prorationInvoiceTiming = value;
    }
            
}
