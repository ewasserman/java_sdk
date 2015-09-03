package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nso_incl_list_array_array", propOrder = {
    "nsoInclListArrayRow"
})
public class NsoInclListArrayArray {

    @XmlElement(name = "nso_incl_list_array_row")
    protected List<NsoInclListArrayRow> nsoInclListArrayRow;

    public List<NsoInclListArrayRow> getNsoInclListArrayRow() {
        if (this.nsoInclListArrayRow == null) {
            this.nsoInclListArrayRow = new ArrayList<NsoInclListArrayRow>();
        }
        return this.nsoInclListArrayRow;
    }

}
