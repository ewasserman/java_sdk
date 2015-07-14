package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contract_rollover_rate_sched_row", propOrder = {
    "currentRateSchedNo",
    "currentClientRateSchedId",
    "rolloverRateSchedNo",
    "rolloverClientRateSchedId"
    })
public class ContractRolloverRateSchedRow {

    @XmlElement(name = "current_rate_sched_no")
    protected String currentRateSchedNo;
    @XmlElement(name = "current_client_rate_sched_id")
    protected String currentClientRateSchedId;
    @XmlElement(name = "rollover_rate_sched_no")
    protected String rolloverRateSchedNo;
    @XmlElement(name = "rollover_client_rate_sched_id")
    protected String rolloverClientRateSchedId;
    public String getCurrentRateSchedNo() {
        return currentRateSchedNo;
    }

    public void setCurrentRateSchedNo(String value) {
        this.currentRateSchedNo = value;
    }

    public String getCurrentClientRateSchedId() {
        return currentClientRateSchedId;
    }

    public void setCurrentClientRateSchedId(String value) {
        this.currentClientRateSchedId = value;
    }

    public String getRolloverRateSchedNo() {
        return rolloverRateSchedNo;
    }

    public void setRolloverRateSchedNo(String value) {
        this.rolloverRateSchedNo = value;
    }

    public String getRolloverClientRateSchedId() {
        return rolloverClientRateSchedId;
    }

    public void setRolloverClientRateSchedId(String value) {
        this.rolloverClientRateSchedId = value;
    }

    
}
