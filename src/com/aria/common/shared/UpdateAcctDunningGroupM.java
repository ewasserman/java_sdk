package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "dunningGroupNo",    "clientDunningGroupId",    "newClientDunningGroupId",    "dunningGroupName",    "dunningGroupDescription",    "dunningProcessNo",    "clientDunningProcessId",    "dunningGroupDirective",    "masterPlansSummary"})
@XmlRootElement(name = "update_acct_dunning_group_m")
public class UpdateAcctDunningGroupM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "dunning_group_no")
    protected Long dunningGroupNo;
        @XmlElement(name = "client_dunning_group_id")
    protected String clientDunningGroupId;
        @XmlElement(name = "new_client_dunning_group_id")
    protected String newClientDunningGroupId;
        @XmlElement(name = "dunning_group_name")
    protected String dunningGroupName;
        @XmlElement(name = "dunning_group_description")
    protected String dunningGroupDescription;
        @XmlElement(name = "dunning_process_no")
    protected Long dunningProcessNo;
        @XmlElement(name = "client_dunning_process_id")
    protected String clientDunningProcessId;
        @XmlElement(name = "dunning_group_directive")
    protected Long dunningGroupDirective;
        @XmlElement(name = "master_plans_summary")
    protected MasterPlansSummaryArray masterPlansSummary;
    
    public long getClientNo() {
        return clientNo;
    }

    public void setClientNo(Long value) {
        this.clientNo = value;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String value) {
        this.authKey = value;
    }

    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
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
            public String getNewClientDunningGroupId() {
        return newClientDunningGroupId;
    }

    public void setNewClientDunningGroupId(String value) {
        this.newClientDunningGroupId = value;
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
            public Long getDunningGroupDirective() {
        return dunningGroupDirective;
    }

    public void setDunningGroupDirective(Long value) {
        this.dunningGroupDirective = value;
    }
            public MasterPlansSummaryArray getMasterPlansSummary() {
        return masterPlansSummary;
    }

    public void setMasterPlansSummary(MasterPlansSummaryArray value) {
        this.masterPlansSummary = value;
    }
            
}
