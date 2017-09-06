//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.banking.wallet._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import uk.co.ladbrokes.cdm.common.managedentity._2.ManagedEntity;


/**
 * TBD - This class represents the lock details that may be associated with this wallet.  Such details may be needed to ensure correctness of the wallet in transactional scenarios.
 * 
 * This will be key as the Wallet will be used in a highly distributed manner, inncluding B2B transactions
 * 
 * A Lock can only go from Active -> Inactive once and then becomes historical.
 * 
 * <p>Java class for WalletLock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WalletLock"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/common/ManagedEntity/2.0}ManagedEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="walletLockKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="walletKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="walletLockStatus" type="{http://cdm.ladbrokes.co.uk/banking/Wallet/2.0}WalletLockStatusKind" minOccurs="0"/&gt;
 *         &lt;element name="walletTransactionKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lockOwnerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lockOwnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="encryptedSemiphore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="releasedDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WalletLock", propOrder = {
    "walletLockKey",
    "walletKey",
    "walletLockStatus",
    "walletTransactionKey",
    "lockOwnerKey",
    "lockOwnerName",
    "encryptedSemiphore",
    "releasedDateTime"
})
public class WalletLock
    extends ManagedEntity
{

    protected String walletLockKey;
    protected String walletKey;
    @XmlSchemaType(name = "string")
    protected WalletLockStatusKind walletLockStatus;
    protected String walletTransactionKey;
    protected String lockOwnerKey;
    protected String lockOwnerName;
    protected String encryptedSemiphore;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar releasedDateTime;

    /**
     * Gets the value of the walletLockKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletLockKey() {
        return walletLockKey;
    }

    /**
     * Sets the value of the walletLockKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletLockKey(String value) {
        this.walletLockKey = value;
    }

    /**
     * Gets the value of the walletKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletKey() {
        return walletKey;
    }

    /**
     * Sets the value of the walletKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletKey(String value) {
        this.walletKey = value;
    }

    /**
     * Gets the value of the walletLockStatus property.
     * 
     * @return
     *     possible object is
     *     {@link WalletLockStatusKind }
     *     
     */
    public WalletLockStatusKind getWalletLockStatus() {
        return walletLockStatus;
    }

    /**
     * Sets the value of the walletLockStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link WalletLockStatusKind }
     *     
     */
    public void setWalletLockStatus(WalletLockStatusKind value) {
        this.walletLockStatus = value;
    }

    /**
     * Gets the value of the walletTransactionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWalletTransactionKey() {
        return walletTransactionKey;
    }

    /**
     * Sets the value of the walletTransactionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalletTransactionKey(String value) {
        this.walletTransactionKey = value;
    }

    /**
     * Gets the value of the lockOwnerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockOwnerKey() {
        return lockOwnerKey;
    }

    /**
     * Sets the value of the lockOwnerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockOwnerKey(String value) {
        this.lockOwnerKey = value;
    }

    /**
     * Gets the value of the lockOwnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockOwnerName() {
        return lockOwnerName;
    }

    /**
     * Sets the value of the lockOwnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockOwnerName(String value) {
        this.lockOwnerName = value;
    }

    /**
     * Gets the value of the encryptedSemiphore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncryptedSemiphore() {
        return encryptedSemiphore;
    }

    /**
     * Sets the value of the encryptedSemiphore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncryptedSemiphore(String value) {
        this.encryptedSemiphore = value;
    }

    /**
     * Gets the value of the releasedDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReleasedDateTime() {
        return releasedDateTime;
    }

    /**
     * Sets the value of the releasedDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReleasedDateTime(XMLGregorianCalendar value) {
        this.releasedDateTime = value;
    }

}
