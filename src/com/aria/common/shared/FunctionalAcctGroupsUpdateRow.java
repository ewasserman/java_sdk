package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "functional_acct_groups_update_row", propOrder = {
    "functionalAcctGroupNo",
    "clientFunctionalAcctGroupId",
    "functionalAcctGrpDirective"
    })
public class FunctionalAcctGroupsUpdateRow {

    @XmlElement(name = "functional_acct_group_no")
    protected Long functionalAcctGroupNo;
    @XmlElement(name = "client_functional_acct_group_id")
    protected String clientFunctionalAcctGroupId;
    @XmlElement(name = "functional_acct_grp_directive")
    protected Long functionalAcctGrpDirective;
    public Long getFunctionalAcctGroupNo() {
        return functionalAcctGroupNo;
    }

    public void setFunctionalAcctGroupNo(Long value) {
        this.functionalAcctGroupNo = value;
    }

    public String getClientFunctionalAcctGroupId() {
        return clientFunctionalAcctGroupId;
    }

    public void setClientFunctionalAcctGroupId(String value) {
        this.clientFunctionalAcctGroupId = value;
    }

    public Long getFunctionalAcctGrpDirective() {
        return functionalAcctGrpDirective;
    }

    public void setFunctionalAcctGrpDirective(Long value) {
        this.functionalAcctGrpDirective = value;
    }

    
}
