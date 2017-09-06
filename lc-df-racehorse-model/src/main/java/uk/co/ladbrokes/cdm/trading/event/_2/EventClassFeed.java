//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.trading.event._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.trading.feed._2.Feed;
import uk.co.ladbrokes.cdm.trading.feed._2.FeedType;


/**
 * <p>Java class for EventClassFeed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventClassFeed"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="primaryProvider" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="availableFeed" type="{http://cdm.ladbrokes.co.uk/trading/Feed/2.0}Feed" minOccurs="0"/&gt;
 *         &lt;element name="forType" type="{http://cdm.ladbrokes.co.uk/trading/Feed/2.0}FeedType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventClassFeed", propOrder = {
    "primaryProvider",
    "availableFeed",
    "forType"
})
public class EventClassFeed {

    protected Boolean primaryProvider;
    protected Feed availableFeed;
    protected FeedType forType;

    /**
     * Gets the value of the primaryProvider property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryProvider() {
        return primaryProvider;
    }

    /**
     * Sets the value of the primaryProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryProvider(Boolean value) {
        this.primaryProvider = value;
    }

    /**
     * Gets the value of the availableFeed property.
     * 
     * @return
     *     possible object is
     *     {@link Feed }
     *     
     */
    public Feed getAvailableFeed() {
        return availableFeed;
    }

    /**
     * Sets the value of the availableFeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Feed }
     *     
     */
    public void setAvailableFeed(Feed value) {
        this.availableFeed = value;
    }

    /**
     * Gets the value of the forType property.
     * 
     * @return
     *     possible object is
     *     {@link FeedType }
     *     
     */
    public FeedType getForType() {
        return forType;
    }

    /**
     * Sets the value of the forType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeedType }
     *     
     */
    public void setForType(FeedType value) {
        this.forType = value;
    }

}