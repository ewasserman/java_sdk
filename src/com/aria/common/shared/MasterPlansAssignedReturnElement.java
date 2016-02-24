package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "master_plans_assigned_ReturnElement", propOrder = {"planInstanceNo", "clientPlanInstanceId", "nsoOrderNo", "nsoOrderStatusLabel", "planUnitInstanceDetails", "suppPlansAssigned", "outContract", "thirdPartyErrors"})
public class MasterPlansAssignedReturnElement {

    @XmlElement(name = "plan_instance_no")
    protected Long planInstanceNo;
    @XmlElement(name = "client_plan_instance_id")
    protected String clientPlanInstanceId;
    @XmlElement(name = "nso_order_no")
    protected Long nsoOrderNo;
    @XmlElement(name = "nso_order_status_label")
    protected String nsoOrderStatusLabel;
    @XmlElement(name = "plan_unit_instance_details")
    protected List<PlanUnitInstanceDetailsReturnElement> planUnitInstanceDetails;
    @XmlElement(name = "supp_plans_assigned")
    protected List<SuppPlansAssignedReturnElement> suppPlansAssigned;
    @XmlElement(name = "out_contract")
    protected List<OutContractReturnElement> outContract;
    @XmlElement(name = "third_party_errors")
    protected List<ThirdPartyErrorsReturnElement> thirdPartyErrors;
    
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

    public Long getNsoOrderNo() {
        return nsoOrderNo;
    }

    public void setNsoOrderNo(Long value) {
        this.nsoOrderNo = value;
    }

    public String getNsoOrderStatusLabel() {
        return nsoOrderStatusLabel;
    }

    public void setNsoOrderStatusLabel(String value) {
        this.nsoOrderStatusLabel = value;
    }

    public List<PlanUnitInstanceDetailsReturnElement> getPlanUnitInstanceDetails() {
        if (this.planUnitInstanceDetails == null) {
            this.planUnitInstanceDetails = new ArrayList<PlanUnitInstanceDetailsReturnElement>();
        }
        return this.planUnitInstanceDetails;
    }public List<SuppPlansAssignedReturnElement> getSuppPlansAssigned() {
        if (this.suppPlansAssigned == null) {
            this.suppPlansAssigned = new ArrayList<SuppPlansAssignedReturnElement>();
        }
        return this.suppPlansAssigned;
    }public List<OutContractReturnElement> getOutContract() {
        if (this.outContract == null) {
            this.outContract = new ArrayList<OutContractReturnElement>();
        }
        return this.outContract;
    }public List<ThirdPartyErrorsReturnElement> getThirdPartyErrors() {
        if (this.thirdPartyErrors == null) {
            this.thirdPartyErrors = new ArrayList<ThirdPartyErrorsReturnElement>();
        }
        return this.thirdPartyErrors;
    }
}
