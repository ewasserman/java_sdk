package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contract_plan_instances_update_row", propOrder = {
    "planInstanceNo",
    "clientPlanInstanceId",
    "rolloverPlanNo",
    "rolloverClientPlanId",
    "rolloverRateSchedNo",
    "rolloverClientRateSchedId"
    })
public class ContractPlanInstancesUpdateRow {

    @XmlElement(name = "plan_instance_no")
    protected Long planInstanceNo;
    @XmlElement(name = "client_plan_instance_id")
    protected String clientPlanInstanceId;
    @XmlElement(name = "rollover_plan_no")
    protected Long rolloverPlanNo;
    @XmlElement(name = "rollover_client_plan_id")
    protected String rolloverClientPlanId;
    @XmlElement(name = "rollover_rate_sched_no")
    protected Long rolloverRateSchedNo;
    @XmlElement(name = "rollover_client_rate_sched_id")
    protected String rolloverClientRateSchedId;
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

    public Long getRolloverPlanNo() {
        return rolloverPlanNo;
    }

    public void setRolloverPlanNo(Long value) {
        this.rolloverPlanNo = value;
    }

    public String getRolloverClientPlanId() {
        return rolloverClientPlanId;
    }

    public void setRolloverClientPlanId(String value) {
        this.rolloverClientPlanId = value;
    }

    public Long getRolloverRateSchedNo() {
        return rolloverRateSchedNo;
    }

    public void setRolloverRateSchedNo(Long value) {
        this.rolloverRateSchedNo = value;
    }

    public String getRolloverClientRateSchedId() {
        return rolloverClientRateSchedId;
    }

    public void setRolloverClientRateSchedId(String value) {
        this.rolloverClientRateSchedId = value;
    }

    
}
