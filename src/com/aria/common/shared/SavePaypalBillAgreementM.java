package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "billingGroupNo",    "clientBillingGroupId",    "masterPlanInstanceNo",    "clientMasterPlanInstanceId",    "token"})
@XmlRootElement(name = "save_paypal_bill_agreement_m")
public class SavePaypalBillAgreementM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "billing_group_no")
    protected Long billingGroupNo;
        @XmlElement(name = "client_billing_group_id")
    protected String clientBillingGroupId;
        @XmlElement(name = "master_plan_instance_no")
    protected Long masterPlanInstanceNo;
        @XmlElement(name = "client_master_plan_instance_id")
    protected String clientMasterPlanInstanceId;
        @XmlElement(name = "token")
    protected String token;
    
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
            public Long getBillingGroupNo() {
        return billingGroupNo;
    }

    public void setBillingGroupNo(Long value) {
        this.billingGroupNo = value;
    }
            public String getClientBillingGroupId() {
        return clientBillingGroupId;
    }

    public void setClientBillingGroupId(String value) {
        this.clientBillingGroupId = value;
    }
            public Long getMasterPlanInstanceNo() {
        return masterPlanInstanceNo;
    }

    public void setMasterPlanInstanceNo(Long value) {
        this.masterPlanInstanceNo = value;
    }
            public String getClientMasterPlanInstanceId() {
        return clientMasterPlanInstanceId;
    }

    public void setClientMasterPlanInstanceId(String value) {
        this.clientMasterPlanInstanceId = value;
    }
            public String getToken() {
        return token;
    }

    public void setToken(String value) {
        this.token = value;
    }
            
}
