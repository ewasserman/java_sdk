package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_instance_field_update_array", propOrder = {
    "planInstanceFieldUpdateRow"
})
public class PlanInstanceFieldUpdateArray {

    @XmlElement(name = "plan_instance_field_update_row")
    protected List<PlanInstanceFieldUpdateRow> planInstanceFieldUpdateRow;

    public List<PlanInstanceFieldUpdateRow> getPlanInstanceFieldUpdateRow() {
        if (this.planInstanceFieldUpdateRow == null) {
            this.planInstanceFieldUpdateRow = new ArrayList<PlanInstanceFieldUpdateRow>();
        }
        return this.planInstanceFieldUpdateRow;
    }

}
