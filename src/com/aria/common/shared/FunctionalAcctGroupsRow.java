package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "functional_acct_groups_row", propOrder = {
    "functionalAcctGroups"
    })
public class FunctionalAcctGroupsRow {

    @XmlElement(name = "functional_acct_groups")
    protected Long functionalAcctGroups;
    public Long getFunctionalAcctGroups() {
        return functionalAcctGroups;
    }

    public void setFunctionalAcctGroups(Long value) {
        this.functionalAcctGroups = value;
    }

    
}
