package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tax_details_ReturnElement", propOrder = {"taxDetailLine", "seqNum", "taxedSeqNum", "debit", "taxAuthorityLevel", "taxRate", "origWasTaxInclusive", "taxSrvTaxTypeId", "taxSrvTaxTypeDesc", "taxSrvCatText", "taxSrvJurisNm", "taxSrvTaxSumText"})
public class TaxDetailsReturnElement {

    @XmlElement(name = "tax_detail_line")
    protected Long taxDetailLine;
    @XmlElement(name = "seq_num")
    protected Long seqNum;
    @XmlElement(name = "taxed_seq_num")
    protected String taxedSeqNum;
    @XmlElement(name = "debit")
    protected Double debit;
    @XmlElement(name = "tax_authority_level")
    protected Double taxAuthorityLevel;
    @XmlElement(name = "tax_rate")
    protected Double taxRate;
    @XmlElement(name = "orig_was_tax_inclusive")
    protected String origWasTaxInclusive;
    @XmlElement(name = "tax_srv_tax_type_id")
    protected String taxSrvTaxTypeId;
    @XmlElement(name = "tax_srv_tax_type_desc")
    protected String taxSrvTaxTypeDesc;
    @XmlElement(name = "tax_srv_cat_text")
    protected String taxSrvCatText;
    @XmlElement(name = "tax_srv_juris_nm")
    protected String taxSrvJurisNm;
    @XmlElement(name = "tax_srv_tax_sum_text")
    protected String taxSrvTaxSumText;
    
    public Long getTaxDetailLine() {
        return taxDetailLine;
    }

    public void setTaxDetailLine(Long value) {
        this.taxDetailLine = value;
    }

    public Long getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(Long value) {
        this.seqNum = value;
    }

    public String getTaxedSeqNum() {
        return taxedSeqNum;
    }

    public void setTaxedSeqNum(String value) {
        this.taxedSeqNum = value;
    }

    public Double getDebit() {
        return debit;
    }

    public void setDebit(Double value) {
        this.debit = value;
    }

    public Double getTaxAuthorityLevel() {
        return taxAuthorityLevel;
    }

    public void setTaxAuthorityLevel(Double value) {
        this.taxAuthorityLevel = value;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double value) {
        this.taxRate = value;
    }

    public String getOrigWasTaxInclusive() {
        return origWasTaxInclusive;
    }

    public void setOrigWasTaxInclusive(String value) {
        this.origWasTaxInclusive = value;
    }

    public String getTaxSrvTaxTypeId() {
        return taxSrvTaxTypeId;
    }

    public void setTaxSrvTaxTypeId(String value) {
        this.taxSrvTaxTypeId = value;
    }

    public String getTaxSrvTaxTypeDesc() {
        return taxSrvTaxTypeDesc;
    }

    public void setTaxSrvTaxTypeDesc(String value) {
        this.taxSrvTaxTypeDesc = value;
    }

    public String getTaxSrvCatText() {
        return taxSrvCatText;
    }

    public void setTaxSrvCatText(String value) {
        this.taxSrvCatText = value;
    }

    public String getTaxSrvJurisNm() {
        return taxSrvJurisNm;
    }

    public void setTaxSrvJurisNm(String value) {
        this.taxSrvJurisNm = value;
    }

    public String getTaxSrvTaxSumText() {
        return taxSrvTaxSumText;
    }

    public void setTaxSrvTaxSumText(String value) {
        this.taxSrvTaxSumText = value;
    }

    
}
