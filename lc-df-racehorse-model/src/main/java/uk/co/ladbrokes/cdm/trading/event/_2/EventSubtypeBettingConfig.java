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
import javax.xml.datatype.XMLGregorianCalendar;
import uk.co.ladbrokes.cdm.common.basetype._2.Money;


/**
 * Contains the details of event betting.
 * 
 * <p>Java class for EventSubtypeBettingConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventSubtypeBettingConfig"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maxPayOut" type="{http://cdm.ladbrokes.co.uk/common/BaseType/2.0}Money" minOccurs="0"/&gt;
 *         &lt;element name="maxPotentialWin" type="{http://cdm.ladbrokes.co.uk/common/BaseType/2.0}Money" minOccurs="0"/&gt;
 *         &lt;element name="minSingleBet" type="{http://cdm.ladbrokes.co.uk/common/BaseType/2.0}Money" minOccurs="0"/&gt;
 *         &lt;element name="maxSingleBet" type="{http://cdm.ladbrokes.co.uk/common/BaseType/2.0}Money" minOccurs="0"/&gt;
 *         &lt;element name="maxMultipleBet" type="{http://cdm.ladbrokes.co.uk/common/BaseType/2.0}Money" minOccurs="0"/&gt;
 *         &lt;element name="winAlertLevel" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="validFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="validTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventSubtypeBettingConfig", propOrder = {
    "maxPayOut",
    "maxPotentialWin",
    "minSingleBet",
    "maxSingleBet",
    "maxMultipleBet",
    "winAlertLevel",
    "validFrom",
    "validTo",
    "isActive"
})
public class EventSubtypeBettingConfig {

    protected Money maxPayOut;
    protected Money maxPotentialWin;
    protected Money minSingleBet;
    protected Money maxSingleBet;
    protected Money maxMultipleBet;
    protected BigInteger winAlertLevel;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validTo;
    protected Boolean isActive;

    /**
     * Gets the value of the maxPayOut property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMaxPayOut() {
        return maxPayOut;
    }

    /**
     * Sets the value of the maxPayOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMaxPayOut(Money value) {
        this.maxPayOut = value;
    }

    /**
     * Gets the value of the maxPotentialWin property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMaxPotentialWin() {
        return maxPotentialWin;
    }

    /**
     * Sets the value of the maxPotentialWin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMaxPotentialWin(Money value) {
        this.maxPotentialWin = value;
    }

    /**
     * Gets the value of the minSingleBet property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMinSingleBet() {
        return minSingleBet;
    }

    /**
     * Sets the value of the minSingleBet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMinSingleBet(Money value) {
        this.minSingleBet = value;
    }

    /**
     * Gets the value of the maxSingleBet property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMaxSingleBet() {
        return maxSingleBet;
    }

    /**
     * Sets the value of the maxSingleBet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMaxSingleBet(Money value) {
        this.maxSingleBet = value;
    }

    /**
     * Gets the value of the maxMultipleBet property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getMaxMultipleBet() {
        return maxMultipleBet;
    }

    /**
     * Sets the value of the maxMultipleBet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setMaxMultipleBet(Money value) {
        this.maxMultipleBet = value;
    }

    /**
     * Gets the value of the winAlertLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWinAlertLevel() {
        return winAlertLevel;
    }

    /**
     * Sets the value of the winAlertLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWinAlertLevel(BigInteger value) {
        this.winAlertLevel = value;
    }

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFrom(XMLGregorianCalendar value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidTo() {
        return validTo;
    }

    /**
     * Sets the value of the validTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidTo(XMLGregorianCalendar value) {
        this.validTo = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

}
