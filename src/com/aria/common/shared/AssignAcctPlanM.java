package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "newPlanNo",    "newClientPlanId",    "clientPlanInstanceId",    "existingBillingGroupNo",    "existingClientBillingGroupId",    "billingGroupName",    "billingGroupDescription",    "clientDefBillingGroupId",    "notifyMethod",    "notifyTemplateGroup",    "statementTemplate",    "creditNoteTemplate",    "existingPrimaryPaymentMethodNo",    "existingClientPrimaryPaymentMethodId",    "existingBackupPaymentMethodNo",    "existingClientBackupPaymentMethodId",    "stmtFirstName",    "stmtMi",    "stmtLastName",    "stmtCompanyName",    "stmtAddress1",    "stmtAddress2",    "stmtAddress3",    "stmtCity",    "stmtLocality",    "stmtStateProv",    "stmtCountry",    "stmtPostalCd",    "stmtPhone",    "stmtPhoneExt",    "stmtCellPhone",    "stmtWorkPhone",    "stmtWorkPhoneExt",    "stmtFax",    "stmtEmail",    "stmtBirthdate",    "billFirstName",    "billMiddleInitial",    "billLastName",    "billCompanyName",    "billAddress1",    "billAddress2",    "billAddress3",    "billCity",    "billLocality",    "billStateProv",    "billCountry",    "billPostalCd",    "billPhone",    "billPhoneExt",    "billCellPhone",    "billWorkPhone",    "billWorkPhoneExt",    "billFax",    "billEmail",    "billBirthdate",    "primaryPayMethodName",    "primaryPayMethodCdid",    "primaryPayMethodDescription",    "primaryPayMethodType",    "ccNumber",    "ccExpireMm",    "ccExpireYyyy",    "bankAcctNo",    "bankRoutingNo",    "cvv",    "trackData1",    "trackData2",    "billAgreementId",    "iban",    "bankCheckDigit",    "bankSwiftCd",    "bankCountryCd",    "mandateId",    "bankIdCd",    "bankBranchCd",    "existingDunningGroupNo",    "existingClientDefDunningGroupId",    "dunningGroupName",    "dunningGroupDescription",    "clientDunningGroupId",    "dunningProcessNo",    "clientDunningProcessId",    "altStartDate",    "statusUntilAltStart",    "altBillDay",    "invoicingOption",    "retroactiveStartDate",    "balanceForward",    "respLevelCd",    "parentAcctMasterPlanInstId",    "parentPlanInstanceNo",    "clientParentPlanInstanceId",    "altRateScheduleNo",    "planUnits",    "couponCodes",    "promoCd",    "mpiSurcharges",    "planStatus",    "planInstanceDescription",    "planInstanceFields",    "assignmentDirective",    "comments",    "doWrite",    "clientReceiptId",    "offsetMonths",    "altProrationStartDate",    "autoOffsetMonthsOption",    "altClientAcctGroupId",    "usageAccumulationResetMonths",    "usagePooling",    "usageThresholdApplicability",    "customRates",    "effectiveDate",    "offsetInterval",    "forceSuppBillDateReset",    "clientAltRateScheduleId",    "nsoBillImmediately",    "nsoItemList"})
@XmlRootElement(name = "assign_acct_plan_m")
public class AssignAcctPlanM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "new_plan_no")
    protected Long newPlanNo;
        @XmlElement(name = "new_client_plan_id")
    protected String newClientPlanId;
        @XmlElement(name = "client_plan_instance_id")
    protected String clientPlanInstanceId;
        @XmlElement(name = "existing_billing_group_no")
    protected Long existingBillingGroupNo;
        @XmlElement(name = "existing_client_billing_group_id")
    protected String existingClientBillingGroupId;
        @XmlElement(name = "billing_group_name")
    protected String billingGroupName;
        @XmlElement(name = "billing_group_description")
    protected String billingGroupDescription;
        @XmlElement(name = "client_def_billing_group_id")
    protected String clientDefBillingGroupId;
        @XmlElement(name = "notify_method")
    protected Long notifyMethod;
        @XmlElement(name = "notify_template_group")
    protected Long notifyTemplateGroup;
        @XmlElement(name = "statement_template")
    protected Long statementTemplate;
        @XmlElement(name = "credit_note_template")
    protected Long creditNoteTemplate;
        @XmlElement(name = "existing_primary_payment_method_no")
    protected Long existingPrimaryPaymentMethodNo;
        @XmlElement(name = "existing_client_primary_payment_method_id")
    protected String existingClientPrimaryPaymentMethodId;
        @XmlElement(name = "existing_backup_payment_method_no")
    protected Long existingBackupPaymentMethodNo;
        @XmlElement(name = "existing_client_backup_payment_method_id")
    protected String existingClientBackupPaymentMethodId;
        @XmlElement(name = "stmt_first_name")
    protected String stmtFirstName;
        @XmlElement(name = "stmt_mi")
    protected String stmtMi;
        @XmlElement(name = "stmt_last_name")
    protected String stmtLastName;
        @XmlElement(name = "stmt_company_name")
    protected String stmtCompanyName;
        @XmlElement(name = "stmt_address1")
    protected String stmtAddress1;
        @XmlElement(name = "stmt_address2")
    protected String stmtAddress2;
        @XmlElement(name = "stmt_address3")
    protected String stmtAddress3;
        @XmlElement(name = "stmt_city")
    protected String stmtCity;
        @XmlElement(name = "stmt_locality")
    protected String stmtLocality;
        @XmlElement(name = "stmt_state_prov")
    protected String stmtStateProv;
        @XmlElement(name = "stmt_country")
    protected String stmtCountry;
        @XmlElement(name = "stmt_postal_cd")
    protected String stmtPostalCd;
        @XmlElement(name = "stmt_phone")
    protected String stmtPhone;
        @XmlElement(name = "stmt_phone_ext")
    protected String stmtPhoneExt;
        @XmlElement(name = "stmt_cell_phone")
    protected String stmtCellPhone;
        @XmlElement(name = "stmt_work_phone")
    protected String stmtWorkPhone;
        @XmlElement(name = "stmt_work_phone_ext")
    protected String stmtWorkPhoneExt;
        @XmlElement(name = "stmt_fax")
    protected String stmtFax;
        @XmlElement(name = "stmt_email")
    protected String stmtEmail;
        @XmlElement(name = "stmt_birthdate")
    protected String stmtBirthdate;
        @XmlElement(name = "bill_first_name")
    protected String billFirstName;
        @XmlElement(name = "bill_middle_initial")
    protected String billMiddleInitial;
        @XmlElement(name = "bill_last_name")
    protected String billLastName;
        @XmlElement(name = "bill_company_name")
    protected String billCompanyName;
        @XmlElement(name = "bill_address1")
    protected String billAddress1;
        @XmlElement(name = "bill_address2")
    protected String billAddress2;
        @XmlElement(name = "bill_address3")
    protected String billAddress3;
        @XmlElement(name = "bill_city")
    protected String billCity;
        @XmlElement(name = "bill_locality")
    protected String billLocality;
        @XmlElement(name = "bill_state_prov")
    protected String billStateProv;
        @XmlElement(name = "bill_country")
    protected String billCountry;
        @XmlElement(name = "bill_postal_cd")
    protected String billPostalCd;
        @XmlElement(name = "bill_phone")
    protected String billPhone;
        @XmlElement(name = "bill_phone_ext")
    protected String billPhoneExt;
        @XmlElement(name = "bill_cell_phone")
    protected String billCellPhone;
        @XmlElement(name = "bill_work_phone")
    protected String billWorkPhone;
        @XmlElement(name = "bill_work_phone_ext")
    protected String billWorkPhoneExt;
        @XmlElement(name = "bill_fax")
    protected String billFax;
        @XmlElement(name = "bill_email")
    protected String billEmail;
        @XmlElement(name = "bill_birthdate")
    protected String billBirthdate;
        @XmlElement(name = "primary_pay_method_name")
    protected String primaryPayMethodName;
        @XmlElement(name = "primary_pay_method_cdid")
    protected String primaryPayMethodCdid;
        @XmlElement(name = "primary_pay_method_description")
    protected String primaryPayMethodDescription;
        @XmlElement(name = "primary_pay_method_type")
    protected Long primaryPayMethodType;
        @XmlElement(name = "cc_number")
    protected String ccNumber;
        @XmlElement(name = "cc_expire_mm")
    protected Long ccExpireMm;
        @XmlElement(name = "cc_expire_yyyy")
    protected Long ccExpireYyyy;
        @XmlElement(name = "bank_acct_no")
    protected String bankAcctNo;
        @XmlElement(name = "bank_routing_no")
    protected String bankRoutingNo;
        @XmlElement(name = "cvv")
    protected String cvv;
        @XmlElement(name = "track_data1")
    protected String trackData1;
        @XmlElement(name = "track_data2")
    protected String trackData2;
        @XmlElement(name = "bill_agreement_id")
    protected String billAgreementId;
        @XmlElement(name = "iban")
    protected String iban;
        @XmlElement(name = "bank_check_digit")
    protected Long bankCheckDigit;
        @XmlElement(name = "bank_swift_cd")
    protected String bankSwiftCd;
        @XmlElement(name = "bank_country_cd")
    protected String bankCountryCd;
        @XmlElement(name = "mandate_id")
    protected String mandateId;
        @XmlElement(name = "bank_id_cd")
    protected String bankIdCd;
        @XmlElement(name = "bank_branch_cd")
    protected String bankBranchCd;
        @XmlElement(name = "existing_dunning_group_no")
    protected Long existingDunningGroupNo;
        @XmlElement(name = "existing_client_def_dunning_group_id")
    protected String existingClientDefDunningGroupId;
        @XmlElement(name = "dunning_group_name")
    protected String dunningGroupName;
        @XmlElement(name = "dunning_group_description")
    protected String dunningGroupDescription;
        @XmlElement(name = "client_dunning_group_id")
    protected String clientDunningGroupId;
        @XmlElement(name = "dunning_process_no")
    protected Long dunningProcessNo;
        @XmlElement(name = "client_dunning_process_id")
    protected String clientDunningProcessId;
        @XmlElement(name = "alt_start_date")
    protected String altStartDate;
        @XmlElement(name = "status_until_alt_start")
    protected Long statusUntilAltStart;
        @XmlElement(name = "alt_bill_day")
    protected Long altBillDay;
        @XmlElement(name = "invoicing_option")
    protected Long invoicingOption;
        @XmlElement(name = "retroactive_start_date")
    protected String retroactiveStartDate;
        @XmlElement(name = "balance_forward")
    protected Double balanceForward;
        @XmlElement(name = "resp_level_cd")
    protected Long respLevelCd;
        @XmlElement(name = "parent_acct_master_plan_inst_id")
    protected Long parentAcctMasterPlanInstId;
        @XmlElement(name = "parent_plan_instance_no")
    protected Long parentPlanInstanceNo;
        @XmlElement(name = "client_parent_plan_instance_id")
    protected String clientParentPlanInstanceId;
        @XmlElement(name = "alt_rate_schedule_no")
    protected Long altRateScheduleNo;
        @XmlElement(name = "plan_units")
    protected Double planUnits;
        @XmlElement(name = "coupon_codes")
    protected CouponCodesArray couponCodes;
        @XmlElement(name = "promo_cd")
    protected String promoCd;
        @XmlElement(name = "mpi_surcharges")
    protected MpiSurchargesArray mpiSurcharges;
        @XmlElement(name = "plan_status")
    protected Long planStatus;
        @XmlElement(name = "plan_instance_description")
    protected String planInstanceDescription;
        @XmlElement(name = "plan_instance_fields")
    protected PlanInstanceFieldsArray planInstanceFields;
        @XmlElement(name = "assignment_directive")
    protected Long assignmentDirective;
        @XmlElement(name = "comments")
    protected String comments;
        @XmlElement(name = "do_write")
    protected String doWrite;
        @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
        @XmlElement(name = "offset_months")
    protected Long offsetMonths;
        @XmlElement(name = "alt_proration_start_date")
    protected String altProrationStartDate;
        @XmlElement(name = "auto_offset_months_option")
    protected Long autoOffsetMonthsOption;
        @XmlElement(name = "alt_client_acct_group_id")
    protected String altClientAcctGroupId;
        @XmlElement(name = "usage_accumulation_reset_months")
    protected Long usageAccumulationResetMonths;
        @XmlElement(name = "usage_pooling")
    protected String usagePooling;
        @XmlElement(name = "usage_threshold_applicability")
    protected String usageThresholdApplicability;
        @XmlElement(name = "custom_rates")
    protected CustomRatesArray customRates;
        @XmlElement(name = "effective_date")
    protected String effectiveDate;
        @XmlElement(name = "offset_interval")
    protected Long offsetInterval;
        @XmlElement(name = "force_supp_bill_date_reset")
    protected Long forceSuppBillDateReset;
        @XmlElement(name = "client_alt_rate_schedule_id")
    protected String clientAltRateScheduleId;
        @XmlElement(name = "nso_bill_immediately")
    protected Long nsoBillImmediately;
        @XmlElement(name = "nso_item_list")
    protected NsoItemListArray nsoItemList;
    
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
            public Long getNewPlanNo() {
        return newPlanNo;
    }

    public void setNewPlanNo(Long value) {
        this.newPlanNo = value;
    }
            public String getNewClientPlanId() {
        return newClientPlanId;
    }

    public void setNewClientPlanId(String value) {
        this.newClientPlanId = value;
    }
            public String getClientPlanInstanceId() {
        return clientPlanInstanceId;
    }

    public void setClientPlanInstanceId(String value) {
        this.clientPlanInstanceId = value;
    }
            public Long getExistingBillingGroupNo() {
        return existingBillingGroupNo;
    }

    public void setExistingBillingGroupNo(Long value) {
        this.existingBillingGroupNo = value;
    }
            public String getExistingClientBillingGroupId() {
        return existingClientBillingGroupId;
    }

    public void setExistingClientBillingGroupId(String value) {
        this.existingClientBillingGroupId = value;
    }
            public String getBillingGroupName() {
        return billingGroupName;
    }

    public void setBillingGroupName(String value) {
        this.billingGroupName = value;
    }
            public String getBillingGroupDescription() {
        return billingGroupDescription;
    }

    public void setBillingGroupDescription(String value) {
        this.billingGroupDescription = value;
    }
            public String getClientDefBillingGroupId() {
        return clientDefBillingGroupId;
    }

    public void setClientDefBillingGroupId(String value) {
        this.clientDefBillingGroupId = value;
    }
            public Long getNotifyMethod() {
        return notifyMethod;
    }

    public void setNotifyMethod(Long value) {
        this.notifyMethod = value;
    }
            public Long getNotifyTemplateGroup() {
        return notifyTemplateGroup;
    }

    public void setNotifyTemplateGroup(Long value) {
        this.notifyTemplateGroup = value;
    }
            public Long getStatementTemplate() {
        return statementTemplate;
    }

    public void setStatementTemplate(Long value) {
        this.statementTemplate = value;
    }
            public Long getCreditNoteTemplate() {
        return creditNoteTemplate;
    }

    public void setCreditNoteTemplate(Long value) {
        this.creditNoteTemplate = value;
    }
            public Long getExistingPrimaryPaymentMethodNo() {
        return existingPrimaryPaymentMethodNo;
    }

    public void setExistingPrimaryPaymentMethodNo(Long value) {
        this.existingPrimaryPaymentMethodNo = value;
    }
            public String getExistingClientPrimaryPaymentMethodId() {
        return existingClientPrimaryPaymentMethodId;
    }

    public void setExistingClientPrimaryPaymentMethodId(String value) {
        this.existingClientPrimaryPaymentMethodId = value;
    }
            public Long getExistingBackupPaymentMethodNo() {
        return existingBackupPaymentMethodNo;
    }

    public void setExistingBackupPaymentMethodNo(Long value) {
        this.existingBackupPaymentMethodNo = value;
    }
            public String getExistingClientBackupPaymentMethodId() {
        return existingClientBackupPaymentMethodId;
    }

    public void setExistingClientBackupPaymentMethodId(String value) {
        this.existingClientBackupPaymentMethodId = value;
    }
            public String getStmtFirstName() {
        return stmtFirstName;
    }

    public void setStmtFirstName(String value) {
        this.stmtFirstName = value;
    }
            public String getStmtMi() {
        return stmtMi;
    }

    public void setStmtMi(String value) {
        this.stmtMi = value;
    }
            public String getStmtLastName() {
        return stmtLastName;
    }

    public void setStmtLastName(String value) {
        this.stmtLastName = value;
    }
            public String getStmtCompanyName() {
        return stmtCompanyName;
    }

    public void setStmtCompanyName(String value) {
        this.stmtCompanyName = value;
    }
            public String getStmtAddress1() {
        return stmtAddress1;
    }

    public void setStmtAddress1(String value) {
        this.stmtAddress1 = value;
    }
            public String getStmtAddress2() {
        return stmtAddress2;
    }

    public void setStmtAddress2(String value) {
        this.stmtAddress2 = value;
    }
            public String getStmtAddress3() {
        return stmtAddress3;
    }

    public void setStmtAddress3(String value) {
        this.stmtAddress3 = value;
    }
            public String getStmtCity() {
        return stmtCity;
    }

    public void setStmtCity(String value) {
        this.stmtCity = value;
    }
            public String getStmtLocality() {
        return stmtLocality;
    }

    public void setStmtLocality(String value) {
        this.stmtLocality = value;
    }
            public String getStmtStateProv() {
        return stmtStateProv;
    }

    public void setStmtStateProv(String value) {
        this.stmtStateProv = value;
    }
            public String getStmtCountry() {
        return stmtCountry;
    }

    public void setStmtCountry(String value) {
        this.stmtCountry = value;
    }
            public String getStmtPostalCd() {
        return stmtPostalCd;
    }

    public void setStmtPostalCd(String value) {
        this.stmtPostalCd = value;
    }
            public String getStmtPhone() {
        return stmtPhone;
    }

    public void setStmtPhone(String value) {
        this.stmtPhone = value;
    }
            public String getStmtPhoneExt() {
        return stmtPhoneExt;
    }

    public void setStmtPhoneExt(String value) {
        this.stmtPhoneExt = value;
    }
            public String getStmtCellPhone() {
        return stmtCellPhone;
    }

    public void setStmtCellPhone(String value) {
        this.stmtCellPhone = value;
    }
            public String getStmtWorkPhone() {
        return stmtWorkPhone;
    }

    public void setStmtWorkPhone(String value) {
        this.stmtWorkPhone = value;
    }
            public String getStmtWorkPhoneExt() {
        return stmtWorkPhoneExt;
    }

    public void setStmtWorkPhoneExt(String value) {
        this.stmtWorkPhoneExt = value;
    }
            public String getStmtFax() {
        return stmtFax;
    }

    public void setStmtFax(String value) {
        this.stmtFax = value;
    }
            public String getStmtEmail() {
        return stmtEmail;
    }

    public void setStmtEmail(String value) {
        this.stmtEmail = value;
    }
            public String getStmtBirthdate() {
        return stmtBirthdate;
    }

    public void setStmtBirthdate(String value) {
        this.stmtBirthdate = value;
    }
            public String getBillFirstName() {
        return billFirstName;
    }

    public void setBillFirstName(String value) {
        this.billFirstName = value;
    }
            public String getBillMiddleInitial() {
        return billMiddleInitial;
    }

    public void setBillMiddleInitial(String value) {
        this.billMiddleInitial = value;
    }
            public String getBillLastName() {
        return billLastName;
    }

    public void setBillLastName(String value) {
        this.billLastName = value;
    }
            public String getBillCompanyName() {
        return billCompanyName;
    }

    public void setBillCompanyName(String value) {
        this.billCompanyName = value;
    }
            public String getBillAddress1() {
        return billAddress1;
    }

    public void setBillAddress1(String value) {
        this.billAddress1 = value;
    }
            public String getBillAddress2() {
        return billAddress2;
    }

    public void setBillAddress2(String value) {
        this.billAddress2 = value;
    }
            public String getBillAddress3() {
        return billAddress3;
    }

    public void setBillAddress3(String value) {
        this.billAddress3 = value;
    }
            public String getBillCity() {
        return billCity;
    }

    public void setBillCity(String value) {
        this.billCity = value;
    }
            public String getBillLocality() {
        return billLocality;
    }

    public void setBillLocality(String value) {
        this.billLocality = value;
    }
            public String getBillStateProv() {
        return billStateProv;
    }

    public void setBillStateProv(String value) {
        this.billStateProv = value;
    }
            public String getBillCountry() {
        return billCountry;
    }

    public void setBillCountry(String value) {
        this.billCountry = value;
    }
            public String getBillPostalCd() {
        return billPostalCd;
    }

    public void setBillPostalCd(String value) {
        this.billPostalCd = value;
    }
            public String getBillPhone() {
        return billPhone;
    }

    public void setBillPhone(String value) {
        this.billPhone = value;
    }
            public String getBillPhoneExt() {
        return billPhoneExt;
    }

    public void setBillPhoneExt(String value) {
        this.billPhoneExt = value;
    }
            public String getBillCellPhone() {
        return billCellPhone;
    }

    public void setBillCellPhone(String value) {
        this.billCellPhone = value;
    }
            public String getBillWorkPhone() {
        return billWorkPhone;
    }

    public void setBillWorkPhone(String value) {
        this.billWorkPhone = value;
    }
            public String getBillWorkPhoneExt() {
        return billWorkPhoneExt;
    }

    public void setBillWorkPhoneExt(String value) {
        this.billWorkPhoneExt = value;
    }
            public String getBillFax() {
        return billFax;
    }

    public void setBillFax(String value) {
        this.billFax = value;
    }
            public String getBillEmail() {
        return billEmail;
    }

    public void setBillEmail(String value) {
        this.billEmail = value;
    }
            public String getBillBirthdate() {
        return billBirthdate;
    }

    public void setBillBirthdate(String value) {
        this.billBirthdate = value;
    }
            public String getPrimaryPayMethodName() {
        return primaryPayMethodName;
    }

    public void setPrimaryPayMethodName(String value) {
        this.primaryPayMethodName = value;
    }
            public String getPrimaryPayMethodCdid() {
        return primaryPayMethodCdid;
    }

    public void setPrimaryPayMethodCdid(String value) {
        this.primaryPayMethodCdid = value;
    }
            public String getPrimaryPayMethodDescription() {
        return primaryPayMethodDescription;
    }

    public void setPrimaryPayMethodDescription(String value) {
        this.primaryPayMethodDescription = value;
    }
            public Long getPrimaryPayMethodType() {
        return primaryPayMethodType;
    }

    public void setPrimaryPayMethodType(Long value) {
        this.primaryPayMethodType = value;
    }
            public String getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(String value) {
        this.ccNumber = value;
    }
            public Long getCcExpireMm() {
        return ccExpireMm;
    }

    public void setCcExpireMm(Long value) {
        this.ccExpireMm = value;
    }
            public Long getCcExpireYyyy() {
        return ccExpireYyyy;
    }

    public void setCcExpireYyyy(Long value) {
        this.ccExpireYyyy = value;
    }
            public String getBankAcctNo() {
        return bankAcctNo;
    }

    public void setBankAcctNo(String value) {
        this.bankAcctNo = value;
    }
            public String getBankRoutingNo() {
        return bankRoutingNo;
    }

    public void setBankRoutingNo(String value) {
        this.bankRoutingNo = value;
    }
            public String getCvv() {
        return cvv;
    }

    public void setCvv(String value) {
        this.cvv = value;
    }
            public String getTrackData1() {
        return trackData1;
    }

    public void setTrackData1(String value) {
        this.trackData1 = value;
    }
            public String getTrackData2() {
        return trackData2;
    }

    public void setTrackData2(String value) {
        this.trackData2 = value;
    }
            public String getBillAgreementId() {
        return billAgreementId;
    }

    public void setBillAgreementId(String value) {
        this.billAgreementId = value;
    }
            public String getIban() {
        return iban;
    }

    public void setIban(String value) {
        this.iban = value;
    }
            public Long getBankCheckDigit() {
        return bankCheckDigit;
    }

    public void setBankCheckDigit(Long value) {
        this.bankCheckDigit = value;
    }
            public String getBankSwiftCd() {
        return bankSwiftCd;
    }

    public void setBankSwiftCd(String value) {
        this.bankSwiftCd = value;
    }
            public String getBankCountryCd() {
        return bankCountryCd;
    }

    public void setBankCountryCd(String value) {
        this.bankCountryCd = value;
    }
            public String getMandateId() {
        return mandateId;
    }

    public void setMandateId(String value) {
        this.mandateId = value;
    }
            public String getBankIdCd() {
        return bankIdCd;
    }

    public void setBankIdCd(String value) {
        this.bankIdCd = value;
    }
            public String getBankBranchCd() {
        return bankBranchCd;
    }

    public void setBankBranchCd(String value) {
        this.bankBranchCd = value;
    }
            public Long getExistingDunningGroupNo() {
        return existingDunningGroupNo;
    }

    public void setExistingDunningGroupNo(Long value) {
        this.existingDunningGroupNo = value;
    }
            public String getExistingClientDefDunningGroupId() {
        return existingClientDefDunningGroupId;
    }

    public void setExistingClientDefDunningGroupId(String value) {
        this.existingClientDefDunningGroupId = value;
    }
            public String getDunningGroupName() {
        return dunningGroupName;
    }

    public void setDunningGroupName(String value) {
        this.dunningGroupName = value;
    }
            public String getDunningGroupDescription() {
        return dunningGroupDescription;
    }

    public void setDunningGroupDescription(String value) {
        this.dunningGroupDescription = value;
    }
            public String getClientDunningGroupId() {
        return clientDunningGroupId;
    }

    public void setClientDunningGroupId(String value) {
        this.clientDunningGroupId = value;
    }
            public Long getDunningProcessNo() {
        return dunningProcessNo;
    }

    public void setDunningProcessNo(Long value) {
        this.dunningProcessNo = value;
    }
            public String getClientDunningProcessId() {
        return clientDunningProcessId;
    }

    public void setClientDunningProcessId(String value) {
        this.clientDunningProcessId = value;
    }
            public String getAltStartDate() {
        return altStartDate;
    }

    public void setAltStartDate(String value) {
        this.altStartDate = value;
    }
            public Long getStatusUntilAltStart() {
        return statusUntilAltStart;
    }

    public void setStatusUntilAltStart(Long value) {
        this.statusUntilAltStart = value;
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
            public String getRetroactiveStartDate() {
        return retroactiveStartDate;
    }

    public void setRetroactiveStartDate(String value) {
        this.retroactiveStartDate = value;
    }
            public Double getBalanceForward() {
        return balanceForward;
    }

    public void setBalanceForward(Double value) {
        this.balanceForward = value;
    }
            public Long getRespLevelCd() {
        return respLevelCd;
    }

    public void setRespLevelCd(Long value) {
        this.respLevelCd = value;
    }
            public Long getParentAcctMasterPlanInstId() {
        return parentAcctMasterPlanInstId;
    }

    public void setParentAcctMasterPlanInstId(Long value) {
        this.parentAcctMasterPlanInstId = value;
    }
            public Long getParentPlanInstanceNo() {
        return parentPlanInstanceNo;
    }

    public void setParentPlanInstanceNo(Long value) {
        this.parentPlanInstanceNo = value;
    }
            public String getClientParentPlanInstanceId() {
        return clientParentPlanInstanceId;
    }

    public void setClientParentPlanInstanceId(String value) {
        this.clientParentPlanInstanceId = value;
    }
            public Long getAltRateScheduleNo() {
        return altRateScheduleNo;
    }

    public void setAltRateScheduleNo(Long value) {
        this.altRateScheduleNo = value;
    }
            public Double getPlanUnits() {
        return planUnits;
    }

    public void setPlanUnits(Double value) {
        this.planUnits = value;
    }
            public CouponCodesArray getCouponCodes() {
        return couponCodes;
    }

    public void setCouponCodes(CouponCodesArray value) {
        this.couponCodes = value;
    }
            public String getPromoCd() {
        return promoCd;
    }

    public void setPromoCd(String value) {
        this.promoCd = value;
    }
            public MpiSurchargesArray getMpiSurcharges() {
        return mpiSurcharges;
    }

    public void setMpiSurcharges(MpiSurchargesArray value) {
        this.mpiSurcharges = value;
    }
            public Long getPlanStatus() {
        return planStatus;
    }

    public void setPlanStatus(Long value) {
        this.planStatus = value;
    }
            public String getPlanInstanceDescription() {
        return planInstanceDescription;
    }

    public void setPlanInstanceDescription(String value) {
        this.planInstanceDescription = value;
    }
            public PlanInstanceFieldsArray getPlanInstanceFields() {
        return planInstanceFields;
    }

    public void setPlanInstanceFields(PlanInstanceFieldsArray value) {
        this.planInstanceFields = value;
    }
            public Long getAssignmentDirective() {
        return assignmentDirective;
    }

    public void setAssignmentDirective(Long value) {
        this.assignmentDirective = value;
    }
            public String getComments() {
        return comments;
    }

    public void setComments(String value) {
        this.comments = value;
    }
            public String getDoWrite() {
        return doWrite;
    }

    public void setDoWrite(String value) {
        this.doWrite = value;
    }
            public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
    }
            public Long getOffsetMonths() {
        return offsetMonths;
    }

    public void setOffsetMonths(Long value) {
        this.offsetMonths = value;
    }
            public String getAltProrationStartDate() {
        return altProrationStartDate;
    }

    public void setAltProrationStartDate(String value) {
        this.altProrationStartDate = value;
    }
            public Long getAutoOffsetMonthsOption() {
        return autoOffsetMonthsOption;
    }

    public void setAutoOffsetMonthsOption(Long value) {
        this.autoOffsetMonthsOption = value;
    }
            public String getAltClientAcctGroupId() {
        return altClientAcctGroupId;
    }

    public void setAltClientAcctGroupId(String value) {
        this.altClientAcctGroupId = value;
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
            public CustomRatesArray getCustomRates() {
        return customRates;
    }

    public void setCustomRates(CustomRatesArray value) {
        this.customRates = value;
    }
            public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
    }
            public Long getOffsetInterval() {
        return offsetInterval;
    }

    public void setOffsetInterval(Long value) {
        this.offsetInterval = value;
    }
            public Long getForceSuppBillDateReset() {
        return forceSuppBillDateReset;
    }

    public void setForceSuppBillDateReset(Long value) {
        this.forceSuppBillDateReset = value;
    }
            public String getClientAltRateScheduleId() {
        return clientAltRateScheduleId;
    }

    public void setClientAltRateScheduleId(String value) {
        this.clientAltRateScheduleId = value;
    }
            public Long getNsoBillImmediately() {
        return nsoBillImmediately;
    }

    public void setNsoBillImmediately(Long value) {
        this.nsoBillImmediately = value;
    }
            public NsoItemListArray getNsoItemList() {
        return nsoItemList;
    }

    public void setNsoItemList(NsoItemListArray value) {
        this.nsoItemList = value;
    }
            
}
