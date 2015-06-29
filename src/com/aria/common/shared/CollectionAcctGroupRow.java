package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "collection_acct_group_row", propOrder = {
    "collectionsAcctGroupNo",
    "clientCollectionsAcctGroupId"
    })
public class CollectionAcctGroupRow {

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
