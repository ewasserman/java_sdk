package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "field_categories_array", propOrder = {
    "fieldCategoriesRow"
})
public class FieldCategoriesArray {

    @XmlElement(name = "field_categories_row")
    protected List<FieldCategoriesRow> fieldCategoriesRow;

    public List<FieldCategoriesRow> getFieldCategoriesRow() {
        if (this.fieldCategoriesRow == null) {
            this.fieldCategoriesRow = new ArrayList<FieldCategoriesRow>();
        }
        return this.fieldCategoriesRow;
    }

}
