//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.common.location._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A class representing an IP Address.
 * 
 * <p>Java class for IPAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IPAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ipVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ipAddressValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ipAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPAddress", propOrder = {
    "ipVersion",
    "ipAddressValue",
    "ipAddressType"
})
public class IPAddress {

    protected String ipVersion;
    protected String ipAddressValue;
    protected String ipAddressType;

    /**
     * Gets the value of the ipVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpVersion() {
        return ipVersion;
    }

    /**
     * Sets the value of the ipVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpVersion(String value) {
        this.ipVersion = value;
    }

    /**
     * Gets the value of the ipAddressValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddressValue() {
        return ipAddressValue;
    }

    /**
     * Sets the value of the ipAddressValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddressValue(String value) {
        this.ipAddressValue = value;
    }

    /**
     * Gets the value of the ipAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddressType() {
        return ipAddressType;
    }

    /**
     * Sets the value of the ipAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddressType(String value) {
        this.ipAddressType = value;
    }

}
