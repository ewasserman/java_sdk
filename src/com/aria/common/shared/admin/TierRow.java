package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tier_row", propOrder = {
    "from",
    "to",
    "description",
    "price"
    })
public class TierRow {

    @XmlElement(name = "from")
    protected Long from;
    @XmlElement(name = "to")
    protected Long to;
    @XmlElement(name = "description")
    protected String description;
    @XmlElement(name = "price")
    protected com.aria.common.shared.admin.PriceArray price;
    public Long getFrom() {
        return from;
    }

    public void setFrom(Long value) {
        this.from = value;
    }

    public Long getTo() {
        return to;
    }

    public void setTo(Long value) {
        this.to = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public com.aria.common.shared.admin.PriceArray getPrice() {
        return price;
    }

    public void setPrice(com.aria.common.shared.admin.PriceArray value) {
        this.price = value;
    }

    
}
