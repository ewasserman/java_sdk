package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "master_plan_plan_inst_fields_array", propOrder = {
    "masterPlanPlanInstFieldsRow"
})
public class MasterPlanPlanInstFieldsArray {

    @XmlElement(name = "master_plan_plan_inst_fields_row")
    protected List<MasterPlanPlanInstFieldsRow> masterPlanPlanInstFieldsRow;

    public List<MasterPlanPlanInstFieldsRow> getMasterPlanPlanInstFieldsRow() {
        if (this.masterPlanPlanInstFieldsRow == null) {
            this.masterPlanPlanInstFieldsRow = new ArrayList<MasterPlanPlanInstFieldsRow>();
        }
        return this.masterPlanPlanInstFieldsRow;
    }

}
