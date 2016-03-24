package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eligible_plan_instances_row", propOrder = {
    "planInstanceNo",
    "planInstanceServiceNo"
    })
public class EligiblePlanInstancesRow {

    @XmlElement(name = "plan_instance_no")
    protected Long planInstanceNo;
    @XmlElement(name = "plan_instance_service_no")
    protected Long planInstanceServiceNo;
    public Long getPlanInstanceNo() {
        return planInstanceNo;
    }

    public void setPlanInstanceNo(Long value) {
        this.planInstanceNo = value;
    }

    public Long getPlanInstanceServiceNo() {
        return planInstanceServiceNo;
    }

    public void setPlanInstanceServiceNo(Long value) {
        this.planInstanceServiceNo = value;
    }

    
}
