package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acct_row", propOrder = {
    "acct",
    "clientAcctId",
    "userid",
    "statusCd",
    "notifyMethod",
    "password",
    "secretQuestion",
    "secretQuestionAnswer",
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
    "seniorAcctNo",
    "seniorAcctUserid",
    "clientSeniorAcctId",
    "invoicingOption",
    "altStartDate",
    "altBillDay",
    "retroactiveStartDate",
    "functionalAcctGroup",
    "collectionAcctGroup",
    "suppField",
    "testAcctInd",
    "acctStartDate",
    "acctCurrency",
    "seqFuncGroupNo",
    "clientSeqFuncGroupId",
    "taxpayerId",
    "taxExemptionLevel",
    "altMsgTemplateNo",
    "cnAltMsgTemplateNo",
    "invoiceApprovalRequired",
    "createSession",
    "clientAltMsgTemplateId",
    "clientCnAltMsgTemplateId",
    "acctSurcharges",
    "couponCodes",
    "paymentMethod",
    "billingGroup",
    "dunningGroup",
    "contracts",
    "masterPlansDetail",
    "consumerAcctInd",
    "revrecProfileNo",
    "clientRevrecId"
    })
public class AcctRow {

    @XmlElement(name = "acct")
    protected com.aria.common.shared.AcctArray acct;
    @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
    @XmlElement(name = "userid")
    protected String userid;
    @XmlElement(name = "status_cd")
    protected Long statusCd;
    @XmlElement(name = "notify_method")
    protected Long notifyMethod;
    @XmlElement(name = "password")
    protected String password;
    @XmlElement(name = "secret_question")
    protected String secretQuestion;
    @XmlElement(name = "secret_question_answer")
    protected String secretQuestionAnswer;
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
    @XmlElement(name = "senior_acct_no")
    protected Long seniorAcctNo;
    @XmlElement(name = "senior_acct_userid")
    protected String seniorAcctUserid;
    @XmlElement(name = "client_senior_acct_id")
    protected String clientSeniorAcctId;
    @XmlElement(name = "invoicing_option")
    protected Long invoicingOption;
    @XmlElement(name = "alt_start_date")
    protected String altStartDate;
    @XmlElement(name = "alt_bill_day")
    protected Long altBillDay;
    @XmlElement(name = "retroactive_start_date")
    protected String retroactiveStartDate;
    @XmlElement(name = "functional_acct_group")
    protected com.aria.common.shared.FunctionalAcctGroupArray functionalAcctGroup;
    @XmlElement(name = "collection_acct_group")
    protected com.aria.common.shared.CollectionAcctGroupArray collectionAcctGroup;
    @XmlElement(name = "supp_field")
    protected com.aria.common.shared.SuppFieldArray suppField;
    @XmlElement(name = "test_acct_ind")
    protected Long testAcctInd;
    @XmlElement(name = "acct_start_date")
    protected String acctStartDate;
    @XmlElement(name = "acct_currency")
    protected String acctCurrency;
    @XmlElement(name = "seq_func_group_no")
    protected Long seqFuncGroupNo;
    @XmlElement(name = "client_seq_func_group_id")
    protected String clientSeqFuncGroupId;
    @XmlElement(name = "taxpayer_id")
    protected String taxpayerId;
    @XmlElement(name = "tax_exemption_level")
    protected Long taxExemptionLevel;
    @XmlElement(name = "alt_msg_template_no")
    protected Long altMsgTemplateNo;
    @XmlElement(name = "cn_alt_msg_template_no")
    protected Long cnAltMsgTemplateNo;
    @XmlElement(name = "invoice_approval_required")
    protected String invoiceApprovalRequired;
    @XmlElement(name = "create_session")
    protected String createSession;
    @XmlElement(name = "client_alt_msg_template_id")
    protected String clientAltMsgTemplateId;
    @XmlElement(name = "client_cn_alt_msg_template_id")
    protected Long clientCnAltMsgTemplateId;
    @XmlElement(name = "acct_surcharges")
    protected com.aria.common.shared.AcctSurchargesArray acctSurcharges;
    @XmlElement(name = "coupon_codes")
    protected com.aria.common.shared.CouponCodesArray couponCodes;
    @XmlElement(name = "payment_method")
    protected com.aria.common.shared.PaymentMethodArray paymentMethod;
    @XmlElement(name = "billing_group")
    protected com.aria.common.shared.BillingGroupArray billingGroup;
    @XmlElement(name = "dunning_group")
    protected com.aria.common.shared.DunningGroupArray dunningGroup;
    @XmlElement(name = "contracts")
    protected com.aria.common.shared.ContractsArray contracts;
    @XmlElement(name = "master_plans_detail")
    protected com.aria.common.shared.MasterPlansDetailArray masterPlansDetail;
    @XmlElement(name = "consumer_acct_ind")
    protected String consumerAcctInd;
    @XmlElement(name = "revrec_profile_no")
    protected Long revrecProfileNo;
    @XmlElement(name = "client_revrec_id")
    protected String clientRevrecId;
    public com.aria.common.shared.AcctArray getAcct() {
        return acct;
    }

