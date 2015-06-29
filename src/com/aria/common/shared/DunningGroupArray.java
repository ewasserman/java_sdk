package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dunning_group_array", propOrder = {
    "dunningGroupRow"
})
public class DunningGroupArray {

    @XmlElement(name = "dunning_group_row")
    protected List<DunningGroupRow> dunningGroupRow;

    public List<DunningGroupRow> getDunningGroupRow() {
        if (this.dunningGroupRow == null) {
            this.dunningGroupRow = new ArrayList<DunningGroupRow>();
        }
        return this.dunningGroupRow;
    }

}
