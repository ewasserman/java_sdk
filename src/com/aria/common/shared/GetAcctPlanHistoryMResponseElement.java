package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "planHistory", "acctLocaleNo", "acctLocaleName"})
@XmlRootElement(name = "get_acct_plan_history_mResponseElement")
public class GetAcctPlanHistoryMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "plan_history")
    protected List<PlanHistoryReturnElement> planHistory;
    @XmlElement(name = "acct_locale_no")
    protected Long acctLocaleNo;
    @XmlElement(name = "acct_locale_name")
    protected String acctLocaleName;
    
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

    public List<PlanHistoryReturnElement> getPlanHistory() {
        if (this.planHistory == null) {
            this.planHistory = new ArrayList<PlanHistoryReturnElement>();
        }
        return this.planHistory;
    }public Long getAcctLocaleNo() {
        return acctLocaleNo;
    }

    public void setAcctLocaleNo(Long value) {
        this.acctLocaleNo = value;
    }

    public String getAcctLocaleName() {
        return acctLocaleName;
    }

    public void setAcctLocaleName(String value) {
        this.acctLocaleName = value;
    }

    
}
