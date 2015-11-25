package com.aria.common.shared.object;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "queryString",    "limit",    "offset"})
@XmlRootElement(name = "get_order_details")
public class GetOrderDetails {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "query_string")
    protected String queryString;
        @XmlElement(name = "limit")
    protected Long limit;
        @XmlElement(name = "offset")
    protected Long offset;
    
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

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String value) {
        this.queryString = value;
    }
                    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long value) {
        this.limit = value;
    }
            public Long getOffset() {
        return offset;
    }

    public void setOffset(Long value) {
        this.offset = value;
    }
            
}
