package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payment_methods_row", propOrder = {
    "paymentMethodNo",
    "clientPaymentMethodId",
    "clientNewTgtPmtMethodId"
    })
public class PaymentMethodsRow {

    @XmlElement(name = "payment_method_no")
    protected Long paymentMethodNo;
    @XmlElement(name = "client_payment_method_id")
    protected String clientPaymentMethodId;
    @XmlElement(name = "client_new_tgt_pmt_method_id")
    protected String clientNewTgtPmtMethodId;
    public Long getPaymentMethodNo() {
        return paymentMethodNo;
    }

    public void setPaymentMethodNo(Long value) {
        this.paymentMethodNo = value;
    }

    public String getClientPaymentMethodId() {
        return clientPaymentMethodId;
    }

    public void setClientPaymentMethodId(String value) {
        this.clientPaymentMethodId = value;
    }

    public String getClientNewTgtPmtMethodId() {
        return clientNewTgtPmtMethodId;
    }

    public void setClientNewTgtPmtMethodId(String value) {
        this.clientNewTgtPmtMethodId = value;
    }

    
}
