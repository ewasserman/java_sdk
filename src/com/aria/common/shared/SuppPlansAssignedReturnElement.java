package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supp_plans_assigned_ReturnElement", propOrder = {"suppPlanInstanceNo", "clientPlanInstanceId", "planUnitInstanceDetails"})
public class SuppPlansAssignedReturnElement {

    @XmlElement(name = "supp_plan_instance_no")
    protected Long suppPlanInstanceNo;
    @XmlElement(name = "client_plan_instance_id")
    protected String clientPlanInstanceId;
    @XmlElement(name = "plan_unit_instance_details")
    protected List<PlanUnitInstanceDetailsReturnElement> planUnitInstanceDetails;
    
    public Long getSuppPlanInstanceNo() {
        return suppPlanInstanceNo;
    }

    public void setSuppPlanInstanceNo(Long value) {
        this.suppPlanInstanceNo = value;
    }

    public String getClientPlanInstanceId() {
        return clientPlanInstanceId;
    }

    public void setClientPlanInstanceId(String value) {
        this.clientPlanInstanceId = value;
    }

    public List<PlanUnitInstanceDetailsReturnElement> getPlanUnitInstanceDetails() {
        if (this.planUnitInstanceDetails == null) {
            this.planUnitInstanceDetails = new ArrayList<PlanUnitInstanceDetailsReturnElement>();
        }
        return this.planUnitInstanceDetails;
    }
}
