package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "child_plans_ReturnElement", propOrder = {"planNo", "clientPlanId", "isMandatory", "isDefault", "minUnits", "maxUnits", "enforcementLevel"})
public class ChildPlansReturnElement {

    @XmlElement(name = "plan_no")
    protected Long planNo;
    @XmlElement(name = "client_plan_id")
    protected String clientPlanId;
    @XmlElement(name = "is_mandatory")
    protected Long isMandatory;
    @XmlElement(name = "is_default")
    protected String isDefault;
    @XmlElement(name = "min_units")
    protected Long minUnits;
    @XmlElement(name = "max_units")
    protected String maxUnits;
    @XmlElement(name = "enforcement_level")
    protected String enforcementLevel;
    
    public Long getPlanNo() {
        return planNo;
    }

    public void setPlanNo(Long value) {
        this.planNo = value;
    }

    public String getClientPlanId() {
        return clientPlanId;
    }

    public void setClientPlanId(String value) {
        this.clientPlanId = value;
    }

    public Long getIsMandatory() {
        return isMandatory;
    }

    public void setIsMandatory(Long value) {
        this.isMandatory = value;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String value) {
        this.isDefault = value;
    }

    public Long getMinUnits() {
        return minUnits;
    }

    public void setMinUnits(Long value) {
        this.minUnits = value;
    }

    public String getMaxUnits() {
        return maxUnits;
    }

    public void setMaxUnits(String value) {
        this.maxUnits = value;
    }

    public String getEnforcementLevel() {
        return enforcementLevel;
    }

    public void setEnforcementLevel(String value) {
        this.enforcementLevel = value;
    }

    
}
