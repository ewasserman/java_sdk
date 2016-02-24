package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"uuidData", "errorCode", "errorMsg"})
@XmlRootElement(name = "get_acct_uuidsResponseElement")
public class GetAcctUuidsResponseElement {

    @XmlElement(name = "uuid_data")
    protected List<UuidDataReturnElement> uuidData;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public List<UuidDataReturnElement> getUuidData() {
        if (this.uuidData == null) {
            this.uuidData = new ArrayList<UuidDataReturnElement>();
        }
        return this.uuidData;
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
