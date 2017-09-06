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
import uk.co.ladbrokes.cdm.common.internationalmoney._2.InternationalMoney;
import uk.co.ladbrokes.cdm.common.internationalmoney._2.Money;


/**
 * A Manual Adjustment represents a change to a customer’s wallet balance that has not been directly been handled by specific OpenBet
 * functionality, such as payments (initiated by customer) or bet placement.
 * 
 * This particular adjustment would originate from a ladbrokes process rather then from a partner or expliciti from a customer
 * 
 * The change will either be a Debit (Withdraw in OpenBet terms), or a Credit (Deposit in OpenBet terms).
 * 
 * <p>Java class for AdjustFunds complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjustFunds"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/banking/Wallet/2.0}WalletTransaction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adjustmentType" type="{http://cdm.ladbrokes.co.uk/banking/Wallet/2.0}AdjustmentType" minOccurs="0"/&gt;
 *         &lt;element name="adjustAmount" type="{http://cdm.ladbrokes.co.uk/common/InternationalMoney/2.0}InternationalMoney" minOccurs="0"/&gt;
 *         &lt;element name="adjustmentSort" type="{http://cdm.ladbrokes.co.uk/banking/Wallet/2.0}AdjustmentSortKind" minOccurs="0"/&gt;
 *         &lt;element name="adjustmentMethod" type="{http://cdm.ladbrokes.co.uk/banking/Wallet/2.0}AdjustmentMethodKind" minOccurs="0"/&gt;
 *         &lt;element name="openBetJournalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authorisedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authorisedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="batchKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isWithdrawable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="businessProcess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="otherInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="adjustmentAmount" type="{http://cdm.ladbrokes.co.uk/common/InternationalMoney/2.0}Money" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustFunds", propOrder = {
    "adjustmentType",
    "adjustAmount",
    "adjustmentSort",
    "adjustmentMethod",
    "openBetJournalType",
    "authorisedBy",
    "authorisedAt",
    "reason",
    "batchKey",
    "isWithdrawable",
    "businessProcess",
    "otherInfo",
    "adjustmentAmount"
})
public class AdjustFunds
    extends WalletTransaction
{

    protected AdjustmentType adjustmentType;
    protected InternationalMoney adjustAmount;
    @XmlSchemaType(name = "string")
    protected AdjustmentSortKind adjustmentSort;
    @XmlSchemaType(name = "string")
    protected AdjustmentMethodKind adjustmentMethod;
    protected String openBetJournalType;
    protected String authorisedBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar authorisedAt;
    protected String reason;
    protected String batchKey;
    protected Boolean isWithdrawable;
    protected String businessProcess;
    protected String otherInfo;
    protected Money adjustmentAmount;

    /**
     * Gets the value of the adjustmentType property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentType }
     *     
     */
    public AdjustmentType getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * Sets the value of the adjustmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentType }
     *     
     */
    public void setAdjustmentType(AdjustmentType value) {
        this.adjustmentType = value;
    }

    /**
     * Gets the value of the adjustAmount property.
     * 
     * @return
     *     possible object is
     *     {@link InternationalMoney }
     *     
     */
    public InternationalMoney getAdjustAmount() {
        return adjustAmount;
    }

    /**
     * Sets the value of the adjustAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalMoney }
     *     
     */
    public void setAdjustAmount(InternationalMoney value) {
        this.adjustAmount = value;
    }

    /**
     * Gets the value of the adjustmentSort property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentSortKind }
     *     
     */
    public AdjustmentSortKind getAdjustmentSort() {
        return adjustmentSort;
    }

    /**
     * Sets the value of the adjustmentSort property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentSortKind }
     *     
     */
    public void setAdjustmentSort(AdjustmentSortKind value) {
        this.adjustmentSort = value;
    }

    /**
     * Gets the value of the adjustmentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentMethodKind }
     *     
     */
    public AdjustmentMethodKind getAdjustmentMethod() {
        return adjustmentMethod;
    }

    /**
     * Sets the value of the adjustmentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentMethodKind }
     *     
     */
    public void setAdjustmentMethod(AdjustmentMethodKind value) {
        this.adjustmentMethod = value;
    }

    /**
     * Gets the value of the openBetJournalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenBetJournalType() {
        return openBetJournalType;
    }

    /**
     * Sets the value of the openBetJournalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenBetJournalType(String value) {
        this.openBetJournalType = value;
    }

    /**
     * Gets the value of the authorisedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorisedBy() {
        return authorisedBy;
    }

    /**
     * Sets the value of the authorisedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorisedBy(String value) {
        this.authorisedBy = value;
    }

    /**
     * Gets the value of the authorisedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuthorisedAt() {
        return authorisedAt;
    }

    /**
     * Sets the value of the authorisedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuthorisedAt(XMLGregorianCalendar value) {
        this.authorisedAt = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the batchKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchKey() {
        return batchKey;
    }

    /**
     * Sets the value of the batchKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchKey(String value) {
        this.batchKey = value;
    }

    /**
     * Gets the value of the isWithdrawable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWithdrawable() {
        return isWithdrawable;
    }

    /**
     * Sets the value of the isWithdrawable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWithdrawable(Boolean value) {
        this.isWithdrawable = value;
    }

    /**
     * Gets the value of the businessProcess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessProcess() {
        return businessProcess;
    }

    /**
     * Sets the value of the businessProcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessProcess(String value) {
        this.businessProcess = value;
    }

    /**
     * Gets the value of the otherInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherInfo() {
        return otherInfo;
    }

    /**
     * Sets the value of the otherInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherInfo(String value) {
        this.otherInfo = value;
    }

    /**
     * Gets the value of the adjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAdjustmentAmount() {
        return adjustmentAmount;
    }

    /**
     * Sets the value of the adjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAdjustmentAmount(Money value) {
        this.adjustmentAmount = value;
    }

}
