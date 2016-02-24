package com.aria.common.shared.object;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "order_details_ReturnElement", propOrder = {"orderNo", "acctNo", "userId", "invoiceNo", "createDate", "amount", "currencyCd", "lastUpdated", "orderStatus", "poNum", "orderItem"})
public class OrderDetailsReturnElement {

    @XmlElement(name = "order_no")
    protected Long orderNo;
    @XmlElement(name = "acct_no")
    protected Long acctNo;
    @XmlElement(name = "user_id")
    protected String userId;
    @XmlElement(name = "invoice_no")
    protected String invoiceNo;
    @XmlElement(name = "create_date")
    protected String createDate;
    @XmlElement(name = "amount")
    protected Double amount;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "last_updated")
    protected String lastUpdated;
    @XmlElement(name = "order_status")
    protected String orderStatus;
    @XmlElement(name = "po_num")
    protected String poNum;
    @XmlElement(name = "order_item")
    protected List<OrderItemReturnElement> orderItem;
    
    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long value) {
        this.orderNo = value;
    }

    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String value) {
        this.userId = value;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String value) {
        this.invoiceNo = value;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String value) {
        this.createDate = value;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double value) {
        this.amount = value;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String value) {
        this.lastUpdated = value;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String value) {
        this.orderStatus = value;
    }

    public String getPoNum() {
        return poNum;
    }

    public void setPoNum(String value) {
        this.poNum = value;
    }

    public List<OrderItemReturnElement> getOrderItem() {
        if (this.orderItem == null) {
            this.orderItem = new ArrayList<OrderItemReturnElement>();
        }
        return this.orderItem;
    }
}
