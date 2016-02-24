package com.aria.common.shared.object;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "master_plan_instances_ReturnElement", propOrder = {"masterPlanInstanceId", "clientMasterPlanInstanceId", "clientMasterPlanId", "masterPlanNo", "masterPlanInstanceDescription", "dunningGroupNo", "clientDunningGroupId", "dunningGroupName", "dunningGroupDescription", "dunningProcessNo", "clientDunningProcessId", "poNum", "suppPlans", "couponCd", "masterPlanPlanInstFields"})
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
    @XmlElement(name = "dunning_group_no")
    protected Long dunningGroupNo;
    @XmlElement(name = "client_dunning_group_id")
    protected String clientDunningGroupId;
    @XmlElement(name = "dunning_group_name")
    protected String dunningGroupName;
    @XmlElement(name = "dunning_group_description")
    protected String dunningGroupDescription;
    @XmlElement(name = "dunning_process_no")
    protected Long dunningProcessNo;
    @XmlElement(name = "client_dunning_process_id")
    protected String clientDunningProcessId;
    @XmlElement(name = "po_num")
    protected String poNum;
    @XmlElement(name = "supp_plans")
    protected List<SuppPlansReturnElement> suppPlans;
    @XmlElement(name = "coupon_cd")
    protected List<CouponCdReturnElement> couponCd;
    @XmlElement(name = "master_plan_plan_inst_fields")
    protected List<MasterPlanPlanInstFieldsReturnElement> masterPlanPlanInstFields;
    
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

    public Long getDunningGroupNo() {
        return dunningGroupNo;
    }

    public void setDunningGroupNo(Long value) {
        this.dunningGroupNo = value;
    }

    public String getClientDunningGroupId() {
        return clientDunningGroupId;
    }

    public void setClientDunningGroupId(String value) {
        this.clientDunningGroupId = value;
    }

    public String getDunningGroupName() {
        return dunningGroupName;
    }

    public void setDunningGroupName(String value) {
        this.dunningGroupName = value;
    }

    public String getDunningGroupDescription() {
        return dunningGroupDescription;
    }

    public void setDunningGroupDescription(String value) {
        this.dunningGroupDescription = value;
    }

    public Long getDunningProcessNo() {
        return dunningProcessNo;
    }

    public void setDunningProcessNo(Long value) {
        this.dunningProcessNo = value;
    }

    public String getClientDunningProcessId() {
        return clientDunningProcessId;
    }

    public void setClientDunningProcessId(String value) {
        this.clientDunningProcessId = value;
    }

    public String getPoNum() {
        return poNum;
    }

    public void setPoNum(String value) {
        this.poNum = value;
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
    }public List<MasterPlanPlanInstFieldsReturnElement> getMasterPlanPlanInstFields() {
        if (this.masterPlanPlanInstFields == null) {
            this.masterPlanPlanInstFields = new ArrayList<MasterPlanPlanInstFieldsReturnElement>();
        }
        return this.masterPlanPlanInstFields;
    }
}
