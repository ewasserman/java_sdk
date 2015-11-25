package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tier_ReturnElement", propOrder = {"from", "to", "amount", "description"})
public class TierReturnElement {

    @XmlElement(name = "from")
    protected Double from;
    @XmlElement(name = "to")
    protected Double to;
    @XmlElement(name = "amount")
    protected Double amount;
    @XmlElement(name = "description")
    protected String description;
    
    public Double getFrom() {
        return from;
    }

    public void setFrom(Double value) {
        this.from = value;
    }

    public Double getTo() {
        return to;
    }

    public void setTo(Double value) {
        this.to = value;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double value) {
        this.amount = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    
}
