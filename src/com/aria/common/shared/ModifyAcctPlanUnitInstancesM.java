package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "clientAcctId",    "planInstNo",    "clientPlanInstId",    "removePlanUnits",    "assignmentDirective",    "newPlanUnits",    "newClientPlanUnitInst"})
@XmlRootElement(name = "modify_acct_plan_unit_instances_m")
public class ModifyAcctPlanUnitInstancesM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
        @XmlElement(name = "plan_inst_no")
    protected Long planInstNo;
        @XmlElement(name = "client_plan_inst_id")
    protected String clientPlanInstId;
        @XmlElement(name = "remove_plan_units")
    protected RemovePlanUnitsArray removePlanUnits;
        @XmlElement(name = "assignment_directive")
    protected Long assignmentDirective;
        @XmlElement(name = "new_plan_units")
    protected Double newPlanUnits;
        @XmlElement(name = "new_client_plan_unit_inst")
    protected NewClientPlanUnitInstArray newClientPlanUnitInst;
    
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
            public Long getPlanInstNo() {
        return planInstNo;
    }

    public void setPlanInstNo(Long value) {
        this.planInstNo = value;
    }
            public String getClientPlanInstId() {
        return clientPlanInstId;
    }

    public void setClientPlanInstId(String value) {
        this.clientPlanInstId = value;
    }
            public RemovePlanUnitsArray getRemovePlanUnits() {
        return removePlanUnits;
    }

    public void setRemovePlanUnits(RemovePlanUnitsArray value) {
        this.removePlanUnits = value;
    }
            public Long getAssignmentDirective() {
        return assignmentDirective;
    }

    public void setAssignmentDirective(Long value) {
        this.assignmentDirective = value;
    }
            public Double getNewPlanUnits() {
        return newPlanUnits;
    }

    public void setNewPlanUnits(Double value) {
        this.newPlanUnits = value;
    }
            public NewClientPlanUnitInstArray getNewClientPlanUnitInst() {
        return newClientPlanUnitInst;
    }

    public void setNewClientPlanUnitInst(NewClientPlanUnitInstArray value) {
        this.newClientPlanUnitInst = value;
    }
            
}
