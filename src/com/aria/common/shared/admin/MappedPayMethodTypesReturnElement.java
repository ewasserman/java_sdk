package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mapped_pay_method_types_ReturnElement", propOrder = {"payMethodTypeCd", "payMethodType"})
public class MappedPayMethodTypesReturnElement {

    @XmlElement(name = "pay_method_type_cd")
    protected Long payMethodTypeCd;
    @XmlElement(name = "pay_method_type")
    protected String payMethodType;
    
    public Long getPayMethodTypeCd() {
        return payMethodTypeCd;
    }

    public void setPayMethodTypeCd(Long value) {
        this.payMethodTypeCd = value;
    }

    public String getPayMethodType() {
        return payMethodType;
    }

    public void setPayMethodType(String value) {
        this.payMethodType = value;
    }

    
}
