package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mp_surcharges_array", propOrder = {
    "mpSurchargesRow"
})
public class MpSurchargesArray {

    @XmlElement(name = "mp_surcharges_row")
    protected List<MpSurchargesRow> mpSurchargesRow;

    public List<MpSurchargesRow> getMpSurchargesRow() {
        if (this.mpSurchargesRow == null) {
            this.mpSurchargesRow = new ArrayList<MpSurchargesRow>();
        }
        return this.mpSurchargesRow;
    }

}
