package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acct_nso_incl_list_ReturnElement", propOrder = {"itemNo", "purchaseScope"})
public class AcctNsoInclListReturnElement {

    @XmlElement(name = "item_no")
    protected Long itemNo;
    @XmlElement(name = "purchase_scope")
    protected Long purchaseScope;
    
    public Long getItemNo() {
        return itemNo;
    }

    public void setItemNo(Long value) {
        this.itemNo = value;
    }

    public Long getPurchaseScope() {
        return purchaseScope;
    }

    public void setPurchaseScope(Long value) {
        this.purchaseScope = value;
    }

    
}
