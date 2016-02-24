package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_history_ReturnElement", propOrder = {"planInstanceNo", "masterPlanInstanceNo", "oldPlanNo", "newPlanNo", "oldClientPlanId", "newClientPlanId", "oldPlanName", "newPlanName", "oldPromoCd", "newPromoCd", "oldStatusCd", "newStatusCd", "oldPlanUnits", "newPlanUnits", "oldRateScheduleNo", "newRateScheduleNo", "oldClientRateScheduleId", "newClientRateScheduleId", "oldClientPlanInstanceId", "newClientPlanInstanceId", "updateDate", "oldDunningState", "newDunningState"})
public class PlanHistoryReturnElement {

    @XmlElement(name = "plan_instance_no")
    protected Long planInstanceNo;
    @XmlElement(name = "master_plan_instance_no")
    protected Long masterPlanInstanceNo;
    @XmlElement(name = "old_plan_no")
    protected Long oldPlanNo;
    @XmlElement(name = "new_plan_no")
    protected Long newPlanNo;
    @XmlElement(name = "old_client_plan_id")
    protected String oldClientPlanId;
    @XmlElement(name = "new_client_plan_id")
    protected String newClientPlanId;
    @XmlElement(name = "old_plan_name")
    protected String oldPlanName;
    @XmlElement(name = "new_plan_name")
    protected String newPlanName;
    @XmlElement(name = "old_promo_cd")
    protected String oldPromoCd;
    @XmlElement(name = "new_promo_cd")
    protected String newPromoCd;
    @XmlElement(name = "old_status_cd")
    protected Long oldStatusCd;
    @XmlElement(name = "new_status_cd")
    protected Long newStatusCd;
    @XmlElement(name = "old_plan_units")
    protected Double oldPlanUnits;
    @XmlElement(name = "new_plan_units")
    protected Double newPlanUnits;
    @XmlElement(name = "old_rate_schedule_no")
    protected Long oldRateScheduleNo;
    @XmlElement(name = "new_rate_schedule_no")
    protected Long newRateScheduleNo;
    @XmlElement(name = "old_client_rate_schedule_id")
    protected String oldClientRateScheduleId;
    @XmlElement(name = "new_client_rate_schedule_id")
    protected String newClientRateScheduleId;
    @XmlElement(name = "old_client_plan_instance_id")
    protected String oldClientPlanInstanceId;
    @XmlElement(name = "new_client_plan_instance_id")
    protected String newClientPlanInstanceId;
    @XmlElement(name = "update_date")
    protected String updateDate;
    @XmlElement(name = "old_dunning_state")
    protected Long oldDunningState;
    @XmlElement(name = "new_dunning_state")
    protected Long newDunningState;
    
    public Long getPlanInstanceNo() {
        return planInstanceNo;
    }

    public void setPlanInstanceNo(Long value) {
        this.planInstanceNo = value;
    }

    public Long getMasterPlanInstanceNo() {
        return masterPlanInstanceNo;
    }

    public void setMasterPlanInstanceNo(Long value) {
        this.masterPlanInstanceNo = value;
    }

    public Long getOldPlanNo() {
        return oldPlanNo;
    }

    public void setOldPlanNo(Long value) {
        this.oldPlanNo = value;
    }

    public Long getNewPlanNo() {
        return newPlanNo;
    }

    public void setNewPlanNo(Long value) {
        this.newPlanNo = value;
    }

    public String getOldClientPlanId() {
        return oldClientPlanId;
    }

    public void setOldClientPlanId(String value) {
        this.oldClientPlanId = value;
    }

    public String getNewClientPlanId() {
        return newClientPlanId;
    }

    public void setNewClientPlanId(String value) {
        this.newClientPlanId = value;
    }

    public String getOldPlanName() {
        return oldPlanName;
    }

    public void setOldPlanName(String value) {
        this.oldPlanName = value;
    }

    public String getNewPlanName() {
        return newPlanName;
    }

    public void setNewPlanName(String value) {
        this.newPlanName = value;
    }

    public String getOldPromoCd() {
        return oldPromoCd;
    }

    public void setOldPromoCd(String value) {
        this.oldPromoCd = value;
    }

    public String getNewPromoCd() {
        return newPromoCd;
    }

    public void setNewPromoCd(String value) {
        this.newPromoCd = value;
    }

    public Long getOldStatusCd() {
        return oldStatusCd;
    }

    public void setOldStatusCd(Long value) {
        this.oldStatusCd = value;
    }

    public Long getNewStatusCd() {
        return newStatusCd;
    }

    public void setNewStatusCd(Long value) {
        this.newStatusCd = value;
    }

    public Double getOldPlanUnits() {
        return oldPlanUnits;
    }

    public void setOldPlanUnits(Double value) {
        this.oldPlanUnits = value;
    }

    public Double getNewPlanUnits() {
        return newPlanUnits;
    }

    public void setNewPlanUnits(Double value) {
        this.newPlanUnits = value;
    }

    public Long getOldRateScheduleNo() {
        return oldRateScheduleNo;
    }

    public void setOldRateScheduleNo(Long value) {
        this.oldRateScheduleNo = value;
    }

    public Long getNewRateScheduleNo() {
        return newRateScheduleNo;
    }

    public void setNewRateScheduleNo(Long value) {
        this.newRateScheduleNo = value;
    }

    public String getOldClientRateScheduleId() {
        return oldClientRateScheduleId;
    }

    public void setOldClientRateScheduleId(String value) {
        this.oldClientRateScheduleId = value;
    }

    public String getNewClientRateScheduleId() {
        return newClientRateScheduleId;
    }

    public void setNewClientRateScheduleId(String value) {
        this.newClientRateScheduleId = value;
    }

    public String getOldClientPlanInstanceId() {
        return oldClientPlanInstanceId;
    }

    public void setOldClientPlanInstanceId(String value) {
        this.oldClientPlanInstanceId = value;
    }

    public String getNewClientPlanInstanceId() {
        return newClientPlanInstanceId;
    }

    public void setNewClientPlanInstanceId(String value) {
        this.newClientPlanInstanceId = value;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String value) {
        this.updateDate = value;
    }

    public Long getOldDunningState() {
        return oldDunningState;
    }

    public void setOldDunningState(Long value) {
        this.oldDunningState = value;
    }

    public Long getNewDunningState() {
        return newDunningState;
    }

    public void setNewDunningState(Long value) {
        this.newDunningState = value;
    }

    
}
