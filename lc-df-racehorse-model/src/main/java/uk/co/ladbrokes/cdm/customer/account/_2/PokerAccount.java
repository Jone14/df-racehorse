//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.customer.account._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.common.basetype._2.Money;


/**
 * <p>Java class for PokerAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PokerAccount"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/customer/Account/2.0}Account"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pokerHeldFunds" type="{http://cdm.ladbrokes.co.uk/common/BaseType/2.0}Money" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PokerAccount", propOrder = {
    "pokerHeldFunds"
})
public class PokerAccount
    extends Account
{

    protected Money pokerHeldFunds;

    /**
     * Gets the value of the pokerHeldFunds property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getPokerHeldFunds() {
        return pokerHeldFunds;
    }

    /**
     * Sets the value of the pokerHeldFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setPokerHeldFunds(Money value) {
        this.pokerHeldFunds = value;
    }

}
