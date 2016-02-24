package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "clientAcctId",    "planUpdates",    "acctBillingGroups",    "doWrite",    "assignmentDirective",    "altStartDate",    "retroactiveStartDate",    "altBillDay",    "invoicingOption",    "acctPaymentMethods",    "acctDunningGroups",    "autoCollectOnPlanChng",    "rollbackPlanChngCollectFail",    "autoSendStmtOnPlanChng",    "comments",    "listStartMasterFile",    "clientReceiptId"})
@XmlRootElement(name = "update_acct_plan_multi_m")
public class UpdateAcctPlanMultiM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
        @XmlElement(name = "plan_updates")
    protected PlanUpdatesArray planUpdates;
        @XmlElement(name = "acct_billing_groups")
    protected AcctBillingGroupsArray acctBillingGroups;
        @XmlElement(name = "do_write")
    protected String doWrite;
        @XmlElement(name = "assignment_directive")
    protected Long assignmentDirective;
        @XmlElement(name = "alt_start_date")
    protected String altStartDate;
        @XmlElement(name = "retroactive_start_date")
    protected String retroactiveStartDate;
        @XmlElement(name = "alt_bill_day")
    protected Long altBillDay;
        @XmlElement(name = "invoicing_option")
    protected Long invoicingOption;
        @XmlElement(name = "acct_payment_methods")
    protected AcctPaymentMethodsArray acctPaymentMethods;
        @XmlElement(name = "acct_dunning_groups")
    protected AcctDunningGroupsArray acctDunningGroups;
        @XmlElement(name = "auto_collect_on_plan_chng")
    protected Long autoCollectOnPlanChng;
        @XmlElement(name = "rollback_plan_chng_collect_fail")
    protected Long rollbackPlanChngCollectFail;
        @XmlElement(name = "auto_send_stmt_on_plan_chng")
    protected Long autoSendStmtOnPlanChng;
        @XmlElement(name = "comments")
    protected String comments;
        @XmlElement(name = "list_start_master_file")
    protected Long listStartMasterFile;
        @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
    
    public long getClientNo() {
        return clientNo;
    }

    public void setClientNo(Long value) {
        this.clientNo = value;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String value) {
        this.authKey = value;
    }

    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }
            public String getClientAcctId() {
        return clientAcctId;
    }

    public void setClientAcctId(String value) {
        this.clientAcctId = value;
    }
            public PlanUpdatesArray getPlanUpdates() {
        return planUpdates;
    }

    public void setPlanUpdates(PlanUpdatesArray value) {
        this.planUpdates = value;
    }
            public AcctBillingGroupsArray getAcctBillingGroups() {
        return acctBillingGroups;
    }

    public void setAcctBillingGroups(AcctBillingGroupsArray value) {
        this.acctBillingGroups = value;
    }
            public String getDoWrite() {
        return doWrite;
    }

    public void setDoWrite(String value) {
        this.doWrite = value;
    }
            public Long getAssignmentDirective() {
        return assignmentDirective;
    }

    public void setAssignmentDirective(Long value) {
        this.assignmentDirective = value;
    }
            public String getAltStartDate() {
        return altStartDate;
    }

    public void setAltStartDate(String value) {
        this.altStartDate = value;
    }
            public String getRetroactiveStartDate() {
        return retroactiveStartDate;
    }

    public void setRetroactiveStartDate(String value) {
        this.retroactiveStartDate = value;
    }
            public Long getAltBillDay() {
        return altBillDay;
    }

    public void setAltBillDay(Long value) {
        this.altBillDay = value;
    }
            public Long getInvoicingOption() {
        return invoicingOption;
    }

    public void setInvoicingOption(Long value) {
        this.invoicingOption = value;
    }
            public AcctPaymentMethodsArray getAcctPaymentMethods() {
        return acctPaymentMethods;
    }

    public void setAcctPaymentMethods(AcctPaymentMethodsArray value) {
        this.acctPaymentMethods = value;
    }
            public AcctDunningGroupsArray getAcctDunningGroups() {
        return acctDunningGroups;
    }

    public void setAcctDunningGroups(AcctDunningGroupsArray value) {
        this.acctDunningGroups = value;
    }
            public Long getAutoCollectOnPlanChng() {
        return autoCollectOnPlanChng;
    }

    public void setAutoCollectOnPlanChng(Long value) {
        this.autoCollectOnPlanChng = value;
    }
            public Long getRollbackPlanChngCollectFail() {
        return rollbackPlanChngCollectFail;
    }

    public void setRollbackPlanChngCollectFail(Long value) {
        this.rollbackPlanChngCollectFail = value;
    }
            public Long getAutoSendStmtOnPlanChng() {
        return autoSendStmtOnPlanChng;
    }

    public void setAutoSendStmtOnPlanChng(Long value) {
        this.autoSendStmtOnPlanChng = value;
    }
            public String getComments() {
        return comments;
    }

    public void setComments(String value) {
        this.comments = value;
    }
            public Long getListStartMasterFile() {
        return listStartMasterFile;
    }

    public void setListStartMasterFile(Long value) {
        this.listStartMasterFile = value;
    }
            public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
    }
            
}
