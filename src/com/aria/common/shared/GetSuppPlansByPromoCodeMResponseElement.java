package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "plansDetails"})
@XmlRootElement(name = "get_supp_plans_by_promo_code_mResponseElement")
public class GetSuppPlansByPromoCodeMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "plans_details")
    protected List<PlansDetailsReturnElement> plansDetails;
    
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

    public List<PlansDetailsReturnElement> getPlansDetails() {
        if (this.plansDetails == null) {
            this.plansDetails = new ArrayList<PlansDetailsReturnElement>();
        }
        return this.plansDetails;
    }
}
