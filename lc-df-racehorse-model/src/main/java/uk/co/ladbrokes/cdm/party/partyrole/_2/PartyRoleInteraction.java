//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.party.partyrole._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import uk.co.ladbrokes.cdm.customer.transaction._2.Transaction;


/**
 * This class represents all the significant interactions that have occurred with a particular party role.  for example, all the business interactions for a particular customer.
 * 
 * This format gives a generic and consistent way to capture all interactions from all party roles.
 * 
 * <p>Java class for PartyRoleInteraction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyRoleInteraction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partyRoleIntKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://cdm.ladbrokes.co.uk/party/PartyRole/2.0}InteractionStatusKind" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="beginDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="endDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="withPartyRoleKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="characteristics" type="{http://cdm.ladbrokes.co.uk/party/PartyRole/2.0}PartyRoleInteractionChars" minOccurs="0"/&gt;
 *         &lt;element name="interactionType" type="{http://cdm.ladbrokes.co.uk/party/PartyRole/2.0}PartyRoleInteractionType" minOccurs="0"/&gt;
 *         &lt;element name="transaction" type="{http://cdm.ladbrokes.co.uk/customer/Transaction/2.0}Transaction" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyRoleInteraction", propOrder = {
    "partyRoleIntKey",
    "name",
    "status",
    "description",
    "beginDateTime",
    "endDateTime",
    "withPartyRoleKey",
    "characteristics",
    "interactionType",
    "transaction"
})
public class PartyRoleInteraction {

    protected String partyRoleIntKey;
    protected String name;
    @XmlSchemaType(name = "string")
    protected InteractionStatusKind status;
    protected String description;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginDateTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateTime;
    protected String withPartyRoleKey;
    protected PartyRoleInteractionChars characteristics;
    protected PartyRoleInteractionType interactionType;
    protected Transaction transaction;

    /**
     * Gets the value of the partyRoleIntKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyRoleIntKey() {
        return partyRoleIntKey;
    }

    /**
     * Sets the value of the partyRoleIntKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyRoleIntKey(String value) {
        this.partyRoleIntKey = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link InteractionStatusKind }
     *     
     */
    public InteractionStatusKind getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractionStatusKind }
     *     
     */
    public void setStatus(InteractionStatusKind value) {
        this.status = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the beginDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDateTime() {
        return beginDateTime;
    }

    /**
     * Sets the value of the beginDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDateTime(XMLGregorianCalendar value) {
        this.beginDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDateTime(XMLGregorianCalendar value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the withPartyRoleKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWithPartyRoleKey() {
        return withPartyRoleKey;
    }

    /**
     * Sets the value of the withPartyRoleKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWithPartyRoleKey(String value) {
        this.withPartyRoleKey = value;
    }

    /**
     * Gets the value of the characteristics property.
     * 
     * @return
     *     possible object is
     *     {@link PartyRoleInteractionChars }
     *     
     */
    public PartyRoleInteractionChars getCharacteristics() {
        return characteristics;
    }

    /**
     * Sets the value of the characteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRoleInteractionChars }
     *     
     */
    public void setCharacteristics(PartyRoleInteractionChars value) {
        this.characteristics = value;
    }

    /**
     * Gets the value of the interactionType property.
     * 
     * @return
     *     possible object is
     *     {@link PartyRoleInteractionType }
     *     
     */
    public PartyRoleInteractionType getInteractionType() {
        return interactionType;
    }

    /**
     * Sets the value of the interactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRoleInteractionType }
     *     
     */
    public void setInteractionType(PartyRoleInteractionType value) {
        this.interactionType = value;
    }

    /**
     * Gets the value of the transaction property.
     * 
     * @return
     *     possible object is
     *     {@link Transaction }
     *     
     */
    public Transaction getTransaction() {
        return transaction;
    }

    /**
     * Sets the value of the transaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transaction }
     *     
     */
    public void setTransaction(Transaction value) {
        this.transaction = value;
    }

}