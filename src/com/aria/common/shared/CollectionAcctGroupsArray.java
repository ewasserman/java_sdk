package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "collection_acct_groups_array", propOrder = {
    "collectionAcctGroupsRow"
})
public class CollectionAcctGroupsArray {

    @XmlElement(name = "collection_acct_groups_row")
    protected List<CollectionAcctGroupsRow> collectionAcctGroupsRow;

    public List<CollectionAcctGroupsRow> getCollectionAcctGroupsRow() {
        if (this.collectionAcctGroupsRow == null) {
            this.collectionAcctGroupsRow = new ArrayList<CollectionAcctGroupsRow>();
        }
        return this.collectionAcctGroupsRow;
    }

}
