package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "clientAcctId",    "orderLineItems",    "parentPlanInstanceNo",    "clientParentPlanInstanceId",    "suppPlanInstanceNo",    "clientPlanInstanceId",    "suppPlanNo",    "clientSuppPlanId",    "suppPlanUnits",    "assignmentDirective",    "billImmediately",    "billSeq",    "clientOrderId",    "clientReceiptId",    "altPayMethod",    "ccNumber",    "ccExpireMm",    "ccExpireYyyy",    "cvv",    "bankRoutingNum",    "bankAcctNum",    "bankCheckDigit",    "bankSwiftCd",    "bankCountryCd",    "bankIdCd",    "bankBranchCd",    "mandateId",    "iban",    "billCompanyName",    "billFirstName",    "billMiddleInitial",    "billLastName",    "billAddress1",    "billAddress2",    "billAddress3",    "billCity",    "billLocality",    "billStateProv",    "billZip",    "billCountry",    "billEmail",    "billPhone",    "billPhoneExtension",    "billCellPhone",    "billWorkPhone",    "billWorkPhoneExtension",    "multipleCoupons",    "altClientAcctGroupId",    "clientAltInvTemplateId",    "altInvTemplateNo",    "statementMessage",    "trackData1",    "trackData2",    "doWrite"})
@XmlRootElement(name = "create_order_with_plan_m")
public class CreateOrderWithPlanM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
        @XmlElement(name = "order_line_items")
    protected OrderLineItemsArray orderLineItems;
        @XmlElement(name = "parent_plan_instance_no")
    protected Long parentPlanInstanceNo;
        @XmlElement(name = "client_parent_plan_instance_id")
    protected String clientParentPlanInstanceId;
        @XmlElement(name = "supp_plan_instance_no")
    protected Long suppPlanInstanceNo;
        @XmlElement(name = "client_plan_instance_id")
    protected String clientPlanInstanceId;
        @XmlElement(name = "supp_plan_no")
    protected Long suppPlanNo;
        @XmlElement(name = "client_supp_plan_id")
    protected String clientSuppPlanId;
        @XmlElement(name = "supp_plan_units")
    protected Long suppPlanUnits;
        @XmlElement(name = "assignment_directive")
    protected Long assignmentDirective;
        @XmlElement(name = "bill_immediately")
    protected Long billImmediately;
        @XmlElement(name = "bill_seq")
    protected Long billSeq;
        @XmlElement(name = "client_order_id")
    protected String clientOrderId;
        @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
        @XmlElement(name = "alt_pay_method")
    protected Long altPayMethod;
        @XmlElement(name = "cc_number")
    protected String ccNumber;
        @XmlElement(name = "cc_expire_mm")
    protected Long ccExpireMm;
        @XmlElement(name = "cc_expire_yyyy")
    protected Long ccExpireYyyy;
        @XmlElement(name = "cvv")
    protected String cvv;
        @XmlElement(name = "bank_routing_num")
    protected String bankRoutingNum;
        @XmlElement(name = "bank_acct_num")
    protected String bankAcctNum;
        @XmlElement(name = "bank_check_digit")
    protected Long bankCheckDigit;
        @XmlElement(name = "bank_swift_cd")
    protected String bankSwiftCd;
        @XmlElement(name = "bank_country_cd")
    protected String bankCountryCd;
        @XmlElement(name = "bank_id_cd")
    protected String bankIdCd;
        @XmlElement(name = "bank_branch_cd")
    protected String bankBranchCd;
        @XmlElement(name = "mandate_id")
    protected String mandateId;
        @XmlElement(name = "iban")
    protected String iban;
        @XmlElement(name = "bill_company_name")
    protected String billCompanyName;
        @XmlElement(name = "bill_first_name")
    protected String billFirstName;
        @XmlElement(name = "bill_middle_initial")
    protected String billMiddleInitial;
        @XmlElement(name = "bill_last_name")
    protected String billLastName;
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
        @XmlElement(name = "bill_zip")
    protected String billZip;
        @XmlElement(name = "bill_country")
    protected String billCountry;
        @XmlElement(name = "bill_email")
    protected String billEmail;
        @XmlElement(name = "bill_phone")
    protected String billPhone;
        @XmlElement(name = "bill_phone_extension")
    protected String billPhoneExtension;
        @XmlElement(name = "bill_cell_phone")
    protected String billCellPhone;
        @XmlElement(name = "bill_work_phone")
    protected String billWorkPhone;
        @XmlElement(name = "bill_work_phone_extension")
    protected String billWorkPhoneExtension;
        @XmlElement(name = "multiple_coupons")
    protected MultipleCouponsArray multipleCoupons;
        @XmlElement(name = "alt_client_acct_group_id")
    protected String altClientAcctGroupId;
        @XmlElement(name = "client_alt_inv_template_id")
    protected String clientAltInvTemplateId;
        @XmlElement(name = "alt_inv_template_no")
    protected Long altInvTemplateNo;
        @XmlElement(name = "statement_message")
    protected String statementMessage;
        @XmlElement(name = "track_data1")
    protected String trackData1;
        @XmlElement(name = "track_data2")
    protected String trackData2;
        @XmlElement(name = "do_write")
    protected String doWrite;
    
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
            public OrderLineItemsArray getOrderLineItems() {
        return orderLineItems;
    }

    public void setOrderLineItems(OrderLineItemsArray value) {
        this.orderLineItems = value;
    }
            public Long getParentPlanInstanceNo() {
        return parentPlanInstanceNo;
    }

    public void setParentPlanInstanceNo(Long value) {
        this.parentPlanInstanceNo = value;
    }
            public String getClientParentPlanInstanceId() {
        return clientParentPlanInstanceId;
    }

    public void setClientParentPlanInstanceId(String value) {
        this.clientParentPlanInstanceId = value;
    }
            public Long getSuppPlanInstanceNo() {
        return suppPlanInstanceNo;
    }

    public void setSuppPlanInstanceNo(Long value) {
        this.suppPlanInstanceNo = value;
    }
            public String getClientPlanInstanceId() {
        return clientPlanInstanceId;
    }

    public void setClientPlanInstanceId(String value) {
        this.clientPlanInstanceId = value;
    }
            public Long getSuppPlanNo() {
        return suppPlanNo;
    }

    public void setSuppPlanNo(Long value) {
        this.suppPlanNo = value;
    }
            public String getClientSuppPlanId() {
        return clientSuppPlanId;
    }

    public void setClientSuppPlanId(String value) {
        this.clientSuppPlanId = value;
    }
            public Long getSuppPlanUnits() {
        return suppPlanUnits;
    }

    public void setSuppPlanUnits(Long value) {
        this.suppPlanUnits = value;
    }
            public Long getAssignmentDirective() {
        return assignmentDirective;
    }

    public void setAssignmentDirective(Long value) {
        this.assignmentDirective = value;
    }
            public Long getBillImmediately() {
        return billImmediately;
    }

    public void setBillImmediately(Long value) {
        this.billImmediately = value;
    }
            public Long getBillSeq() {
        return billSeq;
    }

    public void setBillSeq(Long value) {
        this.billSeq = value;
    }
            public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String value) {
        this.clientOrderId = value;
    }
            public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
    }
            public Long getAltPayMethod() {
        return altPayMethod;
    }

    public void setAltPayMethod(Long value) {
        this.altPayMethod = value;
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
            public String getCvv() {
        return cvv;
    }

    public void setCvv(String value) {
        this.cvv = value;
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
            public String getMandateId() {
        return mandateId;
    }

    public void setMandateId(String value) {
        this.mandateId = value;
    }
            public String getIban() {
        return iban;
    }

    public void setIban(String value) {
        this.iban = value;
    }
            public String getBillCompanyName() {
        return billCompanyName;
    }

    public void setBillCompanyName(String value) {
        this.billCompanyName = value;
    }
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
            public String getBillZip() {
        return billZip;
    }

    public void setBillZip(String value) {
        this.billZip = value;
    }
            public String getBillCountry() {
        return billCountry;
    }

    public void setBillCountry(String value) {
        this.billCountry = value;
    }
            public String getBillEmail() {
        return billEmail;
    }

    public void setBillEmail(String value) {
        this.billEmail = value;
    }
            public String getBillPhone() {
        return billPhone;
    }

    public void setBillPhone(String value) {
        this.billPhone = value;
    }
            public String getBillPhoneExtension() {
        return billPhoneExtension;
    }

    public void setBillPhoneExtension(String value) {
        this.billPhoneExtension = value;
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
            public String getBillWorkPhoneExtension() {
        return billWorkPhoneExtension;
    }

    public void setBillWorkPhoneExtension(String value) {
        this.billWorkPhoneExtension = value;
    }
            public MultipleCouponsArray getMultipleCoupons() {
        return multipleCoupons;
    }

    public void setMultipleCoupons(MultipleCouponsArray value) {
        this.multipleCoupons = value;
    }
            public String getAltClientAcctGroupId() {
        return altClientAcctGroupId;
    }

    public void setAltClientAcctGroupId(String value) {
        this.altClientAcctGroupId = value;
    }
            public String getClientAltInvTemplateId() {
        return clientAltInvTemplateId;
    }

    public void setClientAltInvTemplateId(String value) {
        this.clientAltInvTemplateId = value;
    }
            public Long getAltInvTemplateNo() {
        return altInvTemplateNo;
    }

    public void setAltInvTemplateNo(Long value) {
        this.altInvTemplateNo = value;
    }
            public String getStatementMessage() {
        return statementMessage;
    }

    public void setStatementMessage(String value) {
        this.statementMessage = value;
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
            
}
