package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"acctNo", "clientAcctId", "userid", "firstName", "middleInitial", "lastName", "companyName", "address1", "address2", "address3", "city", "locality", "stateProv", "countryCd", "postalCd", "phone", "phoneExt", "cellPhone", "workPhone", "workPhoneExt", "fax", "email", "birthdate", "statusCd", "notifyMethod", "seniorAcctNo", "seniorAcctUserId", "seniorClientAcctId", "testAcctInd", "taxpayerId", "acctStartDate", "altMsgTemplateNo", "seqFuncGroupNo", "taxExemptionLevel", "listStartMasterFile", "clientAltMsgTemplateId", "clientCnAltMsgTemplateId", "revrecProfileNo", "clientRevrecId", "invoiceApprovalRequired", "functionalAcctGroup", "collectionAcctGroup", "suppField", "acctSurchargesInfo", "acctCurrency", "acctBalance", "addressVerificationCode", "addressMatchScore", "acctCreateClientReceiptId", "statusClientReceiptId", "acctCoupons", "poNum", "billingGroupsInfo", "paymentMethodsInfo", "masterPlansInfo", "consumerAcctInd", "errorCode", "errorMsg"})
@XmlRootElement(name = "get_acct_details_all_mResponseElement")
public class GetAcctDetailsAllMResponseElement {

