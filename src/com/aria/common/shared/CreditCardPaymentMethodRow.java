package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "credit_card_payment_method_row", propOrder = {
    "seqNo"
    })
public class CreditCardPaymentMethodRow {

    @XmlElement(name = "seq_no")
    protected Long seqNo;
    public Long getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Long value) {
        this.seqNo = value;
    }

    
}
