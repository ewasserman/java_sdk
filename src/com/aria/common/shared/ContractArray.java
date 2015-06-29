package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contract_array", propOrder = {
    "contractRow"
})
public class ContractArray {

    @XmlElement(name = "contract_row")
    protected List<ContractRow> contractRow;

    public List<ContractRow> getContractRow() {
        if (this.contractRow == null) {
            this.contractRow = new ArrayList<ContractRow>();
        }
        return this.contractRow;
    }

}
