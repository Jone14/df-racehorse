//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.trading.event._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import uk.co.ladbrokes.cdm.common.crossref._2.CrossRefEntityKeys;
import uk.co.ladbrokes.cdm.common.managedentity._2.ManagedEntity;


/**
 * <p>Java class for EventScoreboard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventScoreboard"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/common/ManagedEntity/2.0}ManagedEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="endDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="matchStatus" type="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}MatchStateKind" minOccurs="0"/&gt;
 *         &lt;element name="eventKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isPreviousSessionGDR" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="winner" type="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}EventParticipant" minOccurs="0"/&gt;
 *         &lt;element name="eventKeys" type="{http://cdm.ladbrokes.co.uk/common/CrossRef/2.0}CrossRefEntityKeys" minOccurs="0"/&gt;
 *         &lt;element name="eventScoreboardChannel" type="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}EventScoreboardChannel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventScoreboard", propOrder = {
    "startDateTime",
    "endDateTime",
    "matchStatus",
    "eventKey",
    "isPreviousSessionGDR",
    "winner",
    "eventKeys",
    "eventScoreboardChannel"
})
@XmlSeeAlso({
    TennisScoreboard.class,
    VolleyballScoreboard.class,
    FootballScoreboard.class
})
public class EventScoreboard
    extends ManagedEntity
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateTime;
    @XmlSchemaType(name = "string")
    protected MatchStateKind matchStatus;
    protected String eventKey;
    protected Boolean isPreviousSessionGDR;
    protected EventParticipant winner;
    protected CrossRefEntityKeys eventKeys;
    protected List<EventScoreboardChannel> eventScoreboardChannel;

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateTime(XMLGregorianCalendar value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDateTime(XMLGregorianCalendar value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the matchStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MatchStateKind }
     *     
     */
    public MatchStateKind getMatchStatus() {
        return matchStatus;
    }

    /**
     * Sets the value of the matchStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchStateKind }
     *     
     */
    public void setMatchStatus(MatchStateKind value) {
        this.matchStatus = value;
    }

    /**
     * Gets the value of the eventKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventKey() {
        return eventKey;
    }

    /**
     * Sets the value of the eventKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventKey(String value) {
        this.eventKey = value;
    }

    /**
     * Gets the value of the isPreviousSessionGDR property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPreviousSessionGDR() {
        return isPreviousSessionGDR;
    }

    /**
     * Sets the value of the isPreviousSessionGDR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPreviousSessionGDR(Boolean value) {
        this.isPreviousSessionGDR = value;
    }

    /**
     * Gets the value of the winner property.
     * 
     * @return
     *     possible object is
     *     {@link EventParticipant }
     *     
     */
    public EventParticipant getWinner() {
        return winner;
    }

    /**
     * Sets the value of the winner property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventParticipant }
     *     
     */
    public void setWinner(EventParticipant value) {
        this.winner = value;
    }

    /**
     * Gets the value of the eventKeys property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public CrossRefEntityKeys getEventKeys() {
        return eventKeys;
    }

    /**
     * Sets the value of the eventKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public void setEventKeys(CrossRefEntityKeys value) {
        this.eventKeys = value;
    }

    /**
     * Gets the value of the eventScoreboardChannel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventScoreboardChannel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventScoreboardChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventScoreboardChannel }
     * 
     * 
     */
    public List<EventScoreboardChannel> getEventScoreboardChannel() {
        if (eventScoreboardChannel == null) {
            eventScoreboardChannel = new ArrayList<EventScoreboardChannel>();
        }
        return this.eventScoreboardChannel;
    }

}
