package com.aria.common.shared.object;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "master_plan_instances_ReturnElement", propOrder = {"masterPlanInstanceId", "clientMasterPlanInstanceId", "clientMasterPlanId", "masterPlanNo", "masterPlanInstanceDescription", "suppPlans", "couponCd"})
public class MasterPlanInstancesReturnElement {

    @XmlElement(name = "master_plan_instance_id")
    protected String masterPlanInstanceId;
    @XmlElement(name = "client_master_plan_instance_id")
    protected String clientMasterPlanInstanceId;
    @XmlElement(name = "client_master_plan_id")
    protected String clientMasterPlanId;
    @XmlElement(name = "master_plan_no")
    protected String masterPlanNo;
    @XmlElement(name = "master_plan_instance_description")
    protected String masterPlanInstanceDescription;
    @XmlElement(name = "supp_plans")
    protected List<SuppPlansReturnElement> suppPlans;
    @XmlElement(name = "coupon_cd")
    protected List<CouponCdReturnElement> couponCd;
    
    public String getMasterPlanInstanceId() {
        return masterPlanInstanceId;
    }

    public void setMasterPlanInstanceId(String value) {
        this.masterPlanInstanceId = value;
    }

    public String getClientMasterPlanInstanceId() {
        return clientMasterPlanInstanceId;
    }

    public void setClientMasterPlanInstanceId(String value) {
        this.clientMasterPlanInstanceId = value;
    }

    public String getClientMasterPlanId() {
        return clientMasterPlanId;
    }

    public void setClientMasterPlanId(String value) {
        this.clientMasterPlanId = value;
    }

    public String getMasterPlanNo() {
        return masterPlanNo;
    }

    public void setMasterPlanNo(String value) {
        this.masterPlanNo = value;
    }

    public String getMasterPlanInstanceDescription() {
        return masterPlanInstanceDescription;
    }

    public void setMasterPlanInstanceDescription(String value) {
        this.masterPlanInstanceDescription = value;
    }

    public List<SuppPlansReturnElement> getSuppPlans() {
        if (this.suppPlans == null) {
            this.suppPlans = new ArrayList<SuppPlansReturnElement>();
        }
        return this.suppPlans;
    }public List<CouponCdReturnElement> getCouponCd() {
        if (this.couponCd == null) {
            this.couponCd = new ArrayList<CouponCdReturnElement>();
        }
        return this.couponCd;
    }
}
