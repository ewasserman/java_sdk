package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acct_hierarchy_details_ReturnElement", propOrder = {"acctNo", "firstName", "mi", "lastName", "userid", "birthdate", "jobTitle", "salutation", "seniorAcctNo", "clientAcctId", "respLevelCd", "isTestAcct", "altEmail", "address1", "address2", "address3", "city", "stateProv", "locality", "postalCode", "country", "companyName", "faxPhone", "phone", "phoneExt", "cellPhone", "workPhone", "workPhoneExt", "billDay", "createdDate", "dateToExpire", "dateToSuspend", "lastArrearsBillThruDate", "lastBillDate", "lastBillThruDate", "nextBillDate", "planDate", "statusDate", "statusDegradeDate", "statusCd", "statusLabel", "masterPlanNo", "masterPlanName", "masterPlanUnits", "notifyMethod", "notifyMethodName", "password", "pin", "secretQuestion", "secretQuestionAnswer", "payMethod", "payMethodName", "currencyCd", "taxId", "listStartMasterFile", "billingEmail", "billingFirstName", "billingMiddleInitial", "billingLastName", "billingAddress1", "billingAddress2", "billingAddress3", "billingCity", "billingState", "billingLocality", "billingZip", "billingCountry", "ccSuffix", "ccExpireMm", "ccExpireYyyy", "ccId", "bankAcctSuffix", "bankRoutingNo", "billingCompanyName", "billingPhone", "billingPhoneExt", "billingCellPhone", "billingWorkPhoneExt", "balance", "acctCreateClientReceiptId", "planClientReceiptId", "statusClientReceiptId", "taxpayerId", "altMsgTemplateNo", "seqFuncGroupNo", "promoCd", "addressVerificationCode", "addressMatchScore", "billingAddressVerificationCode", "billingAddressMatchScore", "clientMasterPlanId", "clientAltMsgTemplateId", "childAcctNo", "thisAcctSuppPlans", "thisAcctSuppFields", "stmntEmailList", "stmntEmailListCc", "stmntEmailListBcc"})
public class AcctHierarchyDetailsReturnElement {

