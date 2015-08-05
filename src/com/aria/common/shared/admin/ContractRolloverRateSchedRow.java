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
    protected Long currentRateSchedNo;
    @XmlElement(name = "current_client_rate_sched_id")
    protected String currentClientRateSchedId;
    @XmlElement(name = "rollover_rate_sched_no")
    protected Long rolloverRateSchedNo;
    @XmlElement(name = "rollover_client_rate_sched_id")
    protected String rolloverClientRateSchedId;
    public Long getCurrentRateSchedNo() {
        return currentRateSchedNo;
    }

    public void setCurrentRateSchedNo(Long value) {
        this.currentRateSchedNo = value;
    }

    public String getCurrentClientRateSchedId() {
        return currentClientRateSchedId;
    }

    public void setCurrentClientRateSchedId(String value) {
        this.currentClientRateSchedId = value;
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
