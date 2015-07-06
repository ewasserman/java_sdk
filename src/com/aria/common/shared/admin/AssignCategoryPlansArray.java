package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assign_category_plans_array", propOrder = {
    "assignCategoryPlansRow"
})
public class AssignCategoryPlansArray {

    @XmlElement(name = "assign_category_plans_row")
    protected List<AssignCategoryPlansRow> assignCategoryPlansRow;

    public List<AssignCategoryPlansRow> getAssignCategoryPlansRow() {
        if (this.assignCategoryPlansRow == null) {
            this.assignCategoryPlansRow = new ArrayList<AssignCategoryPlansRow>();
        }
        return this.assignCategoryPlansRow;
    }

}
