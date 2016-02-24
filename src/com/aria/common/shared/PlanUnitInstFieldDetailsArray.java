package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_unit_inst_field_details_array", propOrder = {
    "planUnitInstFieldDetailsRow"
})
public class PlanUnitInstFieldDetailsArray {

    @XmlElement(name = "plan_unit_inst_field_details_row")
    protected List<PlanUnitInstFieldDetailsRow> planUnitInstFieldDetailsRow;

    public List<PlanUnitInstFieldDetailsRow> getPlanUnitInstFieldDetailsRow() {
        if (this.planUnitInstFieldDetailsRow == null) {
            this.planUnitInstFieldDetailsRow = new ArrayList<PlanUnitInstFieldDetailsRow>();
        }
        return this.planUnitInstFieldDetailsRow;
    }

}
