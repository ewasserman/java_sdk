package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nso_items_array_row", propOrder = {
    "itemNo",
    "nsoItemMinQty",
    "nsoItemMaxQty",
    "itemScope",
    "nsoItemsPriceOverride"
    })
public class NsoItemsArrayRow {

    @XmlElement(name = "item_no")
    protected Long itemNo;
    @XmlElement(name = "nso_item_min_qty")
    protected String nsoItemMinQty;
    @XmlElement(name = "nso_item_max_qty")
    protected String nsoItemMaxQty;
    @XmlElement(name = "item_scope")
    protected String itemScope;
    @XmlElement(name = "nso_items_price_override")
    protected com.aria.common.shared.admin.NsoItemsPriceOverrideArray nsoItemsPriceOverride;
    public Long getItemNo() {
        return itemNo;
    }

    public void setItemNo(Long value) {
        this.itemNo = value;
    }

    public String getNsoItemMinQty() {
        return nsoItemMinQty;
    }

    public void setNsoItemMinQty(String value) {
        this.nsoItemMinQty = value;
    }

    public String getNsoItemMaxQty() {
        return nsoItemMaxQty;
    }

    public void setNsoItemMaxQty(String value) {
        this.nsoItemMaxQty = value;
    }

    public String getItemScope() {
        return itemScope;
    }

    public void setItemScope(String value) {
        this.itemScope = value;
    }

    public com.aria.common.shared.admin.NsoItemsPriceOverrideArray getNsoItemsPriceOverride() {
        return nsoItemsPriceOverride;
    }

    public void setNsoItemsPriceOverride(com.aria.common.shared.admin.NsoItemsPriceOverrideArray value) {
        this.nsoItemsPriceOverride = value;
    }

    
}
