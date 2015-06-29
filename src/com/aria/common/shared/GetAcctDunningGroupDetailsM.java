package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "clientAcctId",    "planInstanceNo",    "clientPlanInstanceId",    "dunningGroupNo",    "clientDunningGroupId"})
@XmlRootElement(name = "get_acct_dunning_group_details_m")
public class GetAcctDunningGroupDetailsM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
        @XmlElement(name = "plan_instance_no")
    protected Long planInstanceNo;
        @XmlElement(name = "client_plan_instance_id")
    protected String clientPlanInstanceId;
        @XmlElement(name = "dunning_group_no")
    protected Long dunningGroupNo;
        @XmlElement(name = "client_dunning_group_id")
    protected String clientDunningGroupId;
    
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
            public String getClientAcctId() {
        return clientAcctId;
    }

    public void setClientAcctId(String value) {
        this.clientAcctId = value;
    }
            public Long getPlanInstanceNo() {
        return planInstanceNo;
    }

    public void setPlanInstanceNo(Long value) {
        this.planInstanceNo = value;
    }
            public String getClientPlanInstanceId() {
        return clientPlanInstanceId;
    }

    public void setClientPlanInstanceId(String value) {
        this.clientPlanInstanceId = value;
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
            
}
