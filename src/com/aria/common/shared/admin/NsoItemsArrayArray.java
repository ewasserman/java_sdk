package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nso_items_array_array", propOrder = {
    "nsoItemsArrayRow"
})
public class NsoItemsArrayArray {

    @XmlElement(name = "nso_items_array_row")
    protected List<NsoItemsArrayRow> nsoItemsArrayRow;

    public List<NsoItemsArrayRow> getNsoItemsArrayRow() {
        if (this.nsoItemsArrayRow == null) {
            this.nsoItemsArrayRow = new ArrayList<NsoItemsArrayRow>();
        }
        return this.nsoItemsArrayRow;
    }

}
