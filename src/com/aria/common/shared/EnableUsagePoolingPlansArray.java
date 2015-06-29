package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enable_usage_pooling_plans_array", propOrder = {
    "enableUsagePoolingPlansRow"
})
public class EnableUsagePoolingPlansArray {

    @XmlElement(name = "enable_usage_pooling_plans_row")
    protected List<EnableUsagePoolingPlansRow> enableUsagePoolingPlansRow;

    public List<EnableUsagePoolingPlansRow> getEnableUsagePoolingPlansRow() {
        if (this.enableUsagePoolingPlansRow == null) {
            this.enableUsagePoolingPlansRow = new ArrayList<EnableUsagePoolingPlansRow>();
        }
        return this.enableUsagePoolingPlansRow;
    }

}
