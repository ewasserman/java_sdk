package com.aria.common.shared.object;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billing_groups_ReturnElement", propOrder = {"billingGroupNo", "billingGroupName", "billingGroupDescription", "clientBillingGroupId", "bgListStartMasterFile", "primaryPayMethod", "primaryPayMethodName", "secondaryPayMethod", "secondaryPayMethodName"})
public class BillingGroupsReturnElement {

    @XmlElement(name = "billing_group_no")
    protected String billingGroupNo;
    @XmlElement(name = "billing_group_name")
    protected String billingGroupName;
    @XmlElement(name = "billing_group_description")
    protected String billingGroupDescription;
    @XmlElement(name = "client_billing_group_id")
    protected String clientBillingGroupId;
    @XmlElement(name = "bg_list_start_master_file")
    protected Long bgListStartMasterFile;
    @XmlElement(name = "primary_pay_method")
    protected Long primaryPayMethod;
    @XmlElement(name = "primary_pay_method_name")
    protected String primaryPayMethodName;
    @XmlElement(name = "secondary_pay_method")
    protected Long secondaryPayMethod;
    @XmlElement(name = "secondary_pay_method_name")
    protected String secondaryPayMethodName;
    
    public String getBillingGroupNo() {
        return billingGroupNo;
    }

    public void setBillingGroupNo(String value) {
        this.billingGroupNo = value;
    }

    public String getBillingGroupName() {
        return billingGroupName;
    }

    public void setBillingGroupName(String value) {
        this.billingGroupName = value;
    }

    public String getBillingGroupDescription() {
        return billingGroupDescription;
    }

    public void setBillingGroupDescription(String value) {
        this.billingGroupDescription = value;
    }

    public String getClientBillingGroupId() {
        return clientBillingGroupId;
    }

    public void setClientBillingGroupId(String value) {
        this.clientBillingGroupId = value;
    }

    public Long getBgListStartMasterFile() {
        return bgListStartMasterFile;
    }

    public void setBgListStartMasterFile(Long value) {
        this.bgListStartMasterFile = value;
    }

    public Long getPrimaryPayMethod() {
        return primaryPayMethod;
    }

    public void setPrimaryPayMethod(Long value) {
        this.primaryPayMethod = value;
    }

    public String getPrimaryPayMethodName() {
        return primaryPayMethodName;
    }

    public void setPrimaryPayMethodName(String value) {
        this.primaryPayMethodName = value;
    }

    public Long getSecondaryPayMethod() {
        return secondaryPayMethod;
    }

    public void setSecondaryPayMethod(Long value) {
        this.secondaryPayMethod = value;
    }

    public String getSecondaryPayMethodName() {
        return secondaryPayMethodName;
    }

    public void setSecondaryPayMethodName(String value) {
        this.secondaryPayMethodName = value;
    }

    
}
