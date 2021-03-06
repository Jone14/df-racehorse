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


/**
 * This class represents a profile of all customer related trust configuration and settings (e.g:  between a Customer and Mobile Applications)
 * 
 * <p>Java class for CustomerTrustProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerTrustProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="profileValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerApplicationTrust" type="{http://cdm.ladbrokes.co.uk/customer/Customer/2.0}CustomerApplicationTrust" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerTrustProfile", propOrder = {
    "profileValue",
    "customerApplicationTrust"
})
public class CustomerTrustProfile {

    protected String profileValue;
    protected CustomerApplicationTrust customerApplicationTrust;

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

    /**
     * Gets the value of the customerApplicationTrust property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerApplicationTrust }
     *     
     */
    public CustomerApplicationTrust getCustomerApplicationTrust() {
        return customerApplicationTrust;
    }

    /**
     * Sets the value of the customerApplicationTrust property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerApplicationTrust }
     *     
     */
    public void setCustomerApplicationTrust(CustomerApplicationTrust value) {
        this.customerApplicationTrust = value;
    }

}
