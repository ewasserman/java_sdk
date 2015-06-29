package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "clientAcctId",    "orderNo",    "clientOrderId",    "limitRecords",    "detailsFlag"})
@XmlRootElement(name = "get_order_m")
public class GetOrderM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
        @XmlElement(name = "order_no")
    protected Long orderNo;
        @XmlElement(name = "client_order_id")
    protected String clientOrderId;
        @XmlElement(name = "limit_records")
    protected Long limitRecords;
        @XmlElement(name = "details_flag")
    protected Long detailsFlag;
    
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

    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }
            public String getClientAcctId() {
        return clientAcctId;
    }

    public void setClientAcctId(String value) {
        this.clientAcctId = value;
    }
            public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long value) {
        this.orderNo = value;
    }
            public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String value) {
        this.clientOrderId = value;
    }
            public Long getLimitRecords() {
        return limitRecords;
    }

    public void setLimitRecords(Long value) {
        this.limitRecords = value;
    }
            public Long getDetailsFlag() {
        return detailsFlag;
    }

    public void setDetailsFlag(Long value) {
        this.detailsFlag = value;
    }
            
}
