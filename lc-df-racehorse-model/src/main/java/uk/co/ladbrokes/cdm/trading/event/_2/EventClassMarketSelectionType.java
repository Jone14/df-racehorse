//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.trading.event._2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventClassMarketSelectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventClassMarketSelectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eventClassMarketSelectionTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="eventClassMarketSelectionTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="participant1Flag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="participant2Flag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="metadata1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="metadata2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="metadata3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="metadata4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="metadata5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventClassMarketSelectionType", propOrder = {
    "eventClassMarketSelectionTypeId",
    "eventClassMarketSelectionTypeName",
    "participant1Flag",
    "participant2Flag",
    "metadata1",
    "metadata2",
    "metadata3",
    "metadata4",
    "metadata5"
})
public class EventClassMarketSelectionType {

    protected BigInteger eventClassMarketSelectionTypeId;
    protected String eventClassMarketSelectionTypeName;
    protected Boolean participant1Flag;
    protected Boolean participant2Flag;
    protected String metadata1;
    protected String metadata2;
    protected String metadata3;
    protected String metadata4;
    protected String metadata5;

    /**
     * Gets the value of the eventClassMarketSelectionTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEventClassMarketSelectionTypeId() {
        return eventClassMarketSelectionTypeId;
    }

    /**
     * Sets the value of the eventClassMarketSelectionTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEventClassMarketSelectionTypeId(BigInteger value) {
        this.eventClassMarketSelectionTypeId = value;
    }

    /**
     * Gets the value of the eventClassMarketSelectionTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventClassMarketSelectionTypeName() {
        return eventClassMarketSelectionTypeName;
    }

    /**
     * Sets the value of the eventClassMarketSelectionTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventClassMarketSelectionTypeName(String value) {
        this.eventClassMarketSelectionTypeName = value;
    }

    /**
     * Gets the value of the participant1Flag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParticipant1Flag() {
        return participant1Flag;
    }

    /**
     * Sets the value of the participant1Flag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParticipant1Flag(Boolean value) {
        this.participant1Flag = value;
    }

    /**
     * Gets the value of the participant2Flag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isParticipant2Flag() {
        return participant2Flag;
    }

    /**
     * Sets the value of the participant2Flag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParticipant2Flag(Boolean value) {
        this.participant2Flag = value;
    }

    /**
     * Gets the value of the metadata1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadata1() {
        return metadata1;
    }

    /**
     * Sets the value of the metadata1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadata1(String value) {
        this.metadata1 = value;
    }

    /**
     * Gets the value of the metadata2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadata2() {
        return metadata2;
    }

    /**
     * Sets the value of the metadata2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadata2(String value) {
        this.metadata2 = value;
    }

    /**
     * Gets the value of the metadata3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadata3() {
        return metadata3;
    }

    /**
     * Sets the value of the metadata3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadata3(String value) {
        this.metadata3 = value;
    }

    /**
     * Gets the value of the metadata4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadata4() {
        return metadata4;
    }

    /**
     * Sets the value of the metadata4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadata4(String value) {
        this.metadata4 = value;
    }

    /**
     * Gets the value of the metadata5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadata5() {
        return metadata5;
    }

    /**
     * Sets the value of the metadata5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadata5(String value) {
        this.metadata5 = value;
    }

}
