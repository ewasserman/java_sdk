package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "all_client_items_ReturnElement", propOrder = {"itemNo", "itemLabel", "serviceNo", "serviceDesc", "clientItemId", "clientServiceId", "clientItemPlanId", "usageTypeCd", "allServiceSuppFields", "clientSku", "itemPlan", "itemMonths", "stockLevel", "avgRatings", "numRatings", "numReviews", "itemType", "itemDesc", "activeInd", "modifyPriceInd", "subunitQty", "subunitLabel", "serviceType", "coaId", "clientCoaCode", "taxableInd", "taxGroup", "usageType", "allItemPrices", "allItemImages", "allItemSuppFields", "allItemClasses", "schedule"})
public class AllClientItemsReturnElement {

    @XmlElement(name = "item_no")
    protected Long itemNo;
    @XmlElement(name = "item_label")
    protected String itemLabel;
    @XmlElement(name = "service_no")
    protected Long serviceNo;
    @XmlElement(name = "service_desc")
    protected String serviceDesc;
    @XmlElement(name = "client_item_id")
    protected String clientItemId;
    @XmlElement(name = "client_service_id")
    protected String clientServiceId;
    @XmlElement(name = "client_item_plan_id")
    protected String clientItemPlanId;
    @XmlElement(name = "usage_type_cd")
    protected String usageTypeCd;
    @XmlElement(name = "all_service_supp_fields")
    protected List<AllServiceSuppFieldsReturnElement> allServiceSuppFields;
    @XmlElement(name = "client_sku")
    protected String clientSku;
    @XmlElement(name = "item_plan")
    protected Long itemPlan;
    @XmlElement(name = "item_months")
    protected Long itemMonths;
    @XmlElement(name = "stock_level")
    protected Double stockLevel;
    @XmlElement(name = "avg_ratings")
    protected Long avgRatings;
    @XmlElement(name = "num_ratings")
    protected Long numRatings;
    @XmlElement(name = "num_reviews")
    protected Long numReviews;
    @XmlElement(name = "item_type")
    protected Long itemType;
    @XmlElement(name = "item_desc")
    protected String itemDesc;
    @XmlElement(name = "active_ind")
    protected Long activeInd;
    @XmlElement(name = "modify_price_ind")
    protected String modifyPriceInd;
    @XmlElement(name = "subunit_qty")
    protected Double subunitQty;
    @XmlElement(name = "subunit_label")
    protected String subunitLabel;
    @XmlElement(name = "service_type")
    protected String serviceType;
    @XmlElement(name = "coa_id")
    protected String coaId;
    @XmlElement(name = "client_coa_code")
    protected String clientCoaCode;
    @XmlElement(name = "taxable_ind")
    protected Long taxableInd;
    @XmlElement(name = "tax_group")
    protected Long taxGroup;
    @XmlElement(name = "usage_type")
    protected Long usageType;
    @XmlElement(name = "all_item_prices")
    protected List<AllItemPricesReturnElement> allItemPrices;
    @XmlElement(name = "all_item_images")
    protected List<AllItemImagesReturnElement> allItemImages;
    @XmlElement(name = "all_item_supp_fields")
    protected List<AllItemSuppFieldsReturnElement> allItemSuppFields;
    @XmlElement(name = "all_item_classes")
    protected List<AllItemClassesReturnElement> allItemClasses;
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

    public String getUsageTypeCd() {
        return usageTypeCd;
    }

    public void setUsageTypeCd(String value) {
        this.usageTypeCd = value;
    }

    public List<AllServiceSuppFieldsReturnElement> getAllServiceSuppFields() {
        if (this.allServiceSuppFields == null) {
            this.allServiceSuppFields = new ArrayList<AllServiceSuppFieldsReturnElement>();
        }
        return this.allServiceSuppFields;
    }public String getClientSku() {
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

    public Long getItemType() {
        return itemType;
    }

    public void setItemType(Long value) {
        this.itemType = value;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String value) {
        this.itemDesc = value;
    }

    public Long getActiveInd() {
        return activeInd;
    }

    public void setActiveInd(Long value) {
        this.activeInd = value;
    }

    public String getModifyPriceInd() {
        return modifyPriceInd;
    }

    public void setModifyPriceInd(String value) {
        this.modifyPriceInd = value;
    }

    public Double getSubunitQty() {
        return subunitQty;
    }

    public void setSubunitQty(Double value) {
        this.subunitQty = value;
    }

    public String getSubunitLabel() {
        return subunitLabel;
    }

    public void setSubunitLabel(String value) {
        this.subunitLabel = value;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String value) {
        this.serviceType = value;
    }

    public String getCoaId() {
        return coaId;
    }

    public void setCoaId(String value) {
        this.coaId = value;
    }

    public String getClientCoaCode() {
        return clientCoaCode;
    }

    public void setClientCoaCode(String value) {
        this.clientCoaCode = value;
    }

    public Long getTaxableInd() {
        return taxableInd;
    }

    public void setTaxableInd(Long value) {
        this.taxableInd = value;
    }

    public Long getTaxGroup() {
        return taxGroup;
    }

    public void setTaxGroup(Long value) {
        this.taxGroup = value;
    }

    public Long getUsageType() {
        return usageType;
    }

    public void setUsageType(Long value) {
        this.usageType = value;
    }

    public List<AllItemPricesReturnElement> getAllItemPrices() {
        if (this.allItemPrices == null) {
            this.allItemPrices = new ArrayList<AllItemPricesReturnElement>();
        }
        return this.allItemPrices;
    }public List<AllItemImagesReturnElement> getAllItemImages() {
        if (this.allItemImages == null) {
            this.allItemImages = new ArrayList<AllItemImagesReturnElement>();
        }
        return this.allItemImages;
    }public List<AllItemSuppFieldsReturnElement> getAllItemSuppFields() {
        if (this.allItemSuppFields == null) {
            this.allItemSuppFields = new ArrayList<AllItemSuppFieldsReturnElement>();
        }
        return this.allItemSuppFields;
    }public List<AllItemClassesReturnElement> getAllItemClasses() {
        if (this.allItemClasses == null) {
            this.allItemClasses = new ArrayList<AllItemClassesReturnElement>();
        }
        return this.allItemClasses;
    }public List<ScheduleReturnElement> getSchedule() {
        if (this.schedule == null) {
            this.schedule = new ArrayList<ScheduleReturnElement>();
        }
        return this.schedule;
    }
}
