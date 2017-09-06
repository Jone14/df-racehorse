//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.trading.selection._2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import uk.co.ladbrokes.cdm.common.baseprice._2.Price;
import uk.co.ladbrokes.cdm.common.crossref._2.CrossRefEntityKeys;
import uk.co.ladbrokes.cdm.common.managedentity._2.ManagedEntity;
import uk.co.ladbrokes.cdm.product.catalogue._2.PriceRow;
import uk.co.ladbrokes.cdm.trading.event._2.EventStateTypeKind;
import uk.co.ladbrokes.cdm.trading.price._2.PriceStream;


/**
 * Maintains detail of a selections price lifecycle
 * 
 * <p>Java class for SelectionPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectionPrice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/common/ManagedEntity/2.0}ManagedEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="selectionPriceKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="selectionKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="validTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="selectionPriceStatus" type="{http://cdm.ladbrokes.co.uk/trading/Selection/2.0}SelectionPriceStateKind" minOccurs="0"/&gt;
 *         &lt;element name="forSelectionIndex" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="americanPrice" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="decimalPrice" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="numFractionalPrice" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="denFractionalPrice" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="marketKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventState" type="{http://cdm.ladbrokes.co.uk/trading/Event/2.0}EventStateTypeKind" minOccurs="0"/&gt;
 *         &lt;element name="marketBirRetailFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="handicapValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="historicalPrice" type="{http://cdm.ladbrokes.co.uk/common/BasePrice/2.0}Price" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="priceStream" type="{http://cdm.ladbrokes.co.uk/trading/Price/2.0}PriceStream" minOccurs="0"/&gt;
 *         &lt;element name="price" type="{http://cdm.ladbrokes.co.uk/common/BasePrice/2.0}Price" minOccurs="0"/&gt;
 *         &lt;element name="selectionPriceKeys" type="{http://cdm.ladbrokes.co.uk/common/CrossRef/2.0}CrossRefEntityKeys" minOccurs="0"/&gt;
 *         &lt;element name="selectionKeys" type="{http://cdm.ladbrokes.co.uk/common/CrossRef/2.0}CrossRefEntityKeys" minOccurs="0"/&gt;
 *         &lt;element name="marketKeys" type="{http://cdm.ladbrokes.co.uk/common/CrossRef/2.0}CrossRefEntityKeys" minOccurs="0"/&gt;
 *         &lt;element name="eventKeys" type="{http://cdm.ladbrokes.co.uk/common/CrossRef/2.0}CrossRefEntityKeys" minOccurs="0"/&gt;
 *         &lt;element name="selectionPriceType" type="{http://cdm.ladbrokes.co.uk/trading/Selection/2.0}SelectionPriceType" minOccurs="0"/&gt;
 *         &lt;element name="priceRow" type="{http://cdm.ladbrokes.co.uk/product/Catalogue/2.0}PriceRow" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectionPrice", propOrder = {
    "selectionPriceKey",
    "selectionKey",
    "validFrom",
    "validTo",
    "isActive",
    "selectionPriceStatus",
    "forSelectionIndex",
    "index",
    "americanPrice",
    "decimalPrice",
    "numFractionalPrice",
    "denFractionalPrice",
    "marketKey",
    "eventState",
    "marketBirRetailFlag",
    "handicapValue",
    "eventKey",
    "historicalPrice",
    "priceStream",
    "price",
    "selectionPriceKeys",
    "selectionKeys",
    "marketKeys",
    "eventKeys",
    "selectionPriceType",
    "priceRow"
})
public class SelectionPrice
    extends ManagedEntity
{

    protected String selectionPriceKey;
    protected String selectionKey;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validTo;
    protected Boolean isActive;
    @XmlSchemaType(name = "string")
    protected SelectionPriceStateKind selectionPriceStatus;
    protected Boolean forSelectionIndex;
    protected BigInteger index;
    protected BigInteger americanPrice;
    protected BigInteger decimalPrice;
    protected BigInteger numFractionalPrice;
    protected BigInteger denFractionalPrice;
    protected String marketKey;
    @XmlSchemaType(name = "string")
    protected EventStateTypeKind eventState;
    protected Boolean marketBirRetailFlag;
    protected String handicapValue;
    protected String eventKey;
    protected List<Price> historicalPrice;
    protected PriceStream priceStream;
    protected Price price;
    protected CrossRefEntityKeys selectionPriceKeys;
    protected CrossRefEntityKeys selectionKeys;
    protected CrossRefEntityKeys marketKeys;
    protected CrossRefEntityKeys eventKeys;
    protected SelectionPriceType selectionPriceType;
    protected PriceRow priceRow;

    /**
     * Gets the value of the selectionPriceKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectionPriceKey() {
        return selectionPriceKey;
    }

    /**
     * Sets the value of the selectionPriceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectionPriceKey(String value) {
        this.selectionPriceKey = value;
    }

    /**
     * Gets the value of the selectionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectionKey() {
        return selectionKey;
    }

    /**
     * Sets the value of the selectionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectionKey(String value) {
        this.selectionKey = value;
    }

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFrom(XMLGregorianCalendar value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidTo() {
        return validTo;
    }

    /**
     * Sets the value of the validTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidTo(XMLGregorianCalendar value) {
        this.validTo = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the selectionPriceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionPriceStateKind }
     *     
     */
    public SelectionPriceStateKind getSelectionPriceStatus() {
        return selectionPriceStatus;
    }

    /**
     * Sets the value of the selectionPriceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionPriceStateKind }
     *     
     */
    public void setSelectionPriceStatus(SelectionPriceStateKind value) {
        this.selectionPriceStatus = value;
    }

    /**
     * Gets the value of the forSelectionIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForSelectionIndex() {
        return forSelectionIndex;
    }

    /**
     * Sets the value of the forSelectionIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForSelectionIndex(Boolean value) {
        this.forSelectionIndex = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndex(BigInteger value) {
        this.index = value;
    }

    /**
     * Gets the value of the americanPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmericanPrice() {
        return americanPrice;
    }

    /**
     * Sets the value of the americanPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmericanPrice(BigInteger value) {
        this.americanPrice = value;
    }

    /**
     * Gets the value of the decimalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDecimalPrice() {
        return decimalPrice;
    }

    /**
     * Sets the value of the decimalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDecimalPrice(BigInteger value) {
        this.decimalPrice = value;
    }

    /**
     * Gets the value of the numFractionalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumFractionalPrice() {
        return numFractionalPrice;
    }

    /**
     * Sets the value of the numFractionalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumFractionalPrice(BigInteger value) {
        this.numFractionalPrice = value;
    }

    /**
     * Gets the value of the denFractionalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDenFractionalPrice() {
        return denFractionalPrice;
    }

    /**
     * Sets the value of the denFractionalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDenFractionalPrice(BigInteger value) {
        this.denFractionalPrice = value;
    }

    /**
     * Gets the value of the marketKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketKey() {
        return marketKey;
    }

    /**
     * Sets the value of the marketKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketKey(String value) {
        this.marketKey = value;
    }

    /**
     * Gets the value of the eventState property.
     * 
     * @return
     *     possible object is
     *     {@link EventStateTypeKind }
     *     
     */
    public EventStateTypeKind getEventState() {
        return eventState;
    }

    /**
     * Sets the value of the eventState property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventStateTypeKind }
     *     
     */
    public void setEventState(EventStateTypeKind value) {
        this.eventState = value;
    }

    /**
     * Gets the value of the marketBirRetailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMarketBirRetailFlag() {
        return marketBirRetailFlag;
    }

    /**
     * Sets the value of the marketBirRetailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarketBirRetailFlag(Boolean value) {
        this.marketBirRetailFlag = value;
    }

    /**
     * Gets the value of the handicapValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandicapValue() {
        return handicapValue;
    }

    /**
     * Sets the value of the handicapValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandicapValue(String value) {
        this.handicapValue = value;
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
     * Gets the value of the historicalPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the historicalPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistoricalPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Price }
     * 
     * 
     */
    public List<Price> getHistoricalPrice() {
        if (historicalPrice == null) {
            historicalPrice = new ArrayList<Price>();
        }
        return this.historicalPrice;
    }

    /**
     * Gets the value of the priceStream property.
     * 
     * @return
     *     possible object is
     *     {@link PriceStream }
     *     
     */
    public PriceStream getPriceStream() {
        return priceStream;
    }

    /**
     * Sets the value of the priceStream property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceStream }
     *     
     */
    public void setPriceStream(PriceStream value) {
        this.priceStream = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setPrice(Price value) {
        this.price = value;
    }

    /**
     * Gets the value of the selectionPriceKeys property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public CrossRefEntityKeys getSelectionPriceKeys() {
        return selectionPriceKeys;
    }

    /**
     * Sets the value of the selectionPriceKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public void setSelectionPriceKeys(CrossRefEntityKeys value) {
        this.selectionPriceKeys = value;
    }

    /**
     * Gets the value of the selectionKeys property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public CrossRefEntityKeys getSelectionKeys() {
        return selectionKeys;
    }

    /**
     * Sets the value of the selectionKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public void setSelectionKeys(CrossRefEntityKeys value) {
        this.selectionKeys = value;
    }

    /**
     * Gets the value of the marketKeys property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public CrossRefEntityKeys getMarketKeys() {
        return marketKeys;
    }

    /**
     * Sets the value of the marketKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public void setMarketKeys(CrossRefEntityKeys value) {
        this.marketKeys = value;
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
     * Gets the value of the selectionPriceType property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionPriceType }
     *     
     */
    public SelectionPriceType getSelectionPriceType() {
        return selectionPriceType;
    }

    /**
     * Sets the value of the selectionPriceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionPriceType }
     *     
     */
    public void setSelectionPriceType(SelectionPriceType value) {
        this.selectionPriceType = value;
    }

    /**
     * Gets the value of the priceRow property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRow }
     *     
     */
    public PriceRow getPriceRow() {
        return priceRow;
    }

    /**
     * Sets the value of the priceRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRow }
     *     
     */
    public void setPriceRow(PriceRow value) {
        this.priceRow = value;
    }

}
