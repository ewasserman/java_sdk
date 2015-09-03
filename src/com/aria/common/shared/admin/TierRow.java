package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tier_row", propOrder = {
    "price"
    })
public class TierRow {

    @XmlElement(name = "price")
    protected com.aria.common.shared.admin.PriceArray price;
    public com.aria.common.shared.admin.PriceArray getPrice() {
        return price;
    }

    public void setPrice(com.aria.common.shared.admin.PriceArray value) {
        this.price = value;
    }

    
}
