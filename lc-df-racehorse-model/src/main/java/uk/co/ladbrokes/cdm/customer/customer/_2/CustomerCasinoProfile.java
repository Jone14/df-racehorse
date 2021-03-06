//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.customer.customer._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import uk.co.ladbrokes.cdm.common.basetype._2.Money;
import uk.co.ladbrokes.cdm.product.catalogue._2.CategoryTypeKind;


/**
 * This represents a customers 'Casino' profile.
 * 
 * Details of bet history, patterns, segmentation, liability, limits, freebets etc are contained within this CustomerCasinoProfile.
 * 
 * This would be populated from some BI / Analytics input or a third party casino supplier data source
 * 
 * <p>Java class for CustomerCasinoProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerCasinoProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="averageBetsPerDay" type="{http://cdm.ladbrokes.co.uk/common/BaseType/2.0}Money" minOccurs="0"/&gt;
 *         &lt;element name="hasOpenPromos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="lastBetDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lastPromoRedeemDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="productCategory" type="{http://cdm.ladbrokes.co.uk/product/Catalogue/2.0}CategoryTypeKind" minOccurs="0"/&gt;
 *         &lt;element name="totalStaked" type="{http://cdm.ladbrokes.co.uk/common/BaseType/2.0}Money" minOccurs="0"/&gt;
 *         &lt;element name="totalWinnings" type="{http://cdm.ladbrokes.co.uk/common/BaseType/2.0}Money" minOccurs="0"/&gt;
 *         &lt;element name="usageIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerCasinoProfile", propOrder = {
    "averageBetsPerDay",
    "hasOpenPromos",
    "lastBetDateTime",
    "lastPromoRedeemDateTime",
    "productCategory",
    "totalStaked",
    "totalWinnings",
    "usageIndicator"
})
public class CustomerCasinoProfile {

    protected Money averageBetsPerDay;
    protected Boolean hasOpenPromos;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastBetDateTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastPromoRedeemDateTime;
    @XmlSchemaType(name = "string")
    protected CategoryTypeKind productCategory;
    protected Money totalStaked;
    protected Money totalWinnings;
    protected String usageIndicator;

    /**
     * Gets the value of the averageBetsPerDay property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getAverageBetsPerDay() {
        return averageBetsPerDay;
    }

    /**
     * Sets the value of the averageBetsPerDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setAverageBetsPerDay(Money value) {
        this.averageBetsPerDay = value;
    }

    /**
     * Gets the value of the hasOpenPromos property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasOpenPromos() {
        return hasOpenPromos;
    }

    /**
     * Sets the value of the hasOpenPromos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasOpenPromos(Boolean value) {
        this.hasOpenPromos = value;
    }

    /**
     * Gets the value of the lastBetDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastBetDateTime() {
        return lastBetDateTime;
    }

    /**
     * Sets the value of the lastBetDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastBetDateTime(XMLGregorianCalendar value) {
        this.lastBetDateTime = value;
    }

    /**
     * Gets the value of the lastPromoRedeemDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPromoRedeemDateTime() {
        return lastPromoRedeemDateTime;
    }

    /**
     * Sets the value of the lastPromoRedeemDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPromoRedeemDateTime(XMLGregorianCalendar value) {
        this.lastPromoRedeemDateTime = value;
    }

    /**
     * Gets the value of the productCategory property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryTypeKind }
     *     
     */
    public CategoryTypeKind getProductCategory() {
        return productCategory;
    }

    /**
     * Sets the value of the productCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryTypeKind }
     *     
     */
    public void setProductCategory(CategoryTypeKind value) {
        this.productCategory = value;
    }

    /**
     * Gets the value of the totalStaked property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalStaked() {
        return totalStaked;
    }

    /**
     * Sets the value of the totalStaked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalStaked(Money value) {
        this.totalStaked = value;
    }

    /**
     * Gets the value of the totalWinnings property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getTotalWinnings() {
        return totalWinnings;
    }

    /**
     * Sets the value of the totalWinnings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setTotalWinnings(Money value) {
        this.totalWinnings = value;
    }

    /**
     * Gets the value of the usageIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageIndicator() {
        return usageIndicator;
    }

    /**
     * Sets the value of the usageIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageIndicator(String value) {
        this.usageIndicator = value;
    }

}
