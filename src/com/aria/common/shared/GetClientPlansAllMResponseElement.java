package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "allClientPlanDtls"})
@XmlRootElement(name = "get_client_plans_all_mResponseElement")
public class GetClientPlansAllMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "all_client_plan_dtls")
    protected List<AllClientPlanDtlsReturnElement> allClientPlanDtls;
    
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

    public List<AllClientPlanDtlsReturnElement> getAllClientPlanDtls() {
        if (this.allClientPlanDtls == null) {
            this.allClientPlanDtls = new ArrayList<AllClientPlanDtlsReturnElement>();
        }
        return this.allClientPlanDtls;
    }
}
