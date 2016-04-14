package com.aria.common.shared.object;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "backup_payment_method_ReturnElement", propOrder = {"bkupBillingFirstName", "bkupBillingMiddleInitial", "bkupBillingLastName", "bkupBillingAddress1", "bkupBillingAddress2", "bkupBillingCity", "bkupBillingState", "bkupBillingLocality", "bkupBillingZip", "bkupBillingCountry", "bkupBillingIntlPhone", "bkupBillingEmail", "bkupPayMethodType", "bkupCcExpireMm", "bkupCcExpireYyyy", "bkupBankRoutingNum", "bkupPaymentInstrumentSuffix", "backupPaymentMethodName", "backupPaymentMethodDescription", "backupPaymentMethodClientDefinedId"})
public class BackupPaymentMethodReturnElement {

    @XmlElement(name = "bkup_billing_first_name")
    protected String bkupBillingFirstName;
    @XmlElement(name = "bkup_billing_middle_initial")
    protected String bkupBillingMiddleInitial;
    @XmlElement(name = "bkup_billing_last_name")
    protected String bkupBillingLastName;
    @XmlElement(name = "bkup_billing_address1")
    protected String bkupBillingAddress1;
    @XmlElement(name = "bkup_billing_address2")
    protected String bkupBillingAddress2;
    @XmlElement(name = "bkup_billing_city")
    protected String bkupBillingCity;
    @XmlElement(name = "bkup_billing_state")
    protected String bkupBillingState;
    @XmlElement(name = "bkup_billing_locality")
    protected String bkupBillingLocality;
    @XmlElement(name = "bkup_billing_zip")
    protected String bkupBillingZip;
    @XmlElement(name = "bkup_billing_country")
    protected String bkupBillingCountry;
    @XmlElement(name = "bkup_billing_intl_phone")
    protected String bkupBillingIntlPhone;
    @XmlElement(name = "bkup_billing_email")
    protected String bkupBillingEmail;
    @XmlElement(name = "bkup_pay_method_type")
    protected Long bkupPayMethodType;
    @XmlElement(name = "bkup_cc_expire_mm")
    protected String bkupCcExpireMm;
    @XmlElement(name = "bkup_cc_expire_yyyy")
    protected String bkupCcExpireYyyy;
    @XmlElement(name = "bkup_bank_routing_num")
    protected String bkupBankRoutingNum;
    @XmlElement(name = "bkup_payment_instrument_suffix")
    protected String bkupPaymentInstrumentSuffix;
    @XmlElement(name = "backup_payment_method_name")
    protected String backupPaymentMethodName;
    @XmlElement(name = "backup_payment_method_description")
    protected String backupPaymentMethodDescription;
    @XmlElement(name = "backup_payment_method_client_defined_id")
    protected String backupPaymentMethodClientDefinedId;
    
    public String getBkupBillingFirstName() {
        return bkupBillingFirstName;
    }

    public void setBkupBillingFirstName(String value) {
        this.bkupBillingFirstName = value;
    }

    public String getBkupBillingMiddleInitial() {
        return bkupBillingMiddleInitial;
    }

    public void setBkupBillingMiddleInitial(String value) {
        this.bkupBillingMiddleInitial = value;
    }

    public String getBkupBillingLastName() {
        return bkupBillingLastName;
    }

    public void setBkupBillingLastName(String value) {
        this.bkupBillingLastName = value;
    }

    public String getBkupBillingAddress1() {
        return bkupBillingAddress1;
    }

    public void setBkupBillingAddress1(String value) {
        this.bkupBillingAddress1 = value;
    }

    public String getBkupBillingAddress2() {
        return bkupBillingAddress2;
    }

    public void setBkupBillingAddress2(String value) {
        this.bkupBillingAddress2 = value;
    }

    public String getBkupBillingCity() {
        return bkupBillingCity;
    }

    public void setBkupBillingCity(String value) {
        this.bkupBillingCity = value;
    }

    public String getBkupBillingState() {
        return bkupBillingState;
    }

    public void setBkupBillingState(String value) {
        this.bkupBillingState = value;
    }

    public String getBkupBillingLocality() {
        return bkupBillingLocality;
    }

    public void setBkupBillingLocality(String value) {
        this.bkupBillingLocality = value;
    }

    public String getBkupBillingZip() {
        return bkupBillingZip;
    }

    public void setBkupBillingZip(String value) {
        this.bkupBillingZip = value;
    }

    public String getBkupBillingCountry() {
        return bkupBillingCountry;
    }

    public void setBkupBillingCountry(String value) {
        this.bkupBillingCountry = value;
    }

    public String getBkupBillingIntlPhone() {
        return bkupBillingIntlPhone;
    }

    public void setBkupBillingIntlPhone(String value) {
        this.bkupBillingIntlPhone = value;
    }

    public String getBkupBillingEmail() {
        return bkupBillingEmail;
    }

    public void setBkupBillingEmail(String value) {
        this.bkupBillingEmail = value;
    }

    public Long getBkupPayMethodType() {
        return bkupPayMethodType;
    }

    public void setBkupPayMethodType(Long value) {
        this.bkupPayMethodType = value;
    }

    public String getBkupCcExpireMm() {
        return bkupCcExpireMm;
    }

    public void setBkupCcExpireMm(String value) {
        this.bkupCcExpireMm = value;
    }

    public String getBkupCcExpireYyyy() {
        return bkupCcExpireYyyy;
    }

    public void setBkupCcExpireYyyy(String value) {
        this.bkupCcExpireYyyy = value;
    }

    public String getBkupBankRoutingNum() {
        return bkupBankRoutingNum;
    }

    public void setBkupBankRoutingNum(String value) {
        this.bkupBankRoutingNum = value;
    }

    public String getBkupPaymentInstrumentSuffix() {
        return bkupPaymentInstrumentSuffix;
    }

    public void setBkupPaymentInstrumentSuffix(String value) {
        this.bkupPaymentInstrumentSuffix = value;
    }

    public String getBackupPaymentMethodName() {
        return backupPaymentMethodName;
    }

    public void setBackupPaymentMethodName(String value) {
        this.backupPaymentMethodName = value;
    }

    public String getBackupPaymentMethodDescription() {
        return backupPaymentMethodDescription;
    }

    public void setBackupPaymentMethodDescription(String value) {
        this.backupPaymentMethodDescription = value;
    }

    public String getBackupPaymentMethodClientDefinedId() {
        return backupPaymentMethodClientDefinedId;
    }

    public void setBackupPaymentMethodClientDefinedId(String value) {
        this.backupPaymentMethodClientDefinedId = value;
    }

    
}
