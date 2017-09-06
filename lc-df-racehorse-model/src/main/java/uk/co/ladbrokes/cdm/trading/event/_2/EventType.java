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
import uk.co.ladbrokes.cdm.common.crossref._2.CrossRefEntityKeys;
import uk.co.ladbrokes.cdm.common.managedentity._2.ManagedEntity;
import uk.co.ladbrokes.cdm.product.catalogue._2.ProductCategory;
import uk.co.ladbrokes.cdm.trading.market._2.MarketType;
import uk.co.ladbrokes.cdm.trading.participant._2.Participant;
import uk.co.ladbrokes.cdm.trading.price._2.CustomerGroupPriceStreams;


/**
 * Maintains various event types of event hierarchies.
 * 
 * <p>Java class for EventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/common/ManagedEntity/2.0}ManagedEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eventTypeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventTypeStatus" type="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}EventStatusKind" minOccurs="0"/&gt;
 *         &lt;element name="eventTypeStatusDerived" type="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}EventStatusKind" minOccurs="0"/&gt;
 *         &lt;element name="displayStatus" type="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}EventDisplayStatusKind" minOccurs="0"/&gt;
 *         &lt;element name="displayOrder" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="blurb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deleteFlag" type="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}DeleteFlagKind" minOccurs="0"/&gt;
 *         &lt;element name="eventClassKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birRetailFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="eventTypeMarketSort" type="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}EventTypeMarketSort" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="characteristic" type="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}EventTypeCharacteristic" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="eventSubtype" type="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}EventSubtype" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="feedSetting" type="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}EventTypeFeed" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="defaultEventBettingConfig" type="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}EventTypeBettingConfig" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="eventPublication" type="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}EventPublication" minOccurs="0"/&gt;
 *         &lt;element name="eventTypeChannel" type="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}EventTypeChannel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="availableParticipant" type="{http://cdm.ladbrokes.co.uk/trading/Participant/2.0}Participant" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="availableMarketType" type="{http://cdm.ladbrokes.co.uk/trading/Market/2.0}MarketType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="event" type="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}Event" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="eventTypeKeys" type="{http://cdm.ladbrokes.co.uk/common/CrossRef/2.0}CrossRefEntityKeys" minOccurs="0"/&gt;
 *         &lt;element name="eventClassKeys" type="{http://cdm.ladbrokes.co.uk/common/CrossRef/2.0}CrossRefEntityKeys" minOccurs="0"/&gt;
 *         &lt;element name="customerGroupPriceStreams" type="{http://cdm.ladbrokes.co.uk/trading/Price/2.0}CustomerGroupPriceStreams" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productCategory" type="{http://cdm.ladbrokes.co.uk/product/Catalogue/2.0}ProductCategory" minOccurs="0"/&gt;
 *         &lt;element name="eventTypeFlag" type="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}EventFlag" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventType", propOrder = {
    "eventTypeKey",
    "eventTypeName",
    "eventTypeStatus",
    "eventTypeStatusDerived",
    "displayStatus",
    "displayOrder",
    "blurb",
    "deleteFlag",
    "eventClassKey",
    "birRetailFlag",
    "eventTypeMarketSort",
    "characteristic",
    "eventSubtype",
    "feedSetting",
    "defaultEventBettingConfig",
    "eventPublication",
    "eventTypeChannel",
    "availableParticipant",
    "availableMarketType",
    "event",
    "eventTypeKeys",
    "eventClassKeys",
    "customerGroupPriceStreams",
    "productCategory",
    "eventTypeFlag"
})
public class EventType
    extends ManagedEntity
{

    protected String eventTypeKey;
    protected String eventTypeName;
    @XmlSchemaType(name = "string")
    protected EventStatusKind eventTypeStatus;
    @XmlSchemaType(name = "string")
    protected EventStatusKind eventTypeStatusDerived;
    @XmlSchemaType(name = "string")
    protected EventDisplayStatusKind displayStatus;
    protected BigInteger displayOrder;
    protected String blurb;
    @XmlSchemaType(name = "string")
    protected DeleteFlagKind deleteFlag;
    protected String eventClassKey;
    protected Boolean birRetailFlag;
    protected List<EventTypeMarketSort> eventTypeMarketSort;
    protected List<EventTypeCharacteristic> characteristic;
    protected List<EventSubtype> eventSubtype;
    protected List<EventTypeFeed> feedSetting;
    protected List<EventTypeBettingConfig> defaultEventBettingConfig;
    protected EventPublication eventPublication;
    protected List<EventTypeChannel> eventTypeChannel;
    protected List<Participant> availableParticipant;
    protected List<MarketType> availableMarketType;
    protected List<Event> event;
    protected CrossRefEntityKeys eventTypeKeys;
    protected CrossRefEntityKeys eventClassKeys;
    protected List<CustomerGroupPriceStreams> customerGroupPriceStreams;
    protected ProductCategory productCategory;
    protected List<EventFlag> eventTypeFlag;

    /**
     * Gets the value of the eventTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventTypeKey() {
        return eventTypeKey;
    }

    /**
     * Sets the value of the eventTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventTypeKey(String value) {
        this.eventTypeKey = value;
    }

    /**
     * Gets the value of the eventTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventTypeName() {
        return eventTypeName;
    }

    /**
     * Sets the value of the eventTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventTypeName(String value) {
        this.eventTypeName = value;
    }

    /**
     * Gets the value of the eventTypeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EventStatusKind }
     *     
     */
    public EventStatusKind getEventTypeStatus() {
        return eventTypeStatus;
    }

    /**
     * Sets the value of the eventTypeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventStatusKind }
     *     
     */
    public void setEventTypeStatus(EventStatusKind value) {
        this.eventTypeStatus = value;
    }

    /**
     * Gets the value of the eventTypeStatusDerived property.
     * 
     * @return
     *     possible object is
     *     {@link EventStatusKind }
     *     
     */
    public EventStatusKind getEventTypeStatusDerived() {
        return eventTypeStatusDerived;
    }

    /**
     * Sets the value of the eventTypeStatusDerived property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventStatusKind }
     *     
     */
    public void setEventTypeStatusDerived(EventStatusKind value) {
        this.eventTypeStatusDerived = value;
    }

    /**
     * Gets the value of the displayStatus property.
     * 
     * @return
     *     possible object is
     *     {@link EventDisplayStatusKind }
     *     
     */
    public EventDisplayStatusKind getDisplayStatus() {
        return displayStatus;
    }

    /**
     * Sets the value of the displayStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventDisplayStatusKind }
     *     
     */
    public void setDisplayStatus(EventDisplayStatusKind value) {
        this.displayStatus = value;
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
     * Gets the value of the blurb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlurb() {
        return blurb;
    }

    /**
     * Sets the value of the blurb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlurb(String value) {
        this.blurb = value;
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
     * Gets the value of the eventClassKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventClassKey() {
        return eventClassKey;
    }

    /**
     * Sets the value of the eventClassKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventClassKey(String value) {
        this.eventClassKey = value;
    }

    /**
     * Gets the value of the birRetailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBirRetailFlag() {
        return birRetailFlag;
    }

    /**
     * Sets the value of the birRetailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBirRetailFlag(Boolean value) {
        this.birRetailFlag = value;
    }

    /**
     * Gets the value of the eventTypeMarketSort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventTypeMarketSort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventTypeMarketSort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventTypeMarketSort }
     * 
     * 
     */
    public List<EventTypeMarketSort> getEventTypeMarketSort() {
        if (eventTypeMarketSort == null) {
            eventTypeMarketSort = new ArrayList<EventTypeMarketSort>();
        }
        return this.eventTypeMarketSort;
    }

    /**
     * Gets the value of the characteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventTypeCharacteristic }
     * 
     * 
     */
    public List<EventTypeCharacteristic> getCharacteristic() {
        if (characteristic == null) {
            characteristic = new ArrayList<EventTypeCharacteristic>();
        }
        return this.characteristic;
    }

    /**
     * Gets the value of the eventSubtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventSubtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventSubtype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventSubtype }
     * 
     * 
     */
    public List<EventSubtype> getEventSubtype() {
        if (eventSubtype == null) {
            eventSubtype = new ArrayList<EventSubtype>();
        }
        return this.eventSubtype;
    }

    /**
     * Gets the value of the feedSetting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feedSetting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeedSetting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventTypeFeed }
     * 
     * 
     */
    public List<EventTypeFeed> getFeedSetting() {
        if (feedSetting == null) {
            feedSetting = new ArrayList<EventTypeFeed>();
        }
        return this.feedSetting;
    }

    /**
     * Gets the value of the defaultEventBettingConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defaultEventBettingConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefaultEventBettingConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventTypeBettingConfig }
     * 
     * 
     */
    public List<EventTypeBettingConfig> getDefaultEventBettingConfig() {
        if (defaultEventBettingConfig == null) {
            defaultEventBettingConfig = new ArrayList<EventTypeBettingConfig>();
        }
        return this.defaultEventBettingConfig;
    }

    /**
     * Gets the value of the eventPublication property.
     * 
     * @return
     *     possible object is
     *     {@link EventPublication }
     *     
     */
    public EventPublication getEventPublication() {
        return eventPublication;
    }

    /**
     * Sets the value of the eventPublication property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventPublication }
     *     
     */
    public void setEventPublication(EventPublication value) {
        this.eventPublication = value;
    }

    /**
     * Gets the value of the eventTypeChannel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventTypeChannel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventTypeChannel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventTypeChannel }
     * 
     * 
     */
    public List<EventTypeChannel> getEventTypeChannel() {
        if (eventTypeChannel == null) {
            eventTypeChannel = new ArrayList<EventTypeChannel>();
        }
        return this.eventTypeChannel;
    }

    /**
     * Gets the value of the availableParticipant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableParticipant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableParticipant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Participant }
     * 
     * 
     */
    public List<Participant> getAvailableParticipant() {
        if (availableParticipant == null) {
            availableParticipant = new ArrayList<Participant>();
        }
        return this.availableParticipant;
    }

    /**
     * Gets the value of the availableMarketType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableMarketType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableMarketType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketType }
     * 
     * 
     */
    public List<MarketType> getAvailableMarketType() {
        if (availableMarketType == null) {
            availableMarketType = new ArrayList<MarketType>();
        }
        return this.availableMarketType;
    }

    /**
     * Gets the value of the event property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the event property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Event }
     * 
     * 
     */
    public List<Event> getEvent() {
        if (event == null) {
            event = new ArrayList<Event>();
        }
        return this.event;
    }

    /**
     * Gets the value of the eventTypeKeys property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public CrossRefEntityKeys getEventTypeKeys() {
        return eventTypeKeys;
    }

    /**
     * Sets the value of the eventTypeKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public void setEventTypeKeys(CrossRefEntityKeys value) {
        this.eventTypeKeys = value;
    }

    /**
     * Gets the value of the eventClassKeys property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public CrossRefEntityKeys getEventClassKeys() {
        return eventClassKeys;
    }

    /**
     * Sets the value of the eventClassKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public void setEventClassKeys(CrossRefEntityKeys value) {
        this.eventClassKeys = value;
    }

    /**
     * Gets the value of the customerGroupPriceStreams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerGroupPriceStreams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerGroupPriceStreams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerGroupPriceStreams }
     * 
     * 
     */
    public List<CustomerGroupPriceStreams> getCustomerGroupPriceStreams() {
        if (customerGroupPriceStreams == null) {
            customerGroupPriceStreams = new ArrayList<CustomerGroupPriceStreams>();
        }
        return this.customerGroupPriceStreams;
    }

    /**
     * Gets the value of the productCategory property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCategory }
     *     
     */
    public ProductCategory getProductCategory() {
        return productCategory;
    }

    /**
     * Sets the value of the productCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCategory }
     *     
     */
    public void setProductCategory(ProductCategory value) {
        this.productCategory = value;
    }

    /**
     * Gets the value of the eventTypeFlag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventTypeFlag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventTypeFlag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventFlag }
     * 
     * 
     */
    public List<EventFlag> getEventTypeFlag() {
        if (eventTypeFlag == null) {
            eventTypeFlag = new ArrayList<EventFlag>();
        }
        return this.eventTypeFlag;
    }

}
