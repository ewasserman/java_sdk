package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_unit_inst_services_array", propOrder = {
    "planUnitInstServicesRow"
})
public class PlanUnitInstServicesArray {

    @XmlElement(name = "plan_unit_inst_services_row")
    protected List<PlanUnitInstServicesRow> planUnitInstServicesRow;

    public List<PlanUnitInstServicesRow> getPlanUnitInstServicesRow() {
        if (this.planUnitInstServicesRow == null) {
            this.planUnitInstServicesRow = new ArrayList<PlanUnitInstServicesRow>();
        }
        return this.planUnitInstServicesRow;
    }

}
