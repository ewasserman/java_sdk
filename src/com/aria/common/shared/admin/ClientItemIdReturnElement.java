package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_item_id_ReturnElement", propOrder = {"clientItemIds", "itemIds"})
public class ClientItemIdReturnElement {

    @XmlElement(name = "client_item_ids")
    protected String clientItemIds;
    @XmlElement(name = "item_ids")
    protected String itemIds;
    
    public String getClientItemIds() {
        return clientItemIds;
    }

    public void setClientItemIds(String value) {
        this.clientItemIds = value;
    }

    public String getItemIds() {
        return itemIds;
    }

    public void setItemIds(String value) {
        this.itemIds = value;
    }

    
}
