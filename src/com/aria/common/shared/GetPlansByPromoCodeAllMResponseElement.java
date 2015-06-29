package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "allPlanDts"})
@XmlRootElement(name = "get_plans_by_promo_code_all_mResponseElement")
public class GetPlansByPromoCodeAllMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "all_plan_dts")
    protected List<AllPlanDtsReturnElement> allPlanDts;
    
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

    public List<AllPlanDtsReturnElement> getAllPlanDts() {
        if (this.allPlanDts == null) {
            this.allPlanDts = new ArrayList<AllPlanDtsReturnElement>();
        }
        return this.allPlanDts;
    }
}
