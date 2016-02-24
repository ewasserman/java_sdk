package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "surcharge_updates_array", propOrder = {
    "surchargeUpdatesRow"
})
public class SurchargeUpdatesArray {

    @XmlElement(name = "surcharge_updates_row")
    protected List<SurchargeUpdatesRow> surchargeUpdatesRow;

    public List<SurchargeUpdatesRow> getSurchargeUpdatesRow() {
        if (this.surchargeUpdatesRow == null) {
            this.surchargeUpdatesRow = new ArrayList<SurchargeUpdatesRow>();
        }
        return this.surchargeUpdatesRow;
    }

}
