package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contract_plan_instance_info_ReturnElement", propOrder = {"planInstanceNo", "planName", "clientPlanInstanceId", "planInstanceStatusCd", "planInstanceStatusLabel", "rolloverPlanNo", "rolloverClientPlanId", "rolloverRateSchedNo", "rolloverClientRateSchedId", "contractRolloverCustomRateInfo"})
public class ContractPlanInstanceInfoReturnElement {

    @XmlElement(name = "plan_instance_no")
    protected Long planInstanceNo;
    @XmlElement(name = "plan_name")
    protected String planName;
    @XmlElement(name = "client_plan_instance_id")
    protected String clientPlanInstanceId;
    @XmlElement(name = "plan_instance_status_cd")
    protected Long planInstanceStatusCd;
    @XmlElement(name = "plan_instance_status_label")
    protected String planInstanceStatusLabel;
    @XmlElement(name = "rollover_plan_no")
    protected Long rolloverPlanNo;
    @XmlElement(name = "rollover_client_plan_id")
    protected String rolloverClientPlanId;
    @XmlElement(name = "rollover_rate_sched_no")
    protected Long rolloverRateSchedNo;
    @XmlElement(name = "rollover_client_rate_sched_id")
    protected String rolloverClientRateSchedId;
    @XmlElement(name = "contract_rollover_custom_rate_info")
    protected List<ContractRolloverCustomRateInfoReturnElement> contractRolloverCustomRateInfo;
    
    public Long getPlanInstanceNo() {
        return planInstanceNo;
    }

    public void setPlanInstanceNo(Long value) {
        this.planInstanceNo = value;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String value) {
        this.planName = value;
    }

    public String getClientPlanInstanceId() {
        return clientPlanInstanceId;
    }

    public void setClientPlanInstanceId(String value) {
        this.clientPlanInstanceId = value;
    }

    public Long getPlanInstanceStatusCd() {
        return planInstanceStatusCd;
    }

    public void setPlanInstanceStatusCd(Long value) {
        this.planInstanceStatusCd = value;
    }

    public String getPlanInstanceStatusLabel() {
        return planInstanceStatusLabel;
    }

    public void setPlanInstanceStatusLabel(String value) {
        this.planInstanceStatusLabel = value;
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

    public List<ContractRolloverCustomRateInfoReturnElement> getContractRolloverCustomRateInfo() {
        if (this.contractRolloverCustomRateInfo == null) {
            this.contractRolloverCustomRateInfo = new ArrayList<ContractRolloverCustomRateInfoReturnElement>();
        }
        return this.contractRolloverCustomRateInfo;
    }
}
