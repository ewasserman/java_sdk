package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_nso_items_ReturnElement", propOrder = {"itemNo", "activeInd", "minQty", "maxQty", "itemScope", "planNsoPriceOverride"})
public class PlanNsoItemsReturnElement {

    @XmlElement(name = "item_no")
    protected Long itemNo;
    @XmlElement(name = "active_ind")
    protected Long activeInd;
    @XmlElement(name = "min_qty")
    protected String minQty;
    @XmlElement(name = "max_qty")
    protected String maxQty;
    @XmlElement(name = "item_scope")
    protected Long itemScope;
    @XmlElement(name = "plan_nso_price_override")
    protected List<PlanNsoPriceOverrideReturnElement> planNsoPriceOverride;
    
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

    public String getMinQty() {
        return minQty;
    }

    public void setMinQty(String value) {
        this.minQty = value;
    }

    public String getMaxQty() {
        return maxQty;
    }

    public void setMaxQty(String value) {
        this.maxQty = value;
    }

    public Long getItemScope() {
        return itemScope;
    }

    public void setItemScope(Long value) {
        this.itemScope = value;
    }

    public List<PlanNsoPriceOverrideReturnElement> getPlanNsoPriceOverride() {
        if (this.planNsoPriceOverride == null) {
            this.planNsoPriceOverride = new ArrayList<PlanNsoPriceOverrideReturnElement>();
        }
        return this.planNsoPriceOverride;
    }
}
