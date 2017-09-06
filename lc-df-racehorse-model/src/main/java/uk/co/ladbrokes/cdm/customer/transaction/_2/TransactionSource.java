//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.customer.transaction._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.common.channel._2.Channel;
import uk.co.ladbrokes.cdm.common.location._2.IPAddress;


/**
 * TBD - The source of the transaction
 * 
 * <p>Java class for TransactionSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionSource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="channel" type="{http://cdm.ladbrokes.co.uk/common/Channel/2.0}Channel" minOccurs="0"/&gt;
 *         &lt;element name="telebetId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ipAddress" type="{http://cdm.ladbrokes.co.uk/common/Location/2.0}IPAddress" minOccurs="0"/&gt;
 *         &lt;element name="retailShopKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionSource", propOrder = {
    "channel",
    "telebetId",
    "ipAddress",
    "retailShopKey"
})
public class TransactionSource {

    protected Channel channel;
    protected String telebetId;
    protected IPAddress ipAddress;
    protected String retailShopKey;

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link Channel }
     *     
     */
    public Channel getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Channel }
     *     
     */
    public void setChannel(Channel value) {
        this.channel = value;
    }

    /**
     * Gets the value of the telebetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelebetId() {
        return telebetId;
    }

    /**
     * Sets the value of the telebetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelebetId(String value) {
        this.telebetId = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link IPAddress }
     *     
     */
    public IPAddress getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPAddress }
     *     
     */
    public void setIpAddress(IPAddress value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the retailShopKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetailShopKey() {
        return retailShopKey;
    }

    /**
     * Sets the value of the retailShopKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetailShopKey(String value) {
        this.retailShopKey = value;
    }

}