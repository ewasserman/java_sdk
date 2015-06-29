package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "allClientPlansServices"})
@XmlRootElement(name = "get_avail_plans_for_acct_all_mResponseElement")
public class GetAvailPlansForAcctAllMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "all_client_plans_services")
    protected List<AllClientPlansServicesReturnElement> allClientPlansServices;
    
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

    public List<AllClientPlansServicesReturnElement> getAllClientPlansServices() {
        if (this.allClientPlansServices == null) {
            this.allClientPlansServices = new ArrayList<AllClientPlansServicesReturnElement>();
        }
        return this.allClientPlansServices;
    }
}
