package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"uuidInfo", "errorCode", "errorMsg"})
@XmlRootElement(name = "get_acct_uuids_mResponseElement")
public class GetAcctUuidsMResponseElement {

    @XmlElement(name = "uuid_info")
    protected List<UuidInfoReturnElement> uuidInfo;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public List<UuidInfoReturnElement> getUuidInfo() {
        if (this.uuidInfo == null) {
            this.uuidInfo = new ArrayList<UuidInfoReturnElement>();
        }
        return this.uuidInfo;
    }public Long getErrorCode() {
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

    
}
