package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "acctNo", "serviceOutageLineItems", "totalOutageCredit", "adjustedOutageCredit"})
@XmlRootElement(name = "get_acct_service_outage_credit_mResponseElement")
public class GetAcctServiceOutageCreditMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "acct_no")
    protected Long acctNo;
    @XmlElement(name = "service_outage_line_items")
    protected List<ServiceOutageLineItemsReturnElement> serviceOutageLineItems;
    @XmlElement(name = "total_outage_credit")
    protected Double totalOutageCredit;
    @XmlElement(name = "adjusted_outage_credit")
    protected Double adjustedOutageCredit;
    
    public Long getErrorCode() {
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

    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }

    public List<ServiceOutageLineItemsReturnElement> getServiceOutageLineItems() {
        if (this.serviceOutageLineItems == null) {
            this.serviceOutageLineItems = new ArrayList<ServiceOutageLineItemsReturnElement>();
        }
        return this.serviceOutageLineItems;
    }public Double getTotalOutageCredit() {
        return totalOutageCredit;
    }

    public void setTotalOutageCredit(Double value) {
        this.totalOutageCredit = value;
    }

    public Double getAdjustedOutageCredit() {
        return adjustedOutageCredit;
    }

    public void setAdjustedOutageCredit(Double value) {
        this.adjustedOutageCredit = value;
    }

    
}
