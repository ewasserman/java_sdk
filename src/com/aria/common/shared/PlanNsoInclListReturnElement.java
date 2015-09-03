package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_nso_incl_list_ReturnElement", propOrder = {"itemNo", "activeInd"})
public class PlanNsoInclListReturnElement {

    @XmlElement(name = "item_no")
    protected Long itemNo;
    @XmlElement(name = "active_ind")
    protected Long activeInd;
    
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

    
}
