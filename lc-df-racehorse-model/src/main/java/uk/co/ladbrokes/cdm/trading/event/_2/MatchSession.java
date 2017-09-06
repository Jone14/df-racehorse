//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.trading.event._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.common.basetype._2.TimePeriod;


/**
 * Maintains details of sessions for a match,  like status, start time and end time for a session.
 * 
 * <p>Java class for MatchSession complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchSession"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sessionStatus" type="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}SessionStateKind" minOccurs="0"/&gt;
 *         &lt;element name="validFor" type="{http://cdm.ladbrokes.co.uk/common/BaseType/2.0}TimePeriod" minOccurs="0"/&gt;
 *         &lt;element name="session" type="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}Session" minOccurs="0"/&gt;
 *         &lt;element name="sessionStatistic" type="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}SessionStatistic" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchSession", propOrder = {
    "sessionStatus",
    "validFor",
    "session",
    "sessionStatistic"
})
public class MatchSession {

    @XmlSchemaType(name = "string")
    protected SessionStateKind sessionStatus;
    protected TimePeriod validFor;
    protected Session session;
    protected SessionStatistic sessionStatistic;

    /**
     * Gets the value of the sessionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SessionStateKind }
     *     
     */
    public SessionStateKind getSessionStatus() {
        return sessionStatus;
    }

    /**
     * Sets the value of the sessionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionStateKind }
     *     
     */
    public void setSessionStatus(SessionStateKind value) {
        this.sessionStatus = value;
    }

    /**
     * Gets the value of the validFor property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod }
     *     
     */
    public TimePeriod getValidFor() {
        return validFor;
    }

    /**
     * Sets the value of the validFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod }
     *     
     */
    public void setValidFor(TimePeriod value) {
        this.validFor = value;
    }

    /**
     * Gets the value of the session property.
     * 
     * @return
     *     possible object is
     *     {@link Session }
     *     
     */
    public Session getSession() {
        return session;
    }

    /**
     * Sets the value of the session property.
     * 
     * @param value
     *     allowed object is
     *     {@link Session }
     *     
     */
    public void setSession(Session value) {
        this.session = value;
    }

    /**
     * Gets the value of the sessionStatistic property.
     * 
     * @return
     *     possible object is
     *     {@link SessionStatistic }
     *     
     */
    public SessionStatistic getSessionStatistic() {
        return sessionStatistic;
    }

    /**
     * Sets the value of the sessionStatistic property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionStatistic }
     *     
     */
    public void setSessionStatistic(SessionStatistic value) {
        this.sessionStatistic = value;
    }

}