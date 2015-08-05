package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pay_method_types_array", propOrder = {
    "payMethodTypesRow"
})
public class PayMethodTypesArray {

    @XmlElement(name = "pay_method_types_row")
    protected List<PayMethodTypesRow> payMethodTypesRow;

    public List<PayMethodTypesRow> getPayMethodTypesRow() {
        if (this.payMethodTypesRow == null) {
            this.payMethodTypesRow = new ArrayList<PayMethodTypesRow>();
        }
        return this.payMethodTypesRow;
    }

}
