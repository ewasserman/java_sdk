package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pay_method_types_row", propOrder = {
    "payMethodTypeCd"
    })
public class PayMethodTypesRow {

    @XmlElement(name = "pay_method_type_cd")
    protected Long payMethodTypeCd;
    public Long getPayMethodTypeCd() {
        return payMethodTypeCd;
    }

    public void setPayMethodTypeCd(Long value) {
        this.payMethodTypeCd = value;
    }

    
}
