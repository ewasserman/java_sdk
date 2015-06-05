package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coupon_groups_ReturnElement", propOrder = {"groupNo", "clientDefinedId", "groupName", "description", "precedence", "coupons"})
public class CouponGroupsReturnElement {

    @XmlElement(name = "group_no")
    protected Long groupNo;
    @XmlElement(name = "client_defined_id")
    protected String clientDefinedId;
    @XmlElement(name = "group_name")
    protected String groupName;
    @XmlElement(name = "description")
    protected String description;
    @XmlElement(name = "precedence")
    protected String precedence;
    @XmlElement(name = "coupons")
    protected List<CouponsReturnElement> coupons;
    
    public Long getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(Long value) {
        this.groupNo = value;
    }

    public String getClientDefinedId() {
        return clientDefinedId;
    }

    public void setClientDefinedId(String value) {
        this.clientDefinedId = value;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String value) {
        this.groupName = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public String getPrecedence() {
        return precedence;
    }

    public void setPrecedence(String value) {
        this.precedence = value;
    }

    public List<CouponsReturnElement> getCoupons() {
        if (this.coupons == null) {
            this.coupons = new ArrayList<CouponsReturnElement>();
        }
        return this.coupons;
    }
}
