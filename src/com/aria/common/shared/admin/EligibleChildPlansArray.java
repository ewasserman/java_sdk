package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eligible_child_plans_array", propOrder = {
    "eligibleChildPlansRow"
})
public class EligibleChildPlansArray {

    @XmlElement(name = "eligible_child_plans_row")
    protected List<EligibleChildPlansRow> eligibleChildPlansRow;

    public List<EligibleChildPlansRow> getEligibleChildPlansRow() {
        if (this.eligibleChildPlansRow == null) {
            this.eligibleChildPlansRow = new ArrayList<EligibleChildPlansRow>();
        }
        return this.eligibleChildPlansRow;
    }

}
