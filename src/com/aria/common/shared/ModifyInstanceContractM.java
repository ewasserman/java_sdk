package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "clientAcctId",    "contractNo",    "clientContractId",    "contractPlanInstances",    "typeNo",    "lengthMonths",    "updateComments",    "cancelFee",    "actionDirective",    "startDate",    "endDate",    "cascadeAction",    "contractRolloverCustomRates"})
@XmlRootElement(name = "modify_instance_contract_m")
public class ModifyInstanceContractM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
        @XmlElement(name = "contract_no")
    protected Long contractNo;
        @XmlElement(name = "client_contract_id")
    protected String clientContractId;
        @XmlElement(name = "contract_plan_instances")
    protected ContractPlanInstancesArray contractPlanInstances;
        @XmlElement(name = "type_no")
    protected Long typeNo;
        @XmlElement(name = "length_months")
    protected Long lengthMonths;
        @XmlElement(name = "update_comments")
    protected String updateComments;
        @XmlElement(name = "cancel_fee")
    protected Double cancelFee;
        @XmlElement(name = "action_directive")
    protected Long actionDirective;
        @XmlElement(name = "start_date")
    protected String startDate;
        @XmlElement(name = "end_date")
    protected String endDate;
        @XmlElement(name = "cascade_action")
    protected String cascadeAction;
        @XmlElement(name = "contract_rollover_custom_rates")
    protected ContractRolloverCustomRatesArray contractRolloverCustomRates;
    
    public long getClientNo() {
        return clientNo;
    }

    public void setClientNo(Long value) {
        this.clientNo = value;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String value) {
        this.authKey = value;
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
            public Long getContractNo() {
        return contractNo;
    }

    public void setContractNo(Long value) {
        this.contractNo = value;
    }
            public String getClientContractId() {
        return clientContractId;
    }

    public void setClientContractId(String value) {
        this.clientContractId = value;
    }
            public ContractPlanInstancesArray getContractPlanInstances() {
        return contractPlanInstances;
    }

    public void setContractPlanInstances(ContractPlanInstancesArray value) {
        this.contractPlanInstances = value;
    }
            public Long getTypeNo() {
        return typeNo;
    }

    public void setTypeNo(Long value) {
        this.typeNo = value;
    }
            public Long getLengthMonths() {
        return lengthMonths;
    }

    public void setLengthMonths(Long value) {
        this.lengthMonths = value;
    }
            public String getUpdateComments() {
        return updateComments;
    }

    public void setUpdateComments(String value) {
        this.updateComments = value;
    }
            public Double getCancelFee() {
        return cancelFee;
    }

    public void setCancelFee(Double value) {
        this.cancelFee = value;
    }
            public Long getActionDirective() {
        return actionDirective;
    }

    public void setActionDirective(Long value) {
        this.actionDirective = value;
    }
            public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String value) {
        this.startDate = value;
    }
            public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String value) {
        this.endDate = value;
    }
            public String getCascadeAction() {
        return cascadeAction;
    }

    public void setCascadeAction(String value) {
        this.cascadeAction = value;
    }
            public ContractRolloverCustomRatesArray getContractRolloverCustomRates() {
        return contractRolloverCustomRates;
    }

    public void setContractRolloverCustomRates(ContractRolloverCustomRatesArray value) {
        this.contractRolloverCustomRates = value;
    }
            
}
