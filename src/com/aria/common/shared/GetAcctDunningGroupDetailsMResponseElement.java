package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "dunningGroups"})
@XmlRootElement(name = "get_acct_dunning_group_details_mResponseElement")
public class GetAcctDunningGroupDetailsMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "dunning_groups")
    protected List<DunningGroupsReturnElement> dunningGroups;
    
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

    public List<DunningGroupsReturnElement> getDunningGroups() {
        if (this.dunningGroups == null) {
            this.dunningGroups = new ArrayList<DunningGroupsReturnElement>();
        }
        return this.dunningGroups;
    }
}
