package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contract_rollover_rate_sched_ReturnElement", propOrder = {"contractCurrentRateSchedNo", "contractCurrentClientRateSchedId", "contractRolloverRateSchedNo", "contractRolloverClientRateSchedId"})
public class ContractRolloverRateSchedReturnElement {

    @XmlElement(name = "contract_current_rate_sched_no")
    protected Long contractCurrentRateSchedNo;
    @XmlElement(name = "contract_current_client_rate_sched_id")
    protected String contractCurrentClientRateSchedId;
    @XmlElement(name = "contract_rollover_rate_sched_no")
    protected Long contractRolloverRateSchedNo;
    @XmlElement(name = "contract_rollover_client_rate_sched_id")
    protected String contractRolloverClientRateSchedId;
    
    public Long getContractCurrentRateSchedNo() {
        return contractCurrentRateSchedNo;
    }

    public void setContractCurrentRateSchedNo(Long value) {
        this.contractCurrentRateSchedNo = value;
    }

    public String getContractCurrentClientRateSchedId() {
        return contractCurrentClientRateSchedId;
    }

    public void setContractCurrentClientRateSchedId(String value) {
        this.contractCurrentClientRateSchedId = value;
    }

    public Long getContractRolloverRateSchedNo() {
        return contractRolloverRateSchedNo;
    }

    public void setContractRolloverRateSchedNo(Long value) {
        this.contractRolloverRateSchedNo = value;
    }

    public String getContractRolloverClientRateSchedId() {
        return contractRolloverClientRateSchedId;
    }

    public void setContractRolloverClientRateSchedId(String value) {
        this.contractRolloverClientRateSchedId = value;
    }

    
}
