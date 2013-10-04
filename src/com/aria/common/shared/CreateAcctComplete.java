package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey","masterPlanNo","altStartDate","clientAcctId","userid","statusCd","masterPlanUnits","suppPlans","suppPlanUnits","notifyMethod","promoCd","password","secretQuestion","secretQuestionAnswer","firstName","mi","lastName","companyName","address1","address2","city","locality","stateProv","country","postalCd","phone","phoneExt","cellPhone","workPhone","workPhoneExt","email","birthdate","billFirstName","billMi","billLastName","billCompanyName","billAddress1","billAddress2","billCity","billLocality","billStateProv","billCountry","billPostalCd","billPhone","billPhoneExt","billCellPhone","billWorkPhone","billWorkPhoneExt","billEmail","payMethod","ccNumber","ccExpireMm","ccExpireYyyy","bankAcctNo","bankRoutingNo","respLevelCd","seniorAcctNo","functionalAcctGroups","collectionsAcctGroups","suppFieldNames","suppFieldValues","testAcctInd","statusUntilAltStart","balanceForward","altBillDay","doFullInvoicing","doProratedInvoicing","masterPlanAltRateSchedNo","suppPlanAltRateSchedNo","clientReceiptId","currencyCd","cvv","taxpayerId","billAgreementId","retroactiveStartDate","couponCodes","newAcctCustomRates","altMsgTemplateNo","seqFuncGroupNo","newAcctPlanContracts","address3","billAddress3","usageAccumulationConfig","enableUsagePoolingPlanNo","clientFuncAcctGroupIds","clientCollAcctGroupIds","trackData1","trackData2","doWrite","taxExemptionLevel","cnAltMsgTemplateNo"})
@XmlRootElement(name = "create_acct_complete")
public class CreateAcctComplete {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
    @XmlElement(name = "master_plan_no")
    protected Long masterPlanNo;
    @XmlElement(name = "alt_start_date")
    protected String altStartDate;
    @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
    @XmlElement(name = "userid")
    protected String userid;
    @XmlElement(name = "status_cd")
    protected Long statusCd;
    @XmlElement(name = "master_plan_units")
    protected Long masterPlanUnits;
    @XmlElement(name = "supp_plans")
    protected SuppPlansArray suppPlans;
    @XmlElement(name = "supp_plan_units")
    protected SuppPlanUnitsArray suppPlanUnits;
    @XmlElement(name = "notify_method")
    protected Long notifyMethod;
    @XmlElement(name = "promo_cd")
    protected String promoCd;
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
    @XmlElement(name = "email")
    protected String email;
    @XmlElement(name = "birthdate")
    protected String birthdate;
    @XmlElement(name = "bill_first_name")
    protected String billFirstName;
    @XmlElement(name = "bill_mi")
    protected String billMi;
    @XmlElement(name = "bill_last_name")
    protected String billLastName;
    @XmlElement(name = "bill_company_name")
    protected String billCompanyName;
    @XmlElement(name = "bill_address1")
    protected String billAddress1;
    @XmlElement(name = "bill_address2")
    protected String billAddress2;
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
    @XmlElement(name = "bill_email")
    protected String billEmail;
    @XmlElement(name = "pay_method")
    protected Long payMethod;
    @XmlElement(name = "cc_number")
    protected String ccNumber;
    @XmlElement(name = "cc_expire_mm")
    protected Long ccExpireMm;
    @XmlElement(name = "cc_expire_yyyy")
    protected Long ccExpireYyyy;
    @XmlElement(name = "bank_acct_no")
    protected String bankAcctNo;
    @XmlElement(name = "bank_routing_no")
    protected String bankRoutingNo;
    @XmlElement(name = "resp_level_cd")
    protected Long respLevelCd;
    @XmlElement(name = "senior_acct_no")
    protected Long seniorAcctNo;
    @XmlElement(name = "functional_acct_groups")
    protected FunctionalAcctGroupsArray functionalAcctGroups;
    @XmlElement(name = "collections_acct_groups")
    protected CollectionsAcctGroupsArray collectionsAcctGroups;
    @XmlElement(name = "supp_field_names")
    protected SuppFieldNamesArray suppFieldNames;
    @XmlElement(name = "supp_field_values")
    protected SuppFieldValuesArray suppFieldValues;
    @XmlElement(name = "test_acct_ind")
    protected Long testAcctInd;
    @XmlElement(name = "status_until_alt_start")
    protected Long statusUntilAltStart;
    @XmlElement(name = "balance_forward")
    protected Double balanceForward;
    @XmlElement(name = "alt_bill_day")
    protected Long altBillDay;
    @XmlElement(name = "do_full_invoicing")
    protected String doFullInvoicing;
    @XmlElement(name = "do_prorated_invoicing")
    protected String doProratedInvoicing;
    @XmlElement(name = "master_plan_alt_rate_sched_no")
    protected Long masterPlanAltRateSchedNo;
    @XmlElement(name = "supp_plan_alt_rate_sched_no")
    protected SuppPlanAltRateSchedNoArray suppPlanAltRateSchedNo;
    @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "cvv")
    protected String cvv;
    @XmlElement(name = "taxpayer_id")
    protected String taxpayerId;
    @XmlElement(name = "bill_agreement_id")
    protected String billAgreementId;
    @XmlElement(name = "retroactive_start_date")
    protected String retroactiveStartDate;
    @XmlElement(name = "coupon_codes")
    protected CouponCodesArray couponCodes;
    @XmlElement(name = "new_acct_custom_rates")
    protected NewAcctCustomRatesArray newAcctCustomRates;
    @XmlElement(name = "alt_msg_template_no")
    protected Long altMsgTemplateNo;
    @XmlElement(name = "seq_func_group_no")
    protected Long seqFuncGroupNo;
    @XmlElement(name = "new_acct_plan_contracts")
    protected NewAcctPlanContractsArray newAcctPlanContracts;
    @XmlElement(name = "address3")
    protected String address3;
    @XmlElement(name = "bill_address3")
    protected String billAddress3;
    @XmlElement(name = "usage_accumulation_config")
    protected UsageAccumulationConfigArray usageAccumulationConfig;
    @XmlElement(name = "enable_usage_pooling_plan_no")
    protected EnableUsagePoolingPlanNoArray enableUsagePoolingPlanNo;
    @XmlElement(name = "client_func_acct_group_ids")
    protected ClientFuncAcctGroupIdsArray clientFuncAcctGroupIds;
    @XmlElement(name = "client_coll_acct_group_ids")
    protected ClientCollAcctGroupIdsArray clientCollAcctGroupIds;
    @XmlElement(name = "track_data1")
    protected String trackData1;
    @XmlElement(name = "track_data2")
    protected String trackData2;
    @XmlElement(name = "do_write")
    protected String doWrite;
    @XmlElement(name = "tax_exemption_level")
    protected Long taxExemptionLevel;
    @XmlElement(name = "cn_alt_msg_template_no")
    protected Long cnAltMsgTemplateNo;
    
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

    public Long getMasterPlanNo() {
        return masterPlanNo;
    }

    public void setMasterPlanNo(Long value) {
        this.masterPlanNo = value;
    }
    
    public String getAltStartDate() {
        return altStartDate;
    }

    public void setAltStartDate(String value) {
        this.altStartDate = value;
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
    
    public Long getMasterPlanUnits() {
        return masterPlanUnits;
    }

    public void setMasterPlanUnits(Long value) {
        this.masterPlanUnits = value;
    }
    
    public SuppPlansArray getSuppPlans() {
        return suppPlans;
    }

    public void setSuppPlans(SuppPlansArray value) {
        this.suppPlans = value;
    }
    
    public SuppPlanUnitsArray getSuppPlanUnits() {
        return suppPlanUnits;
    }

    public void setSuppPlanUnits(SuppPlanUnitsArray value) {
        this.suppPlanUnits = value;
    }
    
    public Long getNotifyMethod() {
        return notifyMethod;
    }

    public void setNotifyMethod(Long value) {
        this.notifyMethod = value;
    }
    
    public String getPromoCd() {
        return promoCd;
    }

    public void setPromoCd(String value) {
        this.promoCd = value;
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
    
    public String getBillFirstName() {
        return billFirstName;
    }

    public void setBillFirstName(String value) {
        this.billFirstName = value;
    }
    
    public String getBillMi() {
        return billMi;
    }

    public void setBillMi(String value) {
        this.billMi = value;
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
    
    public String getBillEmail() {
        return billEmail;
    }

    public void setBillEmail(String value) {
        this.billEmail = value;
    }
    
    public Long getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Long value) {
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
    
    public String getBankAcctNo() {
        return bankAcctNo;
    }

    public void setBankAcctNo(String value) {
        this.bankAcctNo = value;
    }
    
    public String getBankRoutingNo() {
        return bankRoutingNo;
    }

    public void setBankRoutingNo(String value) {
        this.bankRoutingNo = value;
    }
    
    public Long getRespLevelCd() {
        return respLevelCd;
    }

    public void setRespLevelCd(Long value) {
        this.respLevelCd = value;
    }
    
    public Long getSeniorAcctNo() {
        return seniorAcctNo;
    }

    public void setSeniorAcctNo(Long value) {
        this.seniorAcctNo = value;
    }
    
    public FunctionalAcctGroupsArray getFunctionalAcctGroups() {
        return functionalAcctGroups;
    }

    public void setFunctionalAcctGroups(FunctionalAcctGroupsArray value) {
        this.functionalAcctGroups = value;
    }
    
    public CollectionsAcctGroupsArray getCollectionsAcctGroups() {
        return collectionsAcctGroups;
    }

    public void setCollectionsAcctGroups(CollectionsAcctGroupsArray value) {
        this.collectionsAcctGroups = value;
    }
    
    public SuppFieldNamesArray getSuppFieldNames() {
        return suppFieldNames;
    }

    public void setSuppFieldNames(SuppFieldNamesArray value) {
        this.suppFieldNames = value;
    }
    
    public SuppFieldValuesArray getSuppFieldValues() {
        return suppFieldValues;
    }

    public void setSuppFieldValues(SuppFieldValuesArray value) {
        this.suppFieldValues = value;
    }
    
    public Long getTestAcctInd() {
        return testAcctInd;
    }

    public void setTestAcctInd(Long value) {
        this.testAcctInd = value;
    }
    
    public Long getStatusUntilAltStart() {
        return statusUntilAltStart;
    }

    public void setStatusUntilAltStart(Long value) {
        this.statusUntilAltStart = value;
    }
    
    public Double getBalanceForward() {
        return balanceForward;
    }

    public void setBalanceForward(Double value) {
        this.balanceForward = value;
    }
    
    public Long getAltBillDay() {
        return altBillDay;
    }

    public void setAltBillDay(Long value) {
        this.altBillDay = value;
    }
    
    public String getDoFullInvoicing() {
        return doFullInvoicing;
    }

    public void setDoFullInvoicing(String value) {
        this.doFullInvoicing = value;
    }
    
    public String getDoProratedInvoicing() {
        return doProratedInvoicing;
    }

    public void setDoProratedInvoicing(String value) {
        this.doProratedInvoicing = value;
    }
    
    public Long getMasterPlanAltRateSchedNo() {
        return masterPlanAltRateSchedNo;
    }

    public void setMasterPlanAltRateSchedNo(Long value) {
        this.masterPlanAltRateSchedNo = value;
    }
    
    public SuppPlanAltRateSchedNoArray getSuppPlanAltRateSchedNo() {
        return suppPlanAltRateSchedNo;
    }

    public void setSuppPlanAltRateSchedNo(SuppPlanAltRateSchedNoArray value) {
        this.suppPlanAltRateSchedNo = value;
    }
    
    public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
    }
    
    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }
    
    public String getCvv() {
        return cvv;
    }

    public void setCvv(String value) {
        this.cvv = value;
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
    
    public String getRetroactiveStartDate() {
        return retroactiveStartDate;
    }

    public void setRetroactiveStartDate(String value) {
        this.retroactiveStartDate = value;
    }
    
    public CouponCodesArray getCouponCodes() {
        return couponCodes;
    }

    public void setCouponCodes(CouponCodesArray value) {
        this.couponCodes = value;
    }
    
    public NewAcctCustomRatesArray getNewAcctCustomRates() {
        return newAcctCustomRates;
    }

    public void setNewAcctCustomRates(NewAcctCustomRatesArray value) {
        this.newAcctCustomRates = value;
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
    
    public NewAcctPlanContractsArray getNewAcctPlanContracts() {
        return newAcctPlanContracts;
    }

    public void setNewAcctPlanContracts(NewAcctPlanContractsArray value) {
        this.newAcctPlanContracts = value;
    }
    
    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String value) {
        this.address3 = value;
    }
    
    public String getBillAddress3() {
        return billAddress3;
    }

    public void setBillAddress3(String value) {
        this.billAddress3 = value;
    }
    
    public UsageAccumulationConfigArray getUsageAccumulationConfig() {
        return usageAccumulationConfig;
    }

    public void setUsageAccumulationConfig(UsageAccumulationConfigArray value) {
        this.usageAccumulationConfig = value;
    }
    
    public EnableUsagePoolingPlanNoArray getEnableUsagePoolingPlanNo() {
        return enableUsagePoolingPlanNo;
    }

    public void setEnableUsagePoolingPlanNo(EnableUsagePoolingPlanNoArray value) {
        this.enableUsagePoolingPlanNo = value;
    }
    
    public ClientFuncAcctGroupIdsArray getClientFuncAcctGroupIds() {
        return clientFuncAcctGroupIds;
    }

    public void setClientFuncAcctGroupIds(ClientFuncAcctGroupIdsArray value) {
        this.clientFuncAcctGroupIds = value;
    }
    
    public ClientCollAcctGroupIdsArray getClientCollAcctGroupIds() {
        return clientCollAcctGroupIds;
    }

    public void setClientCollAcctGroupIds(ClientCollAcctGroupIdsArray value) {
        this.clientCollAcctGroupIds = value;
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
    
    public String getDoWrite() {
        return doWrite;
    }

    public void setDoWrite(String value) {
        this.doWrite = value;
    }
    
    public Long getTaxExemptionLevel() {
        return taxExemptionLevel;
    }

    public void setTaxExemptionLevel(Long value) {
        this.taxExemptionLevel = value;
    }
    
    public Long getCnAltMsgTemplateNo() {
        return cnAltMsgTemplateNo;
    }

    public void setCnAltMsgTemplateNo(Long value) {
        this.cnAltMsgTemplateNo = value;
    }
    
    
}