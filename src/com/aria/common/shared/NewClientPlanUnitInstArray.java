package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "new_client_plan_unit_inst_array", propOrder = {
    "newClientPlanUnitInstRow"
})
public class NewClientPlanUnitInstArray {

    @XmlElement(name = "new_client_plan_unit_inst_row")
    protected List<NewClientPlanUnitInstRow> newClientPlanUnitInstRow;

    public List<NewClientPlanUnitInstRow> getNewClientPlanUnitInstRow() {
        if (this.newClientPlanUnitInstRow == null) {
            this.newClientPlanUnitInstRow = new ArrayList<NewClientPlanUnitInstRow>();
        }
        return this.newClientPlanUnitInstRow;
    }

}
