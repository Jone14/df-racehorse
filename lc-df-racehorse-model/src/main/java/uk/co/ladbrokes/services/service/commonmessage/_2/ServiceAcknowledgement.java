//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 12:39:51 PM IST 
//


package uk.co.ladbrokes.services.service.commonmessage._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * This enables a 'Functional Acknowledgment' to be returned by a service operation that may implement an async (or partly async)
 * 
 * <p>Java class for ServiceAcknowledgement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceAcknowledgement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://services.ladbrokes.co.uk/service/CommonMessage/2.0}ServiceResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ackCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ackDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceAcknowledgement", propOrder = {
    "ackCode",
    "ackDescription"
})
public class ServiceAcknowledgement
    extends ServiceResponse
{

    protected String ackCode;
    protected String ackDescription;

    /**
     * Gets the value of the ackCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAckCode() {
        return ackCode;
    }

    /**
     * Sets the value of the ackCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAckCode(String value) {
        this.ackCode = value;
    }

    /**
     * Gets the value of the ackDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAckDescription() {
        return ackDescription;
    }

    /**
     * Sets the value of the ackDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAckDescription(String value) {
        this.ackDescription = value;
    }

}
