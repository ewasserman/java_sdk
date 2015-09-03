package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"allClientItemDetails", "errorCode", "errorMsg"})
@XmlRootElement(name = "get_client_items_all_mResponseElement")
public class GetClientItemsAllMResponseElement {

    @XmlElement(name = "all_client_item_details")
    protected List<AllClientItemDetailsReturnElement> allClientItemDetails;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public List<AllClientItemDetailsReturnElement> getAllClientItemDetails() {
        if (this.allClientItemDetails == null) {
            this.allClientItemDetails = new ArrayList<AllClientItemDetailsReturnElement>();
        }
        return this.allClientItemDetails;
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
