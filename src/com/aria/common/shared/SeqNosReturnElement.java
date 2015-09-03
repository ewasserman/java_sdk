package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seq_nos_ReturnElement", propOrder = {"sourceAcctSeqNo", "targetAcctSeqNo", "primaryIndicatorCd"})
public class SeqNosReturnElement {

    @XmlElement(name = "source_acct_seq_no")
    protected Long sourceAcctSeqNo;
    @XmlElement(name = "target_acct_seq_no")
    protected Long targetAcctSeqNo;
    @XmlElement(name = "primary_indicator_cd")
    protected Long primaryIndicatorCd;
    
    public Long getSourceAcctSeqNo() {
        return sourceAcctSeqNo;
    }

    public void setSourceAcctSeqNo(Long value) {
        this.sourceAcctSeqNo = value;
    }

    public Long getTargetAcctSeqNo() {
        return targetAcctSeqNo;
    }

    public void setTargetAcctSeqNo(Long value) {
        this.targetAcctSeqNo = value;
    }

    public Long getPrimaryIndicatorCd() {
        return primaryIndicatorCd;
    }

    public void setPrimaryIndicatorCd(Long value) {
        this.primaryIndicatorCd = value;
    }

    
}
