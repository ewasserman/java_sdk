package com.aria.common.shared.object;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supp_plans_ReturnElement", propOrder = {"suppPlanInstanceNo", "clientSuppPlanInstanceId", "clientSuppPlanId", "suppPlanNo", "suppPlanInstanceDescription", "suppPlanInstanceStatus", "parentPlanInstanceNo", "clientParentPlanInstanceId"})
public class SuppPlansReturnElement {

    @XmlElement(name = "supp_plan_instance_no")
    protected String suppPlanInstanceNo;
    @XmlElement(name = "client_supp_plan_instance_id")
    protected String clientSuppPlanInstanceId;
    @XmlElement(name = "client_supp_plan_id")
    protected String clientSuppPlanId;
    @XmlElement(name = "supp_plan_no")
    protected String suppPlanNo;
    @XmlElement(name = "supp_plan_instance_description")
    protected String suppPlanInstanceDescription;
    @XmlElement(name = "supp_plan_instance_status")
    protected String suppPlanInstanceStatus;
    @XmlElement(name = "parent_plan_instance_no")
    protected String parentPlanInstanceNo;
    @XmlElement(name = "client_parent_plan_instance_id")
    protected String clientParentPlanInstanceId;
    
    public String getSuppPlanInstanceNo() {
        return suppPlanInstanceNo;
    }

    public void setSuppPlanInstanceNo(String value) {
        this.suppPlanInstanceNo = value;
    }

    public String getClientSuppPlanInstanceId() {
        return clientSuppPlanInstanceId;
    }

    public void setClientSuppPlanInstanceId(String value) {
        this.clientSuppPlanInstanceId = value;
    }

    public String getClientSuppPlanId() {
        return clientSuppPlanId;
    }

    public void setClientSuppPlanId(String value) {
        this.clientSuppPlanId = value;
    }

    public String getSuppPlanNo() {
        return suppPlanNo;
    }

    public void setSuppPlanNo(String value) {
        this.suppPlanNo = value;
    }

    public String getSuppPlanInstanceDescription() {
        return suppPlanInstanceDescription;
    }

    public void setSuppPlanInstanceDescription(String value) {
        this.suppPlanInstanceDescription = value;
    }

    public String getSuppPlanInstanceStatus() {
        return suppPlanInstanceStatus;
    }

    public void setSuppPlanInstanceStatus(String value) {
        this.suppPlanInstanceStatus = value;
    }

    public String getParentPlanInstanceNo() {
        return parentPlanInstanceNo;
    }

    public void setParentPlanInstanceNo(String value) {
        this.parentPlanInstanceNo = value;
    }

    public String getClientParentPlanInstanceId() {
        return clientParentPlanInstanceId;
    }

    public void setClientParentPlanInstanceId(String value) {
        this.clientParentPlanInstanceId = value;
    }

    
}
