//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.customer.customer._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This class is a container for generic CustomerCharacteristics to use for future extensibility
 * 
 * <p>Java class for CustomerCharacteristics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerCharacteristics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hasCharacteristics" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="customerCharacteristic" type="{http://cdm.ladbrokes.co.uk/customer/Customer/2.0}CustomerCharacteristic" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerCharacteristics", propOrder = {
    "hasCharacteristics",
    "customerCharacteristic"
})
public class CustomerCharacteristics {

    protected Boolean hasCharacteristics;
    protected List<CustomerCharacteristic> customerCharacteristic;

    /**
     * Gets the value of the hasCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasCharacteristics() {
        return hasCharacteristics;
    }

    /**
     * Sets the value of the hasCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasCharacteristics(Boolean value) {
        this.hasCharacteristics = value;
    }

    /**
     * Gets the value of the customerCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerCharacteristic }
     * 
     * 
     */
    public List<CustomerCharacteristic> getCustomerCharacteristic() {
        if (customerCharacteristic == null) {
            customerCharacteristic = new ArrayList<CustomerCharacteristic>();
        }
        return this.customerCharacteristic;
    }

}
