package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contracts_row", propOrder = {
    "clientContractId",
    "contractTypeNo",
    "contractLengthMonths",
    "contractCancelFee",
    "contractComments",
    "contractStartDate",
    "contractEndDate",
    "contractPlans"
    })
public class ContractsRow {

    @XmlElement(name = "client_contract_id")
    protected String clientContractId;
    @XmlElement(name = "contract_type_no")
    protected Long contractTypeNo;
    @XmlElement(name = "contract_length_months")
    protected Long contractLengthMonths;
    @XmlElement(name = "contract_cancel_fee")
    protected Double contractCancelFee;
    @XmlElement(name = "contract_comments")
    protected String contractComments;
    @XmlElement(name = "contract_start_date")
    protected String contractStartDate;
    @XmlElement(name = "contract_end_date")
    protected String contractEndDate;
    @XmlElement(name = "contract_plans")
    protected com.aria.common.shared.ContractPlansArray contractPlans;
    public String getClientContractId() {
        return clientContractId;
    }

    public void setClientContractId(String value) {
        this.clientContractId = value;
    }

    public Long getContractTypeNo() {
        return contractTypeNo;
    }

    public void setContractTypeNo(Long value) {
        this.contractTypeNo = value;
    }

    public Long getContractLengthMonths() {
        return contractLengthMonths;
    }

    public void setContractLengthMonths(Long value) {
        this.contractLengthMonths = value;
    }

    public Double getContractCancelFee() {
        return contractCancelFee;
    }

    public void setContractCancelFee(Double value) {
        this.contractCancelFee = value;
    }

    public String getContractComments() {
        return contractComments;
    }

    public void setContractComments(String value) {
        this.contractComments = value;
    }

    public String getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(String value) {
        this.contractStartDate = value;
    }

    public String getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(String value) {
        this.contractEndDate = value;
    }

    public com.aria.common.shared.ContractPlansArray getContractPlans() {
        return contractPlans;
    }

    public void setContractPlans(com.aria.common.shared.ContractPlansArray value) {
        this.contractPlans = value;
    }

    
}
