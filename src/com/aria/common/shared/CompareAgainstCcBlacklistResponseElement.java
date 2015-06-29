package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "ccNumBlacklisted", "notes", "dateAdded", "dateRemoved"})
@XmlRootElement(name = "compare_against_cc_blacklistResponseElement")
public class CompareAgainstCcBlacklistResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "cc_num_blacklisted")
    protected Long ccNumBlacklisted;
    @XmlElement(name = "notes")
    protected String notes;
    @XmlElement(name = "date_added")
    protected String dateAdded;
    @XmlElement(name = "date_removed")
    protected String dateRemoved;
    
    public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long value) {
        this.errorCode = value;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    public Long getCcNumBlacklisted() {
        return ccNumBlacklisted;
    }

    public void setCcNumBlacklisted(Long value) {
        this.ccNumBlacklisted = value;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String value) {
        this.notes = value;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String value) {
        this.dateAdded = value;
    }

    public String getDateRemoved() {
        return dateRemoved;
    }

    public void setDateRemoved(String value) {
        this.dateRemoved = value;
    }

    
}
