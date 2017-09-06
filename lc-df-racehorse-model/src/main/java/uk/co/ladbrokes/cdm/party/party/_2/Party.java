//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.party.party._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.common.location._2.Address;
import uk.co.ladbrokes.cdm.common.managedentity._2.ManagedEntity;


/**
 * A Person or Organisation in which Ladbrokes has a current, past or future interest with.
 * 
 * A Party can play many Party Roles depending on the business interaction or transaction taking place.
 * 
 * <p>Java class for Party complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Party"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/common/ManagedEntity/2.0}ManagedEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partyKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="partyType" type="{http://cdm.ladbrokes.co.uk/party/Party/2.0}PartyTypeKind" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://cdm.ladbrokes.co.uk/common/Location/2.0}Address" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="characteristics" type="{http://cdm.ladbrokes.co.uk/party/Party/2.0}PartyCharacteristcs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party", propOrder = {
    "partyKey",
    "partyType",
    "address",
    "characteristics"
})
@XmlSeeAlso({
    Person.class,
    Organisation.class
})
public abstract class Party
    extends ManagedEntity
{

    protected String partyKey;
    @XmlSchemaType(name = "string")
    protected PartyTypeKind partyType;
    protected List<Address> address;
    protected PartyCharacteristcs characteristics;

    /**
     * Gets the value of the partyKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyKey() {
        return partyKey;
    }

    /**
     * Sets the value of the partyKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyKey(String value) {
        this.partyKey = value;
    }

    /**
     * Gets the value of the partyType property.
     * 
     * @return
     *     possible object is
     *     {@link PartyTypeKind }
     *     
     */
    public PartyTypeKind getPartyType() {
        return partyType;
    }

    /**
     * Sets the value of the partyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTypeKind }
     *     
     */
    public void setPartyType(PartyTypeKind value) {
        this.partyType = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getAddress() {
        if (address == null) {
            address = new ArrayList<Address>();
        }
        return this.address;
    }

    /**
     * Gets the value of the characteristics property.
     * 
     * @return
     *     possible object is
     *     {@link PartyCharacteristcs }
     *     
     */
    public PartyCharacteristcs getCharacteristics() {
        return characteristics;
    }

    /**
     * Sets the value of the characteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyCharacteristcs }
     *     
     */
    public void setCharacteristics(PartyCharacteristcs value) {
        this.characteristics = value;
    }

}
