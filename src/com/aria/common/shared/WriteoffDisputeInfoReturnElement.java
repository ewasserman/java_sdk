package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "writeoff_dispute_info_ReturnElement", propOrder = {"recNo", "createdBy", "createdDate", "amount", "invoiceNo", "invoiceDate", "invoiceAmt", "writeoffDetail", "disputeCreationDate", "disputeExpDate", "reasonCode", "secondaryReasonCode", "comments", "disputeInd", "canUnsettle"})
public class WriteoffDisputeInfoReturnElement {

    @XmlElement(name = "rec_no")
    protected Long recNo;
    @XmlElement(name = "created_by")
    protected String createdBy;
    @XmlElement(name = "created_date")
    protected String createdDate;
    @XmlElement(name = "amount")
    protected Double amount;
    @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
    @XmlElement(name = "invoice_date")
    protected String invoiceDate;
    @XmlElement(name = "invoice_amt")
    protected Double invoiceAmt;
    @XmlElement(name = "writeoff_detail")
    protected List<WriteoffDetailReturnElement> writeoffDetail;
    @XmlElement(name = "dispute_creation_date")
    protected String disputeCreationDate;
    @XmlElement(name = "dispute_exp_date")
    protected String disputeExpDate;
    @XmlElement(name = "reason_code")
    protected Long reasonCode;
    @XmlElement(name = "secondary_reason_code")
    protected Long secondaryReasonCode;
    @XmlElement(name = "comments")
    protected String comments;
    @XmlElement(name = "dispute_ind")
    protected Long disputeInd;
    @XmlElement(name = "can_unsettle")
    protected String canUnsettle;
    
    public Long getRecNo() {
        return recNo;
    }

    public void setRecNo(Long value) {
        this.recNo = value;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String value) {
        this.createdDate = value;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double value) {
        this.amount = value;
    }

    public Long getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Long value) {
        this.invoiceNo = value;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String value) {
        this.invoiceDate = value;
    }

    public Double getInvoiceAmt() {
        return invoiceAmt;
    }

    public void setInvoiceAmt(Double value) {
        this.invoiceAmt = value;
    }

    public List<WriteoffDetailReturnElement> getWriteoffDetail() {
        if (this.writeoffDetail == null) {
            this.writeoffDetail = new ArrayList<WriteoffDetailReturnElement>();
        }
        return this.writeoffDetail;
    }public String getDisputeCreationDate() {
        return disputeCreationDate;
    }

    public void setDisputeCreationDate(String value) {
        this.disputeCreationDate = value;
    }

    public String getDisputeExpDate() {
        return disputeExpDate;
    }

    public void setDisputeExpDate(String value) {
        this.disputeExpDate = value;
    }

    public Long getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(Long value) {
        this.reasonCode = value;
    }

    public Long getSecondaryReasonCode() {
        return secondaryReasonCode;
    }

    public void setSecondaryReasonCode(Long value) {
        this.secondaryReasonCode = value;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String value) {
        this.comments = value;
    }

    public Long getDisputeInd() {
        return disputeInd;
    }

    public void setDisputeInd(Long value) {
        this.disputeInd = value;
    }

    public String getCanUnsettle() {
        return canUnsettle;
    }

    public void setCanUnsettle(String value) {
        this.canUnsettle = value;
    }

    
}
