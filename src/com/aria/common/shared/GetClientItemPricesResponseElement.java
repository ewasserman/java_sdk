package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"itemRates", "errorCode", "errorMsg"})
@XmlRootElement(name = "get_client_item_pricesResponseElement")
public class GetClientItemPricesResponseElement {

    @XmlElement(name = "item_rates")
    protected List<ItemRatesReturnElement> itemRates;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public List<ItemRatesReturnElement> getItemRates() {
        if (this.itemRates == null) {
            this.itemRates = new ArrayList<ItemRatesReturnElement>();
        }
        return this.itemRates;
    }public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long value) {
        this.errorCode = value;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    
}
