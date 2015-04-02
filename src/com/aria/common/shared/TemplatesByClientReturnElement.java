package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "templates_by_client_ReturnElement", propOrder = {"templateNo", "templateName", "templateClass", "clientEmailTemplateId", "globalInd", "defaultInd"})
public class TemplatesByClientReturnElement {

    @XmlElement(name = "template_no")
    protected Long templateNo;
    @XmlElement(name = "template_name")
    protected String templateName;
    @XmlElement(name = "template_class")
    protected String templateClass;
    @XmlElement(name = "client_email_template_id")
    protected String clientEmailTemplateId;
    @XmlElement(name = "global_ind")
    protected Long globalInd;
    @XmlElement(name = "default_ind")
    protected Long defaultInd;
    
    public Long getTemplateNo() {
        return templateNo;
    }

    public void setTemplateNo(Long value) {
        this.templateNo = value;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String value) {
        this.templateName = value;
    }

    public String getTemplateClass() {
        return templateClass;
    }

    public void setTemplateClass(String value) {
        this.templateClass = value;
    }

    public String getClientEmailTemplateId() {
        return clientEmailTemplateId;
    }

    public void setClientEmailTemplateId(String value) {
        this.clientEmailTemplateId = value;
    }

    public Long getGlobalInd() {
        return globalInd;
    }

    public void setGlobalInd(Long value) {
        this.globalInd = value;
    }

    public Long getDefaultInd() {
        return defaultInd;
    }

    public void setDefaultInd(Long value) {
        this.defaultInd = value;
    }

    
}
