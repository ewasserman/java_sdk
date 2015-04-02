package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assign_field_categories_array", propOrder = {
    "assignFieldCategoriesRow"
})
public class AssignFieldCategoriesArray {

    @XmlElement(name = "assign_field_categories_row")
    protected List<AssignFieldCategoriesRow> assignFieldCategoriesRow;

    public List<AssignFieldCategoriesRow> getAssignFieldCategoriesRow() {
        if (this.assignFieldCategoriesRow == null) {
            this.assignFieldCategoriesRow = new ArrayList<AssignFieldCategoriesRow>();
        }
        return this.assignFieldCategoriesRow;
    }

}
