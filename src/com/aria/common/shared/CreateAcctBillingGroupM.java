package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "billingGroupName",    "billingGroupDescription",    "clientBillingGroupId",    "notifyMethod",    "notifyTemplateGroup",    "statementTemplate",    "creditNoteTemplate",    "primaryPaymentMethodNo",    "clientPrimaryPaymentMethodId",    "backupPaymentMethodNo",    "clientBackupPaymentMethodId",    "stmtFirstName",    "stmtMi",    "stmtLastName",    "stmtCompanyName",    "stmtAddress1",    "stmtAddress2",    "stmtAddress3",    "stmtCity",    "stmtLocality",    "stmtStateProv",    "stmtCountry",    "stmtPostalCd",    "stmtPhone",    "stmtPhoneExt",    "stmtCellPhone",    "stmtWorkPhone",    "stmtWorkPhoneExt",    "stmtFax",    "stmtEmail",    "stmtBirthdate",    "billFirstName",    "billMiddleInitial",    "billLastName",    "billCompanyName",    "billAddress1",    "billAddress2",    "billAddress3",    "billCity",    "billLocality",    "billStateProv",    "billCountry",    "billPostalCd",    "billPhone",    "billPhoneExt",    "billCellPhone",    "billWorkPhone",    "billWorkPhoneExt",    "billFax",    "billEmail",    "billBirthdate",    "payMethodName",    "clientPaymentMethodId",    "payMethodDescription",    "payMethodType",    "ccNum",    "ccExpireMm",    "ccExpireYyyy",    "bankAcctNum",    "bankRoutingNum",    "cvv",    "trackData1",    "trackData2",    "billAgreementId",    "iban",    "bankCheckDigit",    "bankSwiftCd",    "bankCountryCd",    "mandateId",    "bankIdCd",    "bankBranchCd",    "masterPlansSummary",    "clientReceiptId"})
@XmlRootElement(name = "create_acct_billing_group_m")
public class CreateAcctBillingGroupM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "billing_group_name")
    protected String billingGroupName;
        @XmlElement(name = "billing_group_description")
    protected String billingGroupDescription;
        @XmlElement(name = "client_billing_group_id")
    protected String clientBillingGroupId;
        @XmlElement(name = "notify_method")
    protected Long notifyMethod;
        @XmlElement(name = "notify_template_group")
    protected Long notifyTemplateGroup;
        @XmlElement(name = "statement_template")
    protected Long statementTemplate;
        @XmlElement(name = "credit_note_template")
    protected Long creditNoteTemplate;
        @XmlElement(name = "primary_payment_method_no")
    protected Long primaryPaymentMethodNo;
        @XmlElement(name = "client_primary_payment_method_id")
    protected String clientPrimaryPaymentMethodId;
        @XmlElement(name = "backup_payment_method_no")
    protected Long backupPaymentMethodNo;
        @XmlElement(name = "client_backup_payment_method_id")
    protected String clientBackupPaymentMethodId;
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
        @XmlElement(name = "pay_method_name")
    protected String payMethodName;
        @XmlElement(name = "client_payment_method_id")
    protected String clientPaymentMethodId;
        @XmlElement(name = "pay_method_description")
    protected String payMethodDescription;
        @XmlElement(name = "pay_method_type")
    protected Long payMethodType;
        @XmlElement(name = "cc_num")
    protected String ccNum;
        @XmlElement(name = "cc_expire_mm")
    protected Long ccExpireMm;
        @XmlElement(name = "cc_expire_yyyy")
    protected Long ccExpireYyyy;
        @XmlElement(name = "bank_acct_num")
    protected String bankAcctNum;
        @XmlElement(name = "bank_routing_num")
    protected String bankRoutingNum;
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
        @XmlElement(name = "master_plans_summary")
    protected MasterPlansSummaryArray masterPlansSummary;
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
            public String getClientBillingGroupId() {
        return clientBillingGroupId;
    }

    public void setClientBillingGroupId(String value) {
        this.clientBillingGroupId = value;
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
            public Long getPrimaryPaymentMethodNo() {
        return primaryPaymentMethodNo;
    }

    public void setPrimaryPaymentMethodNo(Long value) {
        this.primaryPaymentMethodNo = value;
    }
            public String getClientPrimaryPaymentMethodId() {
        return clientPrimaryPaymentMethodId;
    }

    public void setClientPrimaryPaymentMethodId(String value) {
        this.clientPrimaryPaymentMethodId = value;
    }
            public Long getBackupPaymentMethodNo() {
        return backupPaymentMethodNo;
    }

    public void setBackupPaymentMethodNo(Long value) {
        this.backupPaymentMethodNo = value;
    }
            public String getClientBackupPaymentMethodId() {
        return clientBackupPaymentMethodId;
    }

    public void setClientBackupPaymentMethodId(String value) {
        this.clientBackupPaymentMethodId = value;
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
            public String getPayMethodName() {
        return payMethodName;
    }

    public void setPayMethodName(String value) {
        this.payMethodName = value;
    }
            public String getClientPaymentMethodId() {
        return clientPaymentMethodId;
    }

    public void setClientPaymentMethodId(String value) {
        this.clientPaymentMethodId = value;
    }
            public String getPayMethodDescription() {
        return payMethodDescription;
    }

    public void setPayMethodDescription(String value) {
        this.payMethodDescription = value;
    }
            public Long getPayMethodType() {
        return payMethodType;
    }

    public void setPayMethodType(Long value) {
        this.payMethodType = value;
    }
            public String getCcNum() {
        return ccNum;
    }

    public void setCcNum(String value) {
        this.ccNum = value;
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
            public String getBankAcctNum() {
        return bankAcctNum;
    }

    public void setBankAcctNum(String value) {
        this.bankAcctNum = value;
    }
            public String getBankRoutingNum() {
        return bankRoutingNum;
    }

    public void setBankRoutingNum(String value) {
        this.bankRoutingNum = value;
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
            public MasterPlansSummaryArray getMasterPlansSummary() {
        return masterPlansSummary;
    }

    public void setMasterPlansSummary(MasterPlansSummaryArray value) {
        this.masterPlansSummary = value;
    }
            public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
    }
            
}
