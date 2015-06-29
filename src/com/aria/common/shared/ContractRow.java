package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contract_row", propOrder = {
    "contractPlanNo",
    "contractTypeNo",
    "contractAltRecurFee",
    "contractLengthMonths",
    "contractCancelFee",
    "contractComments",
    "contractStartDate",
    "contractEndDate"
    })
public class ContractRow {

    @XmlElement(name = "contract_plan_no")
    protected Long contractPlanNo;
    @XmlElement(name = "contract_type_no")
    protected Long contractTypeNo;
    @XmlElement(name = "contract_alt_recur_fee")
    protected Double contractAltRecurFee;
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
    public Long getContractPlanNo() {
        return contractPlanNo;
    }

    public void setContractPlanNo(Long value) {
        this.contractPlanNo = value;
    }

    public Long getContractTypeNo() {
        return contractTypeNo;
    }

    public void setContractTypeNo(Long value) {
        this.contractTypeNo = value;
    }

    public Double getContractAltRecurFee() {
        return contractAltRecurFee;
    }

    public void setContractAltRecurFee(Double value) {
        this.contractAltRecurFee = value;
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

    
}
