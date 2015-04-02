package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "profiles_ReturnElement", propOrder = {"profileId", "clientProfileId", "profileName", "profileDesc"})
public class ProfilesReturnElement {

    @XmlElement(name = "profile_id")
    protected Long profileId;
    @XmlElement(name = "client_profile_id")
    protected String clientProfileId;
    @XmlElement(name = "profile_name")
    protected String profileName;
    @XmlElement(name = "profile_desc")
    protected String profileDesc;
    
    public Long getProfileId() {
        return profileId;
    }

    public void setProfileId(Long value) {
        this.profileId = value;
    }

    public String getClientProfileId() {
        return clientProfileId;
    }

    public void setClientProfileId(String value) {
        this.clientProfileId = value;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String value) {
        this.profileName = value;
    }

    public String getProfileDesc() {
        return profileDesc;
    }

    public void setProfileDesc(String value) {
        this.profileDesc = value;
    }

    
}
