package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_instance_to_remove_array", propOrder = {
    "planInstanceToRemoveRow"
})
public class PlanInstanceToRemoveArray {

    @XmlElement(name = "plan_instance_to_remove_row")
    protected List<PlanInstanceToRemoveRow> planInstanceToRemoveRow;

    public List<PlanInstanceToRemoveRow> getPlanInstanceToRemoveRow() {
        if (this.planInstanceToRemoveRow == null) {
            this.planInstanceToRemoveRow = new ArrayList<PlanInstanceToRemoveRow>();
        }
        return this.planInstanceToRemoveRow;
    }

}
