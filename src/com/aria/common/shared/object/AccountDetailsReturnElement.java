package com.aria.common.shared.object;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "account_details_ReturnElement", propOrder = {"acctNo", "seniorAcctNo", "userId", "password", "statusCd", "planNo", "firstName", "mi", "lastName", "address1", "address2", "city", "locality", "postalCode", "country", "phoneNpa", "phoneNxx", "phoneSuffix", "phoneExtension", "intlPhone", "altEmail", "clientAcctId", "promoCd", "respLevelCd", "payMethod", "created", "lastUpdated", "client1", "companyName", "currentBillingInfo", "planName", "stateProv", "countryEnglish", "promoName", "noProvisionInd", "billActionCd", "statusName", "acctBalance", "suppField", "billDay", "suppPlan", "invoicePostingMethodCd", "acctStartDate"})
public class AccountDetailsReturnElement {

    @XmlElement(name = "acct_no")
    protected Long acctNo;
    @XmlElement(name = "senior_acct_no")
    protected Long seniorAcctNo;
    @XmlElement(name = "user_id")
    protected String userId;
    @XmlElement(name = "password")
    protected String password;
    @XmlElement(name = "status_cd")
    protected String statusCd;
    @XmlElement(name = "plan_no")
    protected Long planNo;
    @XmlElement(name = "first_name")
    protected String firstName;
    @XmlElement(name = "mi")
    protected String mi;
    @XmlElement(name = "last_name")
    protected String lastName;
    @XmlElement(name = "address_1")
    protected String address1;
    @XmlElement(name = "address_2")
    protected String address2;
    @XmlElement(name = "city")
    protected String city;
    @XmlElement(name = "locality")
    protected String locality;
    @XmlElement(name = "postal_code")
    protected String postalCode;
    @XmlElement(name = "country")
    protected String country;
    @XmlElement(name = "phone_npa")
    protected Long phoneNpa;
    @XmlElement(name = "phone_nxx")
    protected Long phoneNxx;
    @XmlElement(name = "phone_suffix")
    protected String phoneSuffix;
    @XmlElement(name = "phone_extension")
    protected String phoneExtension;
    @XmlElement(name = "intl_phone")
    protected String intlPhone;
    @XmlElement(name = "alt_email")
    protected String altEmail;
    @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
    @XmlElement(name = "promo_cd")
    protected String promoCd;
    @XmlElement(name = "resp_level_cd")
    protected String respLevelCd;
    @XmlElement(name = "pay_method")
    protected String payMethod;
    @XmlElement(name = "created")
    protected String created;
    @XmlElement(name = "last_updated")
    protected String lastUpdated;
    @XmlElement(name = "client_1")
    protected String client1;
    @XmlElement(name = "company_name")
    protected String companyName;
    @XmlElement(name = "current_billing_info")
    protected List<CurrentBillingInfoReturnElement> currentBillingInfo;
    @XmlElement(name = "plan_name")
    protected String planName;
    @XmlElement(name = "state_prov")
    protected String stateProv;
    @XmlElement(name = "country_english")
    protected String countryEnglish;
    @XmlElement(name = "promo_name")
    protected String promoName;
    @XmlElement(name = "no_provision_ind")
    protected String noProvisionInd;
    @XmlElement(name = "bill_action_cd")
    protected String billActionCd;
    @XmlElement(name = "status_name")
    protected String statusName;
    @XmlElement(name = "acct_balance")
    protected Double acctBalance;
    @XmlElement(name = "supp_field")
    protected List<SuppFieldReturnElement> suppField;
    @XmlElement(name = "bill_day")
    protected Long billDay;
    @XmlElement(name = "supp_plan")
    protected List<SuppPlanReturnElement> suppPlan;
    @XmlElement(name = "invoice_posting_method_cd")
    protected Long invoicePostingMethodCd;
    @XmlElement(name = "acct_start_date")
    protected String acctStartDate;
    
    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }

    public Long getSeniorAcctNo() {
        return seniorAcctNo;
    }

    public void setSeniorAcctNo(Long value) {
        this.seniorAcctNo = value;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String value) {
        this.userId = value;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String value) {
        this.password = value;
    }

    public String getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(String value) {
        this.statusCd = value;
    }

    public Long getPlanNo() {
        return planNo;
    }

    public void setPlanNo(Long value) {
        this.planNo = value;
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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String value) {
        this.country = value;
    }

    public Long getPhoneNpa() {
        return phoneNpa;
    }

    public void setPhoneNpa(Long value) {
        this.phoneNpa = value;
    }

    public Long getPhoneNxx() {
        return phoneNxx;
    }

    public void setPhoneNxx(Long value) {
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

    public String getIntlPhone() {
        return intlPhone;
    }

    public void setIntlPhone(String value) {
        this.intlPhone = value;
    }

    public String getAltEmail() {
        return altEmail;
    }

    public void setAltEmail(String value) {
        this.altEmail = value;
    }

    public String getClientAcctId() {
        return clientAcctId;
    }

    public void setClientAcctId(String value) {
        this.clientAcctId = value;
    }

    public String getPromoCd() {
        return promoCd;
    }

    public void setPromoCd(String value) {
        this.promoCd = value;
    }

    public String getRespLevelCd() {
        return respLevelCd;
    }

    public void setRespLevelCd(String value) {
        this.respLevelCd = value;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String value) {
        this.payMethod = value;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String value) {
        this.created = value;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String value) {
        this.lastUpdated = value;
    }

    public String getClient1() {
        return client1;
    }

    public void setClient1(String value) {
        this.client1 = value;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String value) {
        this.companyName = value;
    }

    public List<CurrentBillingInfoReturnElement> getCurrentBillingInfo() {
        if (this.currentBillingInfo == null) {
            this.currentBillingInfo = new ArrayList<CurrentBillingInfoReturnElement>();
        }
        return this.currentBillingInfo;
    }public String getPlanName() {
        return planName;
    }

    public void setPlanName(String value) {
        this.planName = value;
    }

    public String getStateProv() {
        return stateProv;
    }

    public void setStateProv(String value) {
        this.stateProv = value;
    }

    public String getCountryEnglish() {
        return countryEnglish;
    }

    public void setCountryEnglish(String value) {
        this.countryEnglish = value;
    }

    public String getPromoName() {
        return promoName;
    }

    public void setPromoName(String value) {
        this.promoName = value;
    }

    public String getNoProvisionInd() {
        return noProvisionInd;
    }

    public void setNoProvisionInd(String value) {
        this.noProvisionInd = value;
    }

    public String getBillActionCd() {
        return billActionCd;
    }

    public void setBillActionCd(String value) {
        this.billActionCd = value;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String value) {
        this.statusName = value;
    }

    public Double getAcctBalance() {
        return acctBalance;
    }

    public void setAcctBalance(Double value) {
        this.acctBalance = value;
    }

    public List<SuppFieldReturnElement> getSuppField() {
        if (this.suppField == null) {
            this.suppField = new ArrayList<SuppFieldReturnElement>();
        }
        return this.suppField;
    }public Long getBillDay() {
        return billDay;
    }

    public void setBillDay(Long value) {
        this.billDay = value;
    }

    public List<SuppPlanReturnElement> getSuppPlan() {
        if (this.suppPlan == null) {
            this.suppPlan = new ArrayList<SuppPlanReturnElement>();
        }
        return this.suppPlan;
    }public Long getInvoicePostingMethodCd() {
        return invoicePostingMethodCd;
    }

    public void setInvoicePostingMethodCd(Long value) {
        this.invoicePostingMethodCd = value;
    }

    public String getAcctStartDate() {
        return acctStartDate;
    }

    public void setAcctStartDate(String value) {
        this.acctStartDate = value;
    }

    
}
