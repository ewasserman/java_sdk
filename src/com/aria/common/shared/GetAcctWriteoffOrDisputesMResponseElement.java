package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "writeoffDisputeInfo"})
@XmlRootElement(name = "get_acct_writeoff_or_disputes_mResponseElement")
public class GetAcctWriteoffOrDisputesMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "writeoff_dispute_info")
    protected List<WriteoffDisputeInfoReturnElement> writeoffDisputeInfo;
    
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

    public List<WriteoffDisputeInfoReturnElement> getWriteoffDisputeInfo() {
        if (this.writeoffDisputeInfo == null) {
            this.writeoffDisputeInfo = new ArrayList<WriteoffDisputeInfoReturnElement>();
        }
        return this.writeoffDisputeInfo;
    }
}
