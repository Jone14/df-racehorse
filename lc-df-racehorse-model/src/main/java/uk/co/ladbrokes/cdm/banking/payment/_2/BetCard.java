//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.banking.payment._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BetCard complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BetCard"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/banking/Payment/2.0}PaymentMethod"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="betCardUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BetCard", propOrder = {
    "betCardUserId"
})
public class BetCard
    extends PaymentMethod
{

    protected String betCardUserId;

    /**
     * Gets the value of the betCardUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBetCardUserId() {
        return betCardUserId;
    }

    /**
     * Sets the value of the betCardUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBetCardUserId(String value) {
        this.betCardUserId = value;
    }

}