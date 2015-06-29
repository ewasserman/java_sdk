package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "custom_rate_array", propOrder = {
    "customRateRow"
})
public class CustomRateArray {

    @XmlElement(name = "custom_rate_row")
    protected List<CustomRateRow> customRateRow;

    public List<CustomRateRow> getCustomRateRow() {
        if (this.customRateRow == null) {
            this.customRateRow = new ArrayList<CustomRateRow>();
        }
        return this.customRateRow;
    }

}
