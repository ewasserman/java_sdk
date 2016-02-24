package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billing_groups_ReturnElement", propOrder = {"billingGroupNo", "billingGroupName", "billingGroupDescription", "clientBillingGroupId", "notifyMethod", "notifyTemplateGroup", "statementTemplate", "creditNoteTemplate", "primaryPaymentMethodNo", "clientPrimaryPaymentMethodId", "backupPaymentMethodNo", "clientBackupPaymentMethodId", "stmtFirstName", "stmtMi", "stmtLastName", "stmtCompanyName", "stmtAddress1", "stmtAddress2", "stmtAddress3", "stmtCity", "stmtLocality", "stmtStateProv", "stmtCountry", "stmtPostalCd", "stmtPhone", "stmtPhoneExt", "stmtCellPhone", "stmtWorkPhone", "stmtWorkPhoneExt", "stmtFax", "stmtEmail", "stmtBirthdate", "listStartMasterFile", "addressVerificationCode", "addressMatchScore", "masterPlansSummary"})
public class BillingGroupsReturnElement {

    @XmlElement(name = "billing_group_no")
    protected Long billingGroupNo;
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
    @XmlElement(name = "list_start_master_file")
    protected Long listStartMasterFile;
    @XmlElement(name = "address_verification_code")
    protected String addressVerificationCode;
    @XmlElement(name = "address_match_score")
    protected Double addressMatchScore;
    @XmlElement(name = "master_plans_summary")
    protected List<MasterPlansSummaryReturnElement> masterPlansSummary;
    
    public Long getBillingGroupNo() {
        return billingGroupNo;
    }

    public void setBillingGroupNo(Long value) {
        this.billingGroupNo = value;
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

    public Long getListStartMasterFile() {
        return listStartMasterFile;
    }

    public void setListStartMasterFile(Long value) {
        this.listStartMasterFile = value;
    }

    public String getAddressVerificationCode() {
        return addressVerificationCode;
    }

    public void setAddressVerificationCode(String value) {
        this.addressVerificationCode = value;
    }

    public Double getAddressMatchScore() {
        return addressMatchScore;
    }

    public void setAddressMatchScore(Double value) {
        this.addressMatchScore = value;
    }

    public List<MasterPlansSummaryReturnElement> getMasterPlansSummary() {
        if (this.masterPlansSummary == null) {
            this.masterPlansSummary = new ArrayList<MasterPlansSummaryReturnElement>();
        }
        return this.masterPlansSummary;
    }
}
