//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.betting.betslip._2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This class represents an 'eligible bet type, based on a number of selections in a group to be considered.  This contains a reference to the bet type itself, and any dtermined stake limits of the customer/event
 * 
 * <p>Java class for EligibleBetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EligibleBetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numOfLines" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="betTypeStakeLimits" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}BetStake" minOccurs="0"/&gt;
 *         &lt;element name="betType" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}BetType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EligibleBetType", propOrder = {
    "numOfLines",
    "betTypeStakeLimits",
    "betType"
})
public class EligibleBetType {

    protected BigInteger numOfLines;
    protected BetStake betTypeStakeLimits;
    protected BetType betType;

    /**
     * Gets the value of the numOfLines property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfLines() {
        return numOfLines;
    }

    /**
     * Sets the value of the numOfLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfLines(BigInteger value) {
        this.numOfLines = value;
    }

    /**
     * Gets the value of the betTypeStakeLimits property.
     * 
     * @return
     *     possible object is
     *     {@link BetStake }
     *     
     */
    public BetStake getBetTypeStakeLimits() {
        return betTypeStakeLimits;
    }

    /**
     * Sets the value of the betTypeStakeLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BetStake }
     *     
     */
    public void setBetTypeStakeLimits(BetStake value) {
        this.betTypeStakeLimits = value;
    }

    /**
     * Gets the value of the betType property.
     * 
     * @return
     *     possible object is
     *     {@link BetType }
     *     
     */
    public BetType getBetType() {
        return betType;
    }

    /**
     * Sets the value of the betType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BetType }
     *     
     */
    public void setBetType(BetType value) {
        this.betType = value;
    }

}
