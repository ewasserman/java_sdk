package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statement_contacts_ReturnElement", propOrder = {"statFirstName", "statMiddleInitial", "statLastName", "statCompanyName", "statAddress1", "statAddress2", "statAddress3", "statCity", "statLocality", "statStateProv", "statCountry", "statPostalCd", "statPhone", "statPhoneExt", "statCellPhone", "statWorkPhone", "statWorkPhoneExt", "statFax", "statEmail", "statBirthdate", "statAddressVerificationCode", "statAddressMatchScore", "statBillingGroupNo", "statClientBillingGroupId"})
public class StatementContactsReturnElement {

    @XmlElement(name = "stat_first_name")
    protected String statFirstName;
    @XmlElement(name = "stat_middle_initial")
    protected String statMiddleInitial;
    @XmlElement(name = "stat_last_name")
    protected String statLastName;
    @XmlElement(name = "stat_company_name")
    protected String statCompanyName;
    @XmlElement(name = "stat_address1")
    protected String statAddress1;
    @XmlElement(name = "stat_address2")
    protected String statAddress2;
    @XmlElement(name = "stat_address3")
    protected String statAddress3;
    @XmlElement(name = "stat_city")
    protected String statCity;
    @XmlElement(name = "stat_locality")
    protected String statLocality;
    @XmlElement(name = "stat_state_prov")
    protected String statStateProv;
    @XmlElement(name = "stat_country")
    protected String statCountry;
    @XmlElement(name = "stat_postal_cd")
    protected String statPostalCd;
    @XmlElement(name = "stat_phone")
    protected String statPhone;
    @XmlElement(name = "stat_phone_ext")
    protected String statPhoneExt;
    @XmlElement(name = "stat_cell_phone")
    protected String statCellPhone;
    @XmlElement(name = "stat_work_phone")
    protected String statWorkPhone;
    @XmlElement(name = "stat_work_phone_ext")
    protected String statWorkPhoneExt;
    @XmlElement(name = "stat_fax")
    protected String statFax;
    @XmlElement(name = "stat_email")
    protected String statEmail;
    @XmlElement(name = "stat_birthdate")
    protected String statBirthdate;
    @XmlElement(name = "stat_address_verification_code")
    protected String statAddressVerificationCode;
    @XmlElement(name = "stat_address_match_score")
    protected Double statAddressMatchScore;
    @XmlElement(name = "stat_billing_group_no")
    protected Long statBillingGroupNo;
    @XmlElement(name = "stat_client_billing_group_id")
    protected String statClientBillingGroupId;
    
    public String getStatFirstName() {
        return statFirstName;
    }

    public void setStatFirstName(String value) {
        this.statFirstName = value;
    }

    public String getStatMiddleInitial() {
        return statMiddleInitial;
    }

    public void setStatMiddleInitial(String value) {
        this.statMiddleInitial = value;
    }

    public String getStatLastName() {
        return statLastName;
    }

    public void setStatLastName(String value) {
        this.statLastName = value;
    }

    public String getStatCompanyName() {
        return statCompanyName;
    }

    public void setStatCompanyName(String value) {
        this.statCompanyName = value;
    }

    public String getStatAddress1() {
        return statAddress1;
    }

    public void setStatAddress1(String value) {
        this.statAddress1 = value;
    }

    public String getStatAddress2() {
        return statAddress2;
    }

    public void setStatAddress2(String value) {
        this.statAddress2 = value;
    }

    public String getStatAddress3() {
        return statAddress3;
    }

    public void setStatAddress3(String value) {
        this.statAddress3 = value;
    }

    public String getStatCity() {
        return statCity;
    }

    public void setStatCity(String value) {
        this.statCity = value;
    }

    public String getStatLocality() {
        return statLocality;
    }

    public void setStatLocality(String value) {
        this.statLocality = value;
    }

    public String getStatStateProv() {
        return statStateProv;
    }

    public void setStatStateProv(String value) {
        this.statStateProv = value;
    }

    public String getStatCountry() {
        return statCountry;
    }

    public void setStatCountry(String value) {
        this.statCountry = value;
    }

    public String getStatPostalCd() {
        return statPostalCd;
    }

    public void setStatPostalCd(String value) {
        this.statPostalCd = value;
    }

    public String getStatPhone() {
        return statPhone;
    }

    public void setStatPhone(String value) {
        this.statPhone = value;
    }

    public String getStatPhoneExt() {
        return statPhoneExt;
    }

    public void setStatPhoneExt(String value) {
        this.statPhoneExt = value;
    }

    public String getStatCellPhone() {
        return statCellPhone;
    }

    public void setStatCellPhone(String value) {
        this.statCellPhone = value;
    }

    public String getStatWorkPhone() {
        return statWorkPhone;
    }

    public void setStatWorkPhone(String value) {
        this.statWorkPhone = value;
    }

    public String getStatWorkPhoneExt() {
        return statWorkPhoneExt;
    }

    public void setStatWorkPhoneExt(String value) {
        this.statWorkPhoneExt = value;
    }

    public String getStatFax() {
        return statFax;
    }

    public void setStatFax(String value) {
        this.statFax = value;
    }

    public String getStatEmail() {
        return statEmail;
    }

    public void setStatEmail(String value) {
        this.statEmail = value;
    }

    public String getStatBirthdate() {
        return statBirthdate;
    }

    public void setStatBirthdate(String value) {
        this.statBirthdate = value;
    }

    public String getStatAddressVerificationCode() {
        return statAddressVerificationCode;
    }

    public void setStatAddressVerificationCode(String value) {
        this.statAddressVerificationCode = value;
    }

    public Double getStatAddressMatchScore() {
        return statAddressMatchScore;
    }

    public void setStatAddressMatchScore(Double value) {
        this.statAddressMatchScore = value;
    }

    public Long getStatBillingGroupNo() {
        return statBillingGroupNo;
    }

    public void setStatBillingGroupNo(Long value) {
        this.statBillingGroupNo = value;
    }

    public String getStatClientBillingGroupId() {
        return statClientBillingGroupId;
    }

    public void setStatClientBillingGroupId(String value) {
        this.statClientBillingGroupId = value;
    }

    
}
