package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_unit_instance_ReturnElement", propOrder = {"outPlanUnitInstNo", "outClientPlanUnitInstId", "planUnitInstStatus", "planUnitInstServices", "planUnitInstFields"})
public class PlanUnitInstanceReturnElement {

    @XmlElement(name = "out_plan_unit_inst_no")
    protected Long outPlanUnitInstNo;
    @XmlElement(name = "out_client_plan_unit_inst_id")
    protected String outClientPlanUnitInstId;
    @XmlElement(name = "plan_unit_inst_status")
    protected String planUnitInstStatus;
    @XmlElement(name = "plan_unit_inst_services")
    protected List<PlanUnitInstServicesReturnElement> planUnitInstServices;
    @XmlElement(name = "plan_unit_inst_fields")
    protected List<PlanUnitInstFieldsReturnElement> planUnitInstFields;
    
    public Long getOutPlanUnitInstNo() {
        return outPlanUnitInstNo;
    }

    public void setOutPlanUnitInstNo(Long value) {
        this.outPlanUnitInstNo = value;
    }

    public String getOutClientPlanUnitInstId() {
        return outClientPlanUnitInstId;
    }

    public void setOutClientPlanUnitInstId(String value) {
        this.outClientPlanUnitInstId = value;
    }

    public String getPlanUnitInstStatus() {
        return planUnitInstStatus;
    }

    public void setPlanUnitInstStatus(String value) {
        this.planUnitInstStatus = value;
    }

    public List<PlanUnitInstServicesReturnElement> getPlanUnitInstServices() {
        if (this.planUnitInstServices == null) {
            this.planUnitInstServices = new ArrayList<PlanUnitInstServicesReturnElement>();
        }
        return this.planUnitInstServices;
    }public List<PlanUnitInstFieldsReturnElement> getPlanUnitInstFields() {
        if (this.planUnitInstFields == null) {
            this.planUnitInstFields = new ArrayList<PlanUnitInstFieldsReturnElement>();
        }
        return this.planUnitInstFields;
    }
}
