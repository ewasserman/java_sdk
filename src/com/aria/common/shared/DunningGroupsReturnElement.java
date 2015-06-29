package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dunning_groups_ReturnElement", propOrder = {"dunningGroupNo", "dunningGroupName", "dunningGroupDescription", "clientDunningGroupId", "dunningProcessNo", "clientDunningProcessId", "masterPlansSummary"})
public class DunningGroupsReturnElement {

    @XmlElement(name = "dunning_group_no")
    protected Long dunningGroupNo;
    @XmlElement(name = "dunning_group_name")
    protected String dunningGroupName;
    @XmlElement(name = "dunning_group_description")
    protected String dunningGroupDescription;
    @XmlElement(name = "client_dunning_group_id")
    protected String clientDunningGroupId;
    @XmlElement(name = "dunning_process_no")
    protected Long dunningProcessNo;
    @XmlElement(name = "client_dunning_process_id")
    protected String clientDunningProcessId;
    @XmlElement(name = "master_plans_summary")
    protected List<MasterPlansSummaryReturnElement> masterPlansSummary;
    
    public Long getDunningGroupNo() {
        return dunningGroupNo;
    }

    public void setDunningGroupNo(Long value) {
        this.dunningGroupNo = value;
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

    public String getClientDunningGroupId() {
        return clientDunningGroupId;
    }

    public void setClientDunningGroupId(String value) {
        this.clientDunningGroupId = value;
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

    public List<MasterPlansSummaryReturnElement> getMasterPlansSummary() {
        if (this.masterPlansSummary == null) {
            this.masterPlansSummary = new ArrayList<MasterPlansSummaryReturnElement>();
        }
        return this.masterPlansSummary;
    }
}
