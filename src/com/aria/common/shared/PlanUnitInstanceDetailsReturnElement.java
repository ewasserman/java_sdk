package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_unit_instance_details_ReturnElement", propOrder = {"outPlanUnitInstNo", "outClientPlanUnitInstId"})
public class PlanUnitInstanceDetailsReturnElement {

    @XmlElement(name = "out_plan_unit_inst_no")
    protected Long outPlanUnitInstNo;
    @XmlElement(name = "out_client_plan_unit_inst_id")
    protected String outClientPlanUnitInstId;
    
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

    
}
