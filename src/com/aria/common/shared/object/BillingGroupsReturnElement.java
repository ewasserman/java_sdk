package com.aria.common.shared.object;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "billing_groups_ReturnElement", propOrder = {"billingGroupNo", "billingGroupName", "billingGroupDescription", "clientBillingGroupId"})
public class BillingGroupsReturnElement {

    @XmlElement(name = "billing_group_no")
    protected String billingGroupNo;
    @XmlElement(name = "billing_group_name")
    protected String billingGroupName;
    @XmlElement(name = "billing_group_description")
    protected String billingGroupDescription;
    @XmlElement(name = "client_billing_group_id")
    protected String clientBillingGroupId;
    
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

    
}
