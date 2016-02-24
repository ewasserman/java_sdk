package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applied_cash_credits_ReturnElement", propOrder = {"serviceNo", "serviceName", "clientServiceId", "transactionType", "transactionName", "appliedTransactionId", "appliedAmount"})
public class AppliedCashCreditsReturnElement {

    @XmlElement(name = "service_no")
    protected Long serviceNo;
    @XmlElement(name = "service_name")
    protected String serviceName;
    @XmlElement(name = "client_service_id")
    protected String clientServiceId;
    @XmlElement(name = "transaction_type")
    protected Long transactionType;
    @XmlElement(name = "transaction_name")
    protected String transactionName;
    @XmlElement(name = "applied_transaction_id")
    protected Long appliedTransactionId;
    @XmlElement(name = "applied_amount")
    protected Double appliedAmount;
    
    public Long getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(Long value) {
        this.serviceNo = value;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String value) {
        this.serviceName = value;
    }

    public String getClientServiceId() {
        return clientServiceId;
    }

    public void setClientServiceId(String value) {
        this.clientServiceId = value;
    }

    public Long getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(Long value) {
        this.transactionType = value;
    }

    public String getTransactionName() {
        return transactionName;
    }

    public void setTransactionName(String value) {
        this.transactionName = value;
    }

    public Long getAppliedTransactionId() {
        return appliedTransactionId;
    }

    public void setAppliedTransactionId(Long value) {
        this.appliedTransactionId = value;
    }

    public Double getAppliedAmount() {
        return appliedAmount;
    }

    public void setAppliedAmount(Double value) {
        this.appliedAmount = value;
    }

    
}
