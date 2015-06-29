package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "unappliedServiceCreditsDetails"})
@XmlRootElement(name = "get_unapplied_service_credits_mResponseElement")
public class GetUnappliedServiceCreditsMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "unapplied_service_credits_details")
    protected List<UnappliedServiceCreditsDetailsReturnElement> unappliedServiceCreditsDetails;
    
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

    public List<UnappliedServiceCreditsDetailsReturnElement> getUnappliedServiceCreditsDetails() {
        if (this.unappliedServiceCreditsDetails == null) {
            this.unappliedServiceCreditsDetails = new ArrayList<UnappliedServiceCreditsDetailsReturnElement>();
        }
        return this.unappliedServiceCreditsDetails;
    }
}
