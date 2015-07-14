package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "clientAcctId",    "typeNo",    "lengthMonths",    "endDate",    "contractPlanInstances",    "clientContractId",    "cancelFee",    "createComments",    "startDate",    "doAutoDiscard",    "cascadeAction",    "contractRolloverCustomRates"})
@XmlRootElement(name = "create_instance_contract_m")
public class CreateInstanceContractM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
        @XmlElement(name = "type_no")
    protected Long typeNo;
        @XmlElement(name = "length_months")
    protected Long lengthMonths;
        @XmlElement(name = "end_date")
    protected String endDate;
        @XmlElement(name = "contract_plan_instances")
    protected ContractPlanInstancesArray contractPlanInstances;
        @XmlElement(name = "client_contract_id")
    protected String clientContractId;
        @XmlElement(name = "cancel_fee")
    protected Double cancelFee;
        @XmlElement(name = "create_comments")
    protected String createComments;
        @XmlElement(name = "start_date")
    protected String startDate;
        @XmlElement(name = "do_auto_discard")
    protected String doAutoDiscard;
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
            public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String value) {
        this.endDate = value;
    }
            public ContractPlanInstancesArray getContractPlanInstances() {
        return contractPlanInstances;
    }

    public void setContractPlanInstances(ContractPlanInstancesArray value) {
        this.contractPlanInstances = value;
    }
            public String getClientContractId() {
        return clientContractId;
    }

    public void setClientContractId(String value) {
        this.clientContractId = value;
    }
            public Double getCancelFee() {
        return cancelFee;
    }

    public void setCancelFee(Double value) {
        this.cancelFee = value;
    }
            public String getCreateComments() {
        return createComments;
    }

    public void setCreateComments(String value) {
        this.createComments = value;
    }
            public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String value) {
        this.startDate = value;
    }
            public String getDoAutoDiscard() {
        return doAutoDiscard;
    }

    public void setDoAutoDiscard(String value) {
        this.doAutoDiscard = value;
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