    @XmlElement(name = "acct_no")
    protected Long acctNo;
    @XmlElement(name = "first_name")
    protected String firstName;
    @XmlElement(name = "mi")
    protected String mi;
    @XmlElement(name = "last_name")
    protected String lastName;
    @XmlElement(name = "userid")
    protected String userid;
    @XmlElement(name = "birthdate")
    protected String birthdate;
    @XmlElement(name = "job_title")
    protected String jobTitle;
    @XmlElement(name = "salutation")
    protected String salutation;
    @XmlElement(name = "senior_acct_no")
    protected Long seniorAcctNo;
    @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
    @XmlElement(name = "resp_level_cd")
    protected Long respLevelCd;
    @XmlElement(name = "is_test_acct")
    protected Long isTestAcct;
    @XmlElement(name = "alt_email")
    protected String altEmail;
    @XmlElement(name = "address1")
    protected String address1;
    @XmlElement(name = "address2")
    protected String address2;
    @XmlElement(name = "address3")
    protected String address3;
    @XmlElement(name = "city")
    protected String city;
    @XmlElement(name = "state_prov")
    protected String stateProv;
    @XmlElement(name = "locality")
    protected String locality;
    @XmlElement(name = "postal_code")
    protected String postalCode;
    @XmlElement(name = "country")
    protected String country;
    @XmlElement(name = "company_name")
    protected String companyName;
    @XmlElement(name = "fax_phone")
    protected String faxPhone;
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
    @XmlElement(name = "bill_day")
    protected Long billDay;
    @XmlElement(name = "created_date")
    protected String createdDate;
    @XmlElement(name = "date_to_expire")
    protected String dateToExpire;
    @XmlElement(name = "date_to_suspend")
    protected String dateToSuspend;
    @XmlElement(name = "last_arrears_bill_thru_date")
    protected String lastArrearsBillThruDate;
    @XmlElement(name = "last_bill_date")
    protected String lastBillDate;
    @XmlElement(name = "last_bill_thru_date")
    protected String lastBillThruDate;
    @XmlElement(name = "next_bill_date")
    protected String nextBillDate;
    @XmlElement(name = "plan_date")
    protected String planDate;
    @XmlElement(name = "status_date")
    protected String statusDate;
    @XmlElement(name = "status_degrade_date")
    protected String statusDegradeDate;
    @XmlElement(name = "status_cd")
    protected Long statusCd;
    @XmlElement(name = "status_label")
    protected String statusLabel;
    @XmlElement(name = "master_plan_no")
    protected Long masterPlanNo;
    @XmlElement(name = "master_plan_name")
    protected String masterPlanName;
    @XmlElement(name = "master_plan_units")
    protected Long masterPlanUnits;
    @XmlElement(name = "notify_method")
    protected Long notifyMethod;
    @XmlElement(name = "notify_method_name")
    protected String notifyMethodName;
    @XmlElement(name = "password")
    protected String password;
    @XmlElement(name = "pin")
    protected String pin;
    @XmlElement(name = "secret_question")
    protected String secretQuestion;
    @XmlElement(name = "secret_question_answer")
    protected String secretQuestionAnswer;
    @XmlElement(name = "pay_method")
    protected Long payMethod;
    @XmlElement(name = "pay_method_name")
    protected String payMethodName;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "tax_id")
    protected String taxId;
    @XmlElement(name = "list_start_master_file")
    protected Long listStartMasterFile;
    @XmlElement(name = "billing_email")
    protected String billingEmail;
    @XmlElement(name = "billing_first_name")
    protected String billingFirstName;
    @XmlElement(name = "billing_middle_initial")
    protected String billingMiddleInitial;
    @XmlElement(name = "billing_last_name")
    protected String billingLastName;
    @XmlElement(name = "billing_address1")
    protected String billingAddress1;
    @XmlElement(name = "billing_address2")
    protected String billingAddress2;
    @XmlElement(name = "billing_address3")
    protected String billingAddress3;
    @XmlElement(name = "billing_city")
    protected String billingCity;
    @XmlElement(name = "billing_state")
    protected String billingState;
    @XmlElement(name = "billing_locality")
    protected String billingLocality;
    @XmlElement(name = "billing_zip")
    protected String billingZip;
    @XmlElement(name = "billing_country")
    protected String billingCountry;
    @XmlElement(name = "cc_suffix")
    protected String ccSuffix;
    @XmlElement(name = "cc_expire_mm")
    protected String ccExpireMm;
    @XmlElement(name = "cc_expire_yyyy")
    protected String ccExpireYyyy;
    @XmlElement(name = "cc_id")
    protected Long ccId;
    @XmlElement(name = "bank_acct_suffix")
    protected String bankAcctSuffix;
    @XmlElement(name = "bank_routing_no")
    protected String bankRoutingNo;
    @XmlElement(name = "billing_company_name")
    protected String billingCompanyName;
    @XmlElement(name = "billing_phone")
    protected String billingPhone;
    @XmlElement(name = "billing_phone_ext")
    protected String billingPhoneExt;
    @XmlElement(name = "billing_cell_phone")
    protected String billingCellPhone;
    @XmlElement(name = "billing_work_phone_ext")
    protected String billingWorkPhoneExt;
    @XmlElement(name = "balance")
    protected Double balance;
    @XmlElement(name = "acct_create_client_receipt_id")
    protected String acctCreateClientReceiptId;
    @XmlElement(name = "plan_client_receipt_id")
    protected String planClientReceiptId;
    @XmlElement(name = "status_client_receipt_id")
    protected String statusClientReceiptId;
    @XmlElement(name = "taxpayer_id")
    protected String taxpayerId;
    @XmlElement(name = "alt_msg_template_no")
    protected Long altMsgTemplateNo;
    @XmlElement(name = "seq_func_group_no")
    protected Long seqFuncGroupNo;
    @XmlElement(name = "promo_cd")
    protected String promoCd;
    @XmlElement(name = "address_verification_code")
    protected String addressVerificationCode;
    @XmlElement(name = "address_match_score")
    protected Double addressMatchScore;
    @XmlElement(name = "billing_address_verification_code")
    protected String billingAddressVerificationCode;
    @XmlElement(name = "billing_address_match_score")
    protected Double billingAddressMatchScore;
    @XmlElement(name = "client_master_plan_id")
    protected String clientMasterPlanId;
    @XmlElement(name = "client_alt_msg_template_id")
    protected String clientAltMsgTemplateId;
    @XmlElement(name = "child_acct_no")
    protected List<ChildAcctNoReturnElement> childAcctNo;
    @XmlElement(name = "this_acct_supp_plans")
    protected List<ThisAcctSuppPlansReturnElement> thisAcctSuppPlans;
    @XmlElement(name = "this_acct_supp_fields")
    protected List<ThisAcctSuppFieldsReturnElement> thisAcctSuppFields;
    @XmlElement(name = "stmnt_email_list")
    protected String stmntEmailList;
    @XmlElement(name = "stmnt_email_list_cc")
    protected String stmntEmailListCc;
    @XmlElement(name = "stmnt_email_list_bcc")
    protected String stmntEmailListBcc;
    
    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String value) {
        this.userid = value;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String value) {
        this.birthdate = value;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String value) {
        this.salutation = value;
    }

    public Long getSeniorAcctNo() {
        return seniorAcctNo;
    }

    public void setSeniorAcctNo(Long value) {
        this.seniorAcctNo = value;
    }

    public String getClientAcctId() {
        return clientAcctId;
    }

    public void setClientAcctId(String value) {
        this.clientAcctId = value;
    }

    public Long getRespLevelCd() {
        return respLevelCd;
    }

    public void setRespLevelCd(Long value) {
        this.respLevelCd = value;
    }

    public Long getIsTestAcct() {
        return isTestAcct;
    }

    public void setIsTestAcct(Long value) {
        this.isTestAcct = value;
    }

    public String getAltEmail() {
        return altEmail;
    }

    public void setAltEmail(String value) {
        this.altEmail = value;
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

    public String getStateProv() {
        return stateProv;
    }

    public void setStateProv(String value) {
        this.stateProv = value;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String value) {
        this.companyName = value;
    }

    public String getFaxPhone() {
        return faxPhone;
    }

    public void setFaxPhone(String value) {
        this.faxPhone = value;
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

    public Long getBillDay() {
        return billDay;
    }

    public void setBillDay(Long value) {
        this.billDay = value;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String value) {
        this.createdDate = value;
    }

    public String getDateToExpire() {
        return dateToExpire;
    }

    public void setDateToExpire(String value) {
        this.dateToExpire = value;
    }

    public String getDateToSuspend() {
        return dateToSuspend;
    }

    public void setDateToSuspend(String value) {
        this.dateToSuspend = value;
    }

    public String getLastArrearsBillThruDate() {
        return lastArrearsBillThruDate;
    }

    public void setLastArrearsBillThruDate(String value) {
        this.lastArrearsBillThruDate = value;
    }

    public String getLastBillDate() {
        return lastBillDate;
    }

    public void setLastBillDate(String value) {
        this.lastBillDate = value;
    }

    public String getLastBillThruDate() {
        return lastBillThruDate;
    }

    public void setLastBillThruDate(String value) {
        this.lastBillThruDate = value;
    }

    public String getNextBillDate() {
        return nextBillDate;
    }

    public void setNextBillDate(String value) {
        this.nextBillDate = value;
    }

    public String getPlanDate() {
        return planDate;
    }

    public void setPlanDate(String value) {
        this.planDate = value;
    }

    public String getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(String value) {
        this.statusDate = value;
    }

    public String getStatusDegradeDate() {
        return statusDegradeDate;
    }

    public void setStatusDegradeDate(String value) {
        this.statusDegradeDate = value;
    }

    public Long getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(Long value) {
        this.statusCd = value;
    }

    public String getStatusLabel() {
        return statusLabel;
    }

    public void setStatusLabel(String value) {
        this.statusLabel = value;
    }

    public Long getMasterPlanNo() {
        return masterPlanNo;
    }

    public void setMasterPlanNo(Long value) {
        this.masterPlanNo = value;
    }

    public String getMasterPlanName() {
        return masterPlanName;
    }

    public void setMasterPlanName(String value) {
        this.masterPlanName = value;
    }

    public Long getMasterPlanUnits() {
        return masterPlanUnits;
    }

    public void setMasterPlanUnits(Long value) {
        this.masterPlanUnits = value;
    }

    public Long getNotifyMethod() {
        return notifyMethod;
    }

    public void setNotifyMethod(Long value) {
        this.notifyMethod = value;
    }

    public String getNotifyMethodName() {
        return notifyMethodName;
    }

    public void setNotifyMethodName(String value) {
        this.notifyMethodName = value;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String value) {
        this.password = value;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String value) {
        this.pin = value;
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

    public Long getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Long value) {
        this.payMethod = value;
    }

    public String getPayMethodName() {
        return payMethodName;
    }

    public void setPayMethodName(String value) {
        this.payMethodName = value;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String value) {
        this.taxId = value;
    }

    public Long getListStartMasterFile() {
        return listStartMasterFile;
    }

    public void setListStartMasterFile(Long value) {
        this.listStartMasterFile = value;
    }

    public String getBillingEmail() {
        return billingEmail;
    }

    public void setBillingEmail(String value) {
        this.billingEmail = value;
    }

    public String getBillingFirstName() {
        return billingFirstName;
    }

    public void setBillingFirstName(String value) {
        this.billingFirstName = value;
    }

    public String getBillingMiddleInitial() {
        return billingMiddleInitial;
    }

    public void setBillingMiddleInitial(String value) {
        this.billingMiddleInitial = value;
    }

    public String getBillingLastName() {
        return billingLastName;
    }

    public void setBillingLastName(String value) {
        this.billingLastName = value;
    }

    public String getBillingAddress1() {
        return billingAddress1;
    }

    public void setBillingAddress1(String value) {
        this.billingAddress1 = value;
    }

    public String getBillingAddress2() {
        return billingAddress2;
    }

    public void setBillingAddress2(String value) {
        this.billingAddress2 = value;
    }

    public String getBillingAddress3() {
        return billingAddress3;
    }

    public void setBillingAddress3(String value) {
        this.billingAddress3 = value;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String value) {
        this.billingCity = value;
    }

    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String value) {
        this.billingState = value;
    }

    public String getBillingLocality() {
        return billingLocality;
    }

    public void setBillingLocality(String value) {
        this.billingLocality = value;
    }

    public String getBillingZip() {
        return billingZip;
    }

    public void setBillingZip(String value) {
        this.billingZip = value;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String value) {
        this.billingCountry = value;
    }

    public String getCcSuffix() {
        return ccSuffix;
    }

    public void setCcSuffix(String value) {
        this.ccSuffix = value;
    }

    public String getCcExpireMm() {
        return ccExpireMm;
    }

    public void setCcExpireMm(String value) {
        this.ccExpireMm = value;
    }

    public String getCcExpireYyyy() {
        return ccExpireYyyy;
    }

    public void setCcExpireYyyy(String value) {
        this.ccExpireYyyy = value;
    }

    public Long getCcId() {
        return ccId;
    }

    public void setCcId(Long value) {
        this.ccId = value;
    }

    public String getBankAcctSuffix() {
        return bankAcctSuffix;
    }

    public void setBankAcctSuffix(String value) {
        this.bankAcctSuffix = value;
    }

    public String getBankRoutingNo() {
        return bankRoutingNo;
    }

    public void setBankRoutingNo(String value) {
        this.bankRoutingNo = value;
    }

    public String getBillingCompanyName() {
        return billingCompanyName;
    }

    public void setBillingCompanyName(String value) {
        this.billingCompanyName = value;
    }

    public String getBillingPhone() {
        return billingPhone;
    }

    public void setBillingPhone(String value) {
        this.billingPhone = value;
    }

    public String getBillingPhoneExt() {
        return billingPhoneExt;
    }

    public void setBillingPhoneExt(String value) {
        this.billingPhoneExt = value;
    }

    public String getBillingCellPhone() {
        return billingCellPhone;
    }

    public void setBillingCellPhone(String value) {
        this.billingCellPhone = value;
    }

    public String getBillingWorkPhoneExt() {
        return billingWorkPhoneExt;
    }

    public void setBillingWorkPhoneExt(String value) {
        this.billingWorkPhoneExt = value;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double value) {
        this.balance = value;
    }

    public String getAcctCreateClientReceiptId() {
        return acctCreateClientReceiptId;
    }

    public void setAcctCreateClientReceiptId(String value) {
        this.acctCreateClientReceiptId = value;
    }

    public String getPlanClientReceiptId() {
        return planClientReceiptId;
    }

    public void setPlanClientReceiptId(String value) {
        this.planClientReceiptId = value;
    }

    public String getStatusClientReceiptId() {
        return statusClientReceiptId;
    }

    public void setStatusClientReceiptId(String value) {
        this.statusClientReceiptId = value;
    }

    public String getTaxpayerId() {
        return taxpayerId;
    }

    public void setTaxpayerId(String value) {
        this.taxpayerId = value;
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

    public String getPromoCd() {
        return promoCd;
    }

    public void setPromoCd(String value) {
        this.promoCd = value;
    }

    public String getAddressVerificationCode() {
        return addressVerificationCode;
    }

    public void setAddressVerificationCode(String value) {
        this.addressVerificationCode = value;
    }

    public Double getAddressMatchScore() {
        return addressMatchScore;
    }

    public void setAddressMatchScore(Double value) {
        this.addressMatchScore = value;
    }

    public String getBillingAddressVerificationCode() {
        return billingAddressVerificationCode;
    }

    public void setBillingAddressVerificationCode(String value) {
        this.billingAddressVerificationCode = value;
    }

    public Double getBillingAddressMatchScore() {
        return billingAddressMatchScore;
    }

    public void setBillingAddressMatchScore(Double value) {
        this.billingAddressMatchScore = value;
    }

    public String getClientMasterPlanId() {
        return clientMasterPlanId;
    }

    public void setClientMasterPlanId(String value) {
        this.clientMasterPlanId = value;
    }

    public String getClientAltMsgTemplateId() {
        return clientAltMsgTemplateId;
    }

    public void setClientAltMsgTemplateId(String value) {
        this.clientAltMsgTemplateId = value;
    }

    public List<ChildAcctNoReturnElement> getChildAcctNo() {
        if (this.childAcctNo == null) {
            this.childAcctNo = new ArrayList<ChildAcctNoReturnElement>();
        }
        return this.childAcctNo;
    }public List<ThisAcctSuppPlansReturnElement> getThisAcctSuppPlans() {
        if (this.thisAcctSuppPlans == null) {
            this.thisAcctSuppPlans = new ArrayList<ThisAcctSuppPlansReturnElement>();
        }
        return this.thisAcctSuppPlans;
    }public List<ThisAcctSuppFieldsReturnElement> getThisAcctSuppFields() {
        if (this.thisAcctSuppFields == null) {
            this.thisAcctSuppFields = new ArrayList<ThisAcctSuppFieldsReturnElement>();
        }
        return this.thisAcctSuppFields;
    }public String getStmntEmailList() {
        return stmntEmailList;
    }

    public void setStmntEmailList(String value) {
        this.stmntEmailList = value;
    }

    public String getStmntEmailListCc() {
        return stmntEmailListCc;
    }

    public void setStmntEmailListCc(String value) {
        this.stmntEmailListCc = value;
    }

    public String getStmntEmailListBcc() {
        return stmntEmailListBcc;
    }

    public void setStmntEmailListBcc(String value) {
        this.stmntEmailListBcc = value;
    }

    
}
