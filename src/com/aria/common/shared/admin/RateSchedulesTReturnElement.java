package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rate_schedules_t_ReturnElement", propOrder = {"rateInfo"})
public class RateSchedulesTReturnElement {

    @XmlElement(name = "rate_info")
    protected List<RateInfoReturnElement> rateInfo;
    
    public List<RateInfoReturnElement> getRateInfo() {
        if (this.rateInfo == null) {
            this.rateInfo = new ArrayList<RateInfoReturnElement>();
        }
        return this.rateInfo;
    }
}
