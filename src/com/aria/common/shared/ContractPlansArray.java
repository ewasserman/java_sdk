package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contract_plans_array", propOrder = {
    "contractPlansRow"
})
public class ContractPlansArray {

    @XmlElement(name = "contract_plans_row")
    protected List<ContractPlansRow> contractPlansRow;

    public List<ContractPlansRow> getContractPlansRow() {
        if (this.contractPlansRow == null) {
            this.contractPlansRow = new ArrayList<ContractPlansRow>();
        }
        return this.contractPlansRow;
    }

}
