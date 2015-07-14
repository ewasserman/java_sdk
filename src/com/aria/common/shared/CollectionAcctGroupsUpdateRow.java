package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "collection_acct_groups_update_row", propOrder = {
    "collectionAcctGroupNo",
    "clientCollectionAcctGroupId",
    "collectionAcctGrpDirective"
    })
public class CollectionAcctGroupsUpdateRow {

    @XmlElement(name = "collection_acct_group_no")
    protected Long collectionAcctGroupNo;
    @XmlElement(name = "client_collection_acct_group_id")
    protected String clientCollectionAcctGroupId;
    @XmlElement(name = "collection_acct_grp_directive")
    protected Long collectionAcctGrpDirective;
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

    public Long getCollectionAcctGrpDirective() {
        return collectionAcctGrpDirective;
    }

    public void setCollectionAcctGrpDirective(Long value) {
        this.collectionAcctGrpDirective = value;
    }

    
}
