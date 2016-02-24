package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "promo_plan_set_ReturnElement", propOrder = {"promoPlanSetNo", "promoPlanSetName", "promoPlanSetDesc", "clientPlanTypeId"})
public class PromoPlanSetReturnElement {

    @XmlElement(name = "promo_plan_set_no")
    protected Long promoPlanSetNo;
    @XmlElement(name = "promo_plan_set_name")
    protected String promoPlanSetName;
    @XmlElement(name = "promo_plan_set_desc")
    protected String promoPlanSetDesc;
    @XmlElement(name = "client_plan_type_id")
    protected String clientPlanTypeId;
    
    public Long getPromoPlanSetNo() {
        return promoPlanSetNo;
    }

    public void setPromoPlanSetNo(Long value) {
        this.promoPlanSetNo = value;
    }

    public String getPromoPlanSetName() {
        return promoPlanSetName;
    }

    public void setPromoPlanSetName(String value) {
        this.promoPlanSetName = value;
    }

    public String getPromoPlanSetDesc() {
        return promoPlanSetDesc;
    }

    public void setPromoPlanSetDesc(String value) {
        this.promoPlanSetDesc = value;
    }

    public String getClientPlanTypeId() {
        return clientPlanTypeId;
    }

    public void setClientPlanTypeId(String value) {
        this.clientPlanTypeId = value;
    }

    
}
