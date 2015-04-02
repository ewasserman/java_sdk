package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "acctUserId",    "clientAcctId",    "templateClass",    "overrideTemplateNo",    "behavioralOption",    "overrideTemplateOption"})
@XmlRootElement(name = "set_acct_notify_override")
public class SetAcctNotifyOverride {

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
        @XmlElement(name = "template_class")
    protected String templateClass;
        @XmlElement(name = "override_template_no")
    protected Long overrideTemplateNo;
        @XmlElement(name = "behavioral_option")
    protected Long behavioralOption;
        @XmlElement(name = "override_template_option")
    protected Long overrideTemplateOption;
    
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
            public String getTemplateClass() {
        return templateClass;
    }

    public void setTemplateClass(String value) {
        this.templateClass = value;
    }
            public Long getOverrideTemplateNo() {
        return overrideTemplateNo;
    }

    public void setOverrideTemplateNo(Long value) {
        this.overrideTemplateNo = value;
    }
            public Long getBehavioralOption() {
        return behavioralOption;
    }

    public void setBehavioralOption(Long value) {
        this.behavioralOption = value;
    }
            public Long getOverrideTemplateOption() {
        return overrideTemplateOption;
    }

    public void setOverrideTemplateOption(Long value) {
        this.overrideTemplateOption = value;
    }
            
}
