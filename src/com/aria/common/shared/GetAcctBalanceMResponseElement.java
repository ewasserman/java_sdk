package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "currencyCd", "acctBalance", "masterPlanInstances"})
@XmlRootElement(name = "get_acct_balance_mResponseElement")
public class GetAcctBalanceMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "acct_balance")
    protected String acctBalance;
    @XmlElement(name = "master_plan_instances")
    protected List<MasterPlanInstancesReturnElement> masterPlanInstances;
    
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

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }

    public String getAcctBalance() {
        return acctBalance;
    }

    public void setAcctBalance(String value) {
        this.acctBalance = value;
    }

    public List<MasterPlanInstancesReturnElement> getMasterPlanInstances() {
        if (this.masterPlanInstances == null) {
            this.masterPlanInstances = new ArrayList<MasterPlanInstancesReturnElement>();
        }
        return this.masterPlanInstances;
    }
}
