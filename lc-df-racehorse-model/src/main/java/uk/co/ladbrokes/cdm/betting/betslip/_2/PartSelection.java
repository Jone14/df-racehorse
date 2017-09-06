//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.betting.betslip._2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import uk.co.ladbrokes.cdm.common.crossref._2.CrossRefEntityKeys;


/**
 * This class contains the summary details of the Selection associated to the Part. This includes details about the selection, its price at a point in time, the event and market names for display purpose. 
 * 
 * NOTE:  for 2.0, 'currentPrice' depricated.  This was part of an error returned if the price had changed against the customer as part of betPlacement.  This should be on the service error rather
 * 
 * <p>Java class for PartSelection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartSelection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="selectionKey" type="{http://cdm.ladbrokes.co.uk/common/CrossRef/2.0}CrossRefEntityKeys" minOccurs="0"/&gt;
 *         &lt;element name="selectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marketName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marketKey" type="{http://cdm.ladbrokes.co.uk/common/CrossRef/2.0}CrossRefEntityKeys" minOccurs="0"/&gt;
 *         &lt;element name="marketIndex" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="marketMeaningMajorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outcomeMeaningMajorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outcomeMeaningMinorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventKey" type="{http://cdm.ladbrokes.co.uk/common/CrossRef/2.0}CrossRefEntityKeys" minOccurs="0"/&gt;
 *         &lt;element name="isInRunning" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="eventName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventTypeKey" type="{http://cdm.ladbrokes.co.uk/common/CrossRef/2.0}CrossRefEntityKeys" minOccurs="0"/&gt;
 *         &lt;element name="eventStartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="eventSubtype" type="{http://cdm.ladbrokes.co.uk/common/CrossRef/2.0}CrossRefEntityKeys" minOccurs="0"/&gt;
 *         &lt;element name="eventSort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventClassKey" type="{http://cdm.ladbrokes.co.uk/common/CrossRef/2.0}CrossRefEntityKeys" minOccurs="0"/&gt;
 *         &lt;element name="eventTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventSubtypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventClassExtraInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventCategoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noCombinationsWith" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="nonRunnerNoBet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartSelection", propOrder = {
    "selectionKey",
    "selectionName",
    "marketName",
    "marketKey",
    "marketIndex",
    "marketMeaningMajorCode",
    "outcomeMeaningMajorCode",
    "outcomeMeaningMinorCode",
    "eventKey",
    "isInRunning",
    "eventName",
    "eventTypeKey",
    "eventStartDateTime",
    "eventSubtype",
    "eventSort",
    "eventClassKey",
    "eventTypeName",
    "eventSubtypeName",
    "eventClassName",
    "eventClassExtraInfo",
    "eventCategoryName",
    "noCombinationsWith",
    "nonRunnerNoBet"
})
public class PartSelection {

    protected CrossRefEntityKeys selectionKey;
    protected String selectionName;
    protected String marketName;
    protected CrossRefEntityKeys marketKey;
    protected BigInteger marketIndex;
    protected String marketMeaningMajorCode;
    protected String outcomeMeaningMajorCode;
    protected String outcomeMeaningMinorCode;
    protected CrossRefEntityKeys eventKey;
    protected Boolean isInRunning;
    protected String eventName;
    protected CrossRefEntityKeys eventTypeKey;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventStartDateTime;
    protected CrossRefEntityKeys eventSubtype;
    protected String eventSort;
    protected CrossRefEntityKeys eventClassKey;
    protected String eventTypeName;
    protected String eventSubtypeName;
    protected String eventClassName;
    protected String eventClassExtraInfo;
    protected String eventCategoryName;
    protected Boolean noCombinationsWith;
    protected Boolean nonRunnerNoBet;

    /**
     * Gets the value of the selectionKey property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public CrossRefEntityKeys getSelectionKey() {
        return selectionKey;
    }

    /**
     * Sets the value of the selectionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public void setSelectionKey(CrossRefEntityKeys value) {
        this.selectionKey = value;
    }

    /**
     * Gets the value of the selectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectionName() {
        return selectionName;
    }

    /**
     * Sets the value of the selectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectionName(String value) {
        this.selectionName = value;
    }

    /**
     * Gets the value of the marketName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketName() {
        return marketName;
    }

    /**
     * Sets the value of the marketName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketName(String value) {
        this.marketName = value;
    }

    /**
     * Gets the value of the marketKey property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public CrossRefEntityKeys getMarketKey() {
        return marketKey;
    }

    /**
     * Sets the value of the marketKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public void setMarketKey(CrossRefEntityKeys value) {
        this.marketKey = value;
    }

    /**
     * Gets the value of the marketIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMarketIndex() {
        return marketIndex;
    }

    /**
     * Sets the value of the marketIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMarketIndex(BigInteger value) {
        this.marketIndex = value;
    }

    /**
     * Gets the value of the marketMeaningMajorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketMeaningMajorCode() {
        return marketMeaningMajorCode;
    }

    /**
     * Sets the value of the marketMeaningMajorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketMeaningMajorCode(String value) {
        this.marketMeaningMajorCode = value;
    }

    /**
     * Gets the value of the outcomeMeaningMajorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutcomeMeaningMajorCode() {
        return outcomeMeaningMajorCode;
    }

    /**
     * Sets the value of the outcomeMeaningMajorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutcomeMeaningMajorCode(String value) {
        this.outcomeMeaningMajorCode = value;
    }

    /**
     * Gets the value of the outcomeMeaningMinorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutcomeMeaningMinorCode() {
        return outcomeMeaningMinorCode;
    }

    /**
     * Sets the value of the outcomeMeaningMinorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutcomeMeaningMinorCode(String value) {
        this.outcomeMeaningMinorCode = value;
    }

    /**
     * Gets the value of the eventKey property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public CrossRefEntityKeys getEventKey() {
        return eventKey;
    }

    /**
     * Sets the value of the eventKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public void setEventKey(CrossRefEntityKeys value) {
        this.eventKey = value;
    }

    /**
     * Gets the value of the isInRunning property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInRunning() {
        return isInRunning;
    }

    /**
     * Sets the value of the isInRunning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInRunning(Boolean value) {
        this.isInRunning = value;
    }

    /**
     * Gets the value of the eventName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * Sets the value of the eventName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventName(String value) {
        this.eventName = value;
    }

    /**
     * Gets the value of the eventTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public CrossRefEntityKeys getEventTypeKey() {
        return eventTypeKey;
    }

    /**
     * Sets the value of the eventTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public void setEventTypeKey(CrossRefEntityKeys value) {
        this.eventTypeKey = value;
    }

    /**
     * Gets the value of the eventStartDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventStartDateTime() {
        return eventStartDateTime;
    }

    /**
     * Sets the value of the eventStartDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventStartDateTime(XMLGregorianCalendar value) {
        this.eventStartDateTime = value;
    }

    /**
     * Gets the value of the eventSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public CrossRefEntityKeys getEventSubtype() {
        return eventSubtype;
    }

    /**
     * Sets the value of the eventSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public void setEventSubtype(CrossRefEntityKeys value) {
        this.eventSubtype = value;
    }

    /**
     * Gets the value of the eventSort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventSort() {
        return eventSort;
    }

    /**
     * Sets the value of the eventSort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventSort(String value) {
        this.eventSort = value;
    }

    /**
     * Gets the value of the eventClassKey property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public CrossRefEntityKeys getEventClassKey() {
        return eventClassKey;
    }

    /**
     * Sets the value of the eventClassKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public void setEventClassKey(CrossRefEntityKeys value) {
        this.eventClassKey = value;
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
     * Gets the value of the eventSubtypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventSubtypeName() {
        return eventSubtypeName;
    }

    /**
     * Sets the value of the eventSubtypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventSubtypeName(String value) {
        this.eventSubtypeName = value;
    }

    /**
     * Gets the value of the eventClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventClassName() {
        return eventClassName;
    }

    /**
     * Sets the value of the eventClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventClassName(String value) {
        this.eventClassName = value;
    }

    /**
     * Gets the value of the eventClassExtraInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventClassExtraInfo() {
        return eventClassExtraInfo;
    }

    /**
     * Sets the value of the eventClassExtraInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventClassExtraInfo(String value) {
        this.eventClassExtraInfo = value;
    }

    /**
     * Gets the value of the eventCategoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventCategoryName() {
        return eventCategoryName;
    }

    /**
     * Sets the value of the eventCategoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventCategoryName(String value) {
        this.eventCategoryName = value;
    }

    /**
     * Gets the value of the noCombinationsWith property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoCombinationsWith() {
        return noCombinationsWith;
    }

    /**
     * Sets the value of the noCombinationsWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoCombinationsWith(Boolean value) {
        this.noCombinationsWith = value;
    }

    /**
     * Gets the value of the nonRunnerNoBet property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonRunnerNoBet() {
        return nonRunnerNoBet;
    }

    /**
     * Sets the value of the nonRunnerNoBet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNonRunnerNoBet(Boolean value) {
        this.nonRunnerNoBet = value;
    }

}
