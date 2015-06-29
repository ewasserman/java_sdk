package com.aria.common.shared.object;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "collection_acct_groups_ReturnElement", propOrder = {"collectionAcctGroupNo", "clientCollectionAcctGroupId"})
public class CollectionAcctGroupsReturnElement {

    @XmlElement(name = "collection_acct_group_no")
    protected Long collectionAcctGroupNo;
    @XmlElement(name = "client_collection_acct_group_id")
    protected String clientCollectionAcctGroupId;
    
    public Long getCollectionAcctGroupNo() {
        return collectionAcctGroupNo;
    }

    public void setCollectionAcctGroupNo(Long value) {
        this.collectionAcctGroupNo = value;
    }

    public String getClientCollectionAcctGroupId() {
        return clientCollectionAcctGroupId;
    }

    public void setClientCollectionAcctGroupId(String value) {
        this.clientCollectionAcctGroupId = value;
    }

    
}
