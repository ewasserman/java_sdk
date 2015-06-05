package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "field_selection_array", propOrder = {
    "fieldSelectionRow"
})
public class FieldSelectionArray {

    @XmlElement(name = "field_selection_row")
    protected List<FieldSelectionRow> fieldSelectionRow;

    public List<FieldSelectionRow> getFieldSelectionRow() {
        if (this.fieldSelectionRow == null) {
            this.fieldSelectionRow = new ArrayList<FieldSelectionRow>();
        }
        return this.fieldSelectionRow;
    }

}
