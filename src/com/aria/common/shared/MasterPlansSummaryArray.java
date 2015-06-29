package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "master_plans_summary_array", propOrder = {
    "masterPlansSummaryRow"
})
public class MasterPlansSummaryArray {

    @XmlElement(name = "master_plans_summary_row")
    protected List<MasterPlansSummaryRow> masterPlansSummaryRow;

    public List<MasterPlansSummaryRow> getMasterPlansSummaryRow() {
        if (this.masterPlansSummaryRow == null) {
            this.masterPlansSummaryRow = new ArrayList<MasterPlansSummaryRow>();
        }
        return this.masterPlansSummaryRow;
    }

}
