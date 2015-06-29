package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "typeNo", "lengthMonths", "createComments", "updateComments", "createDate", "updateDate", "startDate", "endDate", "statusCode", "planNo", "planName", "clientPlanId"})
@XmlRootElement(name = "get_acct_multiplan_contractResponseElement")
public class GetAcctMultiplanContractResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "type_no")
    protected Long typeNo;
    @XmlElement(name = "length_months")
    protected Long lengthMonths;
    @XmlElement(name = "create_comments")
    protected String createComments;
    @XmlElement(name = "update_comments")
    protected String updateComments;
    @XmlElement(name = "create_date")
    protected String createDate;
    @XmlElement(name = "update_date")
    protected String updateDate;
    @XmlElement(name = "start_date")
    protected String startDate;
    @XmlElement(name = "end_date")
    protected String endDate;
    @XmlElement(name = "status_code")
    protected String statusCode;
    @XmlElement(name = "plan_no")
    protected List<PlanNoReturnElement> planNo;
    @XmlElement(name = "plan_name")
    protected List<PlanNameReturnElement> planName;
    @XmlElement(name = "client_plan_id")
    protected List<ClientPlanIdReturnElement> clientPlanId;
    
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

    public Long getTypeNo() {
        return typeNo;
    }

    public void setTypeNo(Long value) {
        this.typeNo = value;
    }

    public Long getLengthMonths() {
        return lengthMonths;
    }

    public void setLengthMonths(Long value) {
        this.lengthMonths = value;
    }

    public String getCreateComments() {
        return createComments;
    }

    public void setCreateComments(String value) {
        this.createComments = value;
    }

    public String getUpdateComments() {
        return updateComments;
    }

    public void setUpdateComments(String value) {
        this.updateComments = value;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String value) {
        this.createDate = value;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String value) {
        this.updateDate = value;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String value) {
        this.startDate = value;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String value) {
        this.endDate = value;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    public List<PlanNoReturnElement> getPlanNo() {
        if (this.planNo == null) {
            this.planNo = new ArrayList<PlanNoReturnElement>();
        }
        return this.planNo;
    }public List<PlanNameReturnElement> getPlanName() {
        if (this.planName == null) {
            this.planName = new ArrayList<PlanNameReturnElement>();
        }
        return this.planName;
    }public List<ClientPlanIdReturnElement> getClientPlanId() {
        if (this.clientPlanId == null) {
            this.clientPlanId = new ArrayList<ClientPlanIdReturnElement>();
        }
        return this.clientPlanId;
    }
}
