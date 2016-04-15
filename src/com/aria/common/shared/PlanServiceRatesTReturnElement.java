package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_service_rates_t_ReturnElement", propOrder = {"rateSeqNo", "rateTierDescription"})
public class PlanServiceRatesTReturnElement {

    @XmlElement(name = "rate_seq_no")
    protected Long rateSeqNo;
    @XmlElement(name = "rate_tier_description")
    protected String rateTierDescription;
    
    public Long getRateSeqNo() {
        return rateSeqNo;
    }

    public void setRateSeqNo(Long value) {
        this.rateSeqNo = value;
    }

    public String getRateTierDescription() {
        return rateTierDescription;
    }

    public void setRateTierDescription(String value) {
        this.rateTierDescription = value;
    }

    
}
