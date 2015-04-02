package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "planUnits",    "newClientPlanUnitInst"})
@XmlRootElement(name = "modify_acct_plan_unit_instances")
public class ModifyAcctPlanUnitInstances {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "plan_units")
    protected PlanUnitsArray planUnits;
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
            public PlanUnitsArray getPlanUnits() {
        return planUnits;
    }

    public void setPlanUnits(PlanUnitsArray value) {
        this.planUnits = value;
    }
            public NewClientPlanUnitInstArray getNewClientPlanUnitInst() {
        return newClientPlanUnitInst;
    }

    public void setNewClientPlanUnitInst(NewClientPlanUnitInstArray value) {
        this.newClientPlanUnitInst = value;
    }
            
}
