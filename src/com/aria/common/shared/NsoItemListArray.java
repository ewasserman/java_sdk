package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nso_item_list_array", propOrder = {
    "nsoItemListRow"
})
public class NsoItemListArray {

    @XmlElement(name = "nso_item_list_row")
    protected List<NsoItemListRow> nsoItemListRow;

    public List<NsoItemListRow> getNsoItemListRow() {
        if (this.nsoItemListRow == null) {
            this.nsoItemListRow = new ArrayList<NsoItemListRow>();
        }
        return this.nsoItemListRow;
    }

}
