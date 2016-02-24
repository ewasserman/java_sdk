package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_unit_instances_array", propOrder = {
    "planUnitInstancesRow"
})
public class PlanUnitInstancesArray {

    @XmlElement(name = "plan_unit_instances_row")
    protected List<PlanUnitInstancesRow> planUnitInstancesRow;

    public List<PlanUnitInstancesRow> getPlanUnitInstancesRow() {
        if (this.planUnitInstancesRow == null) {
            this.planUnitInstancesRow = new ArrayList<PlanUnitInstancesRow>();
        }
        return this.planUnitInstancesRow;
    }

}
