package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "master_plans_detail_array", propOrder = {
    "masterPlansDetailRow"
})
public class MasterPlansDetailArray {

    @XmlElement(name = "master_plans_detail_row")
    protected List<MasterPlansDetailRow> masterPlansDetailRow;

    public List<MasterPlansDetailRow> getMasterPlansDetailRow() {
        if (this.masterPlansDetailRow == null) {
            this.masterPlansDetailRow = new ArrayList<MasterPlansDetailRow>();
        }
        return this.masterPlansDetailRow;
    }

}
