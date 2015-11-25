package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_groups_ReturnElement", propOrder = {"groupNo", "groupName", "planSetNo", "setName", "setDescription", "clientPlanTypeId", "planGroup", "groupDesc", "clientPlanChangeGroupId", "groupUsage", "groupPlansCount"})
public class PlanGroupsReturnElement {

    @XmlElement(name = "group_no")
    protected Long groupNo;
    @XmlElement(name = "group_name")
    protected String groupName;
    @XmlElement(name = "plan_set_no")
    protected Long planSetNo;
    @XmlElement(name = "set_name")
    protected String setName;
    @XmlElement(name = "set_description")
    protected String setDescription;
    @XmlElement(name = "client_plan_type_id")
    protected String clientPlanTypeId;
    @XmlElement(name = "plan_group")
    protected Long planGroup;
    @XmlElement(name = "group_desc")
    protected String groupDesc;
    @XmlElement(name = "client_plan_change_group_id")
    protected String clientPlanChangeGroupId;
    @XmlElement(name = "group_usage")
    protected String groupUsage;
    @XmlElement(name = "group_plans_count")
    protected Long groupPlansCount;
    
    public Long getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(Long value) {
        this.groupNo = value;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String value) {
        this.groupName = value;
    }

    public Long getPlanSetNo() {
        return planSetNo;
    }

    public void setPlanSetNo(Long value) {
        this.planSetNo = value;
    }

    public String getSetName() {
        return setName;
    }

    public void setSetName(String value) {
        this.setName = value;
    }

    public String getSetDescription() {
        return setDescription;
    }

    public void setSetDescription(String value) {
        this.setDescription = value;
    }

    public String getClientPlanTypeId() {
        return clientPlanTypeId;
    }

    public void setClientPlanTypeId(String value) {
        this.clientPlanTypeId = value;
    }

    public Long getPlanGroup() {
        return planGroup;
    }

    public void setPlanGroup(Long value) {
        this.planGroup = value;
    }

    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(String value) {
        this.groupDesc = value;
    }

    public String getClientPlanChangeGroupId() {
        return clientPlanChangeGroupId;
    }

    public void setClientPlanChangeGroupId(String value) {
        this.clientPlanChangeGroupId = value;
    }

    public String getGroupUsage() {
        return groupUsage;
    }

    public void setGroupUsage(String value) {
        this.groupUsage = value;
    }

    public Long getGroupPlansCount() {
        return groupPlansCount;
    }

    public void setGroupPlansCount(Long value) {
        this.groupPlansCount = value;
    }

    
}
