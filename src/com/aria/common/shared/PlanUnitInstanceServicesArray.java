package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_unit_instance_services_array", propOrder = {
    "planUnitInstanceServicesRow"
})
public class PlanUnitInstanceServicesArray {

    @XmlElement(name = "plan_unit_instance_services_row")
    protected List<PlanUnitInstanceServicesRow> planUnitInstanceServicesRow;

    public List<PlanUnitInstanceServicesRow> getPlanUnitInstanceServicesRow() {
        if (this.planUnitInstanceServicesRow == null) {
            this.planUnitInstanceServicesRow = new ArrayList<PlanUnitInstanceServicesRow>();
        }
        return this.planUnitInstanceServicesRow;
    }

}
