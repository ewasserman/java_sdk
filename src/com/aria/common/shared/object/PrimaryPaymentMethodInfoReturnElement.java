package com.aria.common.shared.object;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "primary_payment_method_info_ReturnElement", propOrder = {"billingFirstName", "billingMiddleInitial", "billingLastName", "billingAddress1", "billingAddress2", "billingCity", "billingState", "billingLocality", "billingZip", "billingCountry", "billingIntlPhone", "billingEmail", "payMethodType", "ccExpireMm", "ccExpireYyyy", "bankRoutingNum", "paymentInstrumentSuffix", "primaryPaymentMethodName", "primaryPaymentMethodDescription", "primaryPaymentMethodClientDefinedId"})
public class PrimaryPaymentMethodInfoReturnElement {

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
    @XmlElement(name = "billing_intl_phone")
    protected String billingIntlPhone;
    @XmlElement(name = "billing_email")
    protected String billingEmail;
    @XmlElement(name = "pay_method_type")
    protected Long payMethodType;
    @XmlElement(name = "cc_expire_mm")
    protected String ccExpireMm;
    @XmlElement(name = "cc_expire_yyyy")
    protected String ccExpireYyyy;
    @XmlElement(name = "bank_routing_num")
    protected String bankRoutingNum;
    @XmlElement(name = "payment_instrument_suffix")
    protected String paymentInstrumentSuffix;
    @XmlElement(name = "primary_payment_method_name")
    protected String primaryPaymentMethodName;
    @XmlElement(name = "primary_payment_method_description")
    protected String primaryPaymentMethodDescription;
    @XmlElement(name = "primary_payment_method_client_defined_id")
    protected String primaryPaymentMethodClientDefinedId;
    
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

    public String getBillingIntlPhone() {
        return billingIntlPhone;
    }

    public void setBillingIntlPhone(String value) {
        this.billingIntlPhone = value;
    }

    public String getBillingEmail() {
        return billingEmail;
    }

    public void setBillingEmail(String value) {
        this.billingEmail = value;
    }

    public Long getPayMethodType() {
        return payMethodType;
    }

    public void setPayMethodType(Long value) {
        this.payMethodType = value;
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

    public String getBankRoutingNum() {
        return bankRoutingNum;
    }

    public void setBankRoutingNum(String value) {
        this.bankRoutingNum = value;
    }

    public String getPaymentInstrumentSuffix() {
        return paymentInstrumentSuffix;
    }

    public void setPaymentInstrumentSuffix(String value) {
        this.paymentInstrumentSuffix = value;
    }

    public String getPrimaryPaymentMethodName() {
        return primaryPaymentMethodName;
    }

    public void setPrimaryPaymentMethodName(String value) {
        this.primaryPaymentMethodName = value;
    }

    public String getPrimaryPaymentMethodDescription() {
        return primaryPaymentMethodDescription;
    }

    public void setPrimaryPaymentMethodDescription(String value) {
        this.primaryPaymentMethodDescription = value;
    }

    public String getPrimaryPaymentMethodClientDefinedId() {
        return primaryPaymentMethodClientDefinedId;
    }

    public void setPrimaryPaymentMethodClientDefinedId(String value) {
        this.primaryPaymentMethodClientDefinedId = value;
    }

    
}