    @XmlElement(name = "acct_no")
    protected Long acctNo;
    @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
    @XmlElement(name = "userid")
    protected String userid;
    @XmlElement(name = "first_name")
    protected String firstName;
    @XmlElement(name = "middle_initial")
    protected String middleInitial;
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
    @XmlElement(name = "status_cd")
    protected Long statusCd;
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
    protected String taxpayerId;
    @XmlElement(name = "acct_start_date")
    protected String acctStartDate;
    @XmlElement(name = "alt_msg_template_no")
    protected Long altMsgTemplateNo;
    @XmlElement(name = "seq_func_group_no")
    protected Long seqFuncGroupNo;
    @XmlElement(name = "tax_exemption_level")
    protected Long taxExemptionLevel;
    @XmlElement(name = "list_start_master_file")
    protected Long listStartMasterFile;
    @XmlElement(name = "client_alt_msg_template_id")
    protected String clientAltMsgTemplateId;
    @XmlElement(name = "client_cn_alt_msg_template_id")
    protected String clientCnAltMsgTemplateId;
    @XmlElement(name = "revrec_profile_no")
    protected Long revrecProfileNo;
    @XmlElement(name = "client_revrec_id")
    protected String clientRevrecId;
    @XmlElement(name = "invoice_approval_required")
    protected Long invoiceApprovalRequired;
    @XmlElement(name = "functional_acct_group")
    protected List<FunctionalAcctGroupReturnElement> functionalAcctGroup;
    @XmlElement(name = "collection_acct_group")
    protected List<CollectionAcctGroupReturnElement> collectionAcctGroup;
    @XmlElement(name = "supp_field")
    protected List<SuppFieldReturnElement> suppField;
    @XmlElement(name = "acct_surcharges_info")
    protected List<AcctSurchargesInfoReturnElement> acctSurchargesInfo;
    @XmlElement(name = "acct_currency")
    protected String acctCurrency;
    @XmlElement(name = "acct_balance")
    protected Double acctBalance;
    @XmlElement(name = "address_verification_code")
    protected String addressVerificationCode;
    @XmlElement(name = "address_match_score")
    protected Double addressMatchScore;
    @XmlElement(name = "acct_create_client_receipt_id")
    protected String acctCreateClientReceiptId;
    @XmlElement(name = "status_client_receipt_id")
    protected String statusClientReceiptId;
    @XmlElement(name = "acct_coupons")
    protected List<AcctCouponsReturnElement> acctCoupons;
    @XmlElement(name = "po_num")
    protected String poNum;
    @XmlElement(name = "billing_groups_info")
    protected List<BillingGroupsInfoReturnElement> billingGroupsInfo;
    @XmlElement(name = "payment_methods_info")
    protected List<PaymentMethodsInfoReturnElement> paymentMethodsInfo;
    @XmlElement(name = "master_plans_info")
    protected List<MasterPlansInfoReturnElement> masterPlansInfo;
    @XmlElement(name = "consumer_acct_ind")
    protected Long consumerAcctInd;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String value) {
        this.userid = value;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String value) {
        this.middleInitial = value;
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

    public String getTaxpayerId() {
        return taxpayerId;
    }

    public void setTaxpayerId(String value) {
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

    public Long getListStartMasterFile() {
        return listStartMasterFile;
    }

    public void setListStartMasterFile(Long value) {
        this.listStartMasterFile = value;
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

    public Long getInvoiceApprovalRequired() {
        return invoiceApprovalRequired;
    }

    public void setInvoiceApprovalRequired(Long value) {
        this.invoiceApprovalRequired = value;
    }

    public List<FunctionalAcctGroupReturnElement> getFunctionalAcctGroup() {
        if (this.functionalAcctGroup == null) {
            this.functionalAcctGroup = new ArrayList<FunctionalAcctGroupReturnElement>();
        }
        return this.functionalAcctGroup;
    }public List<CollectionAcctGroupReturnElement> getCollectionAcctGroup() {
        if (this.collectionAcctGroup == null) {
            this.collectionAcctGroup = new ArrayList<CollectionAcctGroupReturnElement>();
        }
        return this.collectionAcctGroup;
    }public List<SuppFieldReturnElement> getSuppField() {
        if (this.suppField == null) {
            this.suppField = new ArrayList<SuppFieldReturnElement>();
        }
        return this.suppField;
    }public List<AcctSurchargesInfoReturnElement> getAcctSurchargesInfo() {
        if (this.acctSurchargesInfo == null) {
            this.acctSurchargesInfo = new ArrayList<AcctSurchargesInfoReturnElement>();
        }
        return this.acctSurchargesInfo;
    }public String getAcctCurrency() {
        return acctCurrency;
    }

    public void setAcctCurrency(String value) {
        this.acctCurrency = value;
    }

    public Double getAcctBalance() {
        return acctBalance;
    }

    public void setAcctBalance(Double value) {
        this.acctBalance = value;
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

    public String getAcctCreateClientReceiptId() {
        return acctCreateClientReceiptId;
    }

    public void setAcctCreateClientReceiptId(String value) {
        this.acctCreateClientReceiptId = value;
    }

    public String getStatusClientReceiptId() {
        return statusClientReceiptId;
    }

    public void setStatusClientReceiptId(String value) {
        this.statusClientReceiptId = value;
    }

    public List<AcctCouponsReturnElement> getAcctCoupons() {
        if (this.acctCoupons == null) {
            this.acctCoupons = new ArrayList<AcctCouponsReturnElement>();
        }
        return this.acctCoupons;
    }public String getPoNum() {
        return poNum;
    }

    public void setPoNum(String value) {
        this.poNum = value;
    }

    public List<BillingGroupsInfoReturnElement> getBillingGroupsInfo() {
        if (this.billingGroupsInfo == null) {
            this.billingGroupsInfo = new ArrayList<BillingGroupsInfoReturnElement>();
        }
        return this.billingGroupsInfo;
    }public List<PaymentMethodsInfoReturnElement> getPaymentMethodsInfo() {
        if (this.paymentMethodsInfo == null) {
            this.paymentMethodsInfo = new ArrayList<PaymentMethodsInfoReturnElement>();
        }
        return this.paymentMethodsInfo;
    }public List<MasterPlansInfoReturnElement> getMasterPlansInfo() {
        if (this.masterPlansInfo == null) {
            this.masterPlansInfo = new ArrayList<MasterPlansInfoReturnElement>();
        }
        return this.masterPlansInfo;
    }public Long getConsumerAcctInd() {
        return consumerAcctInd;
    }

    public void setConsumerAcctInd(Long value) {
        this.consumerAcctInd = value;
    }

    public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long value) {
        this.errorCode = value;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    
}
