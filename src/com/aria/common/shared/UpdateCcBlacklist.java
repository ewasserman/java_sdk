package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "ccNum",    "assignmentDirective",    "notes"})
@XmlRootElement(name = "update_cc_blacklist")
public class UpdateCcBlacklist {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "cc_num")
    protected String ccNum;
        @XmlElement(name = "assignment_directive")
    protected Long assignmentDirective;
        @XmlElement(name = "notes")
    protected String notes;
    
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

    public String getCcNum() {
        return ccNum;
    }

    public void setCcNum(String value) {
        this.ccNum = value;
    }
            public Long getAssignmentDirective() {
        return assignmentDirective;
    }

    public void setAssignmentDirective(Long value) {
        this.assignmentDirective = value;
    }
            public String getNotes() {
        return notes;
    }

    public void setNotes(String value) {
        this.notes = value;
    }
            
}
