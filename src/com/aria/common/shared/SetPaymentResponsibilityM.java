package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "accountNo",    "planInstanceNo",    "clientPlanInstanceId",    "respLevelCd",    "seniorAcctNo",    "seniorAcctUserId",    "clientSeniorAcctId",    "seniorPlanInstanceNo",    "clientSeniorPlanInstanceId"})
@XmlRootElement(name = "set_payment_responsibility_m")
public class SetPaymentResponsibilityM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "account_no")
    protected Long accountNo;
        @XmlElement(name = "plan_instance_no")
    protected Long planInstanceNo;
        @XmlElement(name = "client_plan_instance_id")
    protected String clientPlanInstanceId;
        @XmlElement(name = "resp_level_cd")
    protected Long respLevelCd;
        @XmlElement(name = "senior_acct_no")
    protected Long seniorAcctNo;
        @XmlElement(name = "senior_acct_user_id")
    protected String seniorAcctUserId;
        @XmlElement(name = "client_senior_acct_id")
    protected String clientSeniorAcctId;
        @XmlElement(name = "senior_plan_instance_no")
    protected Long seniorPlanInstanceNo;
        @XmlElement(name = "client_senior_plan_instance_id")
    protected String clientSeniorPlanInstanceId;
    
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

    public Long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Long value) {
        this.accountNo = value;
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
            public Long getRespLevelCd() {
        return respLevelCd;
    }

    public void setRespLevelCd(Long value) {
        this.respLevelCd = value;
    }
            public Long getSeniorAcctNo() {
        return seniorAcctNo;
    }

    public void setSeniorAcctNo(Long value) {
        this.seniorAcctNo = value;
    }
            public String getSeniorAcctUserId() {
        return seniorAcctUserId;
    }

    public void setSeniorAcctUserId(String value) {
        this.seniorAcctUserId = value;
    }
            public String getClientSeniorAcctId() {
        return clientSeniorAcctId;
    }

    public void setClientSeniorAcctId(String value) {
        this.clientSeniorAcctId = value;
    }
            public Long getSeniorPlanInstanceNo() {
        return seniorPlanInstanceNo;
    }

    public void setSeniorPlanInstanceNo(Long value) {
        this.seniorPlanInstanceNo = value;
    }
            public String getClientSeniorPlanInstanceId() {
        return clientSeniorPlanInstanceId;
    }

    public void setClientSeniorPlanInstanceId(String value) {
        this.clientSeniorPlanInstanceId = value;
    }
            
}
