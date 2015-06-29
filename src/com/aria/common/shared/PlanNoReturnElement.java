package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_no_ReturnElement", propOrder = {"planNo", "planStatusCd", "planStatusLabel"})
public class PlanNoReturnElement {

    @XmlElement(name = "plan_no")
    protected Long planNo;
    @XmlElement(name = "plan_status_cd")
    protected Long planStatusCd;
    @XmlElement(name = "plan_status_label")
    protected String planStatusLabel;
    
    public Long getPlanNo() {
        return planNo;
    }

    public void setPlanNo(Long value) {
        this.planNo = value;
    }

    public Long getPlanStatusCd() {
        return planStatusCd;
    }

    public void setPlanStatusCd(Long value) {
        this.planStatusCd = value;
    }

    public String getPlanStatusLabel() {
        return planStatusLabel;
    }

    public void setPlanStatusLabel(String value) {
        this.planStatusLabel = value;
    }

    
}
