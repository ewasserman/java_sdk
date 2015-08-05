package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dunning_process_details_ReturnElement", propOrder = {"dunningProcessNo", "clientDunningProcessId", "dunningProcessName", "dunningProcessDescription", "clientDefaultInd", "totalStepCount", "mappedMasterPlans", "mappedPayMethodTypes"})
public class DunningProcessDetailsReturnElement {

    @XmlElement(name = "dunning_process_no")
    protected Long dunningProcessNo;
    @XmlElement(name = "client_dunning_process_id")
    protected String clientDunningProcessId;
    @XmlElement(name = "dunning_process_name")
    protected String dunningProcessName;
    @XmlElement(name = "dunning_process_description")
    protected String dunningProcessDescription;
    @XmlElement(name = "client_default_ind")
    protected Long clientDefaultInd;
    @XmlElement(name = "total_step_count")
    protected Long totalStepCount;
    @XmlElement(name = "mapped_master_plans")
    protected List<MappedMasterPlansReturnElement> mappedMasterPlans;
    @XmlElement(name = "mapped_pay_method_types")
    protected List<MappedPayMethodTypesReturnElement> mappedPayMethodTypes;
    
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

    public String getDunningProcessName() {
        return dunningProcessName;
    }

    public void setDunningProcessName(String value) {
        this.dunningProcessName = value;
    }

    public String getDunningProcessDescription() {
        return dunningProcessDescription;
    }

    public void setDunningProcessDescription(String value) {
        this.dunningProcessDescription = value;
    }

    public Long getClientDefaultInd() {
        return clientDefaultInd;
    }

    public void setClientDefaultInd(Long value) {
        this.clientDefaultInd = value;
    }

    public Long getTotalStepCount() {
        return totalStepCount;
    }

    public void setTotalStepCount(Long value) {
        this.totalStepCount = value;
    }

    public List<MappedMasterPlansReturnElement> getMappedMasterPlans() {
        if (this.mappedMasterPlans == null) {
            this.mappedMasterPlans = new ArrayList<MappedMasterPlansReturnElement>();
        }
        return this.mappedMasterPlans;
    }public List<MappedPayMethodTypesReturnElement> getMappedPayMethodTypes() {
        if (this.mappedPayMethodTypes == null) {
            this.mappedPayMethodTypes = new ArrayList<MappedPayMethodTypesReturnElement>();
        }
        return this.mappedPayMethodTypes;
    }
}
