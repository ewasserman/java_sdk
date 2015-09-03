package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"itemsBasicDetails", "errorCode", "errorMsg"})
@XmlRootElement(name = "get_client_items_basic_mResponseElement")
public class GetClientItemsBasicMResponseElement {

    @XmlElement(name = "items_basic_details")
    protected List<ItemsBasicDetailsReturnElement> itemsBasicDetails;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public List<ItemsBasicDetailsReturnElement> getItemsBasicDetails() {
        if (this.itemsBasicDetails == null) {
            this.itemsBasicDetails = new ArrayList<ItemsBasicDetailsReturnElement>();
        }
        return this.itemsBasicDetails;
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
