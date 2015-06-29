package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queue_id_to_remove_array", propOrder = {
    "queueIdToRemoveRow"
})
public class QueueIdToRemoveArray {

    @XmlElement(name = "queue_id_to_remove_row")
    protected List<QueueIdToRemoveRow> queueIdToRemoveRow;

    public List<QueueIdToRemoveRow> getQueueIdToRemoveRow() {
        if (this.queueIdToRemoveRow == null) {
            this.queueIdToRemoveRow = new ArrayList<QueueIdToRemoveRow>();
        }
        return this.queueIdToRemoveRow;
    }

}
