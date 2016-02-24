package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cash_credits_ReturnElement", propOrder = {"creditNo", "createdBy", "createdDate", "amount", "reasonCode", "reasonText", "appliedCashCredits"})
public class CashCreditsReturnElement {

    @XmlElement(name = "credit_no")
    protected Long creditNo;
    @XmlElement(name = "created_by")
    protected String createdBy;
    @XmlElement(name = "created_date")
    protected String createdDate;
    @XmlElement(name = "amount")
    protected Double amount;
    @XmlElement(name = "reason_code")
    protected Long reasonCode;
    @XmlElement(name = "reason_text")
    protected String reasonText;
    @XmlElement(name = "applied_cash_credits")
    protected List<AppliedCashCreditsReturnElement> appliedCashCredits;
    
    public Long getCreditNo() {
        return creditNo;
    }

    public void setCreditNo(Long value) {
        this.creditNo = value;
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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double value) {
        this.amount = value;
    }

    public Long getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(Long value) {
        this.reasonCode = value;
    }

    public String getReasonText() {
        return reasonText;
    }

    public void setReasonText(String value) {
        this.reasonText = value;
    }

    public List<AppliedCashCreditsReturnElement> getAppliedCashCredits() {
        if (this.appliedCashCredits == null) {
            this.appliedCashCredits = new ArrayList<AppliedCashCreditsReturnElement>();
        }
        return this.appliedCashCredits;
    }
}
