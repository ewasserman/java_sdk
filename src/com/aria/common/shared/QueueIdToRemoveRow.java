package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queue_id_to_remove_row", propOrder = {
    "queueId"
    })
public class QueueIdToRemoveRow {

    @XmlElement(name = "queue_id")
    protected Long queueId;
    public Long getQueueId() {
        return queueId;
    }

    public void setQueueId(Long value) {
        this.queueId = value;
    }

    
}
