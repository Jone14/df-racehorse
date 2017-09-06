//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.customer.account._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.common.managedentity._2.ManagedEntity;
import uk.co.ladbrokes.cdm.customer.customer._2.CustomerKey;
import uk.co.ladbrokes.cdm.customer.transaction._2.Transaction;
import uk.co.ladbrokes.cdm.party.party._2.Party;


/**
 * Abstract business entity 'Account', realised through the various subclasses.
 * 
 * A customer can have a number of Accounts of different types.  With MDM and Unified Wallet porgrammes of work, the concept of 'Account' is a little blurred.
 * 
 * Accounts are almost becoming 'System' level buckets of information.  As far as a customer is concerned, they have profile/settings and a wallet to transact with.
 * 
 * Accounts can be managed internally (Sportsbook) or externally (e.g. Poker), and from an integration / master data point of view, may be important to modlled this.
 * 
 * Some accounts may have financial transaction occure, others may be a 'System' account like CRM Account.
 * 
 * TBD:  MDM and Unified Wallet Project to agree a conceptual model for this.
 * 
 * <p>Java class for Account complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Account"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/common/ManagedEntity/2.0}ManagedEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerKey" type="{http://cdm.ladbrokes.co.uk/customer/Customer/2.0}CustomerKey" minOccurs="0"/&gt;
 *         &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountType" type="{http://cdm.ladbrokes.co.uk/customer/Account/2.0}AccountType" minOccurs="0"/&gt;
 *         &lt;element name="accountMastered" type="{http://cdm.ladbrokes.co.uk/customer/Account/2.0}AccountMasteredKind" minOccurs="0"/&gt;
 *         &lt;element name="accountStatus" type="{http://cdm.ladbrokes.co.uk/customer/Account/2.0}AccountStatusKind" minOccurs="0"/&gt;
 *         &lt;element name="owningParty" type="{http://cdm.ladbrokes.co.uk/party/Party/2.0}Party" minOccurs="0"/&gt;
 *         &lt;element name="isFinancial" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="transaction" type="{http://cdm.ladbrokes.co.uk/customer/Transaction/2.0}Transaction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="characteristic" type="{http://cdm.ladbrokes.co.uk/customer/Account/2.0}AccountCharacteristic" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Account", propOrder = {
    "accountKey",
    "customerKey",
    "accountName",
    "accountType",
    "accountMastered",
    "accountStatus",
    "owningParty",
    "isFinancial",
    "transaction",
    "characteristic"
})
@XmlSeeAlso({
    GamesAccount.class,
    PokerAccount.class,
    LoyaltyAccount.class,
    SportsbookAccount.class,
    LiveCasinoAccount.class,
    FinancialsAccount.class,
    LottosAccount.class,
    CRMAccount.class,
    CasinoAccount.class,
    SystemAccount.class
})
public abstract class Account
    extends ManagedEntity
{

    protected String accountKey;
    protected CustomerKey customerKey;
    protected String accountName;
    protected AccountType accountType;
    @XmlSchemaType(name = "string")
    protected AccountMasteredKind accountMastered;
    @XmlSchemaType(name = "string")
    protected AccountStatusKind accountStatus;
    protected Party owningParty;
    protected Boolean isFinancial;
    protected List<Transaction> transaction;
    protected List<AccountCharacteristic> characteristic;

    /**
     * Gets the value of the accountKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountKey() {
        return accountKey;
    }

    /**
     * Sets the value of the accountKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountKey(String value) {
        this.accountKey = value;
    }

    /**
     * Gets the value of the customerKey property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerKey }
     *     
     */
    public CustomerKey getCustomerKey() {
        return customerKey;
    }

    /**
     * Sets the value of the customerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerKey }
     *     
     */
    public void setCustomerKey(CustomerKey value) {
        this.customerKey = value;
    }

    /**
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccountType(AccountType value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the accountMastered property.
     * 
     * @return
     *     possible object is
     *     {@link AccountMasteredKind }
     *     
     */
    public AccountMasteredKind getAccountMastered() {
        return accountMastered;
    }

    /**
     * Sets the value of the accountMastered property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountMasteredKind }
     *     
     */
    public void setAccountMastered(AccountMasteredKind value) {
        this.accountMastered = value;
    }

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatusKind }
     *     
     */
    public AccountStatusKind getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatusKind }
     *     
     */
    public void setAccountStatus(AccountStatusKind value) {
        this.accountStatus = value;
    }

    /**
     * Gets the value of the owningParty property.
     * 
     * @return
     *     possible object is
     *     {@link Party }
     *     
     */
    public Party getOwningParty() {
        return owningParty;
    }

    /**
     * Sets the value of the owningParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party }
     *     
     */
    public void setOwningParty(Party value) {
        this.owningParty = value;
    }

    /**
     * Gets the value of the isFinancial property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsFinancial() {
        return isFinancial;
    }

    /**
     * Sets the value of the isFinancial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsFinancial(Boolean value) {
        this.isFinancial = value;
    }

    /**
     * Gets the value of the transaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transaction }
     * 
     * 
     */
    public List<Transaction> getTransaction() {
        if (transaction == null) {
            transaction = new ArrayList<Transaction>();
        }
        return this.transaction;
    }

    /**
     * Gets the value of the characteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountCharacteristic }
     * 
     * 
     */
    public List<AccountCharacteristic> getCharacteristic() {
        if (characteristic == null) {
            characteristic = new ArrayList<AccountCharacteristic>();
        }
        return this.characteristic;
    }

}
