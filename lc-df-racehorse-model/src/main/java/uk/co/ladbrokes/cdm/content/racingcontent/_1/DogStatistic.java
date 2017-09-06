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
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.product.sportsbook._2.Race;


/**
 * <p>Java class for DogStatistic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DogStatistic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="wins" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="runs" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="isHotStat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isColdStat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dog" type="{http://cdm.ladbrokes.co.uk/content/RacingContent/1.0}Dog" minOccurs="0"/&gt;
 *         &lt;element name="race" type="{http://cdm.ladbrokes.co.uk/product/Sportsbook/2.0}Race" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DogStatistic", propOrder = {
    "wins",
    "runs",
    "isHotStat",
    "isColdStat",
    "dog",
    "race"
})
public class DogStatistic {

    protected BigInteger wins;
    protected BigInteger runs;
    protected Boolean isHotStat;
    protected Boolean isColdStat;
    protected Dog dog;
    protected Race race;

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
     * Gets the value of the runs property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRuns() {
        return runs;
    }

    /**
     * Sets the value of the runs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRuns(BigInteger value) {
        this.runs = value;
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
     * Gets the value of the isColdStat property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsColdStat() {
        return isColdStat;
    }

    /**
     * Sets the value of the isColdStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsColdStat(Boolean value) {
        this.isColdStat = value;
    }

    /**
     * Gets the value of the dog property.
     * 
     * @return
     *     possible object is
     *     {@link Dog }
     *     
     */
    public Dog getDog() {
        return dog;
    }

    /**
     * Sets the value of the dog property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dog }
     *     
     */
    public void setDog(Dog value) {
        this.dog = value;
    }

    /**
     * Gets the value of the race property.
     * 
     * @return
     *     possible object is
     *     {@link Race }
     *     
     */
    public Race getRace() {
        return race;
    }

    /**
     * Sets the value of the race property.
     * 
     * @param value
     *     allowed object is
     *     {@link Race }
     *     
     */
    public void setRace(Race value) {
        this.race = value;
    }

}
