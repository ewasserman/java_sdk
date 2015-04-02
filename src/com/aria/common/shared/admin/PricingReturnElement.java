package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pricing_ReturnElement", propOrder = {"currencyCd", "price", "pricePerUnit"})
public class PricingReturnElement {

    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "price")
    protected Double price;
    @XmlElement(name = "price_per_unit")
    protected Double pricePerUnit;
    
    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }

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

    
}
