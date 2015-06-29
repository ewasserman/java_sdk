package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supp_plan_array", propOrder = {
    "suppPlanRow"
})
public class SuppPlanArray {

    @XmlElement(name = "supp_plan_row")
    protected List<SuppPlanRow> suppPlanRow;

    public List<SuppPlanRow> getSuppPlanRow() {
        if (this.suppPlanRow == null) {
            this.suppPlanRow = new ArrayList<SuppPlanRow>();
        }
        return this.suppPlanRow;
    }

}
