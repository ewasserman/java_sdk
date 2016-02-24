package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billing_group_row", propOrder = {
    "billingGroupName",
    "billingGroupDescription",
    "clientBillingGroupId",
    "billingGroupIdx",
    "notifyMethod",
    "notifyTemplateGroup",
    "statementTemplate",
    "creditNoteTemplate",
    "primaryClientPaymentMethodId",
    "primaryPaymentMethodIdx",
    "backupClientPaymentMethodId",
    "backupPaymentMethodIdx",
    "firstName",
    "mi",
    "lastName",
    "companyName",
    "address1",
    "address2",
    "address3",
    "city",
    "locality",
    "stateProv",
    "country",
    "postalCd",
    "phone",
    "phoneExt",
    "cellPhone",
    "workPhone",
    "workPhoneExt",
    "fax",
    "email",
    "birthdate",
    "listStartMasterFile",
    "paymentTermsNo",
    "paymentTermsName"
    })
public class BillingGroupRow {

    @XmlElement(name = "billing_group_name")
    protected String billingGroupName;
    @XmlElement(name = "billing_group_description")
    protected String billingGroupDescription;
    @XmlElement(name = "client_billing_group_id")
    protected String clientBillingGroupId;
    @XmlElement(name = "billing_group_idx")
    protected Long billingGroupIdx;
    @XmlElement(name = "notify_method")
    protected Long notifyMethod;
    @XmlElement(name = "notify_template_group")
    protected Long notifyTemplateGroup;
    @XmlElement(name = "statement_template")
    protected Long statementTemplate;
    @XmlElement(name = "credit_note_template")
    protected Long creditNoteTemplate;
    @XmlElement(name = "primary_client_payment_method_id")
    protected String primaryClientPaymentMethodId;
    @XmlElement(name = "primary_payment_method_idx")
    protected Long primaryPaymentMethodIdx;
    @XmlElement(name = "backup_client_payment_method_id")
    protected String backupClientPaymentMethodId;
    @XmlElement(name = "backup_payment_method_idx")
    protected Long backupPaymentMethodIdx;
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
    @XmlElement(name = "country")
    protected String country;
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
    @XmlElement(name = "list_start_master_file")
    protected Long listStartMasterFile;
    @XmlElement(name = "payment_terms_no")
    protected Long paymentTermsNo;
    @XmlElement(name = "payment_terms_name")
    protected String paymentTermsName;
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

    public Long getBillingGroupIdx() {
        return billingGroupIdx;
    }

    public void setBillingGroupIdx(Long value) {
        this.billingGroupIdx = value;
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

    public String getPrimaryClientPaymentMethodId() {
        return primaryClientPaymentMethodId;
    }

    public void setPrimaryClientPaymentMethodId(String value) {
        this.primaryClientPaymentMethodId = value;
    }

    public Long getPrimaryPaymentMethodIdx() {
        return primaryPaymentMethodIdx;
    }

    public void setPrimaryPaymentMethodIdx(Long value) {
        this.primaryPaymentMethodIdx = value;
    }

    public String getBackupClientPaymentMethodId() {
        return backupClientPaymentMethodId;
    }

    public void setBackupClientPaymentMethodId(String value) {
        this.backupClientPaymentMethodId = value;
    }

    public Long getBackupPaymentMethodIdx() {
        return backupPaymentMethodIdx;
    }

    public void setBackupPaymentMethodIdx(Long value) {
        this.backupPaymentMethodIdx = value;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String value) {
        this.country = value;
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

    public Long getListStartMasterFile() {
        return listStartMasterFile;
    }

    public void setListStartMasterFile(Long value) {
        this.listStartMasterFile = value;
    }

    public Long getPaymentTermsNo() {
        return paymentTermsNo;
    }

    public void setPaymentTermsNo(Long value) {
        this.paymentTermsNo = value;
    }

    public String getPaymentTermsName() {
        return paymentTermsName;
    }

    public void setPaymentTermsName(String value) {
        this.paymentTermsName = value;
    }

    
}
