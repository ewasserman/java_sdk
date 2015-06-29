package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "master_plan_instances_ReturnElement", propOrder = {"masterPlanInstanceNo", "clientDefMasterPlanInstanceId", "masterPlanName", "masterPlanInstanceDesc", "masterPlanInstanceBalance"})
public class MasterPlanInstancesReturnElement {

    @XmlElement(name = "master_plan_instance_no")
    protected Long masterPlanInstanceNo;
    @XmlElement(name = "client_def_master_plan_instance_id")
    protected String clientDefMasterPlanInstanceId;
    @XmlElement(name = "master_plan_name")
    protected String masterPlanName;
    @XmlElement(name = "master_plan_instance_desc")
    protected String masterPlanInstanceDesc;
    @XmlElement(name = "master_plan_instance_balance")
    protected Double masterPlanInstanceBalance;
    
    public Long getMasterPlanInstanceNo() {
        return masterPlanInstanceNo;
    }

    public void setMasterPlanInstanceNo(Long value) {
        this.masterPlanInstanceNo = value;
    }

    public String getClientDefMasterPlanInstanceId() {
        return clientDefMasterPlanInstanceId;
    }

    public void setClientDefMasterPlanInstanceId(String value) {
        this.clientDefMasterPlanInstanceId = value;
    }

    public String getMasterPlanName() {
        return masterPlanName;
    }

    public void setMasterPlanName(String value) {
        this.masterPlanName = value;
    }

    public String getMasterPlanInstanceDesc() {
        return masterPlanInstanceDesc;
    }

    public void setMasterPlanInstanceDesc(String value) {
        this.masterPlanInstanceDesc = value;
    }

    public Double getMasterPlanInstanceBalance() {
        return masterPlanInstanceBalance;
    }

    public void setMasterPlanInstanceBalance(Double value) {
        this.masterPlanInstanceBalance = value;
    }

    
}
