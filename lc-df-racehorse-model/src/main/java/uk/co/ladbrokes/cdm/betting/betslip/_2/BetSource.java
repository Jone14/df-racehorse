//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.betting.betslip._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.common.channel._2.Channel;
import uk.co.ladbrokes.cdm.retail.retailshop._2.RetailShop;


/**
 * This class encapsulates details about the source of the Bet
 * 
 * <p>Java class for BetSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BetSource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="channel" type="{http://cdm.ladbrokes.co.uk/common/Channel/2.0}Channel" minOccurs="0"/&gt;
 *         &lt;element name="retailShop" type="{http://cdm.ladbrokes.co.uk/retail/RetailShop/2.0}RetailShop" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BetSource", propOrder = {
    "ipAddress",
    "channel",
    "retailShop"
})
public class BetSource {

    protected String ipAddress;
    protected Channel channel;
    protected RetailShop retailShop;

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
    }

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
     * Gets the value of the retailShop property.
     * 
     * @return
     *     possible object is
     *     {@link RetailShop }
     *     
     */
    public RetailShop getRetailShop() {
        return retailShop;
    }

    /**
     * Sets the value of the retailShop property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailShop }
     *     
     */
    public void setRetailShop(RetailShop value) {
        this.retailShop = value;
    }

}
