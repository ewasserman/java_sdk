package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_unit_inst_fields_array", propOrder = {
    "planUnitInstFieldsRow"
})
public class PlanUnitInstFieldsArray {

    @XmlElement(name = "plan_unit_inst_fields_row")
    protected List<PlanUnitInstFieldsRow> planUnitInstFieldsRow;

    public List<PlanUnitInstFieldsRow> getPlanUnitInstFieldsRow() {
        if (this.planUnitInstFieldsRow == null) {
            this.planUnitInstFieldsRow = new ArrayList<PlanUnitInstFieldsRow>();
        }
        return this.planUnitInstFieldsRow;
    }

}
