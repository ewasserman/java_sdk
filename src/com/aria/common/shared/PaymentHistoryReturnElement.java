package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payment_history_ReturnElement", propOrder = {"transactionId", "paymentSource", "paymentStatus", "paymentDate", "paymentTransType", "paymentCurrency", "paymentAmount", "paymentAmountLeftToApply", "voidingEventNo", "voidableFlag", "last4", "paymentMethodType", "paymentMethod", "paymentProcessorResultCode", "processorPaymentId", "paymentProcessorApprovalCode", "paymentTimestamp", "paymentApplicationDetails"})
public class PaymentHistoryReturnElement {

    @XmlElement(name = "transaction_id")
    protected Long transactionId;
    @XmlElement(name = "payment_source")
    protected String paymentSource;
    @XmlElement(name = "payment_status")
    protected String paymentStatus;
    @XmlElement(name = "payment_date")
    protected String paymentDate;
    @XmlElement(name = "payment_trans_type")
    protected Long paymentTransType;
    @XmlElement(name = "payment_currency")
    protected String paymentCurrency;
    @XmlElement(name = "payment_amount")
    protected Double paymentAmount;
    @XmlElement(name = "payment_amount_left_to_apply")
    protected Double paymentAmountLeftToApply;
    @XmlElement(name = "voiding_event_no")
    protected Long voidingEventNo;
    @XmlElement(name = "voidable_flag")
    protected Long voidableFlag;
    @XmlElement(name = "last_4")
    protected Long last4;
    @XmlElement(name = "payment_method_type")
    protected String paymentMethodType;
    @XmlElement(name = "payment_method")
    protected Long paymentMethod;
    @XmlElement(name = "payment_processor_result_code")
    protected Long paymentProcessorResultCode;
    @XmlElement(name = "processor_payment_id")
    protected String processorPaymentId;
    @XmlElement(name = "payment_processor_approval_code")
    protected String paymentProcessorApprovalCode;
    @XmlElement(name = "payment_timestamp")
    protected String paymentTimestamp;
    @XmlElement(name = "payment_application_details")
    protected List<PaymentApplicationDetailsReturnElement> paymentApplicationDetails;
    
    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long value) {
        this.transactionId = value;
    }

    public String getPaymentSource() {
        return paymentSource;
    }

    public void setPaymentSource(String value) {
        this.paymentSource = value;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String value) {
        this.paymentStatus = value;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String value) {
        this.paymentDate = value;
    }

    public Long getPaymentTransType() {
        return paymentTransType;
    }

    public void setPaymentTransType(Long value) {
        this.paymentTransType = value;
    }

    public String getPaymentCurrency() {
        return paymentCurrency;
    }

    public void setPaymentCurrency(String value) {
        this.paymentCurrency = value;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double value) {
        this.paymentAmount = value;
    }

    public Double getPaymentAmountLeftToApply() {
        return paymentAmountLeftToApply;
    }

    public void setPaymentAmountLeftToApply(Double value) {
        this.paymentAmountLeftToApply = value;
    }

    public Long getVoidingEventNo() {
        return voidingEventNo;
    }

    public void setVoidingEventNo(Long value) {
        this.voidingEventNo = value;
    }

    public Long getVoidableFlag() {
        return voidableFlag;
    }

    public void setVoidableFlag(Long value) {
        this.voidableFlag = value;
    }

    public Long getLast4() {
        return last4;
    }

    public void setLast4(Long value) {
        this.last4 = value;
    }

    public String getPaymentMethodType() {
        return paymentMethodType;
    }

    public void setPaymentMethodType(String value) {
        this.paymentMethodType = value;
    }

    public Long getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Long value) {
        this.paymentMethod = value;
    }

    public Long getPaymentProcessorResultCode() {
        return paymentProcessorResultCode;
    }

    public void setPaymentProcessorResultCode(Long value) {
        this.paymentProcessorResultCode = value;
    }

    public String getProcessorPaymentId() {
        return processorPaymentId;
    }

    public void setProcessorPaymentId(String value) {
        this.processorPaymentId = value;
    }

    public String getPaymentProcessorApprovalCode() {
        return paymentProcessorApprovalCode;
    }

    public void setPaymentProcessorApprovalCode(String value) {
        this.paymentProcessorApprovalCode = value;
    }

    public String getPaymentTimestamp() {
        return paymentTimestamp;
    }

    public void setPaymentTimestamp(String value) {
        this.paymentTimestamp = value;
    }

    public List<PaymentApplicationDetailsReturnElement> getPaymentApplicationDetails() {
        if (this.paymentApplicationDetails == null) {
            this.paymentApplicationDetails = new ArrayList<PaymentApplicationDetailsReturnElement>();
        }
        return this.paymentApplicationDetails;
    }
}