    public void setAcct(com.aria.common.shared.AcctArray value) {
        this.acct = value;
    }

    public String getClientAcctId() {
        return clientAcctId;
    }

    public void setClientAcctId(String value) {
        this.clientAcctId = value;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String value) {
        this.userid = value;
    }

    public Long getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(Long value) {
        this.statusCd = value;
    }

    public Long getNotifyMethod() {
        return notifyMethod;
    }

    public void setNotifyMethod(Long value) {
        this.notifyMethod = value;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String value) {
        this.password = value;
    }

    public String getSecretQuestion() {
        return secretQuestion;
    }

    public void setSecretQuestion(String value) {
        this.secretQuestion = value;
    }

    public String getSecretQuestionAnswer() {
        return secretQuestionAnswer;
    }

    public void setSecretQuestionAnswer(String value) {
        this.secretQuestionAnswer = value;
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

    public Long getSeniorAcctNo() {
        return seniorAcctNo;
    }

    public void setSeniorAcctNo(Long value) {
        this.seniorAcctNo = value;
    }

    public String getSeniorAcctUserid() {
        return seniorAcctUserid;
    }

    public void setSeniorAcctUserid(String value) {
        this.seniorAcctUserid = value;
    }

    public String getClientSeniorAcctId() {
        return clientSeniorAcctId;
    }

    public void setClientSeniorAcctId(String value) {
        this.clientSeniorAcctId = value;
    }

    public Long getInvoicingOption() {
        return invoicingOption;
    }

    public void setInvoicingOption(Long value) {
        this.invoicingOption = value;
    }

    public String getAltStartDate() {
        return altStartDate;
    }

    public void setAltStartDate(String value) {
        this.altStartDate = value;
    }

    public Long getAltBillDay() {
        return altBillDay;
    }

    public void setAltBillDay(Long value) {
        this.altBillDay = value;
    }

    public String getRetroactiveStartDate() {
        return retroactiveStartDate;
    }

    public void setRetroactiveStartDate(String value) {
        this.retroactiveStartDate = value;
    }

    public com.aria.common.shared.FunctionalAcctGroupArray getFunctionalAcctGroup() {
        return functionalAcctGroup;
    }

    public void setFunctionalAcctGroup(com.aria.common.shared.FunctionalAcctGroupArray value) {
        this.functionalAcctGroup = value;
    }

    public com.aria.common.shared.CollectionAcctGroupArray getCollectionAcctGroup() {
        return collectionAcctGroup;
    }

    public void setCollectionAcctGroup(com.aria.common.shared.CollectionAcctGroupArray value) {
        this.collectionAcctGroup = value;
    }

    public com.aria.common.shared.SuppFieldArray getSuppField() {
        return suppField;
    }

    public void setSuppField(com.aria.common.shared.SuppFieldArray value) {
        this.suppField = value;
    }

    public Long getTestAcctInd() {
        return testAcctInd;
    }

    public void setTestAcctInd(Long value) {
        this.testAcctInd = value;
    }

    public String getAcctStartDate() {
        return acctStartDate;
    }

    public void setAcctStartDate(String value) {
        this.acctStartDate = value;
    }

    public String getAcctCurrency() {
        return acctCurrency;
    }

    public void setAcctCurrency(String value) {
        this.acctCurrency = value;
    }

    public Long getSeqFuncGroupNo() {
        return seqFuncGroupNo;
    }

    public void setSeqFuncGroupNo(Long value) {
        this.seqFuncGroupNo = value;
    }

    public String getClientSeqFuncGroupId() {
        return clientSeqFuncGroupId;
    }

    public void setClientSeqFuncGroupId(String value) {
        this.clientSeqFuncGroupId = value;
    }

    public String getTaxpayerId() {
        return taxpayerId;
    }

    public void setTaxpayerId(String value) {
        this.taxpayerId = value;
    }

    public Long getTaxExemptionLevel() {
        return taxExemptionLevel;
    }

    public void setTaxExemptionLevel(Long value) {
        this.taxExemptionLevel = value;
    }

    public Long getAltMsgTemplateNo() {
        return altMsgTemplateNo;
    }

    public void setAltMsgTemplateNo(Long value) {
        this.altMsgTemplateNo = value;
    }

    public Long getCnAltMsgTemplateNo() {
        return cnAltMsgTemplateNo;
    }

    public void setCnAltMsgTemplateNo(Long value) {
        this.cnAltMsgTemplateNo = value;
    }

    public String getInvoiceApprovalRequired() {
        return invoiceApprovalRequired;
    }

    public void setInvoiceApprovalRequired(String value) {
        this.invoiceApprovalRequired = value;
    }

    public String getCreateSession() {
        return createSession;
    }

    public void setCreateSession(String value) {
        this.createSession = value;
    }

    public String getClientAltMsgTemplateId() {
        return clientAltMsgTemplateId;
    }

    public void setClientAltMsgTemplateId(String value) {
        this.clientAltMsgTemplateId = value;
    }

    public Long getClientCnAltMsgTemplateId() {
        return clientCnAltMsgTemplateId;
    }

    public void setClientCnAltMsgTemplateId(Long value) {
        this.clientCnAltMsgTemplateId = value;
    }

    public com.aria.common.shared.AcctSurchargesArray getAcctSurcharges() {
        return acctSurcharges;
    }

    public void setAcctSurcharges(com.aria.common.shared.AcctSurchargesArray value) {
        this.acctSurcharges = value;
    }

    public com.aria.common.shared.CouponCodesArray getCouponCodes() {
        return couponCodes;
    }

    public void setCouponCodes(com.aria.common.shared.CouponCodesArray value) {
        this.couponCodes = value;
    }

    public com.aria.common.shared.PaymentMethodArray getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(com.aria.common.shared.PaymentMethodArray value) {
        this.paymentMethod = value;
    }

    public com.aria.common.shared.BillingGroupArray getBillingGroup() {
        return billingGroup;
    }

    public void setBillingGroup(com.aria.common.shared.BillingGroupArray value) {
        this.billingGroup = value;
    }

    public com.aria.common.shared.DunningGroupArray getDunningGroup() {
        return dunningGroup;
    }

    public void setDunningGroup(com.aria.common.shared.DunningGroupArray value) {
        this.dunningGroup = value;
    }

    public com.aria.common.shared.ContractsArray getContracts() {
        return contracts;
    }

    public void setContracts(com.aria.common.shared.ContractsArray value) {
        this.contracts = value;
    }

    public com.aria.common.shared.MasterPlansDetailArray getMasterPlansDetail() {
        return masterPlansDetail;
    }

    public void setMasterPlansDetail(com.aria.common.shared.MasterPlansDetailArray value) {
        this.masterPlansDetail = value;
    }

    public String getConsumerAcctInd() {
        return consumerAcctInd;
    }

    public void setConsumerAcctInd(String value) {
        this.consumerAcctInd = value;
    }

    public Long getRevrecProfileNo() {
        return revrecProfileNo;
    }

    public void setRevrecProfileNo(Long value) {
        this.revrecProfileNo = value;
    }

    public String getClientRevrecId() {
        return clientRevrecId;
    }

    public void setClientRevrecId(String value) {
        this.clientRevrecId = value;
    }

    
}
