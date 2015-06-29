package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_instance_fields_info_array", propOrder = {
    "planInstanceFieldsInfoRow"
})
public class PlanInstanceFieldsInfoArray {

    @XmlElement(name = "plan_instance_fields_info_row")
    protected List<PlanInstanceFieldsInfoRow> planInstanceFieldsInfoRow;

    public List<PlanInstanceFieldsInfoRow> getPlanInstanceFieldsInfoRow() {
        if (this.planInstanceFieldsInfoRow == null) {
            this.planInstanceFieldsInfoRow = new ArrayList<PlanInstanceFieldsInfoRow>();
        }
        return this.planInstanceFieldsInfoRow;
    }

}
