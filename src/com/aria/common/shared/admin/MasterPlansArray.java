package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "master_plans_array", propOrder = {
    "masterPlansRow"
})
public class MasterPlansArray {

    @XmlElement(name = "master_plans_row")
    protected List<MasterPlansRow> masterPlansRow;

    public List<MasterPlansRow> getMasterPlansRow() {
        if (this.masterPlansRow == null) {
            this.masterPlansRow = new ArrayList<MasterPlansRow>();
        }
        return this.masterPlansRow;
    }

}
