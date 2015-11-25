package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tier_ReturnElement", propOrder = {"from", "to", "description", "amount", "price"})
public class TierReturnElement {

    @XmlElement(name = "from")
    protected Long from;
    @XmlElement(name = "to")
    protected Long to;
    @XmlElement(name = "description")
    protected String description;
    @XmlElement(name = "amount")
    protected Double amount;
    @XmlElement(name = "price")
    protected List<PriceReturnElement> price;
    
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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double value) {
        this.amount = value;
    }

    public List<PriceReturnElement> getPrice() {
        if (this.price == null) {
            this.price = new ArrayList<PriceReturnElement>();
        }
        return this.price;
    }
}
