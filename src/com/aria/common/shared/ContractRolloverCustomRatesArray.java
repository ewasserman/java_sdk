package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contract_rollover_custom_rates_array", propOrder = {
    "contractRolloverCustomRatesRow"
})
public class ContractRolloverCustomRatesArray {

    @XmlElement(name = "contract_rollover_custom_rates_row")
    protected List<ContractRolloverCustomRatesRow> contractRolloverCustomRatesRow;

    public List<ContractRolloverCustomRatesRow> getContractRolloverCustomRatesRow() {
        if (this.contractRolloverCustomRatesRow == null) {
            this.contractRolloverCustomRatesRow = new ArrayList<ContractRolloverCustomRatesRow>();
        }
        return this.contractRolloverCustomRatesRow;
    }

}
