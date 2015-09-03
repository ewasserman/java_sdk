package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nso_group_array_row", propOrder = {
    "itemNo",
    "nsoGroupPriceOverride"
    })
public class NsoGroupArrayRow {

    @XmlElement(name = "item_no")
    protected Long itemNo;
    @XmlElement(name = "nso_group_price_override")
    protected com.aria.common.shared.admin.NsoGroupPriceOverrideArray nsoGroupPriceOverride;
    public Long getItemNo() {
        return itemNo;
    }

    public void setItemNo(Long value) {
        this.itemNo = value;
    }

    public com.aria.common.shared.admin.NsoGroupPriceOverrideArray getNsoGroupPriceOverride() {
        return nsoGroupPriceOverride;
    }

    public void setNsoGroupPriceOverride(com.aria.common.shared.admin.NsoGroupPriceOverrideArray value) {
        this.nsoGroupPriceOverride = value;
    }

    
}
