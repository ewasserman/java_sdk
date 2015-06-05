package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sel_options_ReturnElement", propOrder = {"displayText", "optionValue", "optionValueOrder"})
public class SelOptionsReturnElement {

    @XmlElement(name = "display_text")
    protected String displayText;
    @XmlElement(name = "option_value")
    protected String optionValue;
    @XmlElement(name = "option_value_order")
    protected Long optionValueOrder;
    
    public String getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String value) {
        this.displayText = value;
    }

    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String value) {
        this.optionValue = value;
    }

    public Long getOptionValueOrder() {
        return optionValueOrder;
    }

    public void setOptionValueOrder(Long value) {
        this.optionValueOrder = value;
    }

    
}
