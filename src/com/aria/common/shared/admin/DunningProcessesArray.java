package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dunning_processes_array", propOrder = {
    "dunningProcessesRow"
})
public class DunningProcessesArray {

    @XmlElement(name = "dunning_processes_row")
    protected List<DunningProcessesRow> dunningProcessesRow;

    public List<DunningProcessesRow> getDunningProcessesRow() {
        if (this.dunningProcessesRow == null) {
            this.dunningProcessesRow = new ArrayList<DunningProcessesRow>();
        }
        return this.dunningProcessesRow;
    }

}
