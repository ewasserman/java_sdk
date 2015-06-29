package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "masterPlansDtlBySuppField"})
@XmlRootElement(name = "get_master_plans_by_supp_field_mResponseElement")
public class GetMasterPlansBySuppFieldMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "master_plans_dtl_by_supp_field")
    protected List<MasterPlansDtlBySuppFieldReturnElement> masterPlansDtlBySuppField;
    
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

    public List<MasterPlansDtlBySuppFieldReturnElement> getMasterPlansDtlBySuppField() {
        if (this.masterPlansDtlBySuppField == null) {
            this.masterPlansDtlBySuppField = new ArrayList<MasterPlansDtlBySuppFieldReturnElement>();
        }
        return this.masterPlansDtlBySuppField;
    }
}
