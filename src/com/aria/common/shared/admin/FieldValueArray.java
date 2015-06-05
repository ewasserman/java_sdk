package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "field_value_array", propOrder = {
    "fieldValueRow"
})
public class FieldValueArray {

    @XmlElement(name = "field_value_row")
    protected List<FieldValueRow> fieldValueRow;

    public List<FieldValueRow> getFieldValueRow() {
        if (this.fieldValueRow == null) {
            this.fieldValueRow = new ArrayList<FieldValueRow>();
        }
        return this.fieldValueRow;
    }

}
