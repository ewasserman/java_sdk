package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "order_items_list_ReturnElement", propOrder = {"lineNo", "clientSku", "label", "altLabel", "longDesc", "units", "unitAmount", "lineAmount", "lineComments", "scheduleNo", "tierNo"})
public class OrderItemsListReturnElement {

    @XmlElement(name = "line_no")
    protected Long lineNo;
    @XmlElement(name = "client_sku")
    protected String clientSku;
    @XmlElement(name = "label")
    protected String label;
    @XmlElement(name = "alt_label")
    protected String altLabel;
    @XmlElement(name = "long_desc")
    protected String longDesc;
    @XmlElement(name = "units")
    protected Double units;
    @XmlElement(name = "unit_amount")
    protected Double unitAmount;
    @XmlElement(name = "line_amount")
    protected Double lineAmount;
    @XmlElement(name = "line_comments")
    protected String lineComments;
    @XmlElement(name = "schedule_no")
    protected Long scheduleNo;
    @XmlElement(name = "tier_no")
    protected Long tierNo;
    
    public Long getLineNo() {
        return lineNo;
    }

    public void setLineNo(Long value) {
        this.lineNo = value;
    }

    public String getClientSku() {
        return clientSku;
    }

    public void setClientSku(String value) {
        this.clientSku = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String value) {
        this.label = value;
    }

    public String getAltLabel() {
        return altLabel;
    }

    public void setAltLabel(String value) {
        this.altLabel = value;
    }

    public String getLongDesc() {
        return longDesc;
    }

    public void setLongDesc(String value) {
        this.longDesc = value;
    }

    public Double getUnits() {
        return units;
    }

    public void setUnits(Double value) {
        this.units = value;
    }

    public Double getUnitAmount() {
        return unitAmount;
    }

    public void setUnitAmount(Double value) {
        this.unitAmount = value;
    }

    public Double getLineAmount() {
        return lineAmount;
    }

    public void setLineAmount(Double value) {
        this.lineAmount = value;
    }

    public String getLineComments() {
        return lineComments;
    }

    public void setLineComments(String value) {
        this.lineComments = value;
    }

    public Long getScheduleNo() {
        return scheduleNo;
    }

    public void setScheduleNo(Long value) {
        this.scheduleNo = value;
    }

    public Long getTierNo() {
        return tierNo;
    }

    public void setTierNo(Long value) {
        this.tierNo = value;
    }

    
}
