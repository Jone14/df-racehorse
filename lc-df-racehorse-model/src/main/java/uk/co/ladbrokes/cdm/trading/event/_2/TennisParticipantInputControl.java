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
 * <p>Java class for TennisParticipantInputControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TennisParticipantInputControl"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="participantId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="serve" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="accelerator" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="sets" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="futureSet" type="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}FutureSet" minOccurs="0"/&gt;
 *         &lt;element name="aces" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="doubleFaults" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="tieBreak" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TennisParticipantInputControl", propOrder = {
    "participantId",
    "serve",
    "accelerator",
    "sets",
    "futureSet",
    "aces",
    "doubleFaults",
    "tieBreak"
})
public class TennisParticipantInputControl {

    protected BigInteger participantId;
    protected Double serve;
    protected Double accelerator;
    protected Double sets;
    protected FutureSet futureSet;
    protected Double aces;
    protected Double doubleFaults;
    protected Double tieBreak;

    /**
     * Gets the value of the participantId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParticipantId() {
        return participantId;
    }

    /**
     * Sets the value of the participantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParticipantId(BigInteger value) {
        this.participantId = value;
    }

    /**
     * Gets the value of the serve property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getServe() {
        return serve;
    }

    /**
     * Sets the value of the serve property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setServe(Double value) {
        this.serve = value;
    }

    /**
     * Gets the value of the accelerator property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAccelerator() {
        return accelerator;
    }

    /**
     * Sets the value of the accelerator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAccelerator(Double value) {
        this.accelerator = value;
    }

    /**
     * Gets the value of the sets property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSets() {
        return sets;
    }

    /**
     * Sets the value of the sets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSets(Double value) {
        this.sets = value;
    }

    /**
     * Gets the value of the futureSet property.
     * 
     * @return
     *     possible object is
     *     {@link FutureSet }
     *     
     */
    public FutureSet getFutureSet() {
        return futureSet;
    }

    /**
     * Sets the value of the futureSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutureSet }
     *     
     */
    public void setFutureSet(FutureSet value) {
        this.futureSet = value;
    }

    /**
     * Gets the value of the aces property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAces() {
        return aces;
    }

    /**
     * Sets the value of the aces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAces(Double value) {
        this.aces = value;
    }

    /**
     * Gets the value of the doubleFaults property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDoubleFaults() {
        return doubleFaults;
    }

    /**
     * Sets the value of the doubleFaults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDoubleFaults(Double value) {
        this.doubleFaults = value;
    }

    /**
     * Gets the value of the tieBreak property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTieBreak() {
        return tieBreak;
    }

    /**
     * Sets the value of the tieBreak property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTieBreak(Double value) {
        this.tieBreak = value;
    }

}
