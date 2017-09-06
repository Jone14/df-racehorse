//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.cdm.customer.customer._2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Messages to be shown to the customer via whatever channel is appropriate. 
 * 
 * <p>Java class for CustomerMessages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerMessages"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hasPriorityUnread" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="lastNewMessageDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="numUnread" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="totalNumMessages" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="customerMessage" type="{http://cdm.ladbrokes.co.uk/customer/Customer/2.0}CustomerMessage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerMessages", propOrder = {
    "hasPriorityUnread",
    "lastNewMessageDateTime",
    "numUnread",
    "totalNumMessages",
    "customerMessage"
})
public class CustomerMessages {

    protected BigInteger hasPriorityUnread;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastNewMessageDateTime;
    protected BigInteger numUnread;
    protected BigInteger totalNumMessages;
    protected List<CustomerMessage> customerMessage;

    /**
     * Gets the value of the hasPriorityUnread property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHasPriorityUnread() {
        return hasPriorityUnread;
    }

    /**
     * Sets the value of the hasPriorityUnread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHasPriorityUnread(BigInteger value) {
        this.hasPriorityUnread = value;
    }

    /**
     * Gets the value of the lastNewMessageDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastNewMessageDateTime() {
        return lastNewMessageDateTime;
    }

    /**
     * Sets the value of the lastNewMessageDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastNewMessageDateTime(XMLGregorianCalendar value) {
        this.lastNewMessageDateTime = value;
    }

    /**
     * Gets the value of the numUnread property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumUnread() {
        return numUnread;
    }

    /**
     * Sets the value of the numUnread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumUnread(BigInteger value) {
        this.numUnread = value;
    }

    /**
     * Gets the value of the totalNumMessages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumMessages() {
        return totalNumMessages;
    }

    /**
     * Sets the value of the totalNumMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumMessages(BigInteger value) {
        this.totalNumMessages = value;
    }

    /**
     * Gets the value of the customerMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerMessage }
     * 
     * 
     */
    public List<CustomerMessage> getCustomerMessage() {
        if (customerMessage == null) {
            customerMessage = new ArrayList<CustomerMessage>();
        }
        return this.customerMessage;
    }

}
