package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assign_plan_unit_instances_array", propOrder = {
    "assignPlanUnitInstancesRow"
})
public class AssignPlanUnitInstancesArray {

    @XmlElement(name = "assign_plan_unit_instances_row")
    protected List<AssignPlanUnitInstancesRow> assignPlanUnitInstancesRow;

    public List<AssignPlanUnitInstancesRow> getAssignPlanUnitInstancesRow() {
        if (this.assignPlanUnitInstancesRow == null) {
            this.assignPlanUnitInstancesRow = new ArrayList<AssignPlanUnitInstancesRow>();
        }
        return this.assignPlanUnitInstancesRow;
    }

}
