package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_eligible_plan_instances_array", propOrder = {
    "clientEligiblePlanInstancesRow"
})
public class ClientEligiblePlanInstancesArray {

    @XmlElement(name = "client_eligible_plan_instances_row")
    protected List<ClientEligiblePlanInstancesRow> clientEligiblePlanInstancesRow;

    public List<ClientEligiblePlanInstancesRow> getClientEligiblePlanInstancesRow() {
        if (this.clientEligiblePlanInstancesRow == null) {
            this.clientEligiblePlanInstancesRow = new ArrayList<ClientEligiblePlanInstancesRow>();
        }
        return this.clientEligiblePlanInstancesRow;
    }

}
