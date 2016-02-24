package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item_translations_ReturnElement", propOrder = {"localeName", "itemNo", "itemName", "itemDesc"})
public class ItemTranslationsReturnElement {

    @XmlElement(name = "locale_name")
    protected String localeName;
    @XmlElement(name = "item_no")
    protected Long itemNo;
    @XmlElement(name = "item_name")
    protected String itemName;
    @XmlElement(name = "item_desc")
    protected String itemDesc;
    
    public String getLocaleName() {
        return localeName;
    }

    public void setLocaleName(String value) {
        this.localeName = value;
    }

    public Long getItemNo() {
        return itemNo;
    }

    public void setItemNo(Long value) {
        this.itemNo = value;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String value) {
        this.itemName = value;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String value) {
        this.itemDesc = value;
    }

    
}
