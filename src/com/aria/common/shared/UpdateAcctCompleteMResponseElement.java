package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "collectionErrorCode", "collectionErrorMsg", "parentChildSyncErrorCode", "parentChildSyncErrorMsg", "masterPlanErrorCode", "masterPlanErrorMsg", "masterPlanCollErrorCode", "masterPlanCollErrorMsg", "masterPlanStmtErrorCode", "masterPlanStmtErrorMsg", "procCvvResponse", "procAvsResponse", "procCavvResponse", "procStatusCode", "procStatusText", "procPaymentId", "procAuthCode", "procMerchComments", "thirdPartyErrors", "masterPlanInstanceId", "outClientMpInstanceId", "outMasterPlanNo", "outClientMasterPlanId", "outMasterPlanInstanceDescription", "masterPlanProrationResultTotalAmount", "masterPlanProrationAmount", "masterPlanProrationTaxAmount", "masterPlanProrationSurchargeAmount", "masterPlanProrationCreditAmount", "suppPlanInstanceId", "outClientSuppPlanInstanceId", "suppPlanProrationAmount", "suppPlanProrationTaxAmount", "suppPlanProrationSurchargeAmount", "suppPlanProrationCreditAmount", "outInvoiceNo", "outBillingGroupNo", "outClientBillingGroupId"})
@XmlRootElement(name = "update_acct_complete_mResponseElement")
public class UpdateAcctCompleteMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "collection_error_code")
    protected Long collectionErrorCode;
    @XmlElement(name = "collection_error_msg")
    protected String collectionErrorMsg;
    @XmlElement(name = "parent_child_sync_error_code")
    protected Long parentChildSyncErrorCode;
    @XmlElement(name = "parent_child_sync_error_msg")
    protected String parentChildSyncErrorMsg;
    @XmlElement(name = "master_plan_error_code")
    protected Long masterPlanErrorCode;
    @XmlElement(name = "master_plan_error_msg")
    protected String masterPlanErrorMsg;
    @XmlElement(name = "master_plan_coll_error_code")
    protected Long masterPlanCollErrorCode;
    @XmlElement(name = "master_plan_coll_error_msg")
    protected String masterPlanCollErrorMsg;
    @XmlElement(name = "master_plan_stmt_error_code")
    protected Long masterPlanStmtErrorCode;
    @XmlElement(name = "master_plan_stmt_error_msg")
    protected String masterPlanStmtErrorMsg;
    @XmlElement(name = "proc_cvv_response")
    protected String procCvvResponse;
    @XmlElement(name = "proc_avs_response")
    protected String procAvsResponse;
    @XmlElement(name = "proc_cavv_response")
    protected String procCavvResponse;
    @XmlElement(name = "proc_status_code")
    protected String procStatusCode;
    @XmlElement(name = "proc_status_text")
    protected String procStatusText;
    @XmlElement(name = "proc_payment_id")
    protected String procPaymentId;
    @XmlElement(name = "proc_auth_code")
    protected String procAuthCode;
    @XmlElement(name = "proc_merch_comments")
    protected String procMerchComments;
    @XmlElement(name = "third_party_errors")
    protected List<ThirdPartyErrorsReturnElement> thirdPartyErrors;
    @XmlElement(name = "master_plan_instance_id")
    protected Long masterPlanInstanceId;
    @XmlElement(name = "out_client_mp_instance_id")
    protected String outClientMpInstanceId;
    @XmlElement(name = "out_master_plan_no")
    protected Long outMasterPlanNo;
    @XmlElement(name = "out_client_master_plan_id")
    protected String outClientMasterPlanId;
    @XmlElement(name = "out_master_plan_instance_description")
    protected String outMasterPlanInstanceDescription;
    @XmlElement(name = "master_plan_proration_result_total_amount")
    protected Double masterPlanProrationResultTotalAmount;
    @XmlElement(name = "master_plan_proration_amount")
    protected Double masterPlanProrationAmount;
    @XmlElement(name = "master_plan_proration_tax_amount")
    protected Double masterPlanProrationTaxAmount;
    @XmlElement(name = "master_plan_proration_surcharge_amount")
    protected Double masterPlanProrationSurchargeAmount;
    @XmlElement(name = "master_plan_proration_credit_amount")
    protected Double masterPlanProrationCreditAmount;
    @XmlElement(name = "supp_plan_instance_id")
    protected Long suppPlanInstanceId;
    @XmlElement(name = "out_client_supp_plan_instance_id")
    protected String outClientSuppPlanInstanceId;
    @XmlElement(name = "supp_plan_proration_amount")
    protected Double suppPlanProrationAmount;
    @XmlElement(name = "supp_plan_proration_tax_amount")
    protected Double suppPlanProrationTaxAmount;
    @XmlElement(name = "supp_plan_proration_surcharge_amount")
    protected Double suppPlanProrationSurchargeAmount;
    @XmlElement(name = "supp_plan_proration_credit_amount")
    protected Double suppPlanProrationCreditAmount;
    @XmlElement(name = "out_invoice_no")
    protected Long outInvoiceNo;
    @XmlElement(name = "out_billing_group_no")
    protected Long outBillingGroupNo;
    @XmlElement(name = "out_client_billing_group_id")
    protected String outClientBillingGroupId;
    
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

    public Long getCollectionErrorCode() {
        return collectionErrorCode;
    }

    public void setCollectionErrorCode(Long value) {
        this.collectionErrorCode = value;
    }

    public String getCollectionErrorMsg() {
        return collectionErrorMsg;
    }

    public void setCollectionErrorMsg(String value) {
        this.collectionErrorMsg = value;
    }

    public Long getParentChildSyncErrorCode() {
        return parentChildSyncErrorCode;
    }

    public void setParentChildSyncErrorCode(Long value) {
        this.parentChildSyncErrorCode = value;
    }

    public String getParentChildSyncErrorMsg() {
        return parentChildSyncErrorMsg;
    }

    public void setParentChildSyncErrorMsg(String value) {
        this.parentChildSyncErrorMsg = value;
    }

    public Long getMasterPlanErrorCode() {
        return masterPlanErrorCode;
    }

    public void setMasterPlanErrorCode(Long value) {
        this.masterPlanErrorCode = value;
    }

    public String getMasterPlanErrorMsg() {
        return masterPlanErrorMsg;
    }

    public void setMasterPlanErrorMsg(String value) {
        this.masterPlanErrorMsg = value;
    }

    public Long getMasterPlanCollErrorCode() {
        return masterPlanCollErrorCode;
    }

    public void setMasterPlanCollErrorCode(Long value) {
        this.masterPlanCollErrorCode = value;
    }

    public String getMasterPlanCollErrorMsg() {
        return masterPlanCollErrorMsg;
    }

    public void setMasterPlanCollErrorMsg(String value) {
        this.masterPlanCollErrorMsg = value;
    }

    public Long getMasterPlanStmtErrorCode() {
        return masterPlanStmtErrorCode;
    }

    public void setMasterPlanStmtErrorCode(Long value) {
        this.masterPlanStmtErrorCode = value;
    }

    public String getMasterPlanStmtErrorMsg() {
        return masterPlanStmtErrorMsg;
    }

    public void setMasterPlanStmtErrorMsg(String value) {
        this.masterPlanStmtErrorMsg = value;
    }

    public String getProcCvvResponse() {
        return procCvvResponse;
    }

    public void setProcCvvResponse(String value) {
        this.procCvvResponse = value;
    }

    public String getProcAvsResponse() {
        return procAvsResponse;
    }

    public void setProcAvsResponse(String value) {
        this.procAvsResponse = value;
    }

    public String getProcCavvResponse() {
        return procCavvResponse;
    }

    public void setProcCavvResponse(String value) {
        this.procCavvResponse = value;
    }

    public String getProcStatusCode() {
        return procStatusCode;
    }

    public void setProcStatusCode(String value) {
        this.procStatusCode = value;
    }

    public String getProcStatusText() {
        return procStatusText;
    }

    public void setProcStatusText(String value) {
        this.procStatusText = value;
    }

    public String getProcPaymentId() {
        return procPaymentId;
    }

    public void setProcPaymentId(String value) {
        this.procPaymentId = value;
    }

    public String getProcAuthCode() {
        return procAuthCode;
    }

    public void setProcAuthCode(String value) {
        this.procAuthCode = value;
    }

    public String getProcMerchComments() {
        return procMerchComments;
    }

    public void setProcMerchComments(String value) {
        this.procMerchComments = value;
    }

    public List<ThirdPartyErrorsReturnElement> getThirdPartyErrors() {
        if (this.thirdPartyErrors == null) {
            this.thirdPartyErrors = new ArrayList<ThirdPartyErrorsReturnElement>();
        }
        return this.thirdPartyErrors;
    }public Long getMasterPlanInstanceId() {
        return masterPlanInstanceId;
    }

    public void setMasterPlanInstanceId(Long value) {
        this.masterPlanInstanceId = value;
    }

    public String getOutClientMpInstanceId() {
        return outClientMpInstanceId;
    }

    public void setOutClientMpInstanceId(String value) {
        this.outClientMpInstanceId = value;
    }

    public Long getOutMasterPlanNo() {
        return outMasterPlanNo;
    }

    public void setOutMasterPlanNo(Long value) {
        this.outMasterPlanNo = value;
    }

    public String getOutClientMasterPlanId() {
        return outClientMasterPlanId;
    }

    public void setOutClientMasterPlanId(String value) {
        this.outClientMasterPlanId = value;
    }

    public String getOutMasterPlanInstanceDescription() {
        return outMasterPlanInstanceDescription;
    }

    public void setOutMasterPlanInstanceDescription(String value) {
        this.outMasterPlanInstanceDescription = value;
    }

    public Double getMasterPlanProrationResultTotalAmount() {
        return masterPlanProrationResultTotalAmount;
    }

    public void setMasterPlanProrationResultTotalAmount(Double value) {
        this.masterPlanProrationResultTotalAmount = value;
    }

    public Double getMasterPlanProrationAmount() {
        return masterPlanProrationAmount;
    }

    public void setMasterPlanProrationAmount(Double value) {
        this.masterPlanProrationAmount = value;
    }

    public Double getMasterPlanProrationTaxAmount() {
        return masterPlanProrationTaxAmount;
    }

    public void setMasterPlanProrationTaxAmount(Double value) {
        this.masterPlanProrationTaxAmount = value;
    }

    public Double getMasterPlanProrationSurchargeAmount() {
        return masterPlanProrationSurchargeAmount;
    }

    public void setMasterPlanProrationSurchargeAmount(Double value) {
        this.masterPlanProrationSurchargeAmount = value;
    }

    public Double getMasterPlanProrationCreditAmount() {
        return masterPlanProrationCreditAmount;
    }

    public void setMasterPlanProrationCreditAmount(Double value) {
        this.masterPlanProrationCreditAmount = value;
    }

    public Long getSuppPlanInstanceId() {
        return suppPlanInstanceId;
    }

    public void setSuppPlanInstanceId(Long value) {
        this.suppPlanInstanceId = value;
    }

    public String getOutClientSuppPlanInstanceId() {
        return outClientSuppPlanInstanceId;
    }

    public void setOutClientSuppPlanInstanceId(String value) {
        this.outClientSuppPlanInstanceId = value;
    }

    public Double getSuppPlanProrationAmount() {
        return suppPlanProrationAmount;
    }

    public void setSuppPlanProrationAmount(Double value) {
        this.suppPlanProrationAmount = value;
    }

    public Double getSuppPlanProrationTaxAmount() {
        return suppPlanProrationTaxAmount;
    }

    public void setSuppPlanProrationTaxAmount(Double value) {
        this.suppPlanProrationTaxAmount = value;
    }

    public Double getSuppPlanProrationSurchargeAmount() {
        return suppPlanProrationSurchargeAmount;
    }

    public void setSuppPlanProrationSurchargeAmount(Double value) {
        this.suppPlanProrationSurchargeAmount = value;
    }

    public Double getSuppPlanProrationCreditAmount() {
        return suppPlanProrationCreditAmount;
    }

    public void setSuppPlanProrationCreditAmount(Double value) {
        this.suppPlanProrationCreditAmount = value;
    }

    public Long getOutInvoiceNo() {
        return outInvoiceNo;
    }

    public void setOutInvoiceNo(Long value) {
        this.outInvoiceNo = value;
    }

    public Long getOutBillingGroupNo() {
        return outBillingGroupNo;
    }

    public void setOutBillingGroupNo(Long value) {
        this.outBillingGroupNo = value;
    }

    public String getOutClientBillingGroupId() {
        return outClientBillingGroupId;
    }

    public void setOutClientBillingGroupId(String value) {
        this.outClientBillingGroupId = value;
    }

    
}
