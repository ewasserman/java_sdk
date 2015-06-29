package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supp_field_array", propOrder = {
    "suppFieldRow"
})
public class SuppFieldArray {

    @XmlElement(name = "supp_field_row")
    protected List<SuppFieldRow> suppFieldRow;

    public List<SuppFieldRow> getSuppFieldRow() {
        if (this.suppFieldRow == null) {
            this.suppFieldRow = new ArrayList<SuppFieldRow>();
        }
        return this.suppFieldRow;
    }

}
