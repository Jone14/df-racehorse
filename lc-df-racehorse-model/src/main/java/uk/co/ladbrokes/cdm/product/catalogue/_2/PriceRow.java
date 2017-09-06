//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.product.catalogue._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Represents a price, per unit, for a product.  Know subclasses include:
 * 
 * SportsbookPrice (odds for a selection)
 * 
 * <p>Java class for PriceRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="priceRowKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validFromDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="validToDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="productKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productVariantKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="priceRowType" type="{http://cdm.ladbrokes.co.uk/product/Catalogue/2.0}PriceRowTypeKind" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceRow", propOrder = {
    "priceRowKey",
    "validFromDateTime",
    "validToDateTime",
    "isActive",
    "productKey",
    "productVariantKey",
    "priceRowType"
})
public class PriceRow {

    protected String priceRowKey;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validFromDateTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validToDateTime;
    protected Boolean isActive;
    protected String productKey;
    protected String productVariantKey;
    @XmlSchemaType(name = "string")
    protected PriceRowTypeKind priceRowType;

    /**
     * Gets the value of the priceRowKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceRowKey() {
        return priceRowKey;
    }

    /**
     * Sets the value of the priceRowKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceRowKey(String value) {
        this.priceRowKey = value;
    }

    /**
     * Gets the value of the validFromDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFromDateTime() {
        return validFromDateTime;
    }

    /**
     * Sets the value of the validFromDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFromDateTime(XMLGregorianCalendar value) {
        this.validFromDateTime = value;
    }

    /**
     * Gets the value of the validToDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidToDateTime() {
        return validToDateTime;
    }

    /**
     * Sets the value of the validToDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidToDateTime(XMLGregorianCalendar value) {
        this.validToDateTime = value;
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
     * Gets the value of the productKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductKey() {
        return productKey;
    }

    /**
     * Sets the value of the productKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductKey(String value) {
        this.productKey = value;
    }

    /**
     * Gets the value of the productVariantKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductVariantKey() {
        return productVariantKey;
    }

    /**
     * Sets the value of the productVariantKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductVariantKey(String value) {
        this.productVariantKey = value;
    }

    /**
     * Gets the value of the priceRowType property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRowTypeKind }
     *     
     */
    public PriceRowTypeKind getPriceRowType() {
        return priceRowType;
    }

    /**
     * Sets the value of the priceRowType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRowTypeKind }
     *     
     */
    public void setPriceRowType(PriceRowTypeKind value) {
        this.priceRowType = value;
    }

}
