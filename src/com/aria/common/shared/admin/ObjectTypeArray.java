package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "object_type_array", propOrder = {
    "objectTypeRow"
})
public class ObjectTypeArray {

    @XmlElement(name = "object_type_row")
    protected List<ObjectTypeRow> objectTypeRow;

    public List<ObjectTypeRow> getObjectTypeRow() {
        if (this.objectTypeRow == null) {
            this.objectTypeRow = new ArrayList<ObjectTypeRow>();
        }
        return this.objectTypeRow;
    }

}
