package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "lengthMonths",    "endDate",    "planNo",    "typeNo",    "createComments",    "startDate",    "doAutoDiscard",    "clientPlanId"})
@XmlRootElement(name = "create_acct_multiplan_contract")
public class CreateAcctMultiplanContract {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "length_months")
    protected Long lengthMonths;
        @XmlElement(name = "end_date")
    protected String endDate;
        @XmlElement(name = "plan_no")
    protected PlanNoArray planNo;
        @XmlElement(name = "type_no")
    protected Long typeNo;
        @XmlElement(name = "create_comments")
    protected String createComments;
        @XmlElement(name = "start_date")
    protected String startDate;
        @XmlElement(name = "do_auto_discard")
    protected String doAutoDiscard;
        @XmlElement(name = "client_plan_id")
    protected ClientPlanIdArray clientPlanId;
    
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
            public Long getLengthMonths() {
        return lengthMonths;
    }

    public void setLengthMonths(Long value) {
        this.lengthMonths = value;
    }
            public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String value) {
        this.endDate = value;
    }
            public PlanNoArray getPlanNo() {
        return planNo;
    }

    public void setPlanNo(PlanNoArray value) {
        this.planNo = value;
    }
            public Long getTypeNo() {
        return typeNo;
    }

    public void setTypeNo(Long value) {
        this.typeNo = value;
    }
            public String getCreateComments() {
        return createComments;
    }

    public void setCreateComments(String value) {
        this.createComments = value;
    }
            public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String value) {
        this.startDate = value;
    }
            public String getDoAutoDiscard() {
        return doAutoDiscard;
    }

    public void setDoAutoDiscard(String value) {
        this.doAutoDiscard = value;
    }
            public ClientPlanIdArray getClientPlanId() {
        return clientPlanId;
    }

    public void setClientPlanId(ClientPlanIdArray value) {
        this.clientPlanId = value;
    }
            
}
