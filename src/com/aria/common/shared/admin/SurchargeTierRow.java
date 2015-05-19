package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "surcharge_tier_row", propOrder = {
    "from",
    "to",
    "rate"
    })
public class SurchargeTierRow {

    @XmlElement(name = "from")
    protected Long from;
    @XmlElement(name = "to")
    protected Long to;
    @XmlElement(name = "rate")
    protected Double rate;
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

    public Double getRate() {
        return rate;
    }

    public void setRate(Double value) {
        this.rate = value;
    }

    
}
