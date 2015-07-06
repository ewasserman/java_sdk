package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assign_category_fields_array", propOrder = {
    "assignCategoryFieldsRow"
})
public class AssignCategoryFieldsArray {

    @XmlElement(name = "assign_category_fields_row")
    protected List<AssignCategoryFieldsRow> assignCategoryFieldsRow;

    public List<AssignCategoryFieldsRow> getAssignCategoryFieldsRow() {
        if (this.assignCategoryFieldsRow == null) {
            this.assignCategoryFieldsRow = new ArrayList<AssignCategoryFieldsRow>();
        }
        return this.assignCategoryFieldsRow;
    }

}
