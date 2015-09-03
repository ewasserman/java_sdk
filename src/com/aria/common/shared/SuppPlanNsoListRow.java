package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supp_plan_nso_list_row", propOrder = {
    "clientSku",
    "itemUnits"
    })
public class SuppPlanNsoListRow {

    @XmlElement(name = "client_sku")
    protected String clientSku;
    @XmlElement(name = "item_units")
    protected Long itemUnits;
    public String getClientSku() {
        return clientSku;
    }

    public void setClientSku(String value) {
        this.clientSku = value;
    }

    public Long getItemUnits() {
        return itemUnits;
    }

    public void setItemUnits(Long value) {
        this.itemUnits = value;
    }

    
}
