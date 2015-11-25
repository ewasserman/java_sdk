package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eligible_child_plans_row", propOrder = {
    "planNo",
    "clientPlanId",
    "isMandatory",
    "includeDefault",
    "minUnits",
    "maxUnits",
    "enforcementLevel"
    })
public class EligibleChildPlansRow {

    @XmlElement(name = "plan_no")
    protected String planNo;
    @XmlElement(name = "client_plan_id")
    protected String clientPlanId;
    @XmlElement(name = "is_mandatory")
    protected Long isMandatory;
    @XmlElement(name = "include_default")
    protected Long includeDefault;
    @XmlElement(name = "min_units")
    protected Long minUnits;
    @XmlElement(name = "max_units")
    protected Long maxUnits;
    @XmlElement(name = "enforcement_level")
    protected Long enforcementLevel;
    public String getPlanNo() {
        return planNo;
    }

    public void setPlanNo(String value) {
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

    public Long getIncludeDefault() {
        return includeDefault;
    }

    public void setIncludeDefault(Long value) {
        this.includeDefault = value;
    }

    public Long getMinUnits() {
        return minUnits;
    }

    public void setMinUnits(Long value) {
        this.minUnits = value;
    }

    public Long getMaxUnits() {
        return maxUnits;
    }

    public void setMaxUnits(Long value) {
        this.maxUnits = value;
    }

    public Long getEnforcementLevel() {
        return enforcementLevel;
    }

    public void setEnforcementLevel(Long value) {
        this.enforcementLevel = value;
    }

    
}
