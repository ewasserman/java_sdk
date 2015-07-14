package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mpi_surcharges_row", propOrder = {
    "mpiSurchargeNo",
    "mpiRateScheduleNo"
    })
public class MpiSurchargesRow {

    @XmlElement(name = "mpi_surcharge_no")
    protected Long mpiSurchargeNo;
    @XmlElement(name = "mpi_rate_schedule_no")
    protected Long mpiRateScheduleNo;
    public Long getMpiSurchargeNo() {
        return mpiSurchargeNo;
    }

    public void setMpiSurchargeNo(Long value) {
        this.mpiSurchargeNo = value;
    }

    public Long getMpiRateScheduleNo() {
        return mpiRateScheduleNo;
    }

    public void setMpiRateScheduleNo(Long value) {
        this.mpiRateScheduleNo = value;
    }

    
}
