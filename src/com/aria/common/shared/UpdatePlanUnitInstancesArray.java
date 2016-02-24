package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "update_plan_unit_instances_array", propOrder = {
    "updatePlanUnitInstancesRow"
})
public class UpdatePlanUnitInstancesArray {

    @XmlElement(name = "update_plan_unit_instances_row")
    protected List<UpdatePlanUnitInstancesRow> updatePlanUnitInstancesRow;

    public List<UpdatePlanUnitInstancesRow> getUpdatePlanUnitInstancesRow() {
        if (this.updatePlanUnitInstancesRow == null) {
            this.updatePlanUnitInstancesRow = new ArrayList<UpdatePlanUnitInstancesRow>();
        }
        return this.updatePlanUnitInstancesRow;
    }

}
