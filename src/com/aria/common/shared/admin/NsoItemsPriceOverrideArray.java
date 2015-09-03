package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nso_items_price_override_array", propOrder = {
    "nsoItemsPriceOverrideRow"
})
public class NsoItemsPriceOverrideArray {

    @XmlElement(name = "nso_items_price_override_row")
    protected List<NsoItemsPriceOverrideRow> nsoItemsPriceOverrideRow;

    public List<NsoItemsPriceOverrideRow> getNsoItemsPriceOverrideRow() {
        if (this.nsoItemsPriceOverrideRow == null) {
            this.nsoItemsPriceOverrideRow = new ArrayList<NsoItemsPriceOverrideRow>();
        }
        return this.nsoItemsPriceOverrideRow;
    }

}
