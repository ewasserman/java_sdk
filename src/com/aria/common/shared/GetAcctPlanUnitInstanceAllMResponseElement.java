package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "acctNo", "clientAcctId", "allPlanInstances"})
@XmlRootElement(name = "get_acct_plan_unit_instance_all_mResponseElement")
public class GetAcctPlanUnitInstanceAllMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "acct_no")
    protected Long acctNo;
    @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
    @XmlElement(name = "all_plan_instances")
    protected List<AllPlanInstancesReturnElement> allPlanInstances;
    
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

    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }

    public String getClientAcctId() {
        return clientAcctId;
    }

    public void setClientAcctId(String value) {
        this.clientAcctId = value;
    }

    public List<AllPlanInstancesReturnElement> getAllPlanInstances() {
        if (this.allPlanInstances == null) {
            this.allPlanInstances = new ArrayList<AllPlanInstancesReturnElement>();
        }
        return this.allPlanInstances;
    }
}
