package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "collection_acct_group_ReturnElement", propOrder = {"collectionsAcctGroupNo", "clientCollectionsAcctGroupId"})
public class CollectionAcctGroupReturnElement {

    @XmlElement(name = "collections_acct_group_no")
    protected Long collectionsAcctGroupNo;
    @XmlElement(name = "client_collections_acct_group_id")
    protected String clientCollectionsAcctGroupId;
    
    public Long getCollectionsAcctGroupNo() {
        return collectionsAcctGroupNo;
    }

    public void setCollectionsAcctGroupNo(Long value) {
        this.collectionsAcctGroupNo = value;
    }

    public String getClientCollectionsAcctGroupId() {
        return clientCollectionsAcctGroupId;
    }

    public void setClientCollectionsAcctGroupId(String value) {
        this.clientCollectionsAcctGroupId = value;
    }

    
}
