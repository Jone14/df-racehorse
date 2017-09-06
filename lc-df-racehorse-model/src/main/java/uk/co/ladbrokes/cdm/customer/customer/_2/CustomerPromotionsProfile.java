//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.customer.customer._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.common.managedentity._2.ManagedEntity;


/**
 * Models eligibility and history of available, redeemed, and offered promotions for a customer, whether they be generic or targeted via a personalisation engine or marketing campaign
 * 
 * <p>Java class for CustomerPromotionsProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerPromotionsProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/common/ManagedEntity/2.0}ManagedEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerKey" type="{http://cdm.ladbrokes.co.uk/customer/Customer/2.0}CustomerKey" minOccurs="0"/&gt;
 *         &lt;element name="hasAvailPromotions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="availablePromotions" type="{http://cdm.ladbrokes.co.uk/customer/Customer/2.0}AvailablePromotions" minOccurs="0"/&gt;
 *         &lt;element name="redeemedPromotions" type="{http://cdm.ladbrokes.co.uk/customer/Customer/2.0}RedeemedPromotions" minOccurs="0"/&gt;
 *         &lt;element name="profileValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerPromotionsProfile", propOrder = {
    "customerKey",
    "hasAvailPromotions",
    "availablePromotions",
    "redeemedPromotions",
    "profileValue"
})
public class CustomerPromotionsProfile
    extends ManagedEntity
{

    protected CustomerKey customerKey;
    protected Boolean hasAvailPromotions;
    protected AvailablePromotions availablePromotions;
    protected RedeemedPromotions redeemedPromotions;
    protected String profileValue;

    /**
     * Gets the value of the customerKey property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerKey }
     *     
     */
    public CustomerKey getCustomerKey() {
        return customerKey;
    }

    /**
     * Sets the value of the customerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerKey }
     *     
     */
    public void setCustomerKey(CustomerKey value) {
        this.customerKey = value;
    }

    /**
     * Gets the value of the hasAvailPromotions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasAvailPromotions() {
        return hasAvailPromotions;
    }

    /**
     * Sets the value of the hasAvailPromotions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAvailPromotions(Boolean value) {
        this.hasAvailPromotions = value;
    }

    /**
     * Gets the value of the availablePromotions property.
     * 
     * @return
     *     possible object is
     *     {@link AvailablePromotions }
     *     
     */
    public AvailablePromotions getAvailablePromotions() {
        return availablePromotions;
    }

    /**
     * Sets the value of the availablePromotions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailablePromotions }
     *     
     */
    public void setAvailablePromotions(AvailablePromotions value) {
        this.availablePromotions = value;
    }

    /**
     * Gets the value of the redeemedPromotions property.
     * 
     * @return
     *     possible object is
     *     {@link RedeemedPromotions }
     *     
     */
    public RedeemedPromotions getRedeemedPromotions() {
        return redeemedPromotions;
    }

    /**
     * Sets the value of the redeemedPromotions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedeemedPromotions }
     *     
     */
    public void setRedeemedPromotions(RedeemedPromotions value) {
        this.redeemedPromotions = value;
    }

    /**
     * Gets the value of the profileValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileValue() {
        return profileValue;
    }

    /**
     * Sets the value of the profileValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileValue(String value) {
        this.profileValue = value;
    }

}