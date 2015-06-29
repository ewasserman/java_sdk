package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"statementNo", "seqStatementId", "errorCode", "errorMsg"})
@XmlRootElement(name = "gen_statement_mResponseElement")
public class GenStatementMResponseElement {

    @XmlElement(name = "statement_no")
    protected Long statementNo;
    @XmlElement(name = "seq_statement_id")
    protected String seqStatementId;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public Long getStatementNo() {
        return statementNo;
    }

    public void setStatementNo(Long value) {
        this.statementNo = value;
    }

    public String getSeqStatementId() {
        return seqStatementId;
    }

    public void setSeqStatementId(String value) {
        this.seqStatementId = value;
    }

    public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long value) {
        this.errorCode = value;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    
}
