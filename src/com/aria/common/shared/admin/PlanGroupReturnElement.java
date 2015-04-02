package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_group_ReturnElement", propOrder = {"groupNo", "groupName", "groupDesc"})
public class PlanGroupReturnElement {

    @XmlElement(name = "group_no")
    protected Long groupNo;
    @XmlElement(name = "group_name")
    protected String groupName;
    @XmlElement(name = "group_desc")
    protected String groupDesc;
    
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

    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(String value) {
        this.groupDesc = value;
    }

    
}
