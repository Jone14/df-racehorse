//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.banking.wallet._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.banking.payment._2.Payment;


/**
 * <p>Java class for WithdrawFunds complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WithdrawFunds"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/banking/Wallet/2.0}WalletTransaction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hasPaymentErrors" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="paymentTransaction" type="{http://cdm.ladbrokes.co.uk/banking/Payment/2.0}Payment" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WithdrawFunds", propOrder = {
    "hasPaymentErrors",
    "paymentTransaction"
})
public class WithdrawFunds
    extends WalletTransaction
{

    protected Boolean hasPaymentErrors;
    protected Payment paymentTransaction;

    /**
     * Gets the value of the hasPaymentErrors property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasPaymentErrors() {
        return hasPaymentErrors;
    }

    /**
     * Sets the value of the hasPaymentErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasPaymentErrors(Boolean value) {
        this.hasPaymentErrors = value;
    }

    /**
     * Gets the value of the paymentTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    public Payment getPaymentTransaction() {
        return paymentTransaction;
    }

    /**
     * Sets the value of the paymentTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    public void setPaymentTransaction(Payment value) {
        this.paymentTransaction = value;
    }

}