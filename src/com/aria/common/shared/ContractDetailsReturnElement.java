package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contract_details_ReturnElement", propOrder = {"contractNo", "clientContractId", "contractPlanDetails", "contractScope"})
public class ContractDetailsReturnElement {

    @XmlElement(name = "contract_no")
    protected Long contractNo;
    @XmlElement(name = "client_contract_id")
    protected String clientContractId;
    @XmlElement(name = "contract_plan_details")
    protected List<ContractPlanDetailsReturnElement> contractPlanDetails;
    @XmlElement(name = "contract_scope")
    protected String contractScope;
    
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

    public List<ContractPlanDetailsReturnElement> getContractPlanDetails() {
        if (this.contractPlanDetails == null) {
            this.contractPlanDetails = new ArrayList<ContractPlanDetailsReturnElement>();
        }
        return this.contractPlanDetails;
    }public String getContractScope() {
        return contractScope;
    }

    public void setContractScope(String value) {
        this.contractScope = value;
    }

    
}
