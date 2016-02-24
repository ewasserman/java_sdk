package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billing_groups_updated_ReturnElement", propOrder = {"billingGroupNo", "clientBillingGroupsId", "primaryPaymentMethodNo", "primaryClientPaymentMethodId", "backupPaymentMethodNo", "backupClientPaymentMethodId", "billingGroupOperation"})
public class BillingGroupsUpdatedReturnElement {

    @XmlElement(name = "billing_group_no")
    protected Long billingGroupNo;
    @XmlElement(name = "client_billing_groups_id")
    protected String clientBillingGroupsId;
    @XmlElement(name = "primary_payment_method_no")
    protected Long primaryPaymentMethodNo;
    @XmlElement(name = "primary_client_payment_method_id")
    protected String primaryClientPaymentMethodId;
    @XmlElement(name = "backup_payment_method_no")
    protected Long backupPaymentMethodNo;
    @XmlElement(name = "backup_client_payment_method_id")
    protected String backupClientPaymentMethodId;
    @XmlElement(name = "billing_group_operation")
    protected Long billingGroupOperation;
    
    public Long getBillingGroupNo() {
        return billingGroupNo;
    }

    public void setBillingGroupNo(Long value) {
        this.billingGroupNo = value;
    }

    public String getClientBillingGroupsId() {
        return clientBillingGroupsId;
    }

    public void setClientBillingGroupsId(String value) {
        this.clientBillingGroupsId = value;
    }

    public Long getPrimaryPaymentMethodNo() {
        return primaryPaymentMethodNo;
    }

    public void setPrimaryPaymentMethodNo(Long value) {
        this.primaryPaymentMethodNo = value;
    }

    public String getPrimaryClientPaymentMethodId() {
        return primaryClientPaymentMethodId;
    }

    public void setPrimaryClientPaymentMethodId(String value) {
        this.primaryClientPaymentMethodId = value;
    }

    public Long getBackupPaymentMethodNo() {
        return backupPaymentMethodNo;
    }

    public void setBackupPaymentMethodNo(Long value) {
        this.backupPaymentMethodNo = value;
    }

    public String getBackupClientPaymentMethodId() {
        return backupClientPaymentMethodId;
    }

    public void setBackupClientPaymentMethodId(String value) {
        this.backupClientPaymentMethodId = value;
    }

    public Long getBillingGroupOperation() {
        return billingGroupOperation;
    }

    public void setBillingGroupOperation(Long value) {
        this.billingGroupOperation = value;
    }

    
}
