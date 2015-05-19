package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "invoiceLineItems", "isPendingInd", "customStatusLabel", "customStatusDesc", "clientNotes", "invoiceTypeCd", "fromDate", "toDate", "postingStatusCd", "postingUser", "postingDate"})
@XmlRootElement(name = "get_invoice_detailsResponseElement")
public class GetInvoiceDetailsResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "invoice_line_items")
    protected List<InvoiceLineItemsReturnElement> invoiceLineItems;
    @XmlElement(name = "is_pending_ind")
    protected Long isPendingInd;
    @XmlElement(name = "custom_status_label")
    protected String customStatusLabel;
    @XmlElement(name = "custom_status_desc")
    protected String customStatusDesc;
    @XmlElement(name = "client_notes")
    protected String clientNotes;
    @XmlElement(name = "invoice_type_cd")
    protected String invoiceTypeCd;
    @XmlElement(name = "from_date")
    protected String fromDate;
    @XmlElement(name = "to_date")
    protected String toDate;
    @XmlElement(name = "posting_status_cd")
    protected Long postingStatusCd;
    @XmlElement(name = "posting_user")
    protected String postingUser;
    @XmlElement(name = "posting_date")
    protected String postingDate;
    
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

    public List<InvoiceLineItemsReturnElement> getInvoiceLineItems() {
        if (this.invoiceLineItems == null) {
            this.invoiceLineItems = new ArrayList<InvoiceLineItemsReturnElement>();
        }
        return this.invoiceLineItems;
    }public Long getIsPendingInd() {
        return isPendingInd;
    }

    public void setIsPendingInd(Long value) {
        this.isPendingInd = value;
    }

    public String getCustomStatusLabel() {
        return customStatusLabel;
    }

    public void setCustomStatusLabel(String value) {
        this.customStatusLabel = value;
    }

    public String getCustomStatusDesc() {
        return customStatusDesc;
    }

    public void setCustomStatusDesc(String value) {
        this.customStatusDesc = value;
    }

    public String getClientNotes() {
        return clientNotes;
    }

    public void setClientNotes(String value) {
        this.clientNotes = value;
    }

    public String getInvoiceTypeCd() {
        return invoiceTypeCd;
    }

    public void setInvoiceTypeCd(String value) {
        this.invoiceTypeCd = value;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String value) {
        this.fromDate = value;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String value) {
        this.toDate = value;
    }

    public Long getPostingStatusCd() {
        return postingStatusCd;
    }

    public void setPostingStatusCd(Long value) {
        this.postingStatusCd = value;
    }

    public String getPostingUser() {
        return postingUser;
    }

    public void setPostingUser(String value) {
        this.postingUser = value;
    }

    public String getPostingDate() {
        return postingDate;
    }

    public void setPostingDate(String value) {
        this.postingDate = value;
    }

    
}
