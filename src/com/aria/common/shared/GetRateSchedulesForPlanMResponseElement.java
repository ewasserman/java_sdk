package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "rateScheds"})
@XmlRootElement(name = "get_rate_schedules_for_plan_mResponseElement")
public class GetRateSchedulesForPlanMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "rate_scheds")
    protected List<RateSchedsReturnElement> rateScheds;
    
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

    public List<RateSchedsReturnElement> getRateScheds() {
        if (this.rateScheds == null) {
            this.rateScheds = new ArrayList<RateSchedsReturnElement>();
        }
        return this.rateScheds;
    }
}
