package com.aria.common.shared.object;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "account_plan_history_m_ReturnElement", propOrder = {"planInstanceNo", "clientPlanInstanceId", "masterPlanInstanceNo", "mpClientPlanInstanceId", "oldPlanName", "oldPlanNo", "oldClientPlanId", "oldClientPlanInstanceId", "oldPromoCd", "oldStatusCd", "oldPlanUnits", "oldRateScheduleNo", "oldClientRateScheduleId", "newPlanName", "newPlanNo", "newClientPlanId", "newClientPlanInstanceId", "newPromoCd", "newStatusCd", "newPlanUnits", "newRateScheduleNo", "newClientRateScheduleId"})
public class AccountPlanHistoryMReturnElement {

    @XmlElement(name = "plan_instance_no")
    protected Long planInstanceNo;
    @XmlElement(name = "client_plan_instance_id")
    protected Long clientPlanInstanceId;
    @XmlElement(name = "master_plan_instance_no")
    protected Long masterPlanInstanceNo;
    @XmlElement(name = "mp_client_plan_instance_id")
    protected Long mpClientPlanInstanceId;
    @XmlElement(name = "old_plan_name")
    protected String oldPlanName;
    @XmlElement(name = "old_plan_no")
    protected Long oldPlanNo;
    @XmlElement(name = "old_client_plan_id")
    protected String oldClientPlanId;
    @XmlElement(name = "old_client_plan_instance_id")
    protected Long oldClientPlanInstanceId;
    @XmlElement(name = "old_promo_cd")
    protected String oldPromoCd;
    @XmlElement(name = "old_status_cd")
    protected String oldStatusCd;
    @XmlElement(name = "old_plan_units")
    protected Long oldPlanUnits;
    @XmlElement(name = "old_rate_schedule_no")
    protected Long oldRateScheduleNo;
    @XmlElement(name = "old_client_rate_schedule_id")
    protected Long oldClientRateScheduleId;
    @XmlElement(name = "new_plan_name")
    protected String newPlanName;
    @XmlElement(name = "new_plan_no")
    protected Long newPlanNo;
    @XmlElement(name = "new_client_plan_id")
    protected String newClientPlanId;
    @XmlElement(name = "new_client_plan_instance_id")
    protected Long newClientPlanInstanceId;
    @XmlElement(name = "new_promo_cd")
    protected String newPromoCd;
    @XmlElement(name = "new_status_cd")
    protected String newStatusCd;
    @XmlElement(name = "new_plan_units")
    protected Long newPlanUnits;
    @XmlElement(name = "new_rate_schedule_no")
    protected Long newRateScheduleNo;
    @XmlElement(name = "new_client_rate_schedule_id")
    protected Long newClientRateScheduleId;
    
    public Long getPlanInstanceNo() {
        return planInstanceNo;
    }

    public void setPlanInstanceNo(Long value) {
        this.planInstanceNo = value;
    }

    public Long getClientPlanInstanceId() {
        return clientPlanInstanceId;
    }

    public void setClientPlanInstanceId(Long value) {
        this.clientPlanInstanceId = value;
    }

    public Long getMasterPlanInstanceNo() {
        return masterPlanInstanceNo;
    }

    public void setMasterPlanInstanceNo(Long value) {
        this.masterPlanInstanceNo = value;
    }

    public Long getMpClientPlanInstanceId() {
        return mpClientPlanInstanceId;
    }

    public void setMpClientPlanInstanceId(Long value) {
        this.mpClientPlanInstanceId = value;
    }

    public String getOldPlanName() {
        return oldPlanName;
    }

    public void setOldPlanName(String value) {
        this.oldPlanName = value;
    }

    public Long getOldPlanNo() {
        return oldPlanNo;
    }

    public void setOldPlanNo(Long value) {
        this.oldPlanNo = value;
    }

    public String getOldClientPlanId() {
        return oldClientPlanId;
    }

    public void setOldClientPlanId(String value) {
        this.oldClientPlanId = value;
    }

    public Long getOldClientPlanInstanceId() {
        return oldClientPlanInstanceId;
    }

    public void setOldClientPlanInstanceId(Long value) {
        this.oldClientPlanInstanceId = value;
    }

    public String getOldPromoCd() {
        return oldPromoCd;
    }

    public void setOldPromoCd(String value) {
        this.oldPromoCd = value;
    }

    public String getOldStatusCd() {
        return oldStatusCd;
    }

    public void setOldStatusCd(String value) {
        this.oldStatusCd = value;
    }

    public Long getOldPlanUnits() {
        return oldPlanUnits;
    }

    public void setOldPlanUnits(Long value) {
        this.oldPlanUnits = value;
    }

    public Long getOldRateScheduleNo() {
        return oldRateScheduleNo;
    }

    public void setOldRateScheduleNo(Long value) {
        this.oldRateScheduleNo = value;
    }

    public Long getOldClientRateScheduleId() {
        return oldClientRateScheduleId;
    }

    public void setOldClientRateScheduleId(Long value) {
        this.oldClientRateScheduleId = value;
    }

    public String getNewPlanName() {
        return newPlanName;
    }

    public void setNewPlanName(String value) {
        this.newPlanName = value;
    }

    public Long getNewPlanNo() {
        return newPlanNo;
    }

    public void setNewPlanNo(Long value) {
        this.newPlanNo = value;
    }

    public String getNewClientPlanId() {
        return newClientPlanId;
    }

    public void setNewClientPlanId(String value) {
        this.newClientPlanId = value;
    }

    public Long getNewClientPlanInstanceId() {
        return newClientPlanInstanceId;
    }

    public void setNewClientPlanInstanceId(Long value) {
        this.newClientPlanInstanceId = value;
    }

    public String getNewPromoCd() {
        return newPromoCd;
    }

    public void setNewPromoCd(String value) {
        this.newPromoCd = value;
    }

    public String getNewStatusCd() {
        return newStatusCd;
    }

    public void setNewStatusCd(String value) {
        this.newStatusCd = value;
    }

    public Long getNewPlanUnits() {
        return newPlanUnits;
    }

    public void setNewPlanUnits(Long value) {
        this.newPlanUnits = value;
    }

    public Long getNewRateScheduleNo() {
        return newRateScheduleNo;
    }

    public void setNewRateScheduleNo(Long value) {
        this.newRateScheduleNo = value;
    }

    public Long getNewClientRateScheduleId() {
        return newClientRateScheduleId;
    }

    public void setNewClientRateScheduleId(Long value) {
        this.newClientRateScheduleId = value;
    }

    
}
