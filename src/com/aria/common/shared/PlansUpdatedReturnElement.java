package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plans_updated_ReturnElement", propOrder = {"planInstanceNo", "clientPlanInstanceId", "planNo", "clientPlanId", "planName", "planOperation", "planUnitInstanceDetails", "planServiceProrationResults"})
public class PlansUpdatedReturnElement {

    @XmlElement(name = "plan_instance_no")
    protected Long planInstanceNo;
    @XmlElement(name = "client_plan_instance_id")
    protected String clientPlanInstanceId;
    @XmlElement(name = "plan_no")
    protected Long planNo;
    @XmlElement(name = "client_plan_id")
    protected String clientPlanId;
    @XmlElement(name = "plan_name")
    protected String planName;
    @XmlElement(name = "plan_operation")
    protected Long planOperation;
    @XmlElement(name = "plan_unit_instance_details")
    protected List<PlanUnitInstanceDetailsReturnElement> planUnitInstanceDetails;
    @XmlElement(name = "plan_service_proration_results")
    protected List<PlanServiceProrationResultsReturnElement> planServiceProrationResults;
    
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

    public Long getPlanNo() {
        return planNo;
    }

    public void setPlanNo(Long value) {
        this.planNo = value;
    }

    public String getClientPlanId() {
        return clientPlanId;
    }

    public void setClientPlanId(String value) {
        this.clientPlanId = value;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String value) {
        this.planName = value;
    }

    public Long getPlanOperation() {
        return planOperation;
    }

    public void setPlanOperation(Long value) {
        this.planOperation = value;
    }

    public List<PlanUnitInstanceDetailsReturnElement> getPlanUnitInstanceDetails() {
        if (this.planUnitInstanceDetails == null) {
            this.planUnitInstanceDetails = new ArrayList<PlanUnitInstanceDetailsReturnElement>();
        }
        return this.planUnitInstanceDetails;
    }public List<PlanServiceProrationResultsReturnElement> getPlanServiceProrationResults() {
        if (this.planServiceProrationResults == null) {
            this.planServiceProrationResults = new ArrayList<PlanServiceProrationResultsReturnElement>();
        }
        return this.planServiceProrationResults;
    }
}
