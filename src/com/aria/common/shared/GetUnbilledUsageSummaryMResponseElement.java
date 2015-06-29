package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "currencyCd", "currencyName", "acctNo", "clientAcctId", "masterPlanInstanceId", "clientMasterPlanInstanceId", "mpiMtdThresholdAmount", "mpiPtdThresholdAmount", "clientMtdThresholdAmount", "clientPtdThresholdAmount", "mtdBalanceAmount", "ptdBalanceAmount", "mpiMtdDeltaSign", "mpiMtdDeltaAmount", "mpiPtdDeltaSign", "mpiPtdDeltaAmount", "clientMtdDeltaSign", "clientMtdDeltaAmount", "clientPtdDeltaSign", "clientPtdDeltaAmount", "unappSvcCreditBalAmount", "unappSvcCreditDeltaSign", "unappSvcCreditDeltaAmount", "unbilledUsageRec", "unitThresholdDetails"})
@XmlRootElement(name = "get_unbilled_usage_summary_mResponseElement")
public class GetUnbilledUsageSummaryMResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "currency_name")
    protected String currencyName;
    @XmlElement(name = "acct_no")
    protected Long acctNo;
    @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
    @XmlElement(name = "master_plan_instance_id")
    protected Long masterPlanInstanceId;
    @XmlElement(name = "client_master_plan_instance_id")
    protected String clientMasterPlanInstanceId;
    @XmlElement(name = "mpi_mtd_threshold_amount")
    protected Double mpiMtdThresholdAmount;
    @XmlElement(name = "mpi_ptd_threshold_amount")
    protected Double mpiPtdThresholdAmount;
    @XmlElement(name = "client_mtd_threshold_amount")
    protected Double clientMtdThresholdAmount;
    @XmlElement(name = "client_ptd_threshold_amount")
    protected Double clientPtdThresholdAmount;
    @XmlElement(name = "mtd_balance_amount")
    protected Double mtdBalanceAmount;
    @XmlElement(name = "ptd_balance_amount")
    protected Double ptdBalanceAmount;
    @XmlElement(name = "mpi_mtd_delta_sign")
    protected String mpiMtdDeltaSign;
    @XmlElement(name = "mpi_mtd_delta_amount")
    protected Double mpiMtdDeltaAmount;
    @XmlElement(name = "mpi_ptd_delta_sign")
    protected String mpiPtdDeltaSign;
    @XmlElement(name = "mpi_ptd_delta_amount")
    protected Double mpiPtdDeltaAmount;
    @XmlElement(name = "client_mtd_delta_sign")
    protected String clientMtdDeltaSign;
    @XmlElement(name = "client_mtd_delta_amount")
    protected Double clientMtdDeltaAmount;
    @XmlElement(name = "client_ptd_delta_sign")
    protected String clientPtdDeltaSign;
    @XmlElement(name = "client_ptd_delta_amount")
    protected Double clientPtdDeltaAmount;
    @XmlElement(name = "unapp_svc_credit_bal_amount")
    protected Double unappSvcCreditBalAmount;
    @XmlElement(name = "unapp_svc_credit_delta_sign")
    protected String unappSvcCreditDeltaSign;
    @XmlElement(name = "unapp_svc_credit_delta_amount")
    protected Double unappSvcCreditDeltaAmount;
    @XmlElement(name = "unbilled_usage_rec")
    protected List<UnbilledUsageRecReturnElement> unbilledUsageRec;
    @XmlElement(name = "unit_threshold_details")
    protected List<UnitThresholdDetailsReturnElement> unitThresholdDetails;
    
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

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String value) {
        this.currencyName = value;
    }

    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }

    public String getClientAcctId() {
        return clientAcctId;
    }

    public void setClientAcctId(String value) {
        this.clientAcctId = value;
    }

    public Long getMasterPlanInstanceId() {
        return masterPlanInstanceId;
    }

    public void setMasterPlanInstanceId(Long value) {
        this.masterPlanInstanceId = value;
    }

    public String getClientMasterPlanInstanceId() {
        return clientMasterPlanInstanceId;
    }

    public void setClientMasterPlanInstanceId(String value) {
        this.clientMasterPlanInstanceId = value;
    }

    public Double getMpiMtdThresholdAmount() {
        return mpiMtdThresholdAmount;
    }

    public void setMpiMtdThresholdAmount(Double value) {
        this.mpiMtdThresholdAmount = value;
    }

    public Double getMpiPtdThresholdAmount() {
        return mpiPtdThresholdAmount;
    }

    public void setMpiPtdThresholdAmount(Double value) {
        this.mpiPtdThresholdAmount = value;
    }

    public Double getClientMtdThresholdAmount() {
        return clientMtdThresholdAmount;
    }

    public void setClientMtdThresholdAmount(Double value) {
        this.clientMtdThresholdAmount = value;
    }

    public Double getClientPtdThresholdAmount() {
        return clientPtdThresholdAmount;
    }

    public void setClientPtdThresholdAmount(Double value) {
        this.clientPtdThresholdAmount = value;
    }

    public Double getMtdBalanceAmount() {
        return mtdBalanceAmount;
    }

    public void setMtdBalanceAmount(Double value) {
        this.mtdBalanceAmount = value;
    }

    public Double getPtdBalanceAmount() {
        return ptdBalanceAmount;
    }

    public void setPtdBalanceAmount(Double value) {
        this.ptdBalanceAmount = value;
    }

    public String getMpiMtdDeltaSign() {
        return mpiMtdDeltaSign;
    }

    public void setMpiMtdDeltaSign(String value) {
        this.mpiMtdDeltaSign = value;
    }

    public Double getMpiMtdDeltaAmount() {
        return mpiMtdDeltaAmount;
    }

    public void setMpiMtdDeltaAmount(Double value) {
        this.mpiMtdDeltaAmount = value;
    }

    public String getMpiPtdDeltaSign() {
        return mpiPtdDeltaSign;
    }

    public void setMpiPtdDeltaSign(String value) {
        this.mpiPtdDeltaSign = value;
    }

    public Double getMpiPtdDeltaAmount() {
        return mpiPtdDeltaAmount;
    }

    public void setMpiPtdDeltaAmount(Double value) {
        this.mpiPtdDeltaAmount = value;
    }

    public String getClientMtdDeltaSign() {
        return clientMtdDeltaSign;
    }

    public void setClientMtdDeltaSign(String value) {
        this.clientMtdDeltaSign = value;
    }

    public Double getClientMtdDeltaAmount() {
        return clientMtdDeltaAmount;
    }

    public void setClientMtdDeltaAmount(Double value) {
        this.clientMtdDeltaAmount = value;
    }

    public String getClientPtdDeltaSign() {
        return clientPtdDeltaSign;
    }

    public void setClientPtdDeltaSign(String value) {
        this.clientPtdDeltaSign = value;
    }

    public Double getClientPtdDeltaAmount() {
        return clientPtdDeltaAmount;
    }

    public void setClientPtdDeltaAmount(Double value) {
        this.clientPtdDeltaAmount = value;
    }

    public Double getUnappSvcCreditBalAmount() {
        return unappSvcCreditBalAmount;
    }

    public void setUnappSvcCreditBalAmount(Double value) {
        this.unappSvcCreditBalAmount = value;
    }

    public String getUnappSvcCreditDeltaSign() {
        return unappSvcCreditDeltaSign;
    }

    public void setUnappSvcCreditDeltaSign(String value) {
        this.unappSvcCreditDeltaSign = value;
    }

    public Double getUnappSvcCreditDeltaAmount() {
        return unappSvcCreditDeltaAmount;
    }

    public void setUnappSvcCreditDeltaAmount(Double value) {
        this.unappSvcCreditDeltaAmount = value;
    }

    public List<UnbilledUsageRecReturnElement> getUnbilledUsageRec() {
        if (this.unbilledUsageRec == null) {
            this.unbilledUsageRec = new ArrayList<UnbilledUsageRecReturnElement>();
        }
        return this.unbilledUsageRec;
    }public List<UnitThresholdDetailsReturnElement> getUnitThresholdDetails() {
        if (this.unitThresholdDetails == null) {
            this.unitThresholdDetails = new ArrayList<UnitThresholdDetailsReturnElement>();
        }
        return this.unitThresholdDetails;
    }
}
