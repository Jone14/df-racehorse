//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.content.racingcontent._1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.product.sportsbook._2.RaceMeeting;


/**
 * <p>Java class for TrapStatistic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrapStatistic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="trapStatisticType" type="{http://cdm.ladbrokes.co.uk/content/RacingContent/1.0}TrapStatisticTypeKind" minOccurs="0"/&gt;
 *         &lt;element name="trapNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="wins" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="totalRaces" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="winPercentage" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="isHotStat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="meeting" type="{http://cdm.ladbrokes.co.uk/product/Sportsbook/2.0}RaceMeeting" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrapStatistic", propOrder = {
    "trapStatisticType",
    "trapNumber",
    "wins",
    "totalRaces",
    "winPercentage",
    "isHotStat",
    "meeting"
})
public class TrapStatistic {

    @XmlSchemaType(name = "string")
    protected TrapStatisticTypeKind trapStatisticType;
    protected BigInteger trapNumber;
    protected BigInteger wins;
    protected BigInteger totalRaces;
    protected BigInteger winPercentage;
    protected Boolean isHotStat;
    protected RaceMeeting meeting;

    /**
     * Gets the value of the trapStatisticType property.
     * 
     * @return
     *     possible object is
     *     {@link TrapStatisticTypeKind }
     *     
     */
    public TrapStatisticTypeKind getTrapStatisticType() {
        return trapStatisticType;
    }

    /**
     * Sets the value of the trapStatisticType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrapStatisticTypeKind }
     *     
     */
    public void setTrapStatisticType(TrapStatisticTypeKind value) {
        this.trapStatisticType = value;
    }

    /**
     * Gets the value of the trapNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTrapNumber() {
        return trapNumber;
    }

    /**
     * Sets the value of the trapNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTrapNumber(BigInteger value) {
        this.trapNumber = value;
    }

    /**
     * Gets the value of the wins property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWins() {
        return wins;
    }

    /**
     * Sets the value of the wins property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWins(BigInteger value) {
        this.wins = value;
    }

    /**
     * Gets the value of the totalRaces property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalRaces() {
        return totalRaces;
    }

    /**
     * Sets the value of the totalRaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalRaces(BigInteger value) {
        this.totalRaces = value;
    }

    /**
     * Gets the value of the winPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWinPercentage() {
        return winPercentage;
    }

    /**
     * Sets the value of the winPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWinPercentage(BigInteger value) {
        this.winPercentage = value;
    }

    /**
     * Gets the value of the isHotStat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsHotStat() {
        return isHotStat;
    }

    /**
     * Sets the value of the isHotStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHotStat(Boolean value) {
        this.isHotStat = value;
    }

    /**
     * Gets the value of the meeting property.
     * 
     * @return
     *     possible object is
     *     {@link RaceMeeting }
     *     
     */
    public RaceMeeting getMeeting() {
        return meeting;
    }

    /**
     * Sets the value of the meeting property.
     * 
     * @param value
     *     allowed object is
     *     {@link RaceMeeting }
     *     
     */
    public void setMeeting(RaceMeeting value) {
        this.meeting = value;
    }

}
