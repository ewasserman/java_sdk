package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "accountNumber",    "firstName",    "lastName",    "middleInitial",    "companyName",    "address1",    "address2",    "city",    "locality",    "state",    "country",    "zip",    "intlPhone",    "phoneNpa",    "phoneNxx",    "phoneSuffix",    "phoneExtension",    "email",    "payMethod",    "ccNumber",    "ccExpireMm",    "ccExpireYyyy",    "bankRoutingNum",    "bankAcctNum",    "doCollect",    "changeStatusAfterColl",    "resetDatesAfterStatus",    "clientReceiptId",    "bankAcctType",    "iban",    "bankCheckDigit",    "bankSwiftCd",    "bankCountryCd",    "mandateId",    "bankIdCd",    "bankBranchCd",    "primaryOrBkupPayMethodInd",    "refBkupSeqNo"})
@XmlRootElement(name = "update_payment_method")
public class UpdatePaymentMethod {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "account_number")
    protected Long accountNumber;
        @XmlElement(name = "first_name")
    protected String firstName;
        @XmlElement(name = "last_name")
    protected String lastName;
        @XmlElement(name = "middle_initial")
    protected String middleInitial;
        @XmlElement(name = "company_name")
    protected String companyName;
        @XmlElement(name = "address1")
    protected String address1;
        @XmlElement(name = "address2")
    protected String address2;
        @XmlElement(name = "city")
    protected String city;
        @XmlElement(name = "locality")
    protected String locality;
        @XmlElement(name = "state")
    protected String state;
        @XmlElement(name = "country")
    protected String country;
        @XmlElement(name = "zip")
    protected String zip;
        @XmlElement(name = "intl_phone")
    protected String intlPhone;
        @XmlElement(name = "phone_npa")
    protected String phoneNpa;
        @XmlElement(name = "phone_nxx")
    protected String phoneNxx;
        @XmlElement(name = "phone_suffix")
    protected String phoneSuffix;
        @XmlElement(name = "phone_extension")
    protected String phoneExtension;
        @XmlElement(name = "email")
    protected String email;
        @XmlElement(name = "pay_method")
    protected String payMethod;
        @XmlElement(name = "cc_number")
    protected String ccNumber;
        @XmlElement(name = "cc_expire_mm")
    protected Long ccExpireMm;
        @XmlElement(name = "cc_expire_yyyy")
    protected Long ccExpireYyyy;
        @XmlElement(name = "bank_routing_num")
    protected String bankRoutingNum;
        @XmlElement(name = "bank_acct_num")
    protected String bankAcctNum;
        @XmlElement(name = "do_collect")
    protected String doCollect;
        @XmlElement(name = "change_status_after_coll")
    protected String changeStatusAfterColl;
        @XmlElement(name = "reset_dates_after_status")
    protected String resetDatesAfterStatus;
        @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
        @XmlElement(name = "bank_acct_type")
    protected String bankAcctType;
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
        @XmlElement(name = "primary_or_bkup_pay_method_ind")
    protected Long primaryOrBkupPayMethodInd;
        @XmlElement(name = "ref_bkup_seq_no")
    protected Long refBkupSeqNo;
    
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

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long value) {
        this.accountNumber = value;
    }
            public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }
            public String getLastName() {
        return lastName;
    }

    public void setLastName(String value) {
        this.lastName = value;
    }
            public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String value) {
        this.middleInitial = value;
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
            public String getState() {
        return state;
    }

    public void setState(String value) {
        this.state = value;
    }
            public String getCountry() {
        return country;
    }

    public void setCountry(String value) {
        this.country = value;
    }
            public String getZip() {
        return zip;
    }

    public void setZip(String value) {
        this.zip = value;
    }
            public String getIntlPhone() {
        return intlPhone;
    }

    public void setIntlPhone(String value) {
        this.intlPhone = value;
    }
            public String getPhoneNpa() {
        return phoneNpa;
    }

    public void setPhoneNpa(String value) {
        this.phoneNpa = value;
    }
            public String getPhoneNxx() {
        return phoneNxx;
    }

    public void setPhoneNxx(String value) {
        this.phoneNxx = value;
    }
            public String getPhoneSuffix() {
        return phoneSuffix;
    }

    public void setPhoneSuffix(String value) {
        this.phoneSuffix = value;
    }
            public String getPhoneExtension() {
        return phoneExtension;
    }

    public void setPhoneExtension(String value) {
        this.phoneExtension = value;
    }
            public String getEmail() {
        return email;
    }

    public void setEmail(String value) {
        this.email = value;
    }
            public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String value) {
        this.payMethod = value;
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
            public String getBankRoutingNum() {
        return bankRoutingNum;
    }

    public void setBankRoutingNum(String value) {
        this.bankRoutingNum = value;
    }
            public String getBankAcctNum() {
        return bankAcctNum;
    }

    public void setBankAcctNum(String value) {
        this.bankAcctNum = value;
    }
            public String getDoCollect() {
        return doCollect;
    }

    public void setDoCollect(String value) {
        this.doCollect = value;
    }
            public String getChangeStatusAfterColl() {
        return changeStatusAfterColl;
    }

    public void setChangeStatusAfterColl(String value) {
        this.changeStatusAfterColl = value;
    }
            public String getResetDatesAfterStatus() {
        return resetDatesAfterStatus;
    }

    public void setResetDatesAfterStatus(String value) {
        this.resetDatesAfterStatus = value;
    }
            public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
    }
            public String getBankAcctType() {
        return bankAcctType;
    }

    public void setBankAcctType(String value) {
        this.bankAcctType = value;
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
            public Long getPrimaryOrBkupPayMethodInd() {
        return primaryOrBkupPayMethodInd;
    }

    public void setPrimaryOrBkupPayMethodInd(Long value) {
        this.primaryOrBkupPayMethodInd = value;
    }
            public Long getRefBkupSeqNo() {
        return refBkupSeqNo;
    }

    public void setRefBkupSeqNo(Long value) {
        this.refBkupSeqNo = value;
    }
            
}
