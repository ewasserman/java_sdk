package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pricing_ReturnElement", propOrder = {"currencyCd", "itemPrice", "pricePerUnit"})
public class PricingReturnElement {

    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "item_price")
    protected Double itemPrice;
    @XmlElement(name = "price_per_unit")
    protected Double pricePerUnit;
    
    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double value) {
        this.itemPrice = value;
    }

    public Double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(Double value) {
        this.pricePerUnit = value;
    }

    
}
