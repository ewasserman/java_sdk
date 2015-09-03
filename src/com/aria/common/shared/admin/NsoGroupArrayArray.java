package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nso_group_array_array", propOrder = {
    "nsoGroupArrayRow"
})
public class NsoGroupArrayArray {

    @XmlElement(name = "nso_group_array_row")
    protected List<NsoGroupArrayRow> nsoGroupArrayRow;

    public List<NsoGroupArrayRow> getNsoGroupArrayRow() {
        if (this.nsoGroupArrayRow == null) {
            this.nsoGroupArrayRow = new ArrayList<NsoGroupArrayRow>();
        }
        return this.nsoGroupArrayRow;
    }

}
