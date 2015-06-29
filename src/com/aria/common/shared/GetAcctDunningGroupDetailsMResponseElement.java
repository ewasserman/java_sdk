package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "dunningGroupName", "dunningGroupDescription", "outClientDunningGroupId", "dunningProcess", "masterPlansSummary"})
@XmlRootElement(name = "get_acct_dunning_group_details_mResponseElement")
public class GetAcctDunningGroupDetailsMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "dunning_group_name")
    protected String dunningGroupName;
    @XmlElement(name = "dunning_group_description")
    protected String dunningGroupDescription;
    @XmlElement(name = "out_client_dunning_group_id")
    protected String outClientDunningGroupId;
    @XmlElement(name = "dunning_process")
    protected String dunningProcess;
    @XmlElement(name = "master_plans_summary")
    protected List<MasterPlansSummaryReturnElement> masterPlansSummary;
    
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

    public String getDunningGroupName() {
        return dunningGroupName;
    }

    public void setDunningGroupName(String value) {
        this.dunningGroupName = value;
    }

    public String getDunningGroupDescription() {
        return dunningGroupDescription;
    }

    public void setDunningGroupDescription(String value) {
        this.dunningGroupDescription = value;
    }

    public String getOutClientDunningGroupId() {
        return outClientDunningGroupId;
    }

    public void setOutClientDunningGroupId(String value) {
        this.outClientDunningGroupId = value;
    }

    public String getDunningProcess() {
        return dunningProcess;
    }

    public void setDunningProcess(String value) {
        this.dunningProcess = value;
    }

    public List<MasterPlansSummaryReturnElement> getMasterPlansSummary() {
        if (this.masterPlansSummary == null) {
            this.masterPlansSummary = new ArrayList<MasterPlansSummaryReturnElement>();
        }
        return this.masterPlansSummary;
    }
}
