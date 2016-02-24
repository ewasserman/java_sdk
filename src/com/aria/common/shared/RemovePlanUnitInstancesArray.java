package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remove_plan_unit_instances_array", propOrder = {
    "removePlanUnitInstancesRow"
})
public class RemovePlanUnitInstancesArray {

    @XmlElement(name = "remove_plan_unit_instances_row")
    protected List<RemovePlanUnitInstancesRow> removePlanUnitInstancesRow;

    public List<RemovePlanUnitInstancesRow> getRemovePlanUnitInstancesRow() {
        if (this.removePlanUnitInstancesRow == null) {
            this.removePlanUnitInstancesRow = new ArrayList<RemovePlanUnitInstancesRow>();
        }
        return this.removePlanUnitInstancesRow;
    }

}
