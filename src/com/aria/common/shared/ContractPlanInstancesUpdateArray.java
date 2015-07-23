package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contract_plan_instances_update_array", propOrder = {
    "contractPlanInstancesUpdateRow"
})
public class ContractPlanInstancesUpdateArray {

    @XmlElement(name = "contract_plan_instances_update_row")
    protected List<ContractPlanInstancesUpdateRow> contractPlanInstancesUpdateRow;

    public List<ContractPlanInstancesUpdateRow> getContractPlanInstancesUpdateRow() {
        if (this.contractPlanInstancesUpdateRow == null) {
            this.contractPlanInstancesUpdateRow = new ArrayList<ContractPlanInstancesUpdateRow>();
        }
        return this.contractPlanInstancesUpdateRow;
    }

}
