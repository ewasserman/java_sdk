package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "order_line_items_list_array", propOrder = {
    "orderLineItemsListRow"
})
public class OrderLineItemsListArray {

    @XmlElement(name = "order_line_items_list_row")
    protected List<OrderLineItemsListRow> orderLineItemsListRow;

    public List<OrderLineItemsListRow> getOrderLineItemsListRow() {
        if (this.orderLineItemsListRow == null) {
            this.orderLineItemsListRow = new ArrayList<OrderLineItemsListRow>();
        }
        return this.orderLineItemsListRow;
    }

}
