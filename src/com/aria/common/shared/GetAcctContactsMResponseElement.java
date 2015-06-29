package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"accountContact", "billingContacts", "backupContacts", "statementContacts", "errorCode", "errorMsg"})
@XmlRootElement(name = "get_acct_contacts_mResponseElement")
public class GetAcctContactsMResponseElement {

    @XmlElement(name = "account_contact")
    protected List<AccountContactReturnElement> accountContact;
    @XmlElement(name = "billing_contacts")
    protected List<BillingContactsReturnElement> billingContacts;
    @XmlElement(name = "backup_contacts")
    protected List<BackupContactsReturnElement> backupContacts;
    @XmlElement(name = "statement_contacts")
    protected List<StatementContactsReturnElement> statementContacts;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public List<AccountContactReturnElement> getAccountContact() {
        if (this.accountContact == null) {
            this.accountContact = new ArrayList<AccountContactReturnElement>();
        }
        return this.accountContact;
    }public List<BillingContactsReturnElement> getBillingContacts() {
        if (this.billingContacts == null) {
            this.billingContacts = new ArrayList<BillingContactsReturnElement>();
        }
        return this.billingContacts;
    }public List<BackupContactsReturnElement> getBackupContacts() {
        if (this.backupContacts == null) {
            this.backupContacts = new ArrayList<BackupContactsReturnElement>();
        }
        return this.backupContacts;
    }public List<StatementContactsReturnElement> getStatementContacts() {
        if (this.statementContacts == null) {
            this.statementContacts = new ArrayList<StatementContactsReturnElement>();
        }
        return this.statementContacts;
    }public Long getErrorCode() {
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
