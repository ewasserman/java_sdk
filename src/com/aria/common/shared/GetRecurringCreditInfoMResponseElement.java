package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "recurringCreditsDetails"})
@XmlRootElement(name = "get_recurring_credit_info_mResponseElement")
public class GetRecurringCreditInfoMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "recurring_credits_details")
    protected List<RecurringCreditsDetailsReturnElement> recurringCreditsDetails;
    
    public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long value) {
        this.errorCode = value;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    public List<RecurringCreditsDetailsReturnElement> getRecurringCreditsDetails() {
        if (this.recurringCreditsDetails == null) {
            this.recurringCreditsDetails = new ArrayList<RecurringCreditsDetailsReturnElement>();
        }
        return this.recurringCreditsDetails;
    }
}
