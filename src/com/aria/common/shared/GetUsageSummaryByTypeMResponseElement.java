package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "startDate", "startTime", "endDate", "endTime", "usageSummaryRecs"})
@XmlRootElement(name = "get_usage_summary_by_type_mResponseElement")
public class GetUsageSummaryByTypeMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "start_date")
    protected String startDate;
    @XmlElement(name = "start_time")
    protected String startTime;
    @XmlElement(name = "end_date")
    protected String endDate;
    @XmlElement(name = "end_time")
    protected String endTime;
    @XmlElement(name = "usage_summary_recs")
    protected List<UsageSummaryRecsReturnElement> usageSummaryRecs;
    
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String value) {
        this.startDate = value;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String value) {
        this.startTime = value;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String value) {
        this.endDate = value;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String value) {
        this.endTime = value;
    }

    public List<UsageSummaryRecsReturnElement> getUsageSummaryRecs() {
        if (this.usageSummaryRecs == null) {
            this.usageSummaryRecs = new ArrayList<UsageSummaryRecsReturnElement>();
        }
        return this.usageSummaryRecs;
    }
}
