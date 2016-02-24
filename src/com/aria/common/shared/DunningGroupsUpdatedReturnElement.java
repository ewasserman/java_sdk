package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dunning_groups_updated_ReturnElement", propOrder = {"dunningGroupNo", "clientDunningGroupsId", "dunningGroupOperation"})
public class DunningGroupsUpdatedReturnElement {

    @XmlElement(name = "dunning_group_no")
    protected Long dunningGroupNo;
    @XmlElement(name = "client_dunning_groups_id")
    protected String clientDunningGroupsId;
    @XmlElement(name = "dunning_group_operation")
    protected Long dunningGroupOperation;
    
    public Long getDunningGroupNo() {
        return dunningGroupNo;
    }

    public void setDunningGroupNo(Long value) {
        this.dunningGroupNo = value;
    }

    public String getClientDunningGroupsId() {
        return clientDunningGroupsId;
    }

    public void setClientDunningGroupsId(String value) {
        this.clientDunningGroupsId = value;
    }

    public Long getDunningGroupOperation() {
        return dunningGroupOperation;
    }

    public void setDunningGroupOperation(Long value) {
        this.dunningGroupOperation = value;
    }

    
}
