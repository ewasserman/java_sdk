package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "backup_contacts_ReturnElement", propOrder = {"bkupFirstName", "bkupMiddleInitial", "bkupLastName", "bkupCompanyName", "bkupAddress1", "bkupAddress2", "bkupAddress3", "bkupCity", "bkupLocality", "bkupStateProv", "bkupCountry", "bkupPostalCd", "bkupPhone", "bkupPhoneExt", "bkupCellPhone", "bkupWorkPhone", "bkupWorkPhoneExt", "bkupFax", "bkupEmail", "bkupBirthdate", "bkupAddressVerificationCode", "bkupAddressMatchScore", "bkupBillingGroupNo", "bkupClientBillingGroupId"})
public class BackupContactsReturnElement {

    @XmlElement(name = "bkup_first_name")
    protected String bkupFirstName;
    @XmlElement(name = "bkup_middle_initial")
    protected String bkupMiddleInitial;
    @XmlElement(name = "bkup_last_name")
    protected String bkupLastName;
    @XmlElement(name = "bkup_company_name")
    protected String bkupCompanyName;
    @XmlElement(name = "bkup_address1")
    protected String bkupAddress1;
    @XmlElement(name = "bkup_address2")
    protected String bkupAddress2;
    @XmlElement(name = "bkup_address3")
    protected String bkupAddress3;
    @XmlElement(name = "bkup_city")
    protected String bkupCity;
    @XmlElement(name = "bkup_locality")
    protected String bkupLocality;
    @XmlElement(name = "bkup_state_prov")
    protected String bkupStateProv;
    @XmlElement(name = "bkup_country")
    protected String bkupCountry;
    @XmlElement(name = "bkup_postal_cd")
    protected String bkupPostalCd;
    @XmlElement(name = "bkup_phone")
    protected String bkupPhone;
    @XmlElement(name = "bkup_phone_ext")
    protected String bkupPhoneExt;
    @XmlElement(name = "bkup_cell_phone")
    protected String bkupCellPhone;
    @XmlElement(name = "bkup_work_phone")
    protected String bkupWorkPhone;
    @XmlElement(name = "bkup_work_phone_ext")
    protected String bkupWorkPhoneExt;
    @XmlElement(name = "bkup_fax")
    protected String bkupFax;
    @XmlElement(name = "bkup_email")
    protected String bkupEmail;
    @XmlElement(name = "bkup_birthdate")
    protected String bkupBirthdate;
    @XmlElement(name = "bkup_address_verification_code")
    protected String bkupAddressVerificationCode;
    @XmlElement(name = "bkup_address_match_score")
    protected Double bkupAddressMatchScore;
    @XmlElement(name = "bkup_billing_group_no")
    protected Long bkupBillingGroupNo;
    @XmlElement(name = "bkup_client_billing_group_id")
    protected String bkupClientBillingGroupId;
    
    public String getBkupFirstName() {
        return bkupFirstName;
    }

    public void setBkupFirstName(String value) {
        this.bkupFirstName = value;
    }

    public String getBkupMiddleInitial() {
        return bkupMiddleInitial;
    }

    public void setBkupMiddleInitial(String value) {
        this.bkupMiddleInitial = value;
    }

    public String getBkupLastName() {
        return bkupLastName;
    }

    public void setBkupLastName(String value) {
        this.bkupLastName = value;
    }

    public String getBkupCompanyName() {
        return bkupCompanyName;
    }

    public void setBkupCompanyName(String value) {
        this.bkupCompanyName = value;
    }

    public String getBkupAddress1() {
        return bkupAddress1;
    }

    public void setBkupAddress1(String value) {
        this.bkupAddress1 = value;
    }

    public String getBkupAddress2() {
        return bkupAddress2;
    }

    public void setBkupAddress2(String value) {
        this.bkupAddress2 = value;
    }

    public String getBkupAddress3() {
        return bkupAddress3;
    }

    public void setBkupAddress3(String value) {
        this.bkupAddress3 = value;
    }

    public String getBkupCity() {
        return bkupCity;
    }

    public void setBkupCity(String value) {
        this.bkupCity = value;
    }

    public String getBkupLocality() {
        return bkupLocality;
    }

    public void setBkupLocality(String value) {
        this.bkupLocality = value;
    }

    public String getBkupStateProv() {
        return bkupStateProv;
    }

    public void setBkupStateProv(String value) {
        this.bkupStateProv = value;
    }

    public String getBkupCountry() {
        return bkupCountry;
    }

    public void setBkupCountry(String value) {
        this.bkupCountry = value;
    }

    public String getBkupPostalCd() {
        return bkupPostalCd;
    }

    public void setBkupPostalCd(String value) {
        this.bkupPostalCd = value;
    }

    public String getBkupPhone() {
        return bkupPhone;
    }

    public void setBkupPhone(String value) {
        this.bkupPhone = value;
    }

    public String getBkupPhoneExt() {
        return bkupPhoneExt;
    }

    public void setBkupPhoneExt(String value) {
        this.bkupPhoneExt = value;
    }

    public String getBkupCellPhone() {
        return bkupCellPhone;
    }

    public void setBkupCellPhone(String value) {
        this.bkupCellPhone = value;
    }

    public String getBkupWorkPhone() {
        return bkupWorkPhone;
    }

    public void setBkupWorkPhone(String value) {
        this.bkupWorkPhone = value;
    }

    public String getBkupWorkPhoneExt() {
        return bkupWorkPhoneExt;
    }

    public void setBkupWorkPhoneExt(String value) {
        this.bkupWorkPhoneExt = value;
    }

    public String getBkupFax() {
        return bkupFax;
    }

    public void setBkupFax(String value) {
        this.bkupFax = value;
    }

    public String getBkupEmail() {
        return bkupEmail;
    }

    public void setBkupEmail(String value) {
        this.bkupEmail = value;
    }

    public String getBkupBirthdate() {
        return bkupBirthdate;
    }

    public void setBkupBirthdate(String value) {
        this.bkupBirthdate = value;
    }

    public String getBkupAddressVerificationCode() {
        return bkupAddressVerificationCode;
    }

    public void setBkupAddressVerificationCode(String value) {
        this.bkupAddressVerificationCode = value;
    }

    public Double getBkupAddressMatchScore() {
        return bkupAddressMatchScore;
    }

    public void setBkupAddressMatchScore(Double value) {
        this.bkupAddressMatchScore = value;
    }

    public Long getBkupBillingGroupNo() {
        return bkupBillingGroupNo;
    }

    public void setBkupBillingGroupNo(Long value) {
        this.bkupBillingGroupNo = value;
    }

    public String getBkupClientBillingGroupId() {
        return bkupClientBillingGroupId;
    }

    public void setBkupClientBillingGroupId(String value) {
        this.bkupClientBillingGroupId = value;
    }

    
}
