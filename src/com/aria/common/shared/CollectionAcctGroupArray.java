package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "collection_acct_group_array", propOrder = {
    "collectionAcctGroupRow"
})
public class CollectionAcctGroupArray {

    @XmlElement(name = "collection_acct_group_row")
    protected List<CollectionAcctGroupRow> collectionAcctGroupRow;

    public List<CollectionAcctGroupRow> getCollectionAcctGroupRow() {
        if (this.collectionAcctGroupRow == null) {
            this.collectionAcctGroupRow = new ArrayList<CollectionAcctGroupRow>();
        }
        return this.collectionAcctGroupRow;
    }

}
