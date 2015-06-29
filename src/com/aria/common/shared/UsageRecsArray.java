package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usage_recs_array", propOrder = {
    "usageRecsRow"
})
public class UsageRecsArray {

    @XmlElement(name = "usage_recs_row")
    protected List<UsageRecsRow> usageRecsRow;

    public List<UsageRecsRow> getUsageRecsRow() {
        if (this.usageRecsRow == null) {
            this.usageRecsRow = new ArrayList<UsageRecsRow>();
        }
        return this.usageRecsRow;
    }

}
