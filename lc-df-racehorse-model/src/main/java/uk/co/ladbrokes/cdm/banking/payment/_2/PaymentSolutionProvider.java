//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.banking.payment._2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import uk.co.ladbrokes.cdm.common.managedentity._2.ManagedEntity;


/**
 * This class represents a relationship of Payment Provider to a particular payment solution
 * 
 * <p>Java class for PaymentSolutionProvider complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentSolutionProvider"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://cdm.ladbrokes.co.uk/common/ManagedEntity/2.0}ManagedEntity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="priorityIndex" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="displayOrder" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="PaymentMethodType" type="{http://cdm.ladbrokes.co.uk/banking/Payment/2.0}PaymentMethodType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentProvider" type="{http://cdm.ladbrokes.co.uk/banking/Payment/2.0}PaymentProvider" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentSolutionProvider", propOrder = {
    "isActive",
    "priorityIndex",
    "displayOrder",
    "paymentMethodType",
    "paymentProvider"
})
public class PaymentSolutionProvider
    extends ManagedEntity
{

    protected Boolean isActive;
    protected BigInteger priorityIndex;
    protected BigInteger displayOrder;
    @XmlElement(name = "PaymentMethodType")
    protected PaymentMethodType paymentMethodType;
    @XmlElement(name = "PaymentProvider")
    protected PaymentProvider paymentProvider;

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
     * Gets the value of the priorityIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriorityIndex() {
        return priorityIndex;
    }

    /**
     * Sets the value of the priorityIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriorityIndex(BigInteger value) {
        this.priorityIndex = value;
    }

    /**
     * Gets the value of the displayOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDisplayOrder() {
        return displayOrder;
    }

    /**
     * Sets the value of the displayOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDisplayOrder(BigInteger value) {
        this.displayOrder = value;
    }

    /**
     * Gets the value of the paymentMethodType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodType }
     *     
     */
    public PaymentMethodType getPaymentMethodType() {
        return paymentMethodType;
    }

    /**
     * Sets the value of the paymentMethodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodType }
     *     
     */
    public void setPaymentMethodType(PaymentMethodType value) {
        this.paymentMethodType = value;
    }

    /**
     * Gets the value of the paymentProvider property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentProvider }
     *     
     */
    public PaymentProvider getPaymentProvider() {
        return paymentProvider;
    }

    /**
     * Sets the value of the paymentProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentProvider }
     *     
     */
    public void setPaymentProvider(PaymentProvider value) {
        this.paymentProvider = value;
    }

}