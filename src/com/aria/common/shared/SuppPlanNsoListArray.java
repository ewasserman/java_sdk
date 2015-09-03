package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supp_plan_nso_list_array", propOrder = {
    "suppPlanNsoListRow"
})
public class SuppPlanNsoListArray {

    @XmlElement(name = "supp_plan_nso_list_row")
    protected List<SuppPlanNsoListRow> suppPlanNsoListRow;

    public List<SuppPlanNsoListRow> getSuppPlanNsoListRow() {
        if (this.suppPlanNsoListRow == null) {
            this.suppPlanNsoListRow = new ArrayList<SuppPlanNsoListRow>();
        }
        return this.suppPlanNsoListRow;
    }

}
