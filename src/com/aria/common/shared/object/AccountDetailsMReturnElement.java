package com.aria.common.shared.object;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "account_details_m_ReturnElement", propOrder = {"acctNo", "clientAcctId", "userId", "firstName", "mi", "lastName", "companyName", "address1", "address2", "address3", "city", "locality", "stateProv", "countryCd", "postalCode", "phone", "phoneExt", "cellPhone", "workPhone", "workPhoneExt", "fax", "email", "birthdate", "statusCd", "notifyMethod", "seniorAcctNo", "seniorAcctUserId", "seniorClientAcctId", "testAcctInd", "taxpayerId", "acctStartDate", "altMsgTemplateNo", "seqFuncGroupNo", "taxExemptionLevel", "clientAltMsgTemplateId", "clientCnAltMsgTemplateId", "functionalAcctGroups", "collectionAcctGroups", "acctSuppFields", "surchargeNo", "acctCurrency", "acctBalance", "addressVerificationCode", "addressMatchScore", "billingGroups", "masterPlanInstances", "consumerAcctInd"})
public class AccountDetailsMReturnElement {

    @XmlElement(name = "acct_no")
    protected Long acctNo;
    @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
    @XmlElement(name = "user_id")
    protected String userId;
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
    @XmlElement(name = "country_cd")
    protected String countryCd;
    @XmlElement(name = "postal_code")
    protected String postalCode;
    @XmlElement(name = "phone")
    protected Long phone;
    @XmlElement(name = "phone_ext")
    protected String phoneExt;
    @XmlElement(name = "cell_phone")
    protected Long cellPhone;
    @XmlElement(name = "work_phone")
    protected Long workPhone;
    @XmlElement(name = "work_phone_ext")
    protected String workPhoneExt;
    @XmlElement(name = "fax")
    protected Long fax;
    @XmlElement(name = "email")
    protected String email;
    @XmlElement(name = "birthdate")
    protected String birthdate;
    @XmlElement(name = "status_cd")
    protected String statusCd;
    @XmlElement(name = "notify_method")
    protected Long notifyMethod;
    @XmlElement(name = "senior_acct_no")
    protected Long seniorAcctNo;
    @XmlElement(name = "senior_acct_user_id")
    protected String seniorAcctUserId;
    @XmlElement(name = "senior_client_acct_id")
    protected String seniorClientAcctId;
    @XmlElement(name = "test_acct_ind")
    protected Long testAcctInd;
    @XmlElement(name = "taxpayer_id")
    protected Long taxpayerId;
    @XmlElement(name = "acct_start_date")
    protected String acctStartDate;
    @XmlElement(name = "alt_msg_template_no")
    protected Long altMsgTemplateNo;
    @XmlElement(name = "seq_func_group_no")
    protected Long seqFuncGroupNo;
    @XmlElement(name = "tax_exemption_level")
    protected Long taxExemptionLevel;
    @XmlElement(name = "client_alt_msg_template_id")
    protected String clientAltMsgTemplateId;
    @XmlElement(name = "client_cn_alt_msg_template_id")
    protected String clientCnAltMsgTemplateId;
    @XmlElement(name = "functional_acct_groups")
    protected List<FunctionalAcctGroupsReturnElement> functionalAcctGroups;
    @XmlElement(name = "collection_acct_groups")
    protected List<CollectionAcctGroupsReturnElement> collectionAcctGroups;
    @XmlElement(name = "acct_supp_fields")
    protected List<AcctSuppFieldsReturnElement> acctSuppFields;
    @XmlElement(name = "surcharge_no")
    protected List<SurchargeNoReturnElement> surchargeNo;
    @XmlElement(name = "acct_currency")
    protected String acctCurrency;
    @XmlElement(name = "acct_balance")
    protected String acctBalance;
    @XmlElement(name = "address_verification_code")
    protected String addressVerificationCode;
    @XmlElement(name = "address_match_score")
    protected Long addressMatchScore;
    @XmlElement(name = "billing_groups")
    protected List<BillingGroupsReturnElement> billingGroups;
    @XmlElement(name = "master_plan_instances")
    protected List<MasterPlanInstancesReturnElement> masterPlanInstances;
    @XmlElement(name = "consumer_acct_ind")
    protected String consumerAcctInd;
    
    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }

    public String getClientAcctId() {
        return clientAcctId;
    }

    public void setClientAcctId(String value) {
        this.clientAcctId = value;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String value) {
        this.userId = value;
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

    public String getCountryCd() {
        return countryCd;
    }

    public void setCountryCd(String value) {
        this.countryCd = value;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long value) {
        this.phone = value;
    }

    public String getPhoneExt() {
        return phoneExt;
    }

    public void setPhoneExt(String value) {
        this.phoneExt = value;
    }

    public Long getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(Long value) {
        this.cellPhone = value;
    }

    public Long getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(Long value) {
        this.workPhone = value;
    }

    public String getWorkPhoneExt() {
        return workPhoneExt;
    }

    public void setWorkPhoneExt(String value) {
        this.workPhoneExt = value;
    }

    public Long getFax() {
        return fax;
    }

    public void setFax(Long value) {
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

    public String getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(String value) {
        this.statusCd = value;
    }

    public Long getNotifyMethod() {
        return notifyMethod;
    }

    public void setNotifyMethod(Long value) {
        this.notifyMethod = value;
    }

    public Long getSeniorAcctNo() {
        return seniorAcctNo;
    }

    public void setSeniorAcctNo(Long value) {
        this.seniorAcctNo = value;
    }

    public String getSeniorAcctUserId() {
        return seniorAcctUserId;
    }

    public void setSeniorAcctUserId(String value) {
        this.seniorAcctUserId = value;
    }

    public String getSeniorClientAcctId() {
        return seniorClientAcctId;
    }

    public void setSeniorClientAcctId(String value) {
        this.seniorClientAcctId = value;
    }

    public Long getTestAcctInd() {
        return testAcctInd;
    }

    public void setTestAcctInd(Long value) {
        this.testAcctInd = value;
    }

    public Long getTaxpayerId() {
        return taxpayerId;
    }

    public void setTaxpayerId(Long value) {
        this.taxpayerId = value;
    }

    public String getAcctStartDate() {
        return acctStartDate;
    }

    public void setAcctStartDate(String value) {
        this.acctStartDate = value;
    }

    public Long getAltMsgTemplateNo() {
        return altMsgTemplateNo;
    }

    public void setAltMsgTemplateNo(Long value) {
        this.altMsgTemplateNo = value;
    }

    public Long getSeqFuncGroupNo() {
        return seqFuncGroupNo;
    }

    public void setSeqFuncGroupNo(Long value) {
        this.seqFuncGroupNo = value;
    }

    public Long getTaxExemptionLevel() {
        return taxExemptionLevel;
    }

    public void setTaxExemptionLevel(Long value) {
        this.taxExemptionLevel = value;
    }

    public String getClientAltMsgTemplateId() {
        return clientAltMsgTemplateId;
    }

    public void setClientAltMsgTemplateId(String value) {
        this.clientAltMsgTemplateId = value;
    }

    public String getClientCnAltMsgTemplateId() {
        return clientCnAltMsgTemplateId;
    }

    public void setClientCnAltMsgTemplateId(String value) {
        this.clientCnAltMsgTemplateId = value;
    }

    public List<FunctionalAcctGroupsReturnElement> getFunctionalAcctGroups() {
        if (this.functionalAcctGroups == null) {
            this.functionalAcctGroups = new ArrayList<FunctionalAcctGroupsReturnElement>();
        }
        return this.functionalAcctGroups;
    }public List<CollectionAcctGroupsReturnElement> getCollectionAcctGroups() {
        if (this.collectionAcctGroups == null) {
            this.collectionAcctGroups = new ArrayList<CollectionAcctGroupsReturnElement>();
        }
        return this.collectionAcctGroups;
    }public List<AcctSuppFieldsReturnElement> getAcctSuppFields() {
        if (this.acctSuppFields == null) {
            this.acctSuppFields = new ArrayList<AcctSuppFieldsReturnElement>();
        }
        return this.acctSuppFields;
    }public List<SurchargeNoReturnElement> getSurchargeNo() {
        if (this.surchargeNo == null) {
            this.surchargeNo = new ArrayList<SurchargeNoReturnElement>();
        }
        return this.surchargeNo;
    }public String getAcctCurrency() {
        return acctCurrency;
    }

    public void setAcctCurrency(String value) {
        this.acctCurrency = value;
    }

    public String getAcctBalance() {
        return acctBalance;
    }

    public void setAcctBalance(String value) {
        this.acctBalance = value;
    }

    public String getAddressVerificationCode() {
        return addressVerificationCode;
    }

    public void setAddressVerificationCode(String value) {
        this.addressVerificationCode = value;
    }

    public Long getAddressMatchScore() {
        return addressMatchScore;
    }

    public void setAddressMatchScore(Long value) {
        this.addressMatchScore = value;
    }

    public List<BillingGroupsReturnElement> getBillingGroups() {
        if (this.billingGroups == null) {
            this.billingGroups = new ArrayList<BillingGroupsReturnElement>();
        }
        return this.billingGroups;
    }public List<MasterPlanInstancesReturnElement> getMasterPlanInstances() {
        if (this.masterPlanInstances == null) {
            this.masterPlanInstances = new ArrayList<MasterPlanInstancesReturnElement>();
        }
        return this.masterPlanInstances;
    }public String getConsumerAcctInd() {
        return consumerAcctInd;
    }

    public void setConsumerAcctInd(String value) {
        this.consumerAcctInd = value;
    }

    
}
