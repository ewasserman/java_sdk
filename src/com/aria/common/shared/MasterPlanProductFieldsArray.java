package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "master_plan_product_fields_array", propOrder = {
    "masterPlanProductFieldsRow"
})
public class MasterPlanProductFieldsArray {

    @XmlElement(name = "master_plan_product_fields_row")
    protected List<MasterPlanProductFieldsRow> masterPlanProductFieldsRow;

    public List<MasterPlanProductFieldsRow> getMasterPlanProductFieldsRow() {
        if (this.masterPlanProductFieldsRow == null) {
            this.masterPlanProductFieldsRow = new ArrayList<MasterPlanProductFieldsRow>();
        }
        return this.masterPlanProductFieldsRow;
    }

}
