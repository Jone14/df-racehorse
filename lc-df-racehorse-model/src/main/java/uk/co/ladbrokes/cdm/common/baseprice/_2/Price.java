//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.common.baseprice._2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A price 'value' object which can be used to represent a logical price, which can have up to 3 representations - Decimal, Fractional, American.
 * 
 * A price does not necessarily need to be associated to a selection, this is why it is modelled on its own and as such can be reused where needed.
 * 
 * e.g it can be used in a coupling strategy mapping as well
 * 
 * <p>Java class for Price complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Price"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="priceId" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="priceType" type="{http://cdm.ladbrokes.co.uk/common/BasePrice/2.0}PriceTypeKind" minOccurs="0"/&gt;
 *         &lt;element name="priceStatus" type="{http://cdm.ladbrokes.co.uk/common/BasePrice/2.0}PriceStateKind" minOccurs="0"/&gt;
 *         &lt;element name="validFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="validTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="priceSource" type="{http://cdm.ladbrokes.co.uk/common/BasePrice/2.0}PriceSourceKind" minOccurs="0"/&gt;
 *         &lt;element name="fractional" type="{http://cdm.ladbrokes.co.uk/common/BasePrice/2.0}FractionalPrice" minOccurs="0"/&gt;
 *         &lt;element name="decimal" type="{http://cdm.ladbrokes.co.uk/common/BasePrice/2.0}DecimalPrice" minOccurs="0"/&gt;
 *         &lt;element name="american" type="{http://cdm.ladbrokes.co.uk/common/BasePrice/2.0}AmericanPrice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Price", propOrder = {
    "priceId",
    "priceType",
    "priceStatus",
    "validFrom",
    "validTo",
    "priceSource",
    "fractional",
    "decimal",
    "american"
})
public class Price {

    protected BigInteger priceId;
    @XmlSchemaType(name = "string")
    protected PriceTypeKind priceType;
    @XmlSchemaType(name = "string")
    protected PriceStateKind priceStatus;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validFrom;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validTo;
    @XmlSchemaType(name = "string")
    protected PriceSourceKind priceSource;
    protected FractionalPrice fractional;
    protected DecimalPrice decimal;
    protected AmericanPrice american;

    /**
     * Gets the value of the priceId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriceId() {
        return priceId;
    }

    /**
     * Sets the value of the priceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriceId(BigInteger value) {
        this.priceId = value;
    }

    /**
     * Gets the value of the priceType property.
     * 
     * @return
     *     possible object is
     *     {@link PriceTypeKind }
     *     
     */
    public PriceTypeKind getPriceType() {
        return priceType;
    }

    /**
     * Sets the value of the priceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceTypeKind }
     *     
     */
    public void setPriceType(PriceTypeKind value) {
        this.priceType = value;
    }

    /**
     * Gets the value of the priceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PriceStateKind }
     *     
     */
    public PriceStateKind getPriceStatus() {
        return priceStatus;
    }

    /**
     * Sets the value of the priceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceStateKind }
     *     
     */
    public void setPriceStatus(PriceStateKind value) {
        this.priceStatus = value;
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
     * Gets the value of the priceSource property.
     * 
     * @return
     *     possible object is
     *     {@link PriceSourceKind }
     *     
     */
    public PriceSourceKind getPriceSource() {
        return priceSource;
    }

    /**
     * Sets the value of the priceSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSourceKind }
     *     
     */
    public void setPriceSource(PriceSourceKind value) {
        this.priceSource = value;
    }

    /**
     * Gets the value of the fractional property.
     * 
     * @return
     *     possible object is
     *     {@link FractionalPrice }
     *     
     */
    public FractionalPrice getFractional() {
        return fractional;
    }

    /**
     * Sets the value of the fractional property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionalPrice }
     *     
     */
    public void setFractional(FractionalPrice value) {
        this.fractional = value;
    }

    /**
     * Gets the value of the decimal property.
     * 
     * @return
     *     possible object is
     *     {@link DecimalPrice }
     *     
     */
    public DecimalPrice getDecimal() {
        return decimal;
    }

    /**
     * Sets the value of the decimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalPrice }
     *     
     */
    public void setDecimal(DecimalPrice value) {
        this.decimal = value;
    }

    /**
     * Gets the value of the american property.
     * 
     * @return
     *     possible object is
     *     {@link AmericanPrice }
     *     
     */
    public AmericanPrice getAmerican() {
        return american;
    }

    /**
     * Sets the value of the american property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmericanPrice }
     *     
     */
    public void setAmerican(AmericanPrice value) {
        this.american = value;
    }

}
