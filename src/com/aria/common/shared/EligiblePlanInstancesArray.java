package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eligible_plan_instances_array", propOrder = {
    "eligiblePlanInstancesRow"
})
public class EligiblePlanInstancesArray {

    @XmlElement(name = "eligible_plan_instances_row")
    protected List<EligiblePlanInstancesRow> eligiblePlanInstancesRow;

    public List<EligiblePlanInstancesRow> getEligiblePlanInstancesRow() {
        if (this.eligiblePlanInstancesRow == null) {
            this.eligiblePlanInstancesRow = new ArrayList<EligiblePlanInstancesRow>();
        }
        return this.eligiblePlanInstancesRow;
    }

}
