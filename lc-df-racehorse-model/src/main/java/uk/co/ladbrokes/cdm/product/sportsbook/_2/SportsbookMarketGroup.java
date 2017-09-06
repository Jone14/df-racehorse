//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.product.sportsbook._2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.common.crossref._2.CrossRefEntityKeys;


/**
 * This represents 'Collections' in Openbet, which a Market can be associated to 0..* of these.  A 'Group' could be 'Next 10 races'
 * 
 * <p>Java class for SportsbookMarketGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SportsbookMarketGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="marketGroupKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marketGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="displayOrder" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="externalKeys" type="{http://cdm.ladbrokes.co.uk/common/CrossRef/2.0}CrossRefEntityKeys" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SportsbookMarketGroup", propOrder = {
    "marketGroupKey",
    "marketGroupName",
    "displayOrder",
    "externalKeys"
})
public class SportsbookMarketGroup {

    protected String marketGroupKey;
    protected String marketGroupName;
    protected BigInteger displayOrder;
    protected CrossRefEntityKeys externalKeys;

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
     * Gets the value of the marketGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketGroupName() {
        return marketGroupName;
    }

    /**
     * Sets the value of the marketGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketGroupName(String value) {
        this.marketGroupName = value;
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

}
