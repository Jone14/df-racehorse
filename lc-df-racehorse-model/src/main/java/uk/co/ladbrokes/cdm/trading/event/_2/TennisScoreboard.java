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
 * <p>Java class for TennisScoreboard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TennisScoreboard"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}EventScoreboard"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="player1DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="player2DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="player1Points" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="player1PointsDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="player2Points" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="player2PointsDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="player1NoS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="player2NoS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="player1NoA" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="player2NoA" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="player1DF" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="player2DF" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="totalSets" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="tieBreakLastSet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="currentSet" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="currentGame" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="endOfMatch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="participantServing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="participant1ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="participant2ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="participant1BS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="participant2BS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="isTiebreak" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="setDecreased" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isCreateGameIndexMarket" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isCreateSetIndexMarket" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isBIP" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="currentServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isGDR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="timeUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="bipmarketsStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dynamicData" type="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}TennisDynamicData" minOccurs="0"/&gt;
 *         &lt;element name="set" type="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}SetDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TennisScoreboard", propOrder = {
    "player1DisplayName",
    "player2DisplayName",
    "player1Points",
    "player1PointsDisplayName",
    "player2Points",
    "player2PointsDisplayName",
    "player1NoS",
    "player2NoS",
    "player1NoA",
    "player2NoA",
    "player1DF",
    "player2DF",
    "totalSets",
    "tieBreakLastSet",
    "currentSet",
    "currentGame",
    "endOfMatch",
    "participantServing",
    "participant1ID",
    "participant2ID",
    "participant1BS",
    "participant2BS",
    "isTiebreak",
    "setDecreased",
    "isCreateGameIndexMarket",
    "isCreateSetIndexMarket",
    "isBIP",
    "currentServer",
    "isGDR",
    "timeUpdated",
    "bipmarketsStatus",
    "dynamicData",
    "set"
})
public class TennisScoreboard
    extends EventScoreboard
{

    protected String player1DisplayName;
    protected String player2DisplayName;
    protected BigInteger player1Points;
    protected String player1PointsDisplayName;
    protected BigInteger player2Points;
    protected String player2PointsDisplayName;
    protected BigInteger player1NoS;
    protected BigInteger player2NoS;
    protected BigInteger player1NoA;
    protected BigInteger player2NoA;
    protected BigInteger player1DF;
    protected BigInteger player2DF;
    protected BigInteger totalSets;
    protected Boolean tieBreakLastSet;
    protected BigInteger currentSet;
    protected BigInteger currentGame;
    protected Boolean endOfMatch;
    protected String participantServing;
    protected String participant1ID;
    protected String participant2ID;
    protected BigInteger participant1BS;
    protected BigInteger participant2BS;
    protected Boolean isTiebreak;
    protected Boolean setDecreased;
    protected Boolean isCreateGameIndexMarket;
    protected Boolean isCreateSetIndexMarket;
    protected Boolean isBIP;
    protected String currentServer;
    protected Boolean isGDR;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeUpdated;
    protected String bipmarketsStatus;
    protected TennisDynamicData dynamicData;
    protected List<SetDetail> set;

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
     * Gets the value of the player1PointsDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayer1PointsDisplayName() {
        return player1PointsDisplayName;
    }

    /**
     * Sets the value of the player1PointsDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayer1PointsDisplayName(String value) {
        this.player1PointsDisplayName = value;
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
     * Gets the value of the player2PointsDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayer2PointsDisplayName() {
        return player2PointsDisplayName;
    }

    /**
     * Sets the value of the player2PointsDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayer2PointsDisplayName(String value) {
        this.player2PointsDisplayName = value;
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
     * Gets the value of the player1NoA property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPlayer1NoA() {
        return player1NoA;
    }

    /**
     * Sets the value of the player1NoA property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPlayer1NoA(BigInteger value) {
        this.player1NoA = value;
    }

    /**
     * Gets the value of the player2NoA property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPlayer2NoA() {
        return player2NoA;
    }

    /**
     * Sets the value of the player2NoA property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPlayer2NoA(BigInteger value) {
        this.player2NoA = value;
    }

    /**
     * Gets the value of the player1DF property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPlayer1DF() {
        return player1DF;
    }

    /**
     * Sets the value of the player1DF property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPlayer1DF(BigInteger value) {
        this.player1DF = value;
    }

    /**
     * Gets the value of the player2DF property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPlayer2DF() {
        return player2DF;
    }

    /**
     * Sets the value of the player2DF property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPlayer2DF(BigInteger value) {
        this.player2DF = value;
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
     * Gets the value of the tieBreakLastSet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTieBreakLastSet() {
        return tieBreakLastSet;
    }

    /**
     * Sets the value of the tieBreakLastSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTieBreakLastSet(Boolean value) {
        this.tieBreakLastSet = value;
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
     * Gets the value of the currentGame property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrentGame() {
        return currentGame;
    }

    /**
     * Sets the value of the currentGame property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrentGame(BigInteger value) {
        this.currentGame = value;
    }

    /**
     * Gets the value of the endOfMatch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndOfMatch() {
        return endOfMatch;
    }

    /**
     * Sets the value of the endOfMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndOfMatch(Boolean value) {
        this.endOfMatch = value;
    }

    /**
     * Gets the value of the participantServing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantServing() {
        return participantServing;
    }

    /**
     * Sets the value of the participantServing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantServing(String value) {
        this.participantServing = value;
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
     * Gets the value of the participant1BS property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParticipant1BS() {
        return participant1BS;
    }

    /**
     * Sets the value of the participant1BS property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParticipant1BS(BigInteger value) {
        this.participant1BS = value;
    }

    /**
     * Gets the value of the participant2BS property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParticipant2BS() {
        return participant2BS;
    }

    /**
     * Sets the value of the participant2BS property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParticipant2BS(BigInteger value) {
        this.participant2BS = value;
    }

    /**
     * Gets the value of the isTiebreak property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTiebreak() {
        return isTiebreak;
    }

    /**
     * Sets the value of the isTiebreak property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTiebreak(Boolean value) {
        this.isTiebreak = value;
    }

    /**
     * Gets the value of the setDecreased property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSetDecreased() {
        return setDecreased;
    }

    /**
     * Sets the value of the setDecreased property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSetDecreased(Boolean value) {
        this.setDecreased = value;
    }

    /**
     * Gets the value of the isCreateGameIndexMarket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCreateGameIndexMarket() {
        return isCreateGameIndexMarket;
    }

    /**
     * Sets the value of the isCreateGameIndexMarket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCreateGameIndexMarket(Boolean value) {
        this.isCreateGameIndexMarket = value;
    }

    /**
     * Gets the value of the isCreateSetIndexMarket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCreateSetIndexMarket() {
        return isCreateSetIndexMarket;
    }

    /**
     * Sets the value of the isCreateSetIndexMarket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCreateSetIndexMarket(Boolean value) {
        this.isCreateSetIndexMarket = value;
    }

    /**
     * Gets the value of the isBIP property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsBIP() {
        return isBIP;
    }

    /**
     * Sets the value of the isBIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsBIP(Boolean value) {
        this.isBIP = value;
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
     * Gets the value of the bipmarketsStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBipmarketsStatus() {
        return bipmarketsStatus;
    }

    /**
     * Sets the value of the bipmarketsStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBipmarketsStatus(String value) {
        this.bipmarketsStatus = value;
    }

    /**
     * Gets the value of the dynamicData property.
     * 
     * @return
     *     possible object is
     *     {@link TennisDynamicData }
     *     
     */
    public TennisDynamicData getDynamicData() {
        return dynamicData;
    }

    /**
     * Sets the value of the dynamicData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TennisDynamicData }
     *     
     */
    public void setDynamicData(TennisDynamicData value) {
        this.dynamicData = value;
    }

    /**
     * Gets the value of the set property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the set property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SetDetail }
     * 
     * 
     */
    public List<SetDetail> getSet() {
        if (set == null) {
            set = new ArrayList<SetDetail>();
        }
        return this.set;
    }

}
