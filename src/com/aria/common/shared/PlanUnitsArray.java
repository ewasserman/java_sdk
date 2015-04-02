package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_units_array", propOrder = {
    "planUnitsRow"
})
public class PlanUnitsArray {

    @XmlElement(name = "plan_units_row")
    protected List<PlanUnitsRow> planUnitsRow;

    public List<PlanUnitsRow> getPlanUnitsRow() {
        if (this.planUnitsRow == null) {
            this.planUnitsRow = new ArrayList<PlanUnitsRow>();
        }
        return this.planUnitsRow;
    }

}
