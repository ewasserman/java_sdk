package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orders_ReturnElement", propOrder = {"orderNo", "amount", "currencyCd", "statusLabel", "planInstanceNo", "clientPlanInstanceId", "invoiceNo", "createDate", "updateDate", "comments", "clientOrderId", "transactionId", "orderCreateClientReceiptId", "orderStatusClientReceiptId", "statementMessage", "poNum", "orderItems"})
public class OrdersReturnElement {

    @XmlElement(name = "order_no")
    protected Long orderNo;
    @XmlElement(name = "amount")
    protected Double amount;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "status_label")
    protected String statusLabel;
    @XmlElement(name = "plan_instance_no")
    protected String planInstanceNo;
    @XmlElement(name = "client_plan_instance_id")
    protected String clientPlanInstanceId;
    @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
    @XmlElement(name = "create_date")
    protected String createDate;
    @XmlElement(name = "update_date")
    protected String updateDate;
    @XmlElement(name = "comments")
    protected String comments;
    @XmlElement(name = "client_order_id")
    protected String clientOrderId;
    @XmlElement(name = "transaction_id")
    protected Long transactionId;
    @XmlElement(name = "order_create_client_receipt_id")
    protected String orderCreateClientReceiptId;
    @XmlElement(name = "order_status_client_receipt_id")
    protected String orderStatusClientReceiptId;
    @XmlElement(name = "statement_message")
    protected String statementMessage;
    @XmlElement(name = "po_num")
    protected String poNum;
    @XmlElement(name = "order_items")
    protected List<OrderItemsReturnElement> orderItems;
    
    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long value) {
        this.orderNo = value;
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

    public String getStatusLabel() {
        return statusLabel;
    }

    public void setStatusLabel(String value) {
        this.statusLabel = value;
    }

    public String getPlanInstanceNo() {
        return planInstanceNo;
    }

    public void setPlanInstanceNo(String value) {
        this.planInstanceNo = value;
    }

    public String getClientPlanInstanceId() {
        return clientPlanInstanceId;
    }

    public void setClientPlanInstanceId(String value) {
        this.clientPlanInstanceId = value;
    }

    public Long getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Long value) {
        this.invoiceNo = value;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String value) {
        this.createDate = value;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String value) {
        this.updateDate = value;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String value) {
        this.comments = value;
    }

    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String value) {
        this.clientOrderId = value;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long value) {
        this.transactionId = value;
    }

    public String getOrderCreateClientReceiptId() {
        return orderCreateClientReceiptId;
    }

    public void setOrderCreateClientReceiptId(String value) {
        this.orderCreateClientReceiptId = value;
    }

    public String getOrderStatusClientReceiptId() {
        return orderStatusClientReceiptId;
    }

    public void setOrderStatusClientReceiptId(String value) {
        this.orderStatusClientReceiptId = value;
    }

    public String getStatementMessage() {
        return statementMessage;
    }

    public void setStatementMessage(String value) {
        this.statementMessage = value;
    }

    public String getPoNum() {
        return poNum;
    }

    public void setPoNum(String value) {
        this.poNum = value;
    }

    public List<OrderItemsReturnElement> getOrderItems() {
        if (this.orderItems == null) {
            this.orderItems = new ArrayList<OrderItemsReturnElement>();
        }
        return this.orderItems;
    }
}
