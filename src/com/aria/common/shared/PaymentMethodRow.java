package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payment_method_row", propOrder = {
    "payMethodType",
    "payMethodName",
    "payMethodDescription",
    "clientPayMethodCdid",
    "paymentMethodIdx",
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
    "ccNum",
    "ccExpireMm",
    "ccExpireYyyy",
    "bankAcctNum",
    "bankRoutingNo",
    "cvv",
    "trackData1",
    "trackData2",
    "taxpayerId",
    "billAgreementId",
    "iban",
    "bankCheckDigit",
    "bankSwiftCd",
    "bankCountryCd",
    "mandateId",
    "bankIdCd",
    "bankBranchCd"
    })
public class PaymentMethodRow {

    @XmlElement(name = "pay_method_type")
    protected Long payMethodType;
    @XmlElement(name = "pay_method_name")
    protected String payMethodName;
    @XmlElement(name = "pay_method_description")
    protected String payMethodDescription;
    @XmlElement(name = "client_pay_method_cdid")
    protected String clientPayMethodCdid;
    @XmlElement(name = "payment_method_idx")
    protected Long paymentMethodIdx;
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
    @XmlElement(name = "cc_num")
    protected String ccNum;
    @XmlElement(name = "cc_expire_mm")
    protected Long ccExpireMm;
    @XmlElement(name = "cc_expire_yyyy")
    protected Long ccExpireYyyy;
    @XmlElement(name = "bank_acct_num")
    protected String bankAcctNum;
    @XmlElement(name = "bank_routing_no")
    protected String bankRoutingNo;
    @XmlElement(name = "cvv")
    protected String cvv;
    @XmlElement(name = "track_data1")
    protected String trackData1;
    @XmlElement(name = "track_data2")
    protected String trackData2;
    @XmlElement(name = "taxpayer_id")
    protected String taxpayerId;
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
    public Long getPayMethodType() {
        return payMethodType;
    }

    public void setPayMethodType(Long value) {
        this.payMethodType = value;
    }

    public String getPayMethodName() {
        return payMethodName;
    }

    public void setPayMethodName(String value) {
        this.payMethodName = value;
    }

    public String getPayMethodDescription() {
        return payMethodDescription;
    }

    public void setPayMethodDescription(String value) {
        this.payMethodDescription = value;
    }

    public String getClientPayMethodCdid() {
        return clientPayMethodCdid;
    }

    public void setClientPayMethodCdid(String value) {
        this.clientPayMethodCdid = value;
    }

    public Long getPaymentMethodIdx() {
        return paymentMethodIdx;
    }

    public void setPaymentMethodIdx(Long value) {
        this.paymentMethodIdx = value;
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

    public String getTaxpayerId() {
        return taxpayerId;
    }

    public void setTaxpayerId(String value) {
        this.taxpayerId = value;
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

    
}
