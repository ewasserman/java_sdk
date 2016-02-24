package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "specific_invoices_array", propOrder = {
    "specificInvoicesRow"
})
public class SpecificInvoicesArray {

    @XmlElement(name = "specific_invoices_row")
    protected List<SpecificInvoicesRow> specificInvoicesRow;

    public List<SpecificInvoicesRow> getSpecificInvoicesRow() {
        if (this.specificInvoicesRow == null) {
            this.specificInvoicesRow = new ArrayList<SpecificInvoicesRow>();
        }
        return this.specificInvoicesRow;
    }

}
