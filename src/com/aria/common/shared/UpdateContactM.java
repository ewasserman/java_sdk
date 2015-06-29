package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "contactInd",    "billingGroupNo",    "clientBillingGroupId",    "firstName",    "middleInitial",    "lastName",    "companyName",    "address1",    "address2",    "address3",    "city",    "locality",    "stateProv",    "countryCd",    "postalCd",    "phone",    "phoneExt",    "cellPhone",    "workPhone",    "workPhoneExt",    "fax",    "email",    "birthdate"})
@XmlRootElement(name = "update_contact_m")
public class UpdateContactM {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "contact_ind")
    protected Long contactInd;
        @XmlElement(name = "billing_group_no")
    protected Long billingGroupNo;
        @XmlElement(name = "client_billing_group_id")
    protected String clientBillingGroupId;
        @XmlElement(name = "first_name")
    protected String firstName;
        @XmlElement(name = "middle_initial")
    protected String middleInitial;
        @XmlElement(name = "last_name")
    protected String lastName;
        @XmlElement(name = "company_name")
    protected String companyName;
        @XmlElement(name = "address1")
    protected String address1;
        @XmlElement(name = "address2")
    protected String address2;
        @XmlElement(name = "address3")
    protected String address3;
        @XmlElement(name = "city")
    protected String city;
        @XmlElement(name = "locality")
    protected String locality;
        @XmlElement(name = "state_prov")
    protected String stateProv;
        @XmlElement(name = "country_cd")
    protected String countryCd;
        @XmlElement(name = "postal_cd")
    protected String postalCd;
        @XmlElement(name = "phone")
    protected String phone;
        @XmlElement(name = "phone_ext")
    protected String phoneExt;
        @XmlElement(name = "cell_phone")
    protected String cellPhone;
        @XmlElement(name = "work_phone")
    protected String workPhone;
        @XmlElement(name = "work_phone_ext")
    protected String workPhoneExt;
        @XmlElement(name = "fax")
    protected String fax;
        @XmlElement(name = "email")
    protected String email;
        @XmlElement(name = "birthdate")
    protected String birthdate;
    
    public long getClientNo() {
        return clientNo;
    }

    public void setClientNo(Long value) {
        this.clientNo = value;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String value) {
        this.authKey = value;
    }

    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }
            public Long getContactInd() {
        return contactInd;
    }

    public void setContactInd(Long value) {
        this.contactInd = value;
    }
            public Long getBillingGroupNo() {
        return billingGroupNo;
    }

    public void setBillingGroupNo(Long value) {
        this.billingGroupNo = value;
    }
            public String getClientBillingGroupId() {
        return clientBillingGroupId;
    }

    public void setClientBillingGroupId(String value) {
        this.clientBillingGroupId = value;
    }
            public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }
            public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String value) {
        this.middleInitial = value;
    }
            public String getLastName() {
        return lastName;
    }

    public void setLastName(String value) {
        this.lastName = value;
    }
            public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String value) {
        this.companyName = value;
    }
            public String getAddress1() {
        return address1;
    }

    public void setAddress1(String value) {
        this.address1 = value;
    }
            public String getAddress2() {
        return address2;
    }

    public void setAddress2(String value) {
        this.address2 = value;
    }
            public String getAddress3() {
        return address3;
    }

    public void setAddress3(String value) {
        this.address3 = value;
    }
            public String getCity() {
        return city;
    }

    public void setCity(String value) {
        this.city = value;
    }
            public String getLocality() {
        return locality;
    }

    public void setLocality(String value) {
        this.locality = value;
    }
            public String getStateProv() {
        return stateProv;
    }

    public void setStateProv(String value) {
        this.stateProv = value;
    }
            public String getCountryCd() {
        return countryCd;
    }

    public void setCountryCd(String value) {
        this.countryCd = value;
    }
            public String getPostalCd() {
        return postalCd;
    }

    public void setPostalCd(String value) {
        this.postalCd = value;
    }
            public String getPhone() {
        return phone;
    }

    public void setPhone(String value) {
        this.phone = value;
    }
            public String getPhoneExt() {
        return phoneExt;
    }

    public void setPhoneExt(String value) {
        this.phoneExt = value;
    }
            public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String value) {
        this.cellPhone = value;
    }
            public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String value) {
        this.workPhone = value;
    }
            public String getWorkPhoneExt() {
        return workPhoneExt;
    }

    public void setWorkPhoneExt(String value) {
        this.workPhoneExt = value;
    }
            public String getFax() {
        return fax;
    }

    public void setFax(String value) {
        this.fax = value;
    }
            public String getEmail() {
        return email;
    }

    public void setEmail(String value) {
        this.email = value;
    }
            public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String value) {
        this.birthdate = value;
    }
            
}
