//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.betting.betslip._2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * NEW:  Association to 'selectionPrice' is new
 * 
 * The legs are containers for an event (selection as parts)
 * 
 * For a multiple bet (such as an accumulator), the legs of the bet refer to the events (selections) on which the individual "bets" within the multiple are placed. So the first leg of a Double is the event that takes place first out of the two events involved.
 * 
 * N.B. Legs are not actually stored in start time order, but in the order they are added to the betslip. Hence leg 1 for a double might not necessarily be the first to run.
 * 
 * Line
 * 
 * For a Combination bet, the lines of the bet are the individual "bets" within the package, and as such may be either Singles or Multiples. The same stake is placed on each line of the bet.
 * 
 * <p>Java class for Leg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Leg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="legNo" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="legStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numPermutations" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="marketTags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="legCancelReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outcomeCombination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="legSort" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}LegSort" minOccurs="0"/&gt;
 *         &lt;element name="betPrice" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}BetPrice" minOccurs="0"/&gt;
 *         &lt;element name="eachWayDetail" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}EachWayDetail" minOccurs="0"/&gt;
 *         &lt;element name="placeDetail" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}PlaceDetail" minOccurs="0"/&gt;
 *         &lt;element name="part" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}Part" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="legOverride" type="{http://cdm.ladbrokes.co.uk/betting/Betslip/2.0}LegOverride" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Leg", propOrder = {
    "legNo",
    "legStatus",
    "numPermutations",
    "marketTags",
    "legCancelReason",
    "outcomeCombination",
    "legSort",
    "betPrice",
    "eachWayDetail",
    "placeDetail",
    "part",
    "legOverride"
})
public class Leg {

    protected BigInteger legNo;
    protected String legStatus;
    protected BigInteger numPermutations;
    protected String marketTags;
    protected String legCancelReason;
    protected String outcomeCombination;
    protected LegSort legSort;
    protected BetPrice betPrice;
    protected EachWayDetail eachWayDetail;
    protected PlaceDetail placeDetail;
    protected List<Part> part;
    protected List<LegOverride> legOverride;

    /**
     * Gets the value of the legNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLegNo() {
        return legNo;
    }

    /**
     * Sets the value of the legNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLegNo(BigInteger value) {
        this.legNo = value;
    }

    /**
     * Gets the value of the legStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegStatus() {
        return legStatus;
    }

    /**
     * Sets the value of the legStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegStatus(String value) {
        this.legStatus = value;
    }

    /**
     * Gets the value of the numPermutations property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumPermutations() {
        return numPermutations;
    }

    /**
     * Sets the value of the numPermutations property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumPermutations(BigInteger value) {
        this.numPermutations = value;
    }

    /**
     * Gets the value of the marketTags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketTags() {
        return marketTags;
    }

    /**
     * Sets the value of the marketTags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketTags(String value) {
        this.marketTags = value;
    }

    /**
     * Gets the value of the legCancelReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegCancelReason() {
        return legCancelReason;
    }

    /**
     * Sets the value of the legCancelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegCancelReason(String value) {
        this.legCancelReason = value;
    }

    /**
     * Gets the value of the outcomeCombination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutcomeCombination() {
        return outcomeCombination;
    }

    /**
     * Sets the value of the outcomeCombination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutcomeCombination(String value) {
        this.outcomeCombination = value;
    }

    /**
     * Gets the value of the legSort property.
     * 
     * @return
     *     possible object is
     *     {@link LegSort }
     *     
     */
    public LegSort getLegSort() {
        return legSort;
    }

    /**
     * Sets the value of the legSort property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegSort }
     *     
     */
    public void setLegSort(LegSort value) {
        this.legSort = value;
    }

    /**
     * Gets the value of the betPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BetPrice }
     *     
     */
    public BetPrice getBetPrice() {
        return betPrice;
    }

    /**
     * Sets the value of the betPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BetPrice }
     *     
     */
    public void setBetPrice(BetPrice value) {
        this.betPrice = value;
    }

    /**
     * Gets the value of the eachWayDetail property.
     * 
     * @return
     *     possible object is
     *     {@link EachWayDetail }
     *     
     */
    public EachWayDetail getEachWayDetail() {
        return eachWayDetail;
    }

    /**
     * Sets the value of the eachWayDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link EachWayDetail }
     *     
     */
    public void setEachWayDetail(EachWayDetail value) {
        this.eachWayDetail = value;
    }

    /**
     * Gets the value of the placeDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceDetail }
     *     
     */
    public PlaceDetail getPlaceDetail() {
        return placeDetail;
    }

    /**
     * Sets the value of the placeDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceDetail }
     *     
     */
    public void setPlaceDetail(PlaceDetail value) {
        this.placeDetail = value;
    }

    /**
     * Gets the value of the part property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the part property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Part }
     * 
     * 
     */
    public List<Part> getPart() {
        if (part == null) {
            part = new ArrayList<Part>();
        }
        return this.part;
    }

    /**
     * Gets the value of the legOverride property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legOverride property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegOverride().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegOverride }
     * 
     * 
     */
    public List<LegOverride> getLegOverride() {
        if (legOverride == null) {
            legOverride = new ArrayList<LegOverride>();
        }
        return this.legOverride;
    }

}
