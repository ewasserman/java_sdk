package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_instance_fields_array", propOrder = {
    "planInstanceFieldsRow"
})
public class PlanInstanceFieldsArray {

    @XmlElement(name = "plan_instance_fields_row")
    protected List<PlanInstanceFieldsRow> planInstanceFieldsRow;

    public List<PlanInstanceFieldsRow> getPlanInstanceFieldsRow() {
        if (this.planInstanceFieldsRow == null) {
            this.planInstanceFieldsRow = new ArrayList<PlanInstanceFieldsRow>();
        }
        return this.planInstanceFieldsRow;
    }

}
