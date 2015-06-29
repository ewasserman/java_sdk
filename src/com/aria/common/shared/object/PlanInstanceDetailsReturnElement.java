package com.aria.common.shared.object;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_instance_details_ReturnElement", propOrder = {"acctNo", "userId", "clientAcctId", "planInstanceNo", "clientPlanInstanceId", "productFields", "planNo", "clientPlanId", "planName", "planUnits", "lastBillDate", "nextBillDate", "billThruDate", "statusCd", "statusDate", "scheduleNo", "masterPlanInstanceBalance", "billingGroupNo", "clientBillingGroupId", "dunningGroupNo", "primaryPaymentMethod", "backupPaymentMethod"})
public class PlanInstanceDetailsReturnElement {

    @XmlElement(name = "acct_no")
    protected Long acctNo;
    @XmlElement(name = "user_id")
    protected String userId;
    @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
    @XmlElement(name = "plan_instance_no")
    protected String planInstanceNo;
    @XmlElement(name = "client_plan_instance_id")
    protected String clientPlanInstanceId;
    @XmlElement(name = "product_fields")
    protected List<ProductFieldsReturnElement> productFields;
    @XmlElement(name = "plan_no")
    protected Long planNo;
    @XmlElement(name = "client_plan_id")
    protected String clientPlanId;
    @XmlElement(name = "plan_name")
    protected String planName;
    @XmlElement(name = "plan_units")
    protected Long planUnits;
    @XmlElement(name = "last_bill_date")
    protected String lastBillDate;
    @XmlElement(name = "next_bill_date")
    protected String nextBillDate;
    @XmlElement(name = "bill_thru_date")
    protected String billThruDate;
    @XmlElement(name = "status_cd")
    protected String statusCd;
    @XmlElement(name = "status_date")
    protected String statusDate;
    @XmlElement(name = "schedule_no")
    protected String scheduleNo;
    @XmlElement(name = "master_plan_instance_balance")
    protected Long masterPlanInstanceBalance;
    @XmlElement(name = "billing_group_no")
    protected Long billingGroupNo;
    @XmlElement(name = "client_billing_group_id")
    protected String clientBillingGroupId;
    @XmlElement(name = "dunning_group_no")
    protected Long dunningGroupNo;
    @XmlElement(name = "primary_payment_method")
    protected List<PrimaryPaymentMethodReturnElement> primaryPaymentMethod;
    @XmlElement(name = "backup_payment_method")
    protected List<BackupPaymentMethodReturnElement> backupPaymentMethod;
    
    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String value) {
        this.userId = value;
    }

    public String getClientAcctId() {
        return clientAcctId;
    }

    public void setClientAcctId(String value) {
        this.clientAcctId = value;
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

    public List<ProductFieldsReturnElement> getProductFields() {
        if (this.productFields == null) {
            this.productFields = new ArrayList<ProductFieldsReturnElement>();
        }
        return this.productFields;
    }public Long getPlanNo() {
        return planNo;
    }

    public void setPlanNo(Long value) {
        this.planNo = value;
    }

    public String getClientPlanId() {
        return clientPlanId;
    }

    public void setClientPlanId(String value) {
        this.clientPlanId = value;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String value) {
        this.planName = value;
    }

    public Long getPlanUnits() {
        return planUnits;
    }

    public void setPlanUnits(Long value) {
        this.planUnits = value;
    }

    public String getLastBillDate() {
        return lastBillDate;
    }

    public void setLastBillDate(String value) {
        this.lastBillDate = value;
    }

    public String getNextBillDate() {
        return nextBillDate;
    }

    public void setNextBillDate(String value) {
        this.nextBillDate = value;
    }

    public String getBillThruDate() {
        return billThruDate;
    }

    public void setBillThruDate(String value) {
        this.billThruDate = value;
    }

    public String getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(String value) {
        this.statusCd = value;
    }

    public String getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(String value) {
        this.statusDate = value;
    }

    public String getScheduleNo() {
        return scheduleNo;
    }

    public void setScheduleNo(String value) {
        this.scheduleNo = value;
    }

    public Long getMasterPlanInstanceBalance() {
        return masterPlanInstanceBalance;
    }

    public void setMasterPlanInstanceBalance(Long value) {
        this.masterPlanInstanceBalance = value;
    }

    public Long getBillingGroupNo() {
        return billingGroupNo;
    }

    public void setBillingGroupNo(Long value) {
        this.billingGroupNo = value;
    }

    public String getClientBillingGroupId() {
        return clientBillingGroupId;
    }

    public void setClientBillingGroupId(String value) {
        this.clientBillingGroupId = value;
    }

    public Long getDunningGroupNo() {
        return dunningGroupNo;
    }

    public void setDunningGroupNo(Long value) {
        this.dunningGroupNo = value;
    }

    public List<PrimaryPaymentMethodReturnElement> getPrimaryPaymentMethod() {
        if (this.primaryPaymentMethod == null) {
            this.primaryPaymentMethod = new ArrayList<PrimaryPaymentMethodReturnElement>();
        }
        return this.primaryPaymentMethod;
    }public List<BackupPaymentMethodReturnElement> getBackupPaymentMethod() {
        if (this.backupPaymentMethod == null) {
            this.backupPaymentMethod = new ArrayList<BackupPaymentMethodReturnElement>();
        }
        return this.backupPaymentMethod;
    }
}
