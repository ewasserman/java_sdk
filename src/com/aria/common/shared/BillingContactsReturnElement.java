package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billing_contacts_ReturnElement", propOrder = {"billFirstName", "billMiddleInitial", "billLastName", "billCompanyName", "billAddress1", "billAddress2", "billAddress3", "billCity", "billLocality", "billStateProv", "billCountry", "billPostalCd", "billPhone", "billPhoneExt", "billCellPhone", "billWorkPhone", "billWorkPhoneExt", "billFax", "billEmail", "billBirthdate", "billAddressVerificationCode", "billAddressMatchScore", "billBillingGroupNo", "billClientBillingGroupId"})
public class BillingContactsReturnElement {

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
    @XmlElement(name = "bill_address_verification_code")
    protected String billAddressVerificationCode;
    @XmlElement(name = "bill_address_match_score")
    protected Double billAddressMatchScore;
    @XmlElement(name = "bill_billing_group_no")
    protected Long billBillingGroupNo;
    @XmlElement(name = "bill_client_billing_group_id")
    protected String billClientBillingGroupId;
    
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

    public String getBillAddressVerificationCode() {
        return billAddressVerificationCode;
    }

    public void setBillAddressVerificationCode(String value) {
        this.billAddressVerificationCode = value;
    }

    public Double getBillAddressMatchScore() {
        return billAddressMatchScore;
    }

    public void setBillAddressMatchScore(Double value) {
        this.billAddressMatchScore = value;
    }

    public Long getBillBillingGroupNo() {
        return billBillingGroupNo;
    }

    public void setBillBillingGroupNo(Long value) {
        this.billBillingGroupNo = value;
    }

    public String getBillClientBillingGroupId() {
        return billClientBillingGroupId;
    }

    public void setBillClientBillingGroupId(String value) {
        this.billClientBillingGroupId = value;
    }

    
}
