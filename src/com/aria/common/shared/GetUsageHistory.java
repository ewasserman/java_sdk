package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "specifiedUsageTypeNo",    "dateRangeStart",    "dateRangeEnd",    "specifiedUsageTypeCode",    "usageQualifier1",    "usageQualifier2",    "usageQualifier3",    "usageQualifier4",    "limit",    "offset",    "transactionId",    "invoiceNo",    "invoiceLineItem"})
@XmlRootElement(name = "get_usage_history")
public class GetUsageHistory {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "specified_usage_type_no")
    protected Long specifiedUsageTypeNo;
        @XmlElement(name = "date_range_start")
    protected String dateRangeStart;
        @XmlElement(name = "date_range_end")
    protected String dateRangeEnd;
        @XmlElement(name = "specified_usage_type_code")
    protected String specifiedUsageTypeCode;
        @XmlElement(name = "usage_qualifier_1")
    protected UsageQualifier1Array usageQualifier1;
        @XmlElement(name = "usage_qualifier_2")
    protected UsageQualifier2Array usageQualifier2;
        @XmlElement(name = "usage_qualifier_3")
    protected UsageQualifier3Array usageQualifier3;
        @XmlElement(name = "usage_qualifier_4")
    protected UsageQualifier4Array usageQualifier4;
        @XmlElement(name = "limit")
    protected Long limit;
        @XmlElement(name = "offset")
    protected Long offset;
        @XmlElement(name = "transaction_id")
    protected Long transactionId;
        @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
        @XmlElement(name = "invoice_line_item")
    protected Long invoiceLineItem;
    
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
            public Long getSpecifiedUsageTypeNo() {
        return specifiedUsageTypeNo;
    }

    public void setSpecifiedUsageTypeNo(Long value) {
        this.specifiedUsageTypeNo = value;
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
            public String getSpecifiedUsageTypeCode() {
        return specifiedUsageTypeCode;
    }

    public void setSpecifiedUsageTypeCode(String value) {
        this.specifiedUsageTypeCode = value;
    }
            public UsageQualifier1Array getUsageQualifier1() {
        return usageQualifier1;
    }

    public void setUsageQualifier1(UsageQualifier1Array value) {
        this.usageQualifier1 = value;
    }
            public UsageQualifier2Array getUsageQualifier2() {
        return usageQualifier2;
    }

    public void setUsageQualifier2(UsageQualifier2Array value) {
        this.usageQualifier2 = value;
    }
            public UsageQualifier3Array getUsageQualifier3() {
        return usageQualifier3;
    }

    public void setUsageQualifier3(UsageQualifier3Array value) {
        this.usageQualifier3 = value;
    }
            public UsageQualifier4Array getUsageQualifier4() {
        return usageQualifier4;
    }

    public void setUsageQualifier4(UsageQualifier4Array value) {
        this.usageQualifier4 = value;
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
            public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long value) {
        this.transactionId = value;
    }
            public Long getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Long value) {
        this.invoiceNo = value;
    }
            public Long getInvoiceLineItem() {
        return invoiceLineItem;
    }

    public void setInvoiceLineItem(Long value) {
        this.invoiceLineItem = value;
    }
            
}
