package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contracts_array", propOrder = {
    "contractsRow"
})
public class ContractsArray {

    @XmlElement(name = "contracts_row")
    protected List<ContractsRow> contractsRow;

    public List<ContractsRow> getContractsRow() {
        if (this.contractsRow == null) {
            this.contractsRow = new ArrayList<ContractsRow>();
        }
        return this.contractsRow;
    }

}
