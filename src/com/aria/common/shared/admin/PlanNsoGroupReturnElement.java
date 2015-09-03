package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_nso_group_ReturnElement", propOrder = {"itemNo", "activeInd", "planNsoGroupPriceOverride"})
public class PlanNsoGroupReturnElement {

    @XmlElement(name = "item_no")
    protected Long itemNo;
    @XmlElement(name = "active_ind")
    protected Long activeInd;
    @XmlElement(name = "plan_nso_group_price_override")
    protected List<PlanNsoGroupPriceOverrideReturnElement> planNsoGroupPriceOverride;
    
    public Long getItemNo() {
        return itemNo;
    }

    public void setItemNo(Long value) {
        this.itemNo = value;
    }

    public Long getActiveInd() {
        return activeInd;
    }

    public void setActiveInd(Long value) {
        this.activeInd = value;
    }

    public List<PlanNsoGroupPriceOverrideReturnElement> getPlanNsoGroupPriceOverride() {
        if (this.planNsoGroupPriceOverride == null) {
            this.planNsoGroupPriceOverride = new ArrayList<PlanNsoGroupPriceOverrideReturnElement>();
        }
        return this.planNsoGroupPriceOverride;
    }
}
