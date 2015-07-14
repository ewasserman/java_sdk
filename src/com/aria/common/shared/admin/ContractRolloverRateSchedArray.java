package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contract_rollover_rate_sched_array", propOrder = {
    "contractRolloverRateSchedRow"
})
public class ContractRolloverRateSchedArray {

    @XmlElement(name = "contract_rollover_rate_sched_row")
    protected List<ContractRolloverRateSchedRow> contractRolloverRateSchedRow;

    public List<ContractRolloverRateSchedRow> getContractRolloverRateSchedRow() {
        if (this.contractRolloverRateSchedRow == null) {
            this.contractRolloverRateSchedRow = new ArrayList<ContractRolloverRateSchedRow>();
        }
        return this.contractRolloverRateSchedRow;
    }

}
