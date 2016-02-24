package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "specific_transactions_array", propOrder = {
    "specificTransactionsRow"
})
public class SpecificTransactionsArray {

    @XmlElement(name = "specific_transactions_row")
    protected List<SpecificTransactionsRow> specificTransactionsRow;

    public List<SpecificTransactionsRow> getSpecificTransactionsRow() {
        if (this.specificTransactionsRow == null) {
            this.specificTransactionsRow = new ArrayList<SpecificTransactionsRow>();
        }
        return this.specificTransactionsRow;
    }

}
