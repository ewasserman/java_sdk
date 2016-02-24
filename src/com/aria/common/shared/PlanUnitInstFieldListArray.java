package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_unit_inst_field_list_array", propOrder = {
    "planUnitInstFieldListRow"
})
public class PlanUnitInstFieldListArray {

    @XmlElement(name = "plan_unit_inst_field_list_row")
    protected List<PlanUnitInstFieldListRow> planUnitInstFieldListRow;

    public List<PlanUnitInstFieldListRow> getPlanUnitInstFieldListRow() {
        if (this.planUnitInstFieldListRow == null) {
            this.planUnitInstFieldListRow = new ArrayList<PlanUnitInstFieldListRow>();
        }
        return this.planUnitInstFieldListRow;
    }

}
