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
 * <p>Java class for MatchUpdates complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchUpdates"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numUpdates" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="matchUpdate" type="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}MatchUpdate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchUpdates", propOrder = {
    "numUpdates",
    "matchUpdate"
})
public class MatchUpdates {

    protected BigInteger numUpdates;
    protected MatchUpdate matchUpdate;

    /**
     * Gets the value of the numUpdates property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumUpdates() {
        return numUpdates;
    }

    /**
     * Sets the value of the numUpdates property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumUpdates(BigInteger value) {
        this.numUpdates = value;
    }

    /**
     * Gets the value of the matchUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link MatchUpdate }
     *     
     */
    public MatchUpdate getMatchUpdate() {
        return matchUpdate;
    }

    /**
     * Sets the value of the matchUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchUpdate }
     *     
     */
    public void setMatchUpdate(MatchUpdate value) {
        this.matchUpdate = value;
    }

}
