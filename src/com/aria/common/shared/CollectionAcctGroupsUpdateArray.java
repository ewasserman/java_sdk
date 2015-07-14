package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "collection_acct_groups_update_array", propOrder = {
    "collectionAcctGroupsUpdateRow"
})
public class CollectionAcctGroupsUpdateArray {

    @XmlElement(name = "collection_acct_groups_update_row")
    protected List<CollectionAcctGroupsUpdateRow> collectionAcctGroupsUpdateRow;

    public List<CollectionAcctGroupsUpdateRow> getCollectionAcctGroupsUpdateRow() {
        if (this.collectionAcctGroupsUpdateRow == null) {
            this.collectionAcctGroupsUpdateRow = new ArrayList<CollectionAcctGroupsUpdateRow>();
        }
        return this.collectionAcctGroupsUpdateRow;
    }

}
