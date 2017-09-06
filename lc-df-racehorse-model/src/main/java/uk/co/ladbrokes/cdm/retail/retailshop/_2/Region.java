//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.retail.retailshop._2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.common.location._2.Location;


/**
 * A geographic area defining a cluster of retail shops (used to be called 'RAD')
 * 
 * <p>Java class for Region complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Region"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="regionKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regionNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgUnitId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numShops" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="retailShop" type="{http://cdm.ladbrokes.co.uk/retail/RetailShop/2.0}RetailShop" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://cdm.ladbrokes.co.uk/common/Location/2.0}Location" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Region", propOrder = {
    "regionKey",
    "regionNo",
    "regionName",
    "orgUnitId",
    "description",
    "numShops",
    "isActive",
    "retailShop",
    "location"
})
public class Region {

    protected String regionKey;
    protected String regionNo;
    protected String regionName;
    protected String orgUnitId;
    protected String description;
    protected BigInteger numShops;
    protected Boolean isActive;
    protected List<RetailShop> retailShop;
    protected Location location;

    /**
     * Gets the value of the regionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionKey() {
        return regionKey;
    }

    /**
     * Sets the value of the regionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionKey(String value) {
        this.regionKey = value;
    }

    /**
     * Gets the value of the regionNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionNo() {
        return regionNo;
    }

    /**
     * Sets the value of the regionNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionNo(String value) {
        this.regionNo = value;
    }

    /**
     * Gets the value of the regionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * Sets the value of the regionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionName(String value) {
        this.regionName = value;
    }

    /**
     * Gets the value of the orgUnitId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgUnitId() {
        return orgUnitId;
    }

    /**
     * Sets the value of the orgUnitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgUnitId(String value) {
        this.orgUnitId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the numShops property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumShops() {
        return numShops;
    }

    /**
     * Sets the value of the numShops property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumShops(BigInteger value) {
        this.numShops = value;
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
     * Gets the value of the retailShop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retailShop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetailShop().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetailShop }
     * 
     * 
     */
    public List<RetailShop> getRetailShop() {
        if (retailShop == null) {
            retailShop = new ArrayList<RetailShop>();
        }
        return this.retailShop;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

}