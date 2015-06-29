package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "custom_rates_array", propOrder = {
    "customRatesRow"
})
public class CustomRatesArray {

    @XmlElement(name = "custom_rates_row")
    protected List<CustomRatesRow> customRatesRow;

    public List<CustomRatesRow> getCustomRatesRow() {
        if (this.customRatesRow == null) {
            this.customRatesRow = new ArrayList<CustomRatesRow>();
        }
        return this.customRatesRow;
    }

}
