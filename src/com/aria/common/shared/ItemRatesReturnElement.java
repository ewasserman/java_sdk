package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item_rates_ReturnElement", propOrder = {"price", "pricePerUnit", "currencyCd", "schedule"})
public class ItemRatesReturnElement {

    @XmlElement(name = "price")
    protected Double price;
    @XmlElement(name = "price_per_unit")
    protected Double pricePerUnit;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "schedule")
    protected List<ScheduleReturnElement> schedule;
    
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double value) {
        this.price = value;
    }

    public Double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(Double value) {
        this.pricePerUnit = value;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }

    public List<ScheduleReturnElement> getSchedule() {
        if (this.schedule == null) {
            this.schedule = new ArrayList<ScheduleReturnElement>();
        }
        return this.schedule;
    }
}
