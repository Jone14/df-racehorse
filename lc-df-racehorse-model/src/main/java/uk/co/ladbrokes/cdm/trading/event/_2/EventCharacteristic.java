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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.common.characteristic._2.Characteristic;


/**
 * Maintains the characteristics for event
 * 
 * <p>Java class for EventCharacteristic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventCharacteristic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/common/Characteristic/2.0}Characteristic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eventCharacteristicId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="deleteFlag" type="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}DeleteFlagKind" minOccurs="0"/&gt;
 *         &lt;element name="eventTypeCharacteristic" type="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}EventTypeCharacteristic" minOccurs="0"/&gt;
 *         &lt;element name="eventSubtypeCharacteristic" type="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}EventSubtypeCharacteristic" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventCharacteristic", propOrder = {
    "eventCharacteristicId",
    "deleteFlag",
    "eventTypeCharacteristic",
    "eventSubtypeCharacteristic"
})
public class EventCharacteristic
    extends Characteristic
{

    protected BigInteger eventCharacteristicId;
    @XmlSchemaType(name = "string")
    protected DeleteFlagKind deleteFlag;
    protected EventTypeCharacteristic eventTypeCharacteristic;
    protected EventSubtypeCharacteristic eventSubtypeCharacteristic;

    /**
     * Gets the value of the eventCharacteristicId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEventCharacteristicId() {
        return eventCharacteristicId;
    }

    /**
     * Sets the value of the eventCharacteristicId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEventCharacteristicId(BigInteger value) {
        this.eventCharacteristicId = value;
    }

    /**
     * Gets the value of the deleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteFlagKind }
     *     
     */
    public DeleteFlagKind getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * Sets the value of the deleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteFlagKind }
     *     
     */
    public void setDeleteFlag(DeleteFlagKind value) {
        this.deleteFlag = value;
    }

    /**
     * Gets the value of the eventTypeCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link EventTypeCharacteristic }
     *     
     */
    public EventTypeCharacteristic getEventTypeCharacteristic() {
        return eventTypeCharacteristic;
    }

    /**
     * Sets the value of the eventTypeCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventTypeCharacteristic }
     *     
     */
    public void setEventTypeCharacteristic(EventTypeCharacteristic value) {
        this.eventTypeCharacteristic = value;
    }

    /**
     * Gets the value of the eventSubtypeCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link EventSubtypeCharacteristic }
     *     
     */
    public EventSubtypeCharacteristic getEventSubtypeCharacteristic() {
        return eventSubtypeCharacteristic;
    }

    /**
     * Sets the value of the eventSubtypeCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventSubtypeCharacteristic }
     *     
     */
    public void setEventSubtypeCharacteristic(EventSubtypeCharacteristic value) {
        this.eventSubtypeCharacteristic = value;
    }

}