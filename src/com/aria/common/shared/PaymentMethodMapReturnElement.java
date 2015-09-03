package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payment_method_map_ReturnElement", propOrder = {"sourcePmtMethodNo", "clientSourcePmtMethodId", "targetPmtMethodNo", "clientTargetPmtMethodId"})
public class PaymentMethodMapReturnElement {

    @XmlElement(name = "source_pmt_method_no")
    protected Long sourcePmtMethodNo;
    @XmlElement(name = "client_source_pmt_method_id")
    protected String clientSourcePmtMethodId;
    @XmlElement(name = "target_pmt_method_no")
    protected Long targetPmtMethodNo;
    @XmlElement(name = "client_target_pmt_method_id")
    protected String clientTargetPmtMethodId;
    
    public Long getSourcePmtMethodNo() {
        return sourcePmtMethodNo;
    }

    public void setSourcePmtMethodNo(Long value) {
        this.sourcePmtMethodNo = value;
    }

    public String getClientSourcePmtMethodId() {
        return clientSourcePmtMethodId;
    }

    public void setClientSourcePmtMethodId(String value) {
        this.clientSourcePmtMethodId = value;
    }

    public Long getTargetPmtMethodNo() {
        return targetPmtMethodNo;
    }

    public void setTargetPmtMethodNo(Long value) {
        this.targetPmtMethodNo = value;
    }

    public String getClientTargetPmtMethodId() {
        return clientTargetPmtMethodId;
    }

    public void setClientTargetPmtMethodId(String value) {
        this.clientTargetPmtMethodId = value;
    }

    
}
