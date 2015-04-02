package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "acctUserId",    "clientAcctId",    "notificationTemplateGroupId"})
@XmlRootElement(name = "set_acct_notify_tmplt_grp")
public class SetAcctNotifyTmpltGrp {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "acct_user_id")
    protected String acctUserId;
        @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
        @XmlElement(name = "notification_template_group_id")
    protected String notificationTemplateGroupId;
    
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
            public String getAcctUserId() {
        return acctUserId;
    }

    public void setAcctUserId(String value) {
        this.acctUserId = value;
    }
            public String getClientAcctId() {
        return clientAcctId;
    }

    public void setClientAcctId(String value) {
        this.clientAcctId = value;
    }
            public String getNotificationTemplateGroupId() {
        return notificationTemplateGroupId;
    }

    public void setNotificationTemplateGroupId(String value) {
        this.notificationTemplateGroupId = value;
    }
            
}
