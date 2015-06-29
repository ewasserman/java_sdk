package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "functional_acct_group_ReturnElement", propOrder = {"functionalAcctGroupNo", "clientFunctionalAcctGroupId"})
public class FunctionalAcctGroupReturnElement {

    @XmlElement(name = "functional_acct_group_no")
    protected Long functionalAcctGroupNo;
    @XmlElement(name = "client_functional_acct_group_id")
    protected String clientFunctionalAcctGroupId;
    
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

    
}
