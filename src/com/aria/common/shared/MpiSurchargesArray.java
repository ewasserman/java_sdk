package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mpi_surcharges_array", propOrder = {
    "mpiSurchargesRow"
})
public class MpiSurchargesArray {

    @XmlElement(name = "mpi_surcharges_row")
    protected List<MpiSurchargesRow> mpiSurchargesRow;

    public List<MpiSurchargesRow> getMpiSurchargesRow() {
        if (this.mpiSurchargesRow == null) {
            this.mpiSurchargesRow = new ArrayList<MpiSurchargesRow>();
        }
        return this.mpiSurchargesRow;
    }

}
