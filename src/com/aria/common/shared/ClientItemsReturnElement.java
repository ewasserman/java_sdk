package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_items_ReturnElement", propOrder = {"itemNo", "itemLabel", "serviceNo", "serviceDesc", "clientSku", "itemPlan", "itemMonths", "currencyCd", "classNo", "classLabel", "stockLevel", "avgRatings", "numRatings", "numReviews", "imageUrl", "imageText", "clientItemId", "clientServiceId", "clientItemPlanId", "schedule"})
public class ClientItemsReturnElement {

    @XmlElement(name = "item_no")
    protected Long itemNo;
    @XmlElement(name = "item_label")
    protected String itemLabel;
    @XmlElement(name = "service_no")
    protected Long serviceNo;
    @XmlElement(name = "service_desc")
    protected String serviceDesc;
    @XmlElement(name = "client_sku")
    protected String clientSku;
    @XmlElement(name = "item_plan")
    protected Long itemPlan;
    @XmlElement(name = "item_months")
    protected Long itemMonths;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "class_no")
    protected Long classNo;
    @XmlElement(name = "class_label")
    protected String classLabel;
    @XmlElement(name = "stock_level")
    protected Double stockLevel;
    @XmlElement(name = "avg_ratings")
    protected Long avgRatings;
    @XmlElement(name = "num_ratings")
    protected Long numRatings;
    @XmlElement(name = "num_reviews")
    protected Long numReviews;
    @XmlElement(name = "image_url")
    protected String imageUrl;
    @XmlElement(name = "image_text")
    protected String imageText;
    @XmlElement(name = "client_item_id")
    protected String clientItemId;
    @XmlElement(name = "client_service_id")
    protected String clientServiceId;
    @XmlElement(name = "client_item_plan_id")
    protected String clientItemPlanId;
    @XmlElement(name = "schedule")
    protected List<ScheduleReturnElement> schedule;
    
    public Long getItemNo() {
        return itemNo;
    }

    public void setItemNo(Long value) {
        this.itemNo = value;
    }

    public String getItemLabel() {
        return itemLabel;
    }

    public void setItemLabel(String value) {
        this.itemLabel = value;
    }

    public Long getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(Long value) {
        this.serviceNo = value;
    }

    public String getServiceDesc() {
        return serviceDesc;
    }

    public void setServiceDesc(String value) {
        this.serviceDesc = value;
    }

    public String getClientSku() {
        return clientSku;
    }

    public void setClientSku(String value) {
        this.clientSku = value;
    }

    public Long getItemPlan() {
        return itemPlan;
    }

    public void setItemPlan(Long value) {
        this.itemPlan = value;
    }

    public Long getItemMonths() {
        return itemMonths;
    }

    public void setItemMonths(Long value) {
        this.itemMonths = value;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }

    public Long getClassNo() {
        return classNo;
    }

    public void setClassNo(Long value) {
        this.classNo = value;
    }

    public String getClassLabel() {
        return classLabel;
    }

    public void setClassLabel(String value) {
        this.classLabel = value;
    }

    public Double getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(Double value) {
        this.stockLevel = value;
    }

    public Long getAvgRatings() {
        return avgRatings;
    }

    public void setAvgRatings(Long value) {
        this.avgRatings = value;
    }

    public Long getNumRatings() {
        return numRatings;
    }

    public void setNumRatings(Long value) {
        this.numRatings = value;
    }

    public Long getNumReviews() {
        return numReviews;
    }

    public void setNumReviews(Long value) {
        this.numReviews = value;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String value) {
        this.imageUrl = value;
    }

    public String getImageText() {
        return imageText;
    }

    public void setImageText(String value) {
        this.imageText = value;
    }

    public String getClientItemId() {
        return clientItemId;
    }

    public void setClientItemId(String value) {
        this.clientItemId = value;
    }

    public String getClientServiceId() {
        return clientServiceId;
    }

    public void setClientServiceId(String value) {
        this.clientServiceId = value;
    }

    public String getClientItemPlanId() {
        return clientItemPlanId;
    }

    public void setClientItemPlanId(String value) {
        this.clientItemPlanId = value;
    }

    public List<ScheduleReturnElement> getSchedule() {
        if (this.schedule == null) {
            this.schedule = new ArrayList<ScheduleReturnElement>();
        }
        return this.schedule;
    }
}
