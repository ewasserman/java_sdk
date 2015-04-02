package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usage_threshold_array", propOrder = {
    "usageThresholdRow"
})
public class UsageThresholdArray {

    @XmlElement(name = "usage_threshold_row")
    protected List<UsageThresholdRow> usageThresholdRow;

    public List<UsageThresholdRow> getUsageThresholdRow() {
        if (this.usageThresholdRow == null) {
            this.usageThresholdRow = new ArrayList<UsageThresholdRow>();
        }
        return this.usageThresholdRow;
    }

}
