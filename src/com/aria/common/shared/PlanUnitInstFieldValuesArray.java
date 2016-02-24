package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_unit_inst_field_values_array", propOrder = {
    "planUnitInstFieldValuesRow"
})
public class PlanUnitInstFieldValuesArray {

    @XmlElement(name = "plan_unit_inst_field_values_row")
    protected List<PlanUnitInstFieldValuesRow> planUnitInstFieldValuesRow;

    public List<PlanUnitInstFieldValuesRow> getPlanUnitInstFieldValuesRow() {
        if (this.planUnitInstFieldValuesRow == null) {
            this.planUnitInstFieldValuesRow = new ArrayList<PlanUnitInstFieldValuesRow>();
        }
        return this.planUnitInstFieldValuesRow;
    }

}
