package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "dateRangeStart",    "dateRangeEnd",    "doUrlEncoding",    "filterApplicationId"})
@XmlRootElement(name = "get_acct_comments")
public class GetAcctComments {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "date_range_start")
    protected String dateRangeStart;
        @XmlElement(name = "date_range_end")
    protected String dateRangeEnd;
        @XmlElement(name = "do_url_encoding")
    protected String doUrlEncoding;
        @XmlElement(name = "filter_application_id")
    protected String filterApplicationId;
    
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
            public String getDateRangeStart() {
        return dateRangeStart;
    }

    public void setDateRangeStart(String value) {
        this.dateRangeStart = value;
    }
            public String getDateRangeEnd() {
        return dateRangeEnd;
    }

    public void setDateRangeEnd(String value) {
        this.dateRangeEnd = value;
    }
            public String getDoUrlEncoding() {
        return doUrlEncoding;
    }

    public void setDoUrlEncoding(String value) {
        this.doUrlEncoding = value;
    }
            public String getFilterApplicationId() {
        return filterApplicationId;
    }

    public void setFilterApplicationId(String value) {
        this.filterApplicationId = value;
    }
            
}
