package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "all_payment_terms_ReturnElement", propOrder = {"paymentTermsNo", "termsNameInternal", "termsNameExternal", "daysUntilDue", "discountPercent", "discountPeriod", "functionalAcctGroup", "createdBy", "createdDate"})
public class AllPaymentTermsReturnElement {

    @XmlElement(name = "payment_terms_no")
    protected Long paymentTermsNo;
    @XmlElement(name = "terms_name_internal")
    protected String termsNameInternal;
    @XmlElement(name = "terms_name_external")
    protected String termsNameExternal;
    @XmlElement(name = "days_until_due")
    protected Long daysUntilDue;
    @XmlElement(name = "discount_percent")
    protected Long discountPercent;
    @XmlElement(name = "discount_period")
    protected Long discountPeriod;
    @XmlElement(name = "functional_acct_group")
    protected String functionalAcctGroup;
    @XmlElement(name = "created_by")
    protected String createdBy;
    @XmlElement(name = "created_date")
    protected String createdDate;
    
    public Long getPaymentTermsNo() {
        return paymentTermsNo;
    }

    public void setPaymentTermsNo(Long value) {
        this.paymentTermsNo = value;
    }

    public String getTermsNameInternal() {
        return termsNameInternal;
    }

    public void setTermsNameInternal(String value) {
        this.termsNameInternal = value;
    }

    public String getTermsNameExternal() {
        return termsNameExternal;
    }

    public void setTermsNameExternal(String value) {
        this.termsNameExternal = value;
    }

    public Long getDaysUntilDue() {
        return daysUntilDue;
    }

    public void setDaysUntilDue(Long value) {
        this.daysUntilDue = value;
    }

    public Long getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(Long value) {
        this.discountPercent = value;
    }

    public Long getDiscountPeriod() {
        return discountPeriod;
    }

    public void setDiscountPeriod(Long value) {
        this.discountPeriod = value;
    }

    public String getFunctionalAcctGroup() {
        return functionalAcctGroup;
    }

    public void setFunctionalAcctGroup(String value) {
        this.functionalAcctGroup = value;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String value) {
        this.createdDate = value;
    }

    
}
