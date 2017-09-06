//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.trading.participant._2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Maintains various participant Types.
 * 
 * <p>Java class for ParticipantType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParticipantType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="participantTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="participantTypeId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="participantTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParticipantType", propOrder = {
    "participantTypeCode",
    "participantTypeId",
    "participantTypeName"
})
public class ParticipantType {

    protected String participantTypeCode;
    protected BigInteger participantTypeId;
    protected String participantTypeName;

    /**
     * Gets the value of the participantTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantTypeCode() {
        return participantTypeCode;
    }

    /**
     * Sets the value of the participantTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantTypeCode(String value) {
        this.participantTypeCode = value;
    }

    /**
     * Gets the value of the participantTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParticipantTypeId() {
        return participantTypeId;
    }

    /**
     * Sets the value of the participantTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParticipantTypeId(BigInteger value) {
        this.participantTypeId = value;
    }

    /**
     * Gets the value of the participantTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantTypeName() {
        return participantTypeName;
    }

    /**
     * Sets the value of the participantTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantTypeName(String value) {
        this.participantTypeName = value;
    }

}
