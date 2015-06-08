package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "all_pay_methods_ReturnElement", propOrder = {"payMethodType", "payMethodName", "daysUntilPaymentReminder01", "daysUntilPaymentReminder02", "daysUntilPaymentReminder03"})
public class AllPayMethodsReturnElement {

    @XmlElement(name = "pay_method_type")
    protected Long payMethodType;
    @XmlElement(name = "pay_method_name")
    protected String payMethodName;
    @XmlElement(name = "days_until_payment_reminder_01")
    protected Long daysUntilPaymentReminder01;
    @XmlElement(name = "days_until_payment_reminder_02")
    protected Long daysUntilPaymentReminder02;
    @XmlElement(name = "days_until_payment_reminder_03")
    protected Long daysUntilPaymentReminder03;
    
    public Long getPayMethodType() {
        return payMethodType;
    }

    public void setPayMethodType(Long value) {
        this.payMethodType = value;
    }

    public String getPayMethodName() {
        return payMethodName;
    }

    public void setPayMethodName(String value) {
        this.payMethodName = value;
    }

    public Long getDaysUntilPaymentReminder01() {
        return daysUntilPaymentReminder01;
    }

    public void setDaysUntilPaymentReminder01(Long value) {
        this.daysUntilPaymentReminder01 = value;
    }

    public Long getDaysUntilPaymentReminder02() {
        return daysUntilPaymentReminder02;
    }

    public void setDaysUntilPaymentReminder02(Long value) {
        this.daysUntilPaymentReminder02 = value;
    }

    public Long getDaysUntilPaymentReminder03() {
        return daysUntilPaymentReminder03;
    }

    public void setDaysUntilPaymentReminder03(Long value) {
        this.daysUntilPaymentReminder03 = value;
    }

    
}
