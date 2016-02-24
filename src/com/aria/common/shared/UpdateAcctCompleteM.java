package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "clientReceiptId",    "acctNo",    "clientAcctId",    "userid",    "password",    "secretQuestion",    "secretQuestionAnswer",    "pin",    "firstName",    "mi",    "lastName",    "companyName",    "address1",    "address2",    "address3",    "city",    "locality",    "stateProv",    "countryCd",    "postalCd",    "phone",    "phoneExt",    "cellPhone",    "workPhone",    "workPhoneExt",    "fax",    "email",    "birthdate",    "statusCd",    "notifyMethod",    "seniorAcctNo",    "seniorAcctUserid",    "seniorClientAcctId",    "testAcctInd",    "taxpayerId",    "altClientAcctGroupId",    "acctCoupons",    "acctStartDate",    "altMsgTemplateNo",    "cnAltMsgTemplateNo",    "seqFuncGroupNo",    "clientSeqFuncGroupId",    "taxExemptionLevel",    "clientAltMsgTemplateId",    "clientCnAltMsgTemplateId",    "resetDatesAfterStatus",    "newClientAcctId",    "invoicingOption",    "altStartDate",    "altBillDay",    "retroactiveStartDate",    "functionalAcctGroupsUpdate",    "collectionAcctGroupsUpdate",    "acctSuppFieldsUpdate",    "accountSurcharges",    "clientMasterPlanInstanceId",    "masterPlanInstanceNo",    "newClientMasterPlanInstanceId",    "clientMasterPlanId",    "masterPlanNo",    "masterPlanInstanceDesc",    "dunningGroupNo",    "clientDunningGroupId",    "mpBillingGroupNo",    "clientMpBillingGroupId",    "masterPlanInstanceStatus",    "masterPlanUnits",    "respLevelCd",    "parentMasterPlanInstNo",    "altRateScheduleNo",    "clientAltRateScheduleId",    "promoCd",    "mpCoupons",    "masterPlanAssignDirective",    "offsetMonths",    "offsetInterval",    "invoiceUnbilledUsage",    "invoiceApprovalRequired",    "statusDegradeDate",    "usageAccumulationResetMonths",    "usagePooling",    "usageThresholdApplicability",    "masterPlanPlanInstFields",    "mpSurcharges",    "updateAcctCustomRates",    "billingGroupsArray",    "paymentMethodsArray",    "revrecProfileNo",    "clientRevrecId",    "mpProrationInvoiceTiming",    "poNum",    "mpPoNum",    "listStartMasterFile"})
@XmlRootElement(name = "update_acct_complete_m")
public class UpdateAcctCompleteM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
        @XmlElement(name = "userid")
    protected String userid;
        @XmlElement(name = "password")
    protected String password;
        @XmlElement(name = "secret_question")
    protected String secretQuestion;
        @XmlElement(name = "secret_question_answer")
    protected String secretQuestionAnswer;
        @XmlElement(name = "pin")
    protected String pin;
        @XmlElement(name = "first_name")
    protected String firstName;
        @XmlElement(name = "mi")
    protected String mi;
        @XmlElement(name = "last_name")
    protected String lastName;
        @XmlElement(name = "company_name")
    protected String companyName;
        @XmlElement(name = "address1")
    protected String address1;
        @XmlElement(name = "address2")
    protected String address2;
        @XmlElement(name = "address3")
    protected String address3;
        @XmlElement(name = "city")
    protected String city;
        @XmlElement(name = "locality")
    protected String locality;
        @XmlElement(name = "state_prov")
    protected String stateProv;
        @XmlElement(name = "country_cd")
    protected String countryCd;
        @XmlElement(name = "postal_cd")
    protected String postalCd;
        @XmlElement(name = "phone")
    protected String phone;
        @XmlElement(name = "phone_ext")
    protected String phoneExt;
        @XmlElement(name = "cell_phone")
    protected String cellPhone;
        @XmlElement(name = "work_phone")
    protected String workPhone;
        @XmlElement(name = "work_phone_ext")
    protected String workPhoneExt;
        @XmlElement(name = "fax")
    protected String fax;
        @XmlElement(name = "email")
    protected String email;
        @XmlElement(name = "birthdate")
    protected String birthdate;
        @XmlElement(name = "status_cd")
    protected Long statusCd;
        @XmlElement(name = "notify_method")
    protected Long notifyMethod;
        @XmlElement(name = "senior_acct_no")
    protected Long seniorAcctNo;
        @XmlElement(name = "senior_acct_userid")
    protected String seniorAcctUserid;
        @XmlElement(name = "senior_client_acct_id")
    protected String seniorClientAcctId;
        @XmlElement(name = "test_acct_ind")
    protected Long testAcctInd;
        @XmlElement(name = "taxpayer_id")
    protected String taxpayerId;
        @XmlElement(name = "alt_client_acct_group_id")
    protected String altClientAcctGroupId;
        @XmlElement(name = "acct_coupons")
    protected AcctCouponsArray acctCoupons;
        @XmlElement(name = "acct_start_date")
    protected String acctStartDate;
        @XmlElement(name = "alt_msg_template_no")
    protected Long altMsgTemplateNo;
        @XmlElement(name = "cn_alt_msg_template_no")
    protected Long cnAltMsgTemplateNo;
        @XmlElement(name = "seq_func_group_no")
    protected Long seqFuncGroupNo;
        @XmlElement(name = "client_seq_func_group_id")
    protected Long clientSeqFuncGroupId;
        @XmlElement(name = "tax_exemption_level")
    protected Long taxExemptionLevel;
        @XmlElement(name = "client_alt_msg_template_id")
    protected String clientAltMsgTemplateId;
        @XmlElement(name = "client_cn_alt_msg_template_id")
    protected String clientCnAltMsgTemplateId;
        @XmlElement(name = "reset_dates_after_status")
    protected String resetDatesAfterStatus;
        @XmlElement(name = "new_client_acct_id")
    protected String newClientAcctId;
        @XmlElement(name = "invoicing_option")
    protected Long invoicingOption;
        @XmlElement(name = "alt_start_date")
    protected String altStartDate;
        @XmlElement(name = "alt_bill_day")
    protected Long altBillDay;
        @XmlElement(name = "retroactive_start_date")
    protected String retroactiveStartDate;
        @XmlElement(name = "functional_acct_groups_update")
    protected FunctionalAcctGroupsUpdateArray functionalAcctGroupsUpdate;
        @XmlElement(name = "collection_acct_groups_update")
    protected CollectionAcctGroupsUpdateArray collectionAcctGroupsUpdate;
        @XmlElement(name = "acct_supp_fields_update")
    protected AcctSuppFieldsUpdateArray acctSuppFieldsUpdate;
        @XmlElement(name = "account_surcharges")
    protected AccountSurchargesArray accountSurcharges;
        @XmlElement(name = "client_master_plan_instance_id")
    protected String clientMasterPlanInstanceId;
        @XmlElement(name = "master_plan_instance_no")
    protected Long masterPlanInstanceNo;
        @XmlElement(name = "new_client_master_plan_instance_id")
    protected String newClientMasterPlanInstanceId;
        @XmlElement(name = "client_master_plan_id")
    protected String clientMasterPlanId;
        @XmlElement(name = "master_plan_no")
    protected Long masterPlanNo;
        @XmlElement(name = "master_plan_instance_desc")
    protected String masterPlanInstanceDesc;
        @XmlElement(name = "dunning_group_no")
    protected Long dunningGroupNo;
        @XmlElement(name = "client_dunning_group_id")
    protected String clientDunningGroupId;
        @XmlElement(name = "mp_billing_group_no")
    protected Long mpBillingGroupNo;
        @XmlElement(name = "client_mp_billing_group_id")
    protected String clientMpBillingGroupId;
        @XmlElement(name = "master_plan_instance_status")
    protected Long masterPlanInstanceStatus;
        @XmlElement(name = "master_plan_units")
    protected Long masterPlanUnits;
        @XmlElement(name = "resp_level_cd")
    protected Long respLevelCd;
        @XmlElement(name = "parent_master_plan_inst_no")
    protected Long parentMasterPlanInstNo;
        @XmlElement(name = "alt_rate_schedule_no")
    protected Long altRateScheduleNo;
        @XmlElement(name = "client_alt_rate_schedule_id")
    protected String clientAltRateScheduleId;
        @XmlElement(name = "promo_cd")
    protected String promoCd;
        @XmlElement(name = "mp_coupons")
    protected MpCouponsArray mpCoupons;
        @XmlElement(name = "master_plan_assign_directive")
    protected Long masterPlanAssignDirective;
        @XmlElement(name = "offset_months")
    protected Long offsetMonths;
        @XmlElement(name = "offset_interval")
    protected Long offsetInterval;
        @XmlElement(name = "invoice_unbilled_usage")
    protected String invoiceUnbilledUsage;
        @XmlElement(name = "invoice_approval_required")
    protected String invoiceApprovalRequired;
        @XmlElement(name = "status_degrade_date")
    protected String statusDegradeDate;
        @XmlElement(name = "usage_accumulation_reset_months")
    protected Long usageAccumulationResetMonths;
        @XmlElement(name = "usage_pooling")
    protected String usagePooling;
        @XmlElement(name = "usage_threshold_applicability")
    protected String usageThresholdApplicability;
        @XmlElement(name = "master_plan_plan_inst_fields")
    protected MasterPlanPlanInstFieldsArray masterPlanPlanInstFields;
        @XmlElement(name = "mp_surcharges")
    protected MpSurchargesArray mpSurcharges;
        @XmlElement(name = "update_acct_custom_rates")
    protected UpdateAcctCustomRatesArray updateAcctCustomRates;
        @XmlElement(name = "billing_groups_array")
    protected BillingGroupsArrayArray billingGroupsArray;
        @XmlElement(name = "payment_methods_array")
    protected PaymentMethodsArrayArray paymentMethodsArray;
        @XmlElement(name = "revrec_profile_no")
    protected Long revrecProfileNo;
        @XmlElement(name = "client_revrec_id")
    protected String clientRevrecId;
        @XmlElement(name = "mp_proration_invoice_timing")
    protected Long mpProrationInvoiceTiming;
        @XmlElement(name = "po_num")
    protected String poNum;
        @XmlElement(name = "mp_po_num")
    protected String mpPoNum;
        @XmlElement(name = "list_start_master_file")
    protected Long listStartMasterFile;
    
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

    public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
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
            public String getUserid() {
        return userid;
    }

    public void setUserid(String value) {
        this.userid = value;
    }
            public String getPassword() {
        return password;
    }

    public void setPassword(String value) {
        this.password = value;
    }
            public String getSecretQuestion() {
        return secretQuestion;
    }

    public void setSecretQuestion(String value) {
        this.secretQuestion = value;
    }
            public String getSecretQuestionAnswer() {
        return secretQuestionAnswer;
    }

    public void setSecretQuestionAnswer(String value) {
        this.secretQuestionAnswer = value;
    }
            public String getPin() {
        return pin;
    }

    public void setPin(String value) {
        this.pin = value;
    }
            public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }
            public String getMi() {
        return mi;
    }

    public void setMi(String value) {
        this.mi = value;
    }
            public String getLastName() {
        return lastName;
    }

    public void setLastName(String value) {
        this.lastName = value;
    }
            public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String value) {
        this.companyName = value;
    }
            public String getAddress1() {
        return address1;
    }

    public void setAddress1(String value) {
        this.address1 = value;
    }
            public String getAddress2() {
        return address2;
    }

    public void setAddress2(String value) {
        this.address2 = value;
    }
            public String getAddress3() {
        return address3;
    }

    public void setAddress3(String value) {
        this.address3 = value;
    }
            public String getCity() {
        return city;
    }

    public void setCity(String value) {
        this.city = value;
    }
            public String getLocality() {
        return locality;
    }

    public void setLocality(String value) {
        this.locality = value;
    }
            public String getStateProv() {
        return stateProv;
    }

    public void setStateProv(String value) {
        this.stateProv = value;
    }
            public String getCountryCd() {
        return countryCd;
    }

    public void setCountryCd(String value) {
        this.countryCd = value;
    }
            public String getPostalCd() {
        return postalCd;
    }

    public void setPostalCd(String value) {
        this.postalCd = value;
    }
            public String getPhone() {
        return phone;
    }

    public void setPhone(String value) {
        this.phone = value;
    }
            public String getPhoneExt() {
        return phoneExt;
    }

    public void setPhoneExt(String value) {
        this.phoneExt = value;
    }
            public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String value) {
        this.cellPhone = value;
    }
            public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String value) {
        this.workPhone = value;
    }
            public String getWorkPhoneExt() {
        return workPhoneExt;
    }

    public void setWorkPhoneExt(String value) {
        this.workPhoneExt = value;
    }
            public String getFax() {
        return fax;
    }

    public void setFax(String value) {
        this.fax = value;
    }
            public String getEmail() {
        return email;
    }

    public void setEmail(String value) {
        this.email = value;
    }
            public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String value) {
        this.birthdate = value;
    }
            public Long getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(Long value) {
        this.statusCd = value;
    }
            public Long getNotifyMethod() {
        return notifyMethod;
    }

    public void setNotifyMethod(Long value) {
        this.notifyMethod = value;
    }
            public Long getSeniorAcctNo() {
        return seniorAcctNo;
    }

    public void setSeniorAcctNo(Long value) {
        this.seniorAcctNo = value;
    }
            public String getSeniorAcctUserid() {
        return seniorAcctUserid;
    }

    public void setSeniorAcctUserid(String value) {
        this.seniorAcctUserid = value;
    }
            public String getSeniorClientAcctId() {
        return seniorClientAcctId;
    }

    public void setSeniorClientAcctId(String value) {
        this.seniorClientAcctId = value;
    }
            public Long getTestAcctInd() {
        return testAcctInd;
    }

    public void setTestAcctInd(Long value) {
        this.testAcctInd = value;
    }
            public String getTaxpayerId() {
        return taxpayerId;
    }

    public void setTaxpayerId(String value) {
        this.taxpayerId = value;
    }
            public String getAltClientAcctGroupId() {
        return altClientAcctGroupId;
    }

    public void setAltClientAcctGroupId(String value) {
        this.altClientAcctGroupId = value;
    }
            public AcctCouponsArray getAcctCoupons() {
        return acctCoupons;
    }

    public void setAcctCoupons(AcctCouponsArray value) {
        this.acctCoupons = value;
    }
            public String getAcctStartDate() {
        return acctStartDate;
    }

    public void setAcctStartDate(String value) {
        this.acctStartDate = value;
    }
            public Long getAltMsgTemplateNo() {
        return altMsgTemplateNo;
    }

    public void setAltMsgTemplateNo(Long value) {
        this.altMsgTemplateNo = value;
    }
            public Long getCnAltMsgTemplateNo() {
        return cnAltMsgTemplateNo;
    }

    public void setCnAltMsgTemplateNo(Long value) {
        this.cnAltMsgTemplateNo = value;
    }
            public Long getSeqFuncGroupNo() {
        return seqFuncGroupNo;
    }

    public void setSeqFuncGroupNo(Long value) {
        this.seqFuncGroupNo = value;
    }
            public Long getClientSeqFuncGroupId() {
        return clientSeqFuncGroupId;
    }

    public void setClientSeqFuncGroupId(Long value) {
        this.clientSeqFuncGroupId = value;
    }
            public Long getTaxExemptionLevel() {
        return taxExemptionLevel;
    }

    public void setTaxExemptionLevel(Long value) {
        this.taxExemptionLevel = value;
    }
            public String getClientAltMsgTemplateId() {
        return clientAltMsgTemplateId;
    }

    public void setClientAltMsgTemplateId(String value) {
        this.clientAltMsgTemplateId = value;
    }
            public String getClientCnAltMsgTemplateId() {
        return clientCnAltMsgTemplateId;
    }

    public void setClientCnAltMsgTemplateId(String value) {
        this.clientCnAltMsgTemplateId = value;
    }
            public String getResetDatesAfterStatus() {
        return resetDatesAfterStatus;
    }

    public void setResetDatesAfterStatus(String value) {
        this.resetDatesAfterStatus = value;
    }
            public String getNewClientAcctId() {
        return newClientAcctId;
    }

    public void setNewClientAcctId(String value) {
        this.newClientAcctId = value;
    }
            public Long getInvoicingOption() {
        return invoicingOption;
    }

    public void setInvoicingOption(Long value) {
        this.invoicingOption = value;
    }
            public String getAltStartDate() {
        return altStartDate;
    }

    public void setAltStartDate(String value) {
        this.altStartDate = value;
    }
            public Long getAltBillDay() {
        return altBillDay;
    }

    public void setAltBillDay(Long value) {
        this.altBillDay = value;
    }
            public String getRetroactiveStartDate() {
        return retroactiveStartDate;
    }

    public void setRetroactiveStartDate(String value) {
        this.retroactiveStartDate = value;
    }
            public FunctionalAcctGroupsUpdateArray getFunctionalAcctGroupsUpdate() {
        return functionalAcctGroupsUpdate;
    }

    public void setFunctionalAcctGroupsUpdate(FunctionalAcctGroupsUpdateArray value) {
        this.functionalAcctGroupsUpdate = value;
    }
            public CollectionAcctGroupsUpdateArray getCollectionAcctGroupsUpdate() {
        return collectionAcctGroupsUpdate;
    }

    public void setCollectionAcctGroupsUpdate(CollectionAcctGroupsUpdateArray value) {
        this.collectionAcctGroupsUpdate = value;
    }
            public AcctSuppFieldsUpdateArray getAcctSuppFieldsUpdate() {
        return acctSuppFieldsUpdate;
    }

    public void setAcctSuppFieldsUpdate(AcctSuppFieldsUpdateArray value) {
        this.acctSuppFieldsUpdate = value;
    }
            public AccountSurchargesArray getAccountSurcharges() {
        return accountSurcharges;
    }

    public void setAccountSurcharges(AccountSurchargesArray value) {
        this.accountSurcharges = value;
    }
            public String getClientMasterPlanInstanceId() {
        return clientMasterPlanInstanceId;
    }

    public void setClientMasterPlanInstanceId(String value) {
        this.clientMasterPlanInstanceId = value;
    }
            public Long getMasterPlanInstanceNo() {
        return masterPlanInstanceNo;
    }

    public void setMasterPlanInstanceNo(Long value) {
        this.masterPlanInstanceNo = value;
    }
            public String getNewClientMasterPlanInstanceId() {
        return newClientMasterPlanInstanceId;
    }

    public void setNewClientMasterPlanInstanceId(String value) {
        this.newClientMasterPlanInstanceId = value;
    }
            public String getClientMasterPlanId() {
        return clientMasterPlanId;
    }

    public void setClientMasterPlanId(String value) {
        this.clientMasterPlanId = value;
    }
            public Long getMasterPlanNo() {
        return masterPlanNo;
    }

    public void setMasterPlanNo(Long value) {
        this.masterPlanNo = value;
    }
            public String getMasterPlanInstanceDesc() {
        return masterPlanInstanceDesc;
    }

    public void setMasterPlanInstanceDesc(String value) {
        this.masterPlanInstanceDesc = value;
    }
            public Long getDunningGroupNo() {
        return dunningGroupNo;
    }

    public void setDunningGroupNo(Long value) {
        this.dunningGroupNo = value;
    }
            public String getClientDunningGroupId() {
        return clientDunningGroupId;
    }

    public void setClientDunningGroupId(String value) {
        this.clientDunningGroupId = value;
    }
            public Long getMpBillingGroupNo() {
        return mpBillingGroupNo;
    }

    public void setMpBillingGroupNo(Long value) {
        this.mpBillingGroupNo = value;
    }
            public String getClientMpBillingGroupId() {
        return clientMpBillingGroupId;
    }

    public void setClientMpBillingGroupId(String value) {
        this.clientMpBillingGroupId = value;
    }
            public Long getMasterPlanInstanceStatus() {
        return masterPlanInstanceStatus;
    }

    public void setMasterPlanInstanceStatus(Long value) {
        this.masterPlanInstanceStatus = value;
    }
            public Long getMasterPlanUnits() {
        return masterPlanUnits;
    }

    public void setMasterPlanUnits(Long value) {
        this.masterPlanUnits = value;
    }
            public Long getRespLevelCd() {
        return respLevelCd;
    }

    public void setRespLevelCd(Long value) {
        this.respLevelCd = value;
    }
            public Long getParentMasterPlanInstNo() {
        return parentMasterPlanInstNo;
    }

    public void setParentMasterPlanInstNo(Long value) {
        this.parentMasterPlanInstNo = value;
    }
            public Long getAltRateScheduleNo() {
        return altRateScheduleNo;
    }

    public void setAltRateScheduleNo(Long value) {
        this.altRateScheduleNo = value;
    }
            public String getClientAltRateScheduleId() {
        return clientAltRateScheduleId;
    }

    public void setClientAltRateScheduleId(String value) {
        this.clientAltRateScheduleId = value;
    }
            public String getPromoCd() {
        return promoCd;
    }

    public void setPromoCd(String value) {
        this.promoCd = value;
    }
            public MpCouponsArray getMpCoupons() {
        return mpCoupons;
    }

    public void setMpCoupons(MpCouponsArray value) {
        this.mpCoupons = value;
    }
            public Long getMasterPlanAssignDirective() {
        return masterPlanAssignDirective;
    }

    public void setMasterPlanAssignDirective(Long value) {
        this.masterPlanAssignDirective = value;
    }
            public Long getOffsetMonths() {
        return offsetMonths;
    }

    public void setOffsetMonths(Long value) {
        this.offsetMonths = value;
    }
            public Long getOffsetInterval() {
        return offsetInterval;
    }

    public void setOffsetInterval(Long value) {
        this.offsetInterval = value;
    }
            public String getInvoiceUnbilledUsage() {
        return invoiceUnbilledUsage;
    }

    public void setInvoiceUnbilledUsage(String value) {
        this.invoiceUnbilledUsage = value;
    }
            public String getInvoiceApprovalRequired() {
        return invoiceApprovalRequired;
    }

    public void setInvoiceApprovalRequired(String value) {
        this.invoiceApprovalRequired = value;
    }
            public String getStatusDegradeDate() {
        return statusDegradeDate;
    }

    public void setStatusDegradeDate(String value) {
        this.statusDegradeDate = value;
    }
            public Long getUsageAccumulationResetMonths() {
        return usageAccumulationResetMonths;
    }

    public void setUsageAccumulationResetMonths(Long value) {
        this.usageAccumulationResetMonths = value;
    }
            public String getUsagePooling() {
        return usagePooling;
    }

    public void setUsagePooling(String value) {
        this.usagePooling = value;
    }
            public String getUsageThresholdApplicability() {
        return usageThresholdApplicability;
    }

    public void setUsageThresholdApplicability(String value) {
        this.usageThresholdApplicability = value;
    }
            public MasterPlanPlanInstFieldsArray getMasterPlanPlanInstFields() {
        return masterPlanPlanInstFields;
    }

    public void setMasterPlanPlanInstFields(MasterPlanPlanInstFieldsArray value) {
        this.masterPlanPlanInstFields = value;
    }
            public MpSurchargesArray getMpSurcharges() {
        return mpSurcharges;
    }

    public void setMpSurcharges(MpSurchargesArray value) {
        this.mpSurcharges = value;
    }
            public UpdateAcctCustomRatesArray getUpdateAcctCustomRates() {
        return updateAcctCustomRates;
    }

    public void setUpdateAcctCustomRates(UpdateAcctCustomRatesArray value) {
        this.updateAcctCustomRates = value;
    }
            public BillingGroupsArrayArray getBillingGroupsArray() {
        return billingGroupsArray;
    }

    public void setBillingGroupsArray(BillingGroupsArrayArray value) {
        this.billingGroupsArray = value;
    }
            public PaymentMethodsArrayArray getPaymentMethodsArray() {
        return paymentMethodsArray;
    }

    public void setPaymentMethodsArray(PaymentMethodsArrayArray value) {
        this.paymentMethodsArray = value;
    }
            public Long getRevrecProfileNo() {
        return revrecProfileNo;
    }

    public void setRevrecProfileNo(Long value) {
        this.revrecProfileNo = value;
    }
            public String getClientRevrecId() {
        return clientRevrecId;
    }

    public void setClientRevrecId(String value) {
        this.clientRevrecId = value;
    }
            public Long getMpProrationInvoiceTiming() {
        return mpProrationInvoiceTiming;
    }

    public void setMpProrationInvoiceTiming(Long value) {
        this.mpProrationInvoiceTiming = value;
    }
            public String getPoNum() {
        return poNum;
    }

    public void setPoNum(String value) {
        this.poNum = value;
    }
            public String getMpPoNum() {
        return mpPoNum;
    }

    public void setMpPoNum(String value) {
        this.mpPoNum = value;
    }
            public Long getListStartMasterFile() {
        return listStartMasterFile;
    }

    public void setListStartMasterFile(Long value) {
        this.listStartMasterFile = value;
    }
            
}
