package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "usageHistoryRecs"})
@XmlRootElement(name = "get_usage_history_mResponseElement")
public class GetUsageHistoryMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "usage_history_recs")
    protected List<UsageHistoryRecsReturnElement> usageHistoryRecs;
    
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

    public List<UsageHistoryRecsReturnElement> getUsageHistoryRecs() {
        if (this.usageHistoryRecs == null) {
            this.usageHistoryRecs = new ArrayList<UsageHistoryRecsReturnElement>();
        }
        return this.usageHistoryRecs;
    }
}
