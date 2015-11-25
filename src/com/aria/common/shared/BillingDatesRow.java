package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billing_dates_row", propOrder = {
    "masterPlanInstanceNo",
    "clientMasterPlanInstanceId",
    "actionDirective",
    "adjustmentDays",
    "adjustmentDate"
    })
public class BillingDatesRow {

    @XmlElement(name = "master_plan_instance_no")
    protected Long masterPlanInstanceNo;
    @XmlElement(name = "client_master_plan_instance_id")
    protected String clientMasterPlanInstanceId;
    @XmlElement(name = "action_directive")
    protected Long actionDirective;
    @XmlElement(name = "adjustment_days")
    protected Long adjustmentDays;
    @XmlElement(name = "adjustment_date")
    protected String adjustmentDate;
    public Long getMasterPlanInstanceNo() {
        return masterPlanInstanceNo;
    }

    public void setMasterPlanInstanceNo(Long value) {
        this.masterPlanInstanceNo = value;
    }

    public String getClientMasterPlanInstanceId() {
        return clientMasterPlanInstanceId;
    }

    public void setClientMasterPlanInstanceId(String value) {
        this.clientMasterPlanInstanceId = value;
    }

    public Long getActionDirective() {
        return actionDirective;
    }

    public void setActionDirective(Long value) {
        this.actionDirective = value;
    }

    public Long getAdjustmentDays() {
        return adjustmentDays;
    }

    public void setAdjustmentDays(Long value) {
        this.adjustmentDays = value;
    }

    public String getAdjustmentDate() {
        return adjustmentDate;
    }

    public void setAdjustmentDate(String value) {
        this.adjustmentDate = value;
    }

    
}
