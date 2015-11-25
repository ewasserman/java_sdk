package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "order_line_items_list_row", propOrder = {
    "clientSku",
    "units",
    "amount",
    "unitDiscountAmount",
    "lineComments",
    "rateScheduleNo",
    "clientDefinedRateScheduleId"
    })
public class OrderLineItemsListRow {

    @XmlElement(name = "client_sku")
    protected String clientSku;
    @XmlElement(name = "units")
    protected Double units;
    @XmlElement(name = "amount")
    protected Double amount;
    @XmlElement(name = "unit_discount_amount")
    protected Double unitDiscountAmount;
    @XmlElement(name = "line_comments")
    protected String lineComments;
    @XmlElement(name = "rate_schedule_no")
    protected Long rateScheduleNo;
    @XmlElement(name = "client_defined_rate_schedule_id")
    protected String clientDefinedRateScheduleId;
    public String getClientSku() {
        return clientSku;
    }

    public void setClientSku(String value) {
        this.clientSku = value;
    }

    public Double getUnits() {
        return units;
    }

    public void setUnits(Double value) {
        this.units = value;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double value) {
        this.amount = value;
    }

    public Double getUnitDiscountAmount() {
        return unitDiscountAmount;
    }

    public void setUnitDiscountAmount(Double value) {
        this.unitDiscountAmount = value;
    }

    public String getLineComments() {
        return lineComments;
    }

    public void setLineComments(String value) {
        this.lineComments = value;
    }

    public Long getRateScheduleNo() {
        return rateScheduleNo;
    }

    public void setRateScheduleNo(Long value) {
        this.rateScheduleNo = value;
    }

    public String getClientDefinedRateScheduleId() {
        return clientDefinedRateScheduleId;
    }

    public void setClientDefinedRateScheduleId(String value) {
        this.clientDefinedRateScheduleId = value;
    }

    
}
