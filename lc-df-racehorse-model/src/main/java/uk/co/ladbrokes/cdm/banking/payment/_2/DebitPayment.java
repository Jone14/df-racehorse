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
 * This would result in transferring money INTO an account FROM Ladbrokes.
 * 
 * e.g. The result of a 'WithdrawFunds' initiated by a Customer, or Paying an Affiliate
 * 
 * <p>Java class for DebitPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DebitPayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/banking/Payment/2.0}Payment"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="debitNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebitPayment", propOrder = {
    "debitNote"
})
public class DebitPayment
    extends Payment
{

    protected String debitNote;

    /**
     * Gets the value of the debitNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitNote() {
        return debitNote;
    }

    /**
     * Sets the value of the debitNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitNote(String value) {
        this.debitNote = value;
    }

}
