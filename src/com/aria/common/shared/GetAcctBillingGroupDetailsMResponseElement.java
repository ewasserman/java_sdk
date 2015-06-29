package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "billingGroups", "paymentMethodsSummary"})
@XmlRootElement(name = "get_acct_billing_group_details_mResponseElement")
public class GetAcctBillingGroupDetailsMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "billing_groups")
    protected List<BillingGroupsReturnElement> billingGroups;
    @XmlElement(name = "payment_methods_summary")
    protected List<PaymentMethodsSummaryReturnElement> paymentMethodsSummary;
    
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

    public List<BillingGroupsReturnElement> getBillingGroups() {
        if (this.billingGroups == null) {
            this.billingGroups = new ArrayList<BillingGroupsReturnElement>();
        }
        return this.billingGroups;
    }public List<PaymentMethodsSummaryReturnElement> getPaymentMethodsSummary() {
        if (this.paymentMethodsSummary == null) {
            this.paymentMethodsSummary = new ArrayList<PaymentMethodsSummaryReturnElement>();
        }
        return this.paymentMethodsSummary;
    }
}
