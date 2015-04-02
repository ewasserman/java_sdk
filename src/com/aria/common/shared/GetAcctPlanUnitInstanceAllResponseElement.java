package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "acctNo", "clientAcctId", "allPlanUnitInstances"})
@XmlRootElement(name = "get_acct_plan_unit_instance_allResponseElement")
public class GetAcctPlanUnitInstanceAllResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "acct_no")
    protected Long acctNo;
    @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
    @XmlElement(name = "all_plan_unit_instances")
    protected List<AllPlanUnitInstancesReturnElement> allPlanUnitInstances;
    
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

    public List<AllPlanUnitInstancesReturnElement> getAllPlanUnitInstances() {
        if (this.allPlanUnitInstances == null) {
            this.allPlanUnitInstances = new ArrayList<AllPlanUnitInstancesReturnElement>();
        }
        return this.allPlanUnitInstances;
    }
}
