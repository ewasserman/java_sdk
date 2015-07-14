package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invoice_trans_to_reverse_array", propOrder = {
    "invoiceTransToReverseRow"
})
public class InvoiceTransToReverseArray {

    @XmlElement(name = "invoice_trans_to_reverse_row")
    protected List<InvoiceTransToReverseRow> invoiceTransToReverseRow;

    public List<InvoiceTransToReverseRow> getInvoiceTransToReverseRow() {
        if (this.invoiceTransToReverseRow == null) {
            this.invoiceTransToReverseRow = new ArrayList<InvoiceTransToReverseRow>();
        }
        return this.invoiceTransToReverseRow;
    }

}
