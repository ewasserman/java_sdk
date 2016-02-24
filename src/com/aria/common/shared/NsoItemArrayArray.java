package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nso_item_array_array", propOrder = {
    "nsoItemArrayRow"
})
public class NsoItemArrayArray {

    @XmlElement(name = "nso_item_array_row")
    protected List<NsoItemArrayRow> nsoItemArrayRow;

    public List<NsoItemArrayRow> getNsoItemArrayRow() {
        if (this.nsoItemArrayRow == null) {
            this.nsoItemArrayRow = new ArrayList<NsoItemArrayRow>();
        }
        return this.nsoItemArrayRow;
    }

}
