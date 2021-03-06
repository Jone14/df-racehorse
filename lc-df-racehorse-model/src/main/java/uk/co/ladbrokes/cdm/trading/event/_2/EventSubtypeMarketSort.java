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
import uk.co.ladbrokes.cdm.trading.market._2.MarketSort;


/**
 * Maintains details of sorts at event Sub Type level
 * 
 * <p>Java class for EventSubtypeMarketSort complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventSubtypeMarketSort"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eventSubtypeMarketSortId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="displayOrder" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="deleteFlag" type="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}DeleteFlagKind" minOccurs="0"/&gt;
 *         &lt;element name="marketSort" type="{http://cdm.ladbrokes.co.uk/trading/Market/2.0}MarketSort" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventSubtypeMarketSort", propOrder = {
    "eventSubtypeMarketSortId",
    "displayOrder",
    "deleteFlag",
    "marketSort"
})
public class EventSubtypeMarketSort {

    protected BigInteger eventSubtypeMarketSortId;
    protected BigInteger displayOrder;
    @XmlSchemaType(name = "string")
    protected DeleteFlagKind deleteFlag;
    protected MarketSort marketSort;

    /**
     * Gets the value of the eventSubtypeMarketSortId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEventSubtypeMarketSortId() {
        return eventSubtypeMarketSortId;
    }

    /**
     * Sets the value of the eventSubtypeMarketSortId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEventSubtypeMarketSortId(BigInteger value) {
        this.eventSubtypeMarketSortId = value;
    }

    /**
     * Gets the value of the displayOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDisplayOrder() {
        return displayOrder;
    }

    /**
     * Sets the value of the displayOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDisplayOrder(BigInteger value) {
        this.displayOrder = value;
    }

    /**
     * Gets the value of the deleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteFlagKind }
     *     
     */
    public DeleteFlagKind getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * Sets the value of the deleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteFlagKind }
     *     
     */
    public void setDeleteFlag(DeleteFlagKind value) {
        this.deleteFlag = value;
    }

    /**
     * Gets the value of the marketSort property.
     * 
     * @return
     *     possible object is
     *     {@link MarketSort }
     *     
     */
    public MarketSort getMarketSort() {
        return marketSort;
    }

    /**
     * Sets the value of the marketSort property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketSort }
     *     
     */
    public void setMarketSort(MarketSort value) {
        this.marketSort = value;
    }

}
