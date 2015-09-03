package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "master_plan_nso_list_array", propOrder = {
    "masterPlanNsoListRow"
})
public class MasterPlanNsoListArray {

    @XmlElement(name = "master_plan_nso_list_row")
    protected List<MasterPlanNsoListRow> masterPlanNsoListRow;

    public List<MasterPlanNsoListRow> getMasterPlanNsoListRow() {
        if (this.masterPlanNsoListRow == null) {
            this.masterPlanNsoListRow = new ArrayList<MasterPlanNsoListRow>();
        }
        return this.masterPlanNsoListRow;
    }

}
