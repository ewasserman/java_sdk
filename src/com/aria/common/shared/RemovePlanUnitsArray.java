package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "remove_plan_units_array", propOrder = {
    "removePlanUnitsRow"
})
public class RemovePlanUnitsArray {

    @XmlElement(name = "remove_plan_units_row")
    protected List<RemovePlanUnitsRow> removePlanUnitsRow;

    public List<RemovePlanUnitsRow> getRemovePlanUnitsRow() {
        if (this.removePlanUnitsRow == null) {
            this.removePlanUnitsRow = new ArrayList<RemovePlanUnitsRow>();
        }
        return this.removePlanUnitsRow;
    }

}
