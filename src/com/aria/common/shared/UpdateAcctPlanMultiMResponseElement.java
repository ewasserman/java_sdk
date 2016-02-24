package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "outAcctNo", "outClientAcctId", "billingErrors", "plansUpdated", "billingGroupsUpdated", "dunningGroupsUpdated", "multiPlanInvoiceDetails", "thirdPartyErrors"})
@XmlRootElement(name = "update_acct_plan_multi_mResponseElement")
public class UpdateAcctPlanMultiMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "out_acct_no")
    protected Long outAcctNo;
    @XmlElement(name = "out_client_acct_id")
    protected String outClientAcctId;
    @XmlElement(name = "billing_errors")
    protected List<BillingErrorsReturnElement> billingErrors;
    @XmlElement(name = "plans_updated")
    protected List<PlansUpdatedReturnElement> plansUpdated;
    @XmlElement(name = "billing_groups_updated")
    protected List<BillingGroupsUpdatedReturnElement> billingGroupsUpdated;
    @XmlElement(name = "dunning_groups_updated")
    protected List<DunningGroupsUpdatedReturnElement> dunningGroupsUpdated;
    @XmlElement(name = "multi_plan_invoice_details")
    protected List<MultiPlanInvoiceDetailsReturnElement> multiPlanInvoiceDetails;
    @XmlElement(name = "third_party_errors")
    protected List<ThirdPartyErrorsReturnElement> thirdPartyErrors;
    
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

    public Long getOutAcctNo() {
        return outAcctNo;
    }

    public void setOutAcctNo(Long value) {
        this.outAcctNo = value;
    }

    public String getOutClientAcctId() {
        return outClientAcctId;
    }

    public void setOutClientAcctId(String value) {
        this.outClientAcctId = value;
    }

    public List<BillingErrorsReturnElement> getBillingErrors() {
        if (this.billingErrors == null) {
            this.billingErrors = new ArrayList<BillingErrorsReturnElement>();
        }
        return this.billingErrors;
    }public List<PlansUpdatedReturnElement> getPlansUpdated() {
        if (this.plansUpdated == null) {
            this.plansUpdated = new ArrayList<PlansUpdatedReturnElement>();
        }
        return this.plansUpdated;
    }public List<BillingGroupsUpdatedReturnElement> getBillingGroupsUpdated() {
        if (this.billingGroupsUpdated == null) {
            this.billingGroupsUpdated = new ArrayList<BillingGroupsUpdatedReturnElement>();
        }
        return this.billingGroupsUpdated;
    }public List<DunningGroupsUpdatedReturnElement> getDunningGroupsUpdated() {
        if (this.dunningGroupsUpdated == null) {
            this.dunningGroupsUpdated = new ArrayList<DunningGroupsUpdatedReturnElement>();
        }
        return this.dunningGroupsUpdated;
    }public List<MultiPlanInvoiceDetailsReturnElement> getMultiPlanInvoiceDetails() {
        if (this.multiPlanInvoiceDetails == null) {
            this.multiPlanInvoiceDetails = new ArrayList<MultiPlanInvoiceDetailsReturnElement>();
        }
        return this.multiPlanInvoiceDetails;
    }public List<ThirdPartyErrorsReturnElement> getThirdPartyErrors() {
        if (this.thirdPartyErrors == null) {
            this.thirdPartyErrors = new ArrayList<ThirdPartyErrorsReturnElement>();
        }
        return this.thirdPartyErrors;
    }
}
