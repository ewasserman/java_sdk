package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "filterCurrencyCd",    "returnNoCostItems",    "filterItemNo",    "includeInactiveItems",    "filterClientItemId",    "purchaseScope"})
@XmlRootElement(name = "get_client_items_basic_m")
public class GetClientItemsBasicM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "filter_currency_cd")
    protected String filterCurrencyCd;
        @XmlElement(name = "return_no_cost_items")
    protected String returnNoCostItems;
        @XmlElement(name = "filter_item_no")
    protected Long filterItemNo;
        @XmlElement(name = "include_inactive_items")
    protected String includeInactiveItems;
        @XmlElement(name = "filter_client_item_id")
    protected String filterClientItemId;
        @XmlElement(name = "purchase_scope")
    protected Long purchaseScope;
    
    public long getClientNo() {
        return clientNo;
    }

    public void setClientNo(Long value) {
        this.clientNo = value;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String value) {
        this.authKey = value;
    }

    public String getFilterCurrencyCd() {
        return filterCurrencyCd;
    }

    public void setFilterCurrencyCd(String value) {
        this.filterCurrencyCd = value;
    }
            public String getReturnNoCostItems() {
        return returnNoCostItems;
    }

    public void setReturnNoCostItems(String value) {
        this.returnNoCostItems = value;
    }
            public Long getFilterItemNo() {
        return filterItemNo;
    }

    public void setFilterItemNo(Long value) {
        this.filterItemNo = value;
    }
            public String getIncludeInactiveItems() {
        return includeInactiveItems;
    }

    public void setIncludeInactiveItems(String value) {
        this.includeInactiveItems = value;
    }
            public String getFilterClientItemId() {
        return filterClientItemId;
    }

    public void setFilterClientItemId(String value) {
        this.filterClientItemId = value;
    }
            public Long getPurchaseScope() {
        return purchaseScope;
    }

    public void setPurchaseScope(Long value) {
        this.purchaseScope = value;
    }
            
}
