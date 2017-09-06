//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.product.sportsbook._2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.common.crossref._2.CrossRefEntityKeys;


/**
 * This class represents a Sportsbook Market Type (in OB, a 'TemplateMarket).
 * 
 * The combination of marketType and marketSort shapes the betting behaviour / opportunities.
 * 
 * <p>Java class for SportsbookMarketType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SportsbookMarketType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="marketTypeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="externalKeys" type="{http://cdm.ladbrokes.co.uk/common/CrossRef/2.0}CrossRefEntityKeys" minOccurs="0"/&gt;
 *         &lt;element name="marketTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventTypeKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventTypeExternalKeys" type="{http://cdm.ladbrokes.co.uk/common/CrossRef/2.0}CrossRefEntityKeys" minOccurs="0"/&gt;
 *         &lt;element name="marketGroupKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marketGroupExternalKeys" type="{http://cdm.ladbrokes.co.uk/common/CrossRef/2.0}CrossRefEntityKeys" minOccurs="0"/&gt;
 *         &lt;element name="displayOrder" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="marketMeaningMajorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marketMeaningMinorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marketTypeChannelDetail" type="{http://cdm.ladbrokes.co.uk/product/Sportsbook/2.0}ChannelDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SportsbookMarketType", propOrder = {
    "marketTypeKey",
    "externalKeys",
    "marketTypeName",
    "eventTypeKey",
    "eventTypeExternalKeys",
    "marketGroupKey",
    "marketGroupExternalKeys",
    "displayOrder",
    "marketMeaningMajorCode",
    "marketMeaningMinorCode",
    "marketTypeChannelDetail"
})
public class SportsbookMarketType {

    protected String marketTypeKey;
    protected CrossRefEntityKeys externalKeys;
    protected String marketTypeName;
    protected String eventTypeKey;
    protected CrossRefEntityKeys eventTypeExternalKeys;
    protected String marketGroupKey;
    protected CrossRefEntityKeys marketGroupExternalKeys;
    protected BigInteger displayOrder;
    protected String marketMeaningMajorCode;
    protected String marketMeaningMinorCode;
    protected List<ChannelDetail> marketTypeChannelDetail;

    /**
     * Gets the value of the marketTypeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketTypeKey() {
        return marketTypeKey;
    }

    /**
     * Sets the value of the marketTypeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketTypeKey(String value) {
        this.marketTypeKey = value;
    }

    /**
     * Gets the value of the externalKeys property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public CrossRefEntityKeys getExternalKeys() {
        return externalKeys;
    }

    /**
     * Sets the value of the externalKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public void setExternalKeys(CrossRefEntityKeys value) {
        this.externalKeys = value;
    }

    /**
     * Gets the value of the marketTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketTypeName() {
        return marketTypeName;
    }

    /**
     * Sets the value of the marketTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketTypeName(String value) {
        this.marketTypeName = value;
    }

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
     * Gets the value of the eventTypeExternalKeys property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public CrossRefEntityKeys getEventTypeExternalKeys() {
        return eventTypeExternalKeys;
    }

    /**
     * Sets the value of the eventTypeExternalKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public void setEventTypeExternalKeys(CrossRefEntityKeys value) {
        this.eventTypeExternalKeys = value;
    }

    /**
     * Gets the value of the marketGroupKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketGroupKey() {
        return marketGroupKey;
    }

    /**
     * Sets the value of the marketGroupKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketGroupKey(String value) {
        this.marketGroupKey = value;
    }

    /**
     * Gets the value of the marketGroupExternalKeys property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public CrossRefEntityKeys getMarketGroupExternalKeys() {
        return marketGroupExternalKeys;
    }

    /**
     * Sets the value of the marketGroupExternalKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public void setMarketGroupExternalKeys(CrossRefEntityKeys value) {
        this.marketGroupExternalKeys = value;
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
     * Gets the value of the marketMeaningMinorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketMeaningMinorCode() {
        return marketMeaningMinorCode;
    }

    /**
     * Sets the value of the marketMeaningMinorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketMeaningMinorCode(String value) {
        this.marketMeaningMinorCode = value;
    }

    /**
     * Gets the value of the marketTypeChannelDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketTypeChannelDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketTypeChannelDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChannelDetail }
     * 
     * 
     */
    public List<ChannelDetail> getMarketTypeChannelDetail() {
        if (marketTypeChannelDetail == null) {
            marketTypeChannelDetail = new ArrayList<ChannelDetail>();
        }
        return this.marketTypeChannelDetail;
    }

}