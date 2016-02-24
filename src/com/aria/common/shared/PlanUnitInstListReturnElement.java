package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_unit_inst_list_ReturnElement", propOrder = {"planUnitInstNo", "clientPlanUnitInstId", "planUnitInstStatus", "planUnitInstServiceDetails", "planUnitInstFields"})
public class PlanUnitInstListReturnElement {

    @XmlElement(name = "plan_unit_inst_no")
    protected Long planUnitInstNo;
    @XmlElement(name = "client_plan_unit_inst_id")
    protected String clientPlanUnitInstId;
    @XmlElement(name = "plan_unit_inst_status")
    protected String planUnitInstStatus;
    @XmlElement(name = "plan_unit_inst_service_details")
    protected List<PlanUnitInstServiceDetailsReturnElement> planUnitInstServiceDetails;
    @XmlElement(name = "plan_unit_inst_fields")
    protected List<PlanUnitInstFieldsReturnElement> planUnitInstFields;
    
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

    public String getPlanUnitInstStatus() {
        return planUnitInstStatus;
    }

    public void setPlanUnitInstStatus(String value) {
        this.planUnitInstStatus = value;
    }

    public List<PlanUnitInstServiceDetailsReturnElement> getPlanUnitInstServiceDetails() {
        if (this.planUnitInstServiceDetails == null) {
            this.planUnitInstServiceDetails = new ArrayList<PlanUnitInstServiceDetailsReturnElement>();
        }
        return this.planUnitInstServiceDetails;
    }public List<PlanUnitInstFieldsReturnElement> getPlanUnitInstFields() {
        if (this.planUnitInstFields == null) {
            this.planUnitInstFields = new ArrayList<PlanUnitInstFieldsReturnElement>();
        }
        return this.planUnitInstFields;
    }
}
