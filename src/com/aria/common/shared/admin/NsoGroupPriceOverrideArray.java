package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nso_group_price_override_array", propOrder = {
    "nsoGroupPriceOverrideRow"
})
public class NsoGroupPriceOverrideArray {

    @XmlElement(name = "nso_group_price_override_row")
    protected List<NsoGroupPriceOverrideRow> nsoGroupPriceOverrideRow;

    public List<NsoGroupPriceOverrideRow> getNsoGroupPriceOverrideRow() {
        if (this.nsoGroupPriceOverrideRow == null) {
            this.nsoGroupPriceOverrideRow = new ArrayList<NsoGroupPriceOverrideRow>();
        }
        return this.nsoGroupPriceOverrideRow;
    }

}
