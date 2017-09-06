//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.trading.event._2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VolleyballScoreboard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VolleyballScoreboard"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}EventScoreboard"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="player1Points" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="player2Points" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="player1NoS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="player2NoS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="totalSets" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="currentSet" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="serveNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="endOfMatch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="participant1ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="participant2ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currentServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isGDR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="timeUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="player1DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="player2DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="volleyballSet" type="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}VolleyballAllSetDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolleyballScoreboard", propOrder = {
    "player1Points",
    "player2Points",
    "player1NoS",
    "player2NoS",
    "totalSets",
    "currentSet",
    "serveNumber",
    "endOfMatch",
    "participant1ID",
    "participant2ID",
    "currentServer",
    "isGDR",
    "timeUpdated",
    "player1DisplayName",
    "player2DisplayName",
    "volleyballSet"
})
public class VolleyballScoreboard
    extends EventScoreboard
{

    protected BigInteger player1Points;
    protected BigInteger player2Points;
    protected BigInteger player1NoS;
    protected BigInteger player2NoS;
    protected BigInteger totalSets;
    protected BigInteger currentSet;
    protected BigInteger serveNumber;
    protected String endOfMatch;
    protected String participant1ID;
    protected String participant2ID;
    protected String currentServer;
    protected Boolean isGDR;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeUpdated;
    protected String player1DisplayName;
    protected String player2DisplayName;
    protected List<VolleyballAllSetDetail> volleyballSet;

    /**
     * Gets the value of the player1Points property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPlayer1Points() {
        return player1Points;
    }

    /**
     * Sets the value of the player1Points property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPlayer1Points(BigInteger value) {
        this.player1Points = value;
    }

    /**
     * Gets the value of the player2Points property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPlayer2Points() {
        return player2Points;
    }

    /**
     * Sets the value of the player2Points property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPlayer2Points(BigInteger value) {
        this.player2Points = value;
    }

    /**
     * Gets the value of the player1NoS property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPlayer1NoS() {
        return player1NoS;
    }

    /**
     * Sets the value of the player1NoS property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPlayer1NoS(BigInteger value) {
        this.player1NoS = value;
    }

    /**
     * Gets the value of the player2NoS property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPlayer2NoS() {
        return player2NoS;
    }

    /**
     * Sets the value of the player2NoS property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPlayer2NoS(BigInteger value) {
        this.player2NoS = value;
    }

    /**
     * Gets the value of the totalSets property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalSets() {
        return totalSets;
    }

    /**
     * Sets the value of the totalSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalSets(BigInteger value) {
        this.totalSets = value;
    }

    /**
     * Gets the value of the currentSet property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrentSet() {
        return currentSet;
    }

    /**
     * Sets the value of the currentSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrentSet(BigInteger value) {
        this.currentSet = value;
    }

    /**
     * Gets the value of the serveNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getServeNumber() {
        return serveNumber;
    }

    /**
     * Sets the value of the serveNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setServeNumber(BigInteger value) {
        this.serveNumber = value;
    }

    /**
     * Gets the value of the endOfMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndOfMatch() {
        return endOfMatch;
    }

    /**
     * Sets the value of the endOfMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndOfMatch(String value) {
        this.endOfMatch = value;
    }

    /**
     * Gets the value of the participant1ID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipant1ID() {
        return participant1ID;
    }

    /**
     * Sets the value of the participant1ID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipant1ID(String value) {
        this.participant1ID = value;
    }

    /**
     * Gets the value of the participant2ID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipant2ID() {
        return participant2ID;
    }

    /**
     * Sets the value of the participant2ID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipant2ID(String value) {
        this.participant2ID = value;
    }

    /**
     * Gets the value of the currentServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentServer() {
        return currentServer;
    }

    /**
     * Sets the value of the currentServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentServer(String value) {
        this.currentServer = value;
    }

    /**
     * Gets the value of the isGDR property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGDR() {
        return isGDR;
    }

    /**
     * Sets the value of the isGDR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGDR(Boolean value) {
        this.isGDR = value;
    }

    /**
     * Gets the value of the timeUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Sets the value of the timeUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeUpdated(XMLGregorianCalendar value) {
        this.timeUpdated = value;
    }

    /**
     * Gets the value of the player1DisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayer1DisplayName() {
        return player1DisplayName;
    }

    /**
     * Sets the value of the player1DisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayer1DisplayName(String value) {
        this.player1DisplayName = value;
    }

    /**
     * Gets the value of the player2DisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayer2DisplayName() {
        return player2DisplayName;
    }

    /**
     * Sets the value of the player2DisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayer2DisplayName(String value) {
        this.player2DisplayName = value;
    }

    /**
     * Gets the value of the volleyballSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the volleyballSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVolleyballSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VolleyballAllSetDetail }
     * 
     * 
     */
    public List<VolleyballAllSetDetail> getVolleyballSet() {
        if (volleyballSet == null) {
            volleyballSet = new ArrayList<VolleyballAllSetDetail>();
        }
        return this.volleyballSet;
    }

}