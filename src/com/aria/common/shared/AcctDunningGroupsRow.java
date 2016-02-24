package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acct_dunning_groups_row", propOrder = {
    "dunningGroupDirective",
    "existingDunningGroupNo",
    "existingClientDunningGroupId",
    "dunningGroupName",
    "dunningGroupDescription",
    "newClientDunningGroupId",
    "dunningGroupIdx",
    "dunningProcessNo",
    "clientDunningProcessId"
    })
public class AcctDunningGroupsRow {

    @XmlElement(name = "dunning_group_directive")
    protected Long dunningGroupDirective;
    @XmlElement(name = "existing_dunning_group_no")
    protected Long existingDunningGroupNo;
    @XmlElement(name = "existing_client_dunning_group_id")
    protected String existingClientDunningGroupId;
    @XmlElement(name = "dunning_group_name")
    protected String dunningGroupName;
    @XmlElement(name = "dunning_group_description")
    protected String dunningGroupDescription;
    @XmlElement(name = "new_client_dunning_group_id")
    protected String newClientDunningGroupId;
    @XmlElement(name = "dunning_group_idx")
    protected Long dunningGroupIdx;
    @XmlElement(name = "dunning_process_no")
    protected Long dunningProcessNo;
    @XmlElement(name = "client_dunning_process_id")
    protected String clientDunningProcessId;
    public Long getDunningGroupDirective() {
        return dunningGroupDirective;
    }

    public void setDunningGroupDirective(Long value) {
        this.dunningGroupDirective = value;
    }

    public Long getExistingDunningGroupNo() {
        return existingDunningGroupNo;
    }

    public void setExistingDunningGroupNo(Long value) {
        this.existingDunningGroupNo = value;
    }

    public String getExistingClientDunningGroupId() {
        return existingClientDunningGroupId;
    }

    public void setExistingClientDunningGroupId(String value) {
        this.existingClientDunningGroupId = value;
    }

    public String getDunningGroupName() {
        return dunningGroupName;
    }

    public void setDunningGroupName(String value) {
        this.dunningGroupName = value;
    }

    public String getDunningGroupDescription() {
        return dunningGroupDescription;
    }

    public void setDunningGroupDescription(String value) {
        this.dunningGroupDescription = value;
    }

    public String getNewClientDunningGroupId() {
        return newClientDunningGroupId;
    }

    public void setNewClientDunningGroupId(String value) {
        this.newClientDunningGroupId = value;
    }

    public Long getDunningGroupIdx() {
        return dunningGroupIdx;
    }

    public void setDunningGroupIdx(Long value) {
        this.dunningGroupIdx = value;
    }

    public Long getDunningProcessNo() {
        return dunningProcessNo;
    }

    public void setDunningProcessNo(Long value) {
        this.dunningProcessNo = value;
    }

    public String getClientDunningProcessId() {
        return clientDunningProcessId;
    }

    public void setClientDunningProcessId(String value) {
        this.clientDunningProcessId = value;
    }

    
}
