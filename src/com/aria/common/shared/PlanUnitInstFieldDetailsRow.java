package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_unit_inst_field_details_row", propOrder = {
    "planUnitInstNo",
    "clientPlanUnitInstId",
    "planUnitInstIdx",
    "planUnitInstFieldList"
    })
public class PlanUnitInstFieldDetailsRow {

    @XmlElement(name = "plan_unit_inst_no")
    protected Long planUnitInstNo;
    @XmlElement(name = "client_plan_unit_inst_id")
    protected String clientPlanUnitInstId;
    @XmlElement(name = "plan_unit_inst_idx")
    protected Long planUnitInstIdx;
    @XmlElement(name = "plan_unit_inst_field_list")
    protected com.aria.common.shared.PlanUnitInstFieldListArray planUnitInstFieldList;
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

    public Long getPlanUnitInstIdx() {
        return planUnitInstIdx;
    }

    public void setPlanUnitInstIdx(Long value) {
        this.planUnitInstIdx = value;
    }

    public com.aria.common.shared.PlanUnitInstFieldListArray getPlanUnitInstFieldList() {
        return planUnitInstFieldList;
    }

    public void setPlanUnitInstFieldList(com.aria.common.shared.PlanUnitInstFieldListArray value) {
        this.planUnitInstFieldList = value;
    }

    
}
