package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contract_plan_instances_array", propOrder = {
    "contractPlanInstancesRow"
})
public class ContractPlanInstancesArray {

    @XmlElement(name = "contract_plan_instances_row")
    protected List<ContractPlanInstancesRow> contractPlanInstancesRow;

    public List<ContractPlanInstancesRow> getContractPlanInstancesRow() {
        if (this.contractPlanInstancesRow == null) {
            this.contractPlanInstancesRow = new ArrayList<ContractPlanInstancesRow>();
        }
        return this.contractPlanInstancesRow;
    }

}
