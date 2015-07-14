package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "out_acct_ReturnElement", propOrder = {"acctNo", "userid", "clientAcctId", "contractDetails", "sessionId", "billingErrors", "masterPlansAssigned", "invoiceInfo", "outAcct"})
public class OutAcctReturnElement {

    @XmlElement(name = "acct_no")
    protected Long acctNo;
    @XmlElement(name = "userid")
    protected String userid;
    @XmlElement(name = "client_acct_id")
    protected String clientAcctId;
    @XmlElement(name = "contract_details")
    protected List<ContractDetailsReturnElement> contractDetails;
    @XmlElement(name = "session_id")
    protected String sessionId;
    @XmlElement(name = "billing_errors")
    protected List<BillingErrorsReturnElement> billingErrors;
    @XmlElement(name = "master_plans_assigned")
    protected List<MasterPlansAssignedReturnElement> masterPlansAssigned;
    @XmlElement(name = "invoice_info")
    protected List<InvoiceInfoReturnElement> invoiceInfo;
    @XmlElement(name = "out_acct")
    protected List<OutAcctReturnElement> outAcct;
    
    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String value) {
        this.userid = value;
    }

    public String getClientAcctId() {
        return clientAcctId;
    }

    public void setClientAcctId(String value) {
        this.clientAcctId = value;
    }

    public List<ContractDetailsReturnElement> getContractDetails() {
        if (this.contractDetails == null) {
            this.contractDetails = new ArrayList<ContractDetailsReturnElement>();
        }
        return this.contractDetails;
    }public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String value) {
        this.sessionId = value;
    }

    public List<BillingErrorsReturnElement> getBillingErrors() {
        if (this.billingErrors == null) {
            this.billingErrors = new ArrayList<BillingErrorsReturnElement>();
        }
        return this.billingErrors;
    }public List<MasterPlansAssignedReturnElement> getMasterPlansAssigned() {
        if (this.masterPlansAssigned == null) {
            this.masterPlansAssigned = new ArrayList<MasterPlansAssignedReturnElement>();
        }
        return this.masterPlansAssigned;
    }public List<InvoiceInfoReturnElement> getInvoiceInfo() {
        if (this.invoiceInfo == null) {
            this.invoiceInfo = new ArrayList<InvoiceInfoReturnElement>();
        }
        return this.invoiceInfo;
    }public List<OutAcctReturnElement> getOutAcct() {
        if (this.outAcct == null) {
            this.outAcct = new ArrayList<OutAcctReturnElement>();
        }
        return this.outAcct;
    }
}
