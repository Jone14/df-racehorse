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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.common.crossref._2.CrossRefEntityKeys;


/**
 * <p>Java class for SportsbookCoupon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SportsbookCoupon"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="couponKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="couponName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="displayOrder" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="displayStatus" type="{http://cdm.ladbrokes.co.uk/product/Sportsbook/2.0}SportsbookDisplayStatusKind" minOccurs="0"/&gt;
 *         &lt;element name="couponFlagCodes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="couponSortCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hasOpenEvent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="hasNext24HourEvent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="hasLiveNowEvent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="hasLiveNowOrFutureEvent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="classKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="className" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="categoryKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="categoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="couponChannelDetail" type="{http://cdm.ladbrokes.co.uk/product/Sportsbook/2.0}ChannelDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sportsbookEvent" type="{http://cdm.ladbrokes.co.uk/product/Sportsbook/2.0}SportsbookEvent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="externalKeys" type="{http://cdm.ladbrokes.co.uk/common/CrossRef/2.0}CrossRefEntityKeys" minOccurs="0"/&gt;
 *         &lt;element name="parentExternalKeys" type="{http://cdm.ladbrokes.co.uk/common/CrossRef/2.0}CrossRefEntityKeys" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SportsbookCoupon", propOrder = {
    "couponKey",
    "couponName",
    "displayOrder",
    "displayStatus",
    "couponFlagCodes",
    "couponSortCode",
    "hasOpenEvent",
    "hasNext24HourEvent",
    "hasLiveNowEvent",
    "hasLiveNowOrFutureEvent",
    "classKey",
    "className",
    "categoryKey",
    "categoryName",
    "couponChannelDetail",
    "sportsbookEvent",
    "externalKeys",
    "parentExternalKeys"
})
public class SportsbookCoupon {

    protected String couponKey;
    protected String couponName;
    protected BigInteger displayOrder;
    @XmlSchemaType(name = "string")
    protected SportsbookDisplayStatusKind displayStatus;
    protected String couponFlagCodes;
    protected String couponSortCode;
    protected Boolean hasOpenEvent;
    protected Boolean hasNext24HourEvent;
    protected Boolean hasLiveNowEvent;
    protected Boolean hasLiveNowOrFutureEvent;
    protected String classKey;
    protected String className;
    protected String categoryKey;
    protected String categoryName;
    protected List<ChannelDetail> couponChannelDetail;
    protected List<SportsbookEvent> sportsbookEvent;
    protected CrossRefEntityKeys externalKeys;
    protected CrossRefEntityKeys parentExternalKeys;

    /**
     * Gets the value of the couponKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponKey() {
        return couponKey;
    }

    /**
     * Sets the value of the couponKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponKey(String value) {
        this.couponKey = value;
    }

    /**
     * Gets the value of the couponName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponName() {
        return couponName;
    }

    /**
     * Sets the value of the couponName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponName(String value) {
        this.couponName = value;
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
     * Gets the value of the displayStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SportsbookDisplayStatusKind }
     *     
     */
    public SportsbookDisplayStatusKind getDisplayStatus() {
        return displayStatus;
    }

    /**
     * Sets the value of the displayStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SportsbookDisplayStatusKind }
     *     
     */
    public void setDisplayStatus(SportsbookDisplayStatusKind value) {
        this.displayStatus = value;
    }

    /**
     * Gets the value of the couponFlagCodes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponFlagCodes() {
        return couponFlagCodes;
    }

    /**
     * Sets the value of the couponFlagCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponFlagCodes(String value) {
        this.couponFlagCodes = value;
    }

    /**
     * Gets the value of the couponSortCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponSortCode() {
        return couponSortCode;
    }

    /**
     * Sets the value of the couponSortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponSortCode(String value) {
        this.couponSortCode = value;
    }

    /**
     * Gets the value of the hasOpenEvent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasOpenEvent() {
        return hasOpenEvent;
    }

    /**
     * Sets the value of the hasOpenEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasOpenEvent(Boolean value) {
        this.hasOpenEvent = value;
    }

    /**
     * Gets the value of the hasNext24HourEvent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasNext24HourEvent() {
        return hasNext24HourEvent;
    }

    /**
     * Sets the value of the hasNext24HourEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasNext24HourEvent(Boolean value) {
        this.hasNext24HourEvent = value;
    }

    /**
     * Gets the value of the hasLiveNowEvent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasLiveNowEvent() {
        return hasLiveNowEvent;
    }

    /**
     * Sets the value of the hasLiveNowEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasLiveNowEvent(Boolean value) {
        this.hasLiveNowEvent = value;
    }

    /**
     * Gets the value of the hasLiveNowOrFutureEvent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasLiveNowOrFutureEvent() {
        return hasLiveNowOrFutureEvent;
    }

    /**
     * Sets the value of the hasLiveNowOrFutureEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasLiveNowOrFutureEvent(Boolean value) {
        this.hasLiveNowOrFutureEvent = value;
    }

    /**
     * Gets the value of the classKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassKey() {
        return classKey;
    }

    /**
     * Sets the value of the classKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassKey(String value) {
        this.classKey = value;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

    /**
     * Gets the value of the categoryKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryKey() {
        return categoryKey;
    }

    /**
     * Sets the value of the categoryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryKey(String value) {
        this.categoryKey = value;
    }

    /**
     * Gets the value of the categoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * Sets the value of the categoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryName(String value) {
        this.categoryName = value;
    }

    /**
     * Gets the value of the couponChannelDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the couponChannelDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCouponChannelDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChannelDetail }
     * 
     * 
     */
    public List<ChannelDetail> getCouponChannelDetail() {
        if (couponChannelDetail == null) {
            couponChannelDetail = new ArrayList<ChannelDetail>();
        }
        return this.couponChannelDetail;
    }

    /**
     * Gets the value of the sportsbookEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sportsbookEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSportsbookEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SportsbookEvent }
     * 
     * 
     */
    public List<SportsbookEvent> getSportsbookEvent() {
        if (sportsbookEvent == null) {
            sportsbookEvent = new ArrayList<SportsbookEvent>();
        }
        return this.sportsbookEvent;
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
     * Gets the value of the parentExternalKeys property.
     * 
     * @return
     *     possible object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public CrossRefEntityKeys getParentExternalKeys() {
        return parentExternalKeys;
    }

    /**
     * Sets the value of the parentExternalKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossRefEntityKeys }
     *     
     */
    public void setParentExternalKeys(CrossRefEntityKeys value) {
        this.parentExternalKeys = value;
    }

}
