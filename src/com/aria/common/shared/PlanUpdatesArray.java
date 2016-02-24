package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_updates_array", propOrder = {
    "planUpdatesRow"
})
public class PlanUpdatesArray {

    @XmlElement(name = "plan_updates_row")
    protected List<PlanUpdatesRow> planUpdatesRow;

    public List<PlanUpdatesRow> getPlanUpdatesRow() {
        if (this.planUpdatesRow == null) {
            this.planUpdatesRow = new ArrayList<PlanUpdatesRow>();
        }
        return this.planUpdatesRow;
    }

}
