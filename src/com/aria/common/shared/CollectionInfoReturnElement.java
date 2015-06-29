package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "collection_info_ReturnElement", propOrder = {"collectionErrorCode", "collectionErrorMsg", "billGroupNo", "clientBillGroupId", "procCvvResponse", "procAvsResponse", "procCavvResponse", "procStatusCode", "procStatusText", "procPaymentId", "procAuthCode", "procMerchComments"})
public class CollectionInfoReturnElement {

    @XmlElement(name = "collection_error_code")
    protected Long collectionErrorCode;
    @XmlElement(name = "collection_error_msg")
    protected String collectionErrorMsg;
    @XmlElement(name = "bill_group_no")
    protected Long billGroupNo;
    @XmlElement(name = "client_bill_group_id")
    protected String clientBillGroupId;
    @XmlElement(name = "proc_cvv_response")
    protected String procCvvResponse;
    @XmlElement(name = "proc_avs_response")
    protected String procAvsResponse;
    @XmlElement(name = "proc_cavv_response")
    protected String procCavvResponse;
    @XmlElement(name = "proc_status_code")
    protected String procStatusCode;
    @XmlElement(name = "proc_status_text")
    protected String procStatusText;
    @XmlElement(name = "proc_payment_id")
    protected String procPaymentId;
    @XmlElement(name = "proc_auth_code")
    protected String procAuthCode;
    @XmlElement(name = "proc_merch_comments")
    protected String procMerchComments;
    
    public Long getCollectionErrorCode() {
        return collectionErrorCode;
    }

    public void setCollectionErrorCode(Long value) {
        this.collectionErrorCode = value;
    }

    public String getCollectionErrorMsg() {
        return collectionErrorMsg;
    }

    public void setCollectionErrorMsg(String value) {
        this.collectionErrorMsg = value;
    }

    public Long getBillGroupNo() {
        return billGroupNo;
    }

    public void setBillGroupNo(Long value) {
        this.billGroupNo = value;
    }

    public String getClientBillGroupId() {
        return clientBillGroupId;
    }

    public void setClientBillGroupId(String value) {
        this.clientBillGroupId = value;
    }

    public String getProcCvvResponse() {
        return procCvvResponse;
    }

    public void setProcCvvResponse(String value) {
        this.procCvvResponse = value;
    }

    public String getProcAvsResponse() {
        return procAvsResponse;
    }

    public void setProcAvsResponse(String value) {
        this.procAvsResponse = value;
    }

    public String getProcCavvResponse() {
        return procCavvResponse;
    }

    public void setProcCavvResponse(String value) {
        this.procCavvResponse = value;
    }

    public String getProcStatusCode() {
        return procStatusCode;
    }

    public void setProcStatusCode(String value) {
        this.procStatusCode = value;
    }

    public String getProcStatusText() {
        return procStatusText;
    }

    public void setProcStatusText(String value) {
        this.procStatusText = value;
    }

    public String getProcPaymentId() {
        return procPaymentId;
    }

    public void setProcPaymentId(String value) {
        this.procPaymentId = value;
    }

    public String getProcAuthCode() {
        return procAuthCode;
    }

    public void setProcAuthCode(String value) {
        this.procAuthCode = value;
    }

    public String getProcMerchComments() {
        return procMerchComments;
    }

    public void setProcMerchComments(String value) {
        this.procMerchComments = value;
    }

    
}
